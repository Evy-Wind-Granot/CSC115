/*
 * A3Tester
 *
 * A class to test the methods required for Assignment 3
 *
 */
public class A3Tester {
    
	private static int testPassCount = 0;
	private static int testCount = 0;

    public static void main(String[] args) {
		
		/*
		Uncomment each method one at a time, 
		and implement the method in A3LinkedList.java 
		until all tests pass. It is strongly
		recommended that you add additional tests 
		to ensure the correctness of your implementation.
		*/
		
		/* Part 1: */
		testAddFront();
		testAddBack();
		testSizeAndIsEmpty();
		testRemoveFront();
		testRemoveBack();
		
		/* Part 2 */
		testSwapEnds();
		testRemoveAll();
		
		System.out.println("Passed " + testPassCount + " / " + testCount + " tests");
    }
	
		
	public static void testAddFront() {
		System.out.println("\nTesting addFront...");
		String result = "";
		A3LinkedList list1 = new A3LinkedList();
		
		result = list1.frontToBack();
		displayResults(result.equals("{}"), "testAddFront");
		
		list1.addFront("A");
		result = list1.frontToBack();
		displayResults(result.equals("{A}"), "testAddFront");
		
		list1.addFront("V");
		list1.addFront("A");
		list1.addFront("J");
		result = list1.frontToBack();
		displayResults(result.equals("{JAVA}"), "testAddFront");
		result = list1.backToFront();
		displayResults(result.equals("{AVAJ}"), "testAddFront");
	}
	
	public static void testAddBack() {
		System.out.println("\nTesting addBack...");
		String result = "";
		A3LinkedList list1 = new A3LinkedList();
		
		result = list1.frontToBack();
		displayResults(result.equals("{}"), "testAddBack");
		
		list1.addBack("F");
		result = list1.frontToBack();
		displayResults(result.equals("{F}"), "testAddBack");
		
		list1.addBack("U");
		list1.addBack("N");
		result = list1.frontToBack();
		displayResults(result.equals("{FUN}"), "testAddBack");
		result = list1.backToFront();
		displayResults(result.equals("{NUF}"), "testAddBack");
	}
	
	public static void testSizeAndIsEmpty() {
		System.out.println("\nTesting size and isEmpty...");
		int result = 0;
		A3LinkedList list1 = new A3LinkedList();

		result = list1.size();
		displayResults(result==0, "testSizeAndIsEmpty");
		displayResults(list1.isEmpty()==true, "testSizeAndIsEmpty");
		
		list1.addFront("C");
		list1.addFront("S");
		list1.addFront("C");
		result = list1.size();
		displayResults(result==3, "testSizeAndIsEmpty");
		displayResults(list1.isEmpty()==false, "testSizeAndIsEmpty");
		
		list1.addBack("115");
		result = list1.size();
		displayResults(result==4, "testSizeAndIsEmpty");
		
	}
	
	public static void testRemoveFront() {
		System.out.println("\nTesting removeFront...");
		String result = "";
		A3LinkedList list1 = new A3LinkedList();

		list1.removeFront();
		result = list1.frontToBack();
		displayResults(result.equals("{}"), "testRemoveFront");
		
		list1.addBack("P");
		list1.addBack("I");
		list1.addBack("N");
		list1.addBack("K");
		result = list1.frontToBack();
		displayResults(result.equals("{PINK}"), "testRemoveFront");
		
		list1.removeFront();
		result = list1.frontToBack();
		displayResults(result.equals("{INK}"), "testRemoveFront");

		list1.removeFront();
		result = list1.frontToBack();
		displayResults(result.equals("{NK}"), "testRemoveFront");

		list1.removeFront();
		result = list1.frontToBack();
		displayResults(result.equals("{K}"), "testRemoveFront");

		list1.removeFront();
		result = list1.frontToBack();
		displayResults(result.equals("{}"), "testRemoveFront");
		
		/* Write additional tests here to ensure all of your pointers
		   have been updated correctly.
		
		   You should also ensure that your size and isEmpty 
		   methods work with removal as well as addition */
				
	}
	
	public static void testRemoveBack() {
		System.out.println("\nTesting removeBack...");
		String result = "";
		A3LinkedList list1 = new A3LinkedList();

		list1.removeBack();
		result = list1.frontToBack();
		displayResults(result.equals("{}"), "testRemoveBack");
		
		list1.addBack("P");
		list1.addBack("I");
		list1.addBack("N");
		list1.addBack("K");
		result = list1.frontToBack();
		displayResults(result.equals("{PINK}"), "testRemoveBack");
		
		list1.removeBack();
		result = list1.frontToBack();
		displayResults(result.equals("{PIN}"), "testRemoveBack");

		list1.removeBack();
		result = list1.frontToBack();
		displayResults(result.equals("{PI}"), "testRemoveBack");

		list1.removeBack();
		result = list1.frontToBack();
		displayResults(result.equals("{P}"), "testRemoveBack");

		list1.removeBack();
		result = list1.frontToBack();
		displayResults(result.equals("{}"), "testRemoveBack");
	}
	
	public static void testSwapEnds() {
		System.out.println("\nTesting swapEnds...");
		A3LinkedList list1 = new A3LinkedList();
		A3LinkedList list2 = new A3LinkedList();
		A3LinkedList list3 = new A3LinkedList();
		String result1;
		String result2;		
		
		list1.addBack("t");
		list1.addBack("e");
		list1.addBack("a");
		list1.addBack("m");

		list2.addBack("a");

		list3.addBack("a");
		list3.addBack("b");
		list3.addBack("c");
		
		list1.swapEnds();
		result1 = list1.frontToBack();
		result2 = list1.backToFront();
		displayResults(result1.equals("{meat}"), "swapEnds on team");
		displayResults(result2.equals("{taem}"), "swapEnds on team");

		list1.swapEnds();
		result1 = list1.frontToBack();
		result2 = list1.backToFront();
		displayResults(result1.equals("{team}"), "swapEnds on team");
		displayResults(result2.equals("{maet}"), "swapEnds on team");

		list2.swapEnds();
		result1 = list2.frontToBack();
		result2 = list2.backToFront();
		displayResults(result1.equals("{a}"), "swapEnds on team");
		displayResults(result2.equals("{a}"), "swapEnds on team");

		list3.swapEnds();
		result1 = list3.frontToBack();
		result2 = list3.backToFront();
		System.out.println(result1);
		displayResults(result1.equals("{cba}"), "swapEnds on team");
		displayResults(result2.equals("{abc}"), "swapEnds on team");
		
		
		A3LinkedList list5 = new A3LinkedList();
		list5.addBack("d");
		list5.addBack("a");
		list5.addBack("t");
		list5.addBack("e");
		list5.addBack("r");
		
		list5.swapEnds();
		result1 = list5.frontToBack();
		result2 = list5.backToFront();
		displayResults(result1.equals("{rated}"), "swapEnds on dater");
		displayResults(result2.equals("{detar}"), "swapEnds on dater");
		
		// Write more tests here
				
	}
	
	
	public static void testRemoveAll() {
		System.out.println("\nTesting removeAll...");
		A3LinkedList list1 = new A3LinkedList();
		A3LinkedList list2 = new A3LinkedList();
		String result1;
		String result2;
		
		list1.removeAll("b");
		result1 = list1.frontToBack();
		result2 = list1.backToFront();
		displayResults(result1.equals("{}"), "removeAll b's from abc");
		displayResults(result2.equals("{}"), "removeAll b's from abc");
		displayResults(list1.size()==0, "size after removeAll");
				
		list1.addBack("a");
		list1.addBack("b");
		list1.addBack("c");
		
		list2.addBack("a");
		list2.addBack("b");
		list2.addBack("c");
		list2.addBack("b");
		list2.addBack("d");

		list1.removeAll("c");
		result1 = list1.frontToBack();
		result2 = list1.backToFront();
		displayResults(result1.equals("{ab}"), "removeAll c's from abc");
		displayResults(result2.equals("{ba}"), "removeAll c's from abc");
		displayResults(list1.size()==2, "size after removeAll");
		
		list1.removeAll("b");
		result1 = list1.frontToBack();
		result2 = list1.backToFront();
		displayResults(result1.equals("{a}"), "removeAll b's from abc");
		displayResults(result2.equals("{a}"), "removeAll b's from abc");
		displayResults(list1.size()==1, "size after removeAll");

		list1.removeAll("a");
		result1 = list1.frontToBack();
		result2 = list1.backToFront();
		displayResults(result1.equals("{}"), "removeAll a's from abc");
		displayResults(result2.equals("{}"), "removeAll a's from abc");
		displayResults(list1.size()== 0, "size after removeAll");
		
		list2.removeAll("a");
		result1 = list2.frontToBack();
		result2 = list2.backToFront();
		displayResults(result1.equals("{bcbd}"), "removeAll a's from abcbd");
		displayResults(result2.equals("{dbcb}"), "removeAll a's from abcbd");
		displayResults(list2.size()==4, "size after removeAll");

		list2.removeAll("d");
		result1 = list2.frontToBack();
		result2 = list2.backToFront();
		displayResults(result1.equals("{bcb}"), "removeAll d's from abcbd");
		displayResults(result2.equals("{bcb}"), "removeAll d's from abcbd");
		displayResults(list2.size()==3, "size after removeAll");
		
		// Write more tests here
		
	}
	
	public static void displayResults (boolean passed, String testName) {
       /* There is some magic going on here getting the line number
        * Borrowed from:
        * http://blog.taragana.com/index.php/archive/core-java-how-to-get-java-source-code-line-number-file-name-in-code/
        */
        
        testCount++;
        if (passed)
        {
            System.out.println ("Passed test: " + testName);
            testPassCount++;
        }
        else
        {
            System.out.println ("Failed test: " + testName + " at line "
                                + Thread.currentThread().getStackTrace()[2].getLineNumber());
        }
    }
	
}
