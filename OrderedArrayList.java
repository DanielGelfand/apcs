//Daniel Gelfand
//APCS1 pd2
//HW47 -- ascending,making wrapper class
//2017-12-05


/********************************
 * class OrderedArrayList
 * wrapper class for ArrayList.
 * Imposes the restriction that stored items 
 * must remain sorted in ascending order
 ********************************/

//ArrayList's implementation is in the java.util package
import java.util.ArrayList;

public class OrderedArrayList
{
    // instance of class ArrayList, holding objects of type Comparable 
    // (ie, instances of a class that implements interface Comparable)
    private ArrayList<Comparable> _data;


    // default constructor initializes instance variable _data
    public OrderedArrayList()
    {
	_data = new ArrayList<Comparable>();
    }


    public String toString()
    {
	String foo = "[";
	for( int i = 0; i < size(); i++ ) {
	    foo += get(i) + ",";
	}
	if ( foo.length() > 1 )
	    //shave off trailing comma
	    foo = foo.substring( 0, foo.length()-1 );
	foo += "]";
    
	return foo;
   
    }


    //uses remove() from ArrayList
    public Comparable remove( int index )
    {	
	Comparable temp = get(index);


	_data.remove(index);
	
	return temp; //placeholder 
        
    }

      
   


    //uses size() from ArrayList
    public int size()
    { 
	return _data.size();
    }

    //uses get() from ArrayList
    public Comparable get( int index )
    { 
   
	return _data.get(index); 
    }


    //uses add methods from ArrayList
    public void add(Comparable newVal)
    {
	for(int i = 0; i < size(); i +=1){
	    //if newVal is smaller than elem at a certain index add it at that index
	    if(get(i).compareTo(newVal) >= 0){
		_data.add(i,newVal);
	       
	      	return; //add newVal at proper position and get out of method
	        
	    }
	  
	}
    
       	_data.add(newVal); //otherwise append to the end
    
    }



    // main method solely for testing purposes
    public static void main( String[] args )
    {
  
	OrderedArrayList Franz = new OrderedArrayList();

	// testing linear search
	for( int i = 0; i < 15; i++ )
	    Franz.add( (int)( 50 * Math.random() ) );
	System.out.println( Franz );
	// System.out.println(Franz.size()); //
  
	//check for sorted-ness
	//if msg does not appear, list was sorted
	for( int i=0; i<Franz.size()-1; i++ ) {
	    System.out.println("at i: " + Franz.get(i) );
	    if ( Franz.get(i).compareTo(Franz.get(i+1)) > 0 ) {
		System.out.println( " *** NOT sorted *** " );
		break;
	    }
	}
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~    
	   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main()

}//end class OrderedArrayList
