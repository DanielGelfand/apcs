// Team SuperSort -- Daniel Gelfand & T. Fabiha
// APCS1 pd2
// HW#53 -- Solid Comparative Analysis
// 2017-12-14 r

import java.util.ArrayList;

public class SortTester{
    
    
    public static void main(String[] args){

	/* In the case that the list is already sorted, no swaps are needed.
	 */
	ArrayList sortedCaseBub = new ArrayList<Integer>();
	sortedCaseBub.add(1);
	sortedCaseBub.add(2);
	sortedCaseBub.add(3);
	sortedCaseBub.add(4);

	System.out.println("Sorted bub: " + sortedCaseBub);
	MySorts.bubbleSort(sortedCaseBub);
	System.out.println("Sorted bub after sort: " + sortedCaseBub);
	System.out.println("----------------------------");
	System.out.println();

	/* In the case that the list is in reverse order, the maximum  amount 
	 * of swaps will be needed. 
	 */
	
	ArrayList revSortedCaseBub = new ArrayList<Integer>();
	revSortedCaseBub.add(4);
	revSortedCaseBub.add(3);
	revSortedCaseBub.add(2);
	revSortedCaseBub.add(1);
	
	System.out.println("RevSorted bub: " + revSortedCaseBub);
	MySorts.bubbleSort(revSortedCaseBub);
	System.out.println("RevSorted bub after sort: " + revSortedCaseBub);
	System.out.println("----------------------------");	
	System.out.println();

	
	// sortedCaseBub -- Swaps: 0, Comparisons: 9
	// revSortedCaseBub -- Swaps: 6, Comparisons: 9

	/* Both the sorted and revSorted cases had the same number of comparisons.
	 * But, they had different numbers for swaps, with revSortedCaseBub having
	 * more swaps than sortedCaseBub. Since swaps cost far more than 
	 * comparisons, they are the deciding factor when deciding the 
	 * best/worst. Having more swaps means it costs more, and therefore
	 * revSortedCaseBub is worst. sortedCaseBub has 0 swaps, which is the least
	 * possible number, and so it is the best.
	 */


	// END OF BUBBLE TESTS
	

	ArrayList sortedCaseSel = new ArrayList<Integer>();
	sortedCaseSel.add(1);
	sortedCaseSel.add(2);
	sortedCaseSel.add(3);
	sortedCaseSel.add(4);
	
	System.out.println("Sorted sel: " + sortedCaseSel);
	MySorts.selectionSort(sortedCaseSel);
	System.out.println("Sorted sel after sort: " + sortedCaseSel);
	System.out.println("----------------------------");	
	System.out.println();
    
	ArrayList revSortedCaseSel = new ArrayList<Integer>();
	revSortedCaseSel.add(4);
	revSortedCaseSel.add(3);
	revSortedCaseSel.add(2);
	revSortedCaseSel.add(1);
    
	System.out.println("RevSorted sel: " + revSortedCaseSel);
	MySorts.selectionSort(revSortedCaseSel);
	System.out.println("RevSorted sel after sort: " + revSortedCaseSel);
	System.out.println("----------------------------");	
	System.out.println();

	// sortedCaseSel -- Swaps: 3, Comparisons: 6
	// revSortedCaseSel -- Swaps: 3, Comparisons: 6

	/* Both the sortedCaseSel and revSortedCaseSel cases had the same number of comparisons and
	 * the same number of swaps. The cost, in this case, will always be the
	 * same, no matter. Since the cost does not change, there is no best
	 * or worst, because it will not matter how you input the data.
	 */


	// END OF SELECTION TESTS

	
	ArrayList sortedCaseIns = new ArrayList<Integer>();
	sortedCaseIns.add(1);
	sortedCaseIns.add(2);
	sortedCaseIns.add(3);
	sortedCaseIns.add(4);
	
	System.out.println("Sorted Ins: " + sortedCaseIns);
	MySorts.insertionSort(sortedCaseIns);
	System.out.println("Sorted Ins after sort: " + sortedCaseIns);
	System.out.println("----------------------------");	
	System.out.println();
    
	ArrayList revSortedCaseIns = new ArrayList<Integer>();	
	revSortedCaseIns.add(4);
	revSortedCaseIns.add(3);
	revSortedCaseIns.add(2);
	revSortedCaseIns.add(1);
    
	System.out.println("RevSorted ins: " + revSortedCaseIns);
	MySorts.insertionSort(revSortedCaseIns);
	System.out.println("RevSorted ins after sort: " + revSortedCaseIns);
    

	// sortedCaseIns -- Swaps: 0, Comparisons: 3
	// revSortedCaseIns -- Swaps: 6, Comparisons: 6

	/* The sortedCaseIns and revSortedCaseIns cases didn't have the same number,
	 * for either comparisons or swaps. sortedCaseIns had the least in both categories
	 * so it is the best case. That leaves revSortedCaseIns as the worst, because of
	 * how expensive it is.
	 */

	
	// END OF INSERTION TESTS
    }//end main
    
    
}//end class
