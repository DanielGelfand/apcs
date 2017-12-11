//Daniel Gelfand
//APCS pd2
//HW51 -- Selection
//2017-12-11

/***************************************
 * class SelectionSort -- implements SelectionSort algorithm
 ***************************************/

import java.util.ArrayList;

public class SelectionSort 
{
    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }

    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) {
	int randomIndex;
	for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
	    randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
	    al.set( i, al.set( randomIndex, al.get(i) ) );
	}
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // VOID version of SelectionSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void selectionSortV( ArrayList<Comparable> data ) 
    {
	int minIndex;
      
	//passes
	for(int pass = 0; pass < data.size()-1; pass +=1){
	    //starting points to check for min value
	    minIndex = pass;
        
	    //System.out.println("passCtr: " + pass);
	    for(int i = pass + 1; i < data.size(); i +=1){
		//if elem before is smaller
		if(data.get(i).compareTo(data.get(minIndex)) < 0){
		    //find index of min value in array
		    minIndex = i;
		 
		    //System.out.println("minIndex: " + minIndex);
		}
	
	            
	    }
        
	    //swap elements after finding min
	    swap(data,minIndex, pass);
	  
	    //System.out.println("After a pass and swap: " + data);
	
	
	}
    }//end selectionSortV

    //HELPER FUNCTION FOR BUBBLESORT
    //swaps adjacent elements given the ArrayList and two indexes.
    public static void swap(ArrayList<Comparable> data,int a, int b){

	Comparable temp = data.get(b);
	data.set(b,data.get(a));
	data.set(a,temp);
    }
  

      
    // ArrayList-returning selectionSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable>	selectionSort( ArrayList<Comparable> input ) 
	{
	    ArrayList<Comparable> temp = new ArrayList<Comparable>();

	    //put all values into temp
	    for(Comparable c: input){
		temp.add(c);
	    }

	    //sort it and then return
	    selectionSortV(temp);
	    return temp;

	}    //end selectionSort 


    public static void main( String [] args ) 
    {
	/*	ArrayList glen = new ArrayList<Integer>();
	glen.add(7);
	glen.add(1);
	glen.add(5);
	glen.add(12);
	glen.add(3);
	System.out.println( "ArrayList glen before sorting:\n" + glen );
	selectionSortV(glen);
	System.out.println( "ArrayList glen after sorting:\n" + glen );*/

	/*===============for VOID methods=============
	  ArrayList coco = populate( 10, 1, 1000 );
	  System.out.println( "ArrayList coco before sorting:\n" + coco );
	  selectionSortV(coco);
	  System.out.println( "ArrayList coco after sorting:\n" + coco );

	  ============================================*/


	  ArrayList glen = new ArrayList<Integer>();
	  glen.add(7);
	  glen.add(1);
	  glen.add(5);
	  glen.add(12);
	  glen.add(3);
	  System.out.println( "ArrayList glen before sorting:\n" + glen );
	  ArrayList glenSorted = selectionSort( glen );
	  System.out.println( "sorted version of ArrayList glen:\n" 
	  + glenSorted );
	  System.out.println( "ArrayList glen after sorting:\n" + glen );

	  ArrayList coco = populate( 10, 1, 1000 );
	  System.out.println( "ArrayList coco before sorting:\n" + coco );
	  ArrayList cocoSorted = selectionSort( coco );
	  System.out.println( "sorted version of ArrayList coco:\n" 
	  + cocoSorted );
	  System.out.println( "ArrayList coco after sorting:\n" + coco );
	  System.out.println( coco );
	/*==========for AL-returning methods==========
	  ============================================*/

    }//end main

}//end class SelectionSort
