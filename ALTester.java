//Daniel Gelfand
//APCS pd2
//HW46 Al<B> Sorted!
//2017-12-04


import java.util.ArrayList;

public class ALTester{

    //populates ArrayList with integers(23 integers in this case)
    public static void pop(ArrayList<Integer> a){

	for(int index = 0; index < 23; index += 1){
	    a.add(index);

      	}

    }

    //checks if ArrayList is sorted(ascending or equal)    
    public static boolean isSorted(ArrayList<Integer> a){


      	for(int i = 1; i < a.size(); i +=1){
	    if(a.get(i-1) > a.get(i))  {
	        return false;
	    }
	   
	}
	return true;
    }

    //main method
    public static void main(String[] args){
	
	ArrayList<Integer> bob = new ArrayList<Integer>();
	pop(bob);
	System.out.println(bob);
	System.out.println(isSorted(bob)); //true
	// System.out.println(bob.size()); //23
	
    }//end main

    
}//end class
