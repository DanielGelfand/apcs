// Team SuperSort -- Daniel Gelfand & T. Fabiha
// APCS1 pd2
// HW#55 -- Never Fear, Big Oh Is Here!
// 2017-12-14

import java.util.ArrayList;

public class MySorts {

 /***
   * add takes as input any comparable object 
   * (i.e., any object of a class implementing interface Comparable)
   * inserts newVal at the appropriate index
   * maintains ascending order of elements
   * uses a linear search to find appropriate index
   ***/

    //Best Case(need to place newVal in index 0): O(1) After 1 comparison adds newVal to the beginning of the data set. Doesn't vary with size of data set.
    //Worst Case(need to add newVal to the back): O(n). Searches in a linear fashion through all the elements to find the proper spot.
  public void addLinear( Comparable newVal )
  { 
    for( int p = 0; p < _data.size(); p++ ) {
	    if ( newVal.compareTo( _data.get(p) ) < 0 ) { 
        //newVal < oal[p]
        _data.add( p, newVal );
        return; //Q:why not break?
	    }
    }
    _data.add( newVal ); //newVal > every item in oal, so add to end 
    }
    //Best Case(newVal needs to be placed in the middle): O(1) After 1 comparison adds newVal to the data set. Doesn't vary with size of data set.
    //Worst Case: O(log n) Halves data set every time until proper locatio is found for newVal.
    public void addBin(Comparable newVal){

	int lo = 0;
	int hi = size()-1;
	int mid;

	while(lo <= hi){

	    //get middle
	    mid = (lo+hi) / 2;

	    //variable holds whether newVal is equal, less than, or greater than elem at mid
	    int check = newVal.compareTo(get(mid));
	    
	    if(check == 0){
		_data.add(mid,newVal);
	
	    }

	    //if newVal greater than elem at mid look at the right
	    else if(check > 0){
		lo = mid + 1;

	    }
	    //if newVal less than elem at mid look at the left
	    else{

		hi = mid - 1;
	    }

	 
	}

	_data.add(lo,newVal);
    }

    
    // VOID version of bubbleSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order

    /* Best Case: O(n). Passing n-1 times but performing no swaps. Ignore -1 -> n
       Worst Case: O(n^2). Passing n-1 times and performing 1+2+3 + ... (n-1) swaps. Ignoring unimpactful terms(ex:-1) ->  n*n
     
     */
    public static void bubbleSort( ArrayList<Comparable> data ) {
	//count numbers of swaps and comparisons
	int swapCtr = 0;
	int compCtr = 0;
	
	//make n-1 passes across collection
	for( int passCtr = 1; passCtr < data.size(); passCtr++ ) {
	    System.out.println( "commencing pass #" + passCtr + "..." );

	    //iterate from first to next-to-last element
	    for( int i = 0; i < data.size()-1; i++ ) {
		//if element at i > element at i+1, swap
		if ( data.get(i).compareTo(data.get(i+1) ) > 0 ){
		    data.set( i, data.set(i+1,data.get(i)) );
		    swapCtr += 1;
		    //System.out.println(data); //diag: show current state of list
		}
		compCtr += 1;
	    }
	}
	System.out.println("Swaps: " + swapCtr + ", " + "Comparisons: " + compCtr);
    }//end bubbleSort

    // VOID version of InsertionSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order

    /* Best Case: O(n). n-1 passes but 0 swaps made. Ignoring -1 -> n
       Worst Case: O(n^2). n-1 passes and performing 1+2+3 + ... (n-1) swaps. Ignoring unimpactful terms(ex:-1) ->  n*n
     
    */
    public static void insertionSort( ArrayList<Comparable> data )
    {
	int swapCtr = 0;
	int compCtr = 0;
	
	for( int partition = 1; partition < data.size(); partition++ ) {
	    //partition marks first item in unsorted region

	    //diag:
	    System.out.println( "\npartition: " + partition + "\tdataset:");
	    System.out.println( data ); 

	    //traverse sorted region from right to left
	    for( int i = partition; i > 0; i-- ) {

		compCtr += 1;
		// "walk" the current item to where it belongs
		// by swapping adjacent items
		if ( data.get(i).compareTo( data.get(i-1) ) < 0 ) {
		    //diag:
		    System.out.println( "swap indices "+(i-1)+" & "+i+"..." );
		    data.set( i, data.set( i-1, data.get(i) ) );
		    swapCtr +=1;
		}
		else 
		    break; 
	    }
	}
	System.out.println("Swaps: " + swapCtr + ", " + "Comparisons: " + compCtr);
	
    }//end insertionSort

    // VOID version of SelectionSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order

    //NOTE: SelectionSort has one best or worst scenario so getting one efificency time is enough.

    // Best/Worst: O(n^2): n-1 passes and n-1 swaps. n * n (ignoring -1's) -> n^2
    public static void selectionSort( ArrayList<Comparable> data ) 
    {
	int swapCtr = 0;
	int compCtr = 0;
	//note: this version places greatest value at rightmost end,

	//maxPos will point to position of SELECTION (greatest value)
	int maxPos;

	for( int pass = data.size()-1; pass > 0; pass-- ) {
	    System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
	    maxPos = 0;
	    for( int i = 1; i <= pass; i++ ) {
		System.out.println( "maxPos: " + maxPos );//diag
		System.out.println( data );//diag
		if ( data.get(i).compareTo( data.get(maxPos) ) > 0 )
		    maxPos = i;
		compCtr +=1;
	    }
	    data.set( maxPos, ( data.set( pass, data.get(maxPos) ) ) );
	    swapCtr += 1;
	    System.out.println( "after swap: " +  data );//diag
	   
	}
	System.out.println("Swaps: " + swapCtr + ", " + "Comparisons: " + compCtr);	    
    }//end selectionSort
    
}
