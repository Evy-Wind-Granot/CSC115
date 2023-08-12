public class A4Tester {
	private static int testPassCount = 0;
	private static int testCount = 0;
	
	public static void main (String[] args)	{
		testCount = 0;
		testPassCount = 0;
		
		/* Part 1: Using the List ADT */		
		testPeopleCount();
		testAdultsCount();
		testDistanceAway();
		testDistanceToTallest();
		testNumberVisible();
		testNumberOfAdultsInARow();
		
		/* Part 2: Implementing the Generic Stack ADT */
		testStackOperations();
		testStackIsGeneric();
		
		System.out.println("Passed " + testPassCount + " / " + testCount + " tests");
	}
	

	public static void testPeopleCount() {
		System.out.println("\nTesting peopleCount...");
		
		Person p1 = new Person("Ali", 165, 18); 
		Person p2 = new Person("Sam", 170, 21); 
		Person p3 = new Person("Lee", 140, 16); 
		Person p4 = new Person("Jo",  190, 24); 
		Person p5 = new Person("Tay", 170, 12); 
		Person p6 = new Person("Ali", 200, 20); 
		Person p7 = new Person("Ola", 177, 19); 
		Person p8 = new Person("Ali", 195, 18); 
		Person p9 = new Person("gri", 195, 0); 
		Person p10 = new Person("lee", 195, 1); 
		
		Person[] arr1 = {p1};
		Person[] arr2 = {p1, p4, p3, p2};
		Person[] arr3 = {p1, p2, p3, p4, p5, p6, p7, p8};
		Person[] arr0 = {};
		Person[] arr4 = {p9, p10, p3, p2};
		Person[] arr5 = {p10, p10, p2, p2};
		
		List list1 = new ArrayList(arr1);
		List list2 = new ArrayList(arr2);
		List list3 = new ArrayList(arr3);
		List list0 = new ArrayList(arr0);
		List list4 = new ArrayList(arr4);
		List list5 = new ArrayList(arr5);
		
		int result = 0;
		int expected = 0;
		
		result = A4Exercises.peopleCount(list1);
		expected = 1;
		displayResults(result == expected, "peopleCount(list1)");

		result = A4Exercises.peopleCount(list0);
		expected = 0;
		displayResults(result == expected, "peopleCount(list0)");
		
		result = A4Exercises.peopleCount(list2);
		expected = 4;
		displayResults(result == expected, "peopleCount(list2)");
		
		result = A4Exercises.peopleCount(list3);
		expected = 8;
		displayResults(result == expected, "peopleCount(list3)");

		result = A4Exercises.peopleCount(list4);
		expected = 4;
		displayResults(result == expected, "peopleCount(list4)");

		result = A4Exercises.peopleCount(list0);
		expected = 0;
		displayResults(result == expected, "peopleCount(list0)");
		
		result = A4Exercises.peopleCount(list5);
		expected = 4;
		displayResults(result == expected, "peopleCount(list0)");
		
		// Add tests until you are sure your implementation 
		// produces the correct result for all inputs

	}
	
	
	public static void testAdultsCount() {
		System.out.println("\nTesting adultsCount...");
		
		Person p1 = new Person("Ali", 165, 18); 
		Person p2 = new Person("Sam", 170, 21); 
		Person p3 = new Person("Lee", 140, 16); 
		Person p4 = new Person("Jo",  190, 24); 
		Person p5 = new Person("Tay", 170, 12); 
		Person p6 = new Person("Ali", 200, 20); 
		Person p7 = new Person("Ola", 177, 19); 
		Person p8 = new Person("Ali", 195, 18); 
		Person p9 = new Person("gri", 195, 0); 
		Person p10 = new Person("lee", 195, 1); 
		
		Person[] arr1 = {p1};
		Person[] arr2 = {p1, p4, p3, p2};
		Person[] arr3 = {p1, p2, p3, p4, p5, p6, p7, p8};
		Person[] arr0 = {};
		Person[] arr4 = {p9, p10, p3, p2};
		Person[] arr5 = {p10, p10, p5, p5};
		
		List list1 = new ArrayList(arr1);
		List list2 = new ArrayList(arr2);
		List list3 = new ArrayList(arr3);
		List list0 = new ArrayList(arr0);
		List list4 = new ArrayList(arr4);
		List list5 = new ArrayList(arr5);
		
		int result = 0;
		int expected = 0;
		
		result = A4Exercises.adultsCount(list1);
		expected = 1;
		displayResults(result == expected, "adultsCount(list1)");
		
		result = A4Exercises.adultsCount(list2);
		expected = 3;
		displayResults(result == expected, "adultsCount(list2)");
		
		result = A4Exercises.adultsCount(list3);
		expected = 6;
		displayResults(result == expected, "adultsCount(list3)");

		result = A4Exercises.adultsCount(list0);
		expected = 0;
		displayResults(result == expected, "adultsCount(list0)");

		result = A4Exercises.adultsCount(list4);
		expected = 1;
		displayResults(result == expected, "adultsCount(list4)");
		
		result = A4Exercises.adultsCount(list5);
		expected = 0;
		displayResults(result == expected, "adultsCount(list4)");
		// Add tests until you are sure your implementation 
		// produces the correct result for all inputs

		
	}


	public static void testDistanceAway() {
		System.out.println("\nTesting distanceAway...");
		
		Person p1 = new Person("Ali", 165, 18); 
		Person p2 = new Person("Sam", 170, 21); 
		Person p3 = new Person("Lee", 140, 16); 
		Person p4 = new Person("Jo",  190, 24); 
		Person p5 = new Person("Tay", 170, 12); 
		Person p6 = new Person("Ali", 200, 20); 
		Person p7 = new Person("Ola", 177, 19); 
		Person p8 = new Person("Ali", 195, 19); 
		
		Person[] arr0 = {};
		Person[] arr1 = {p1};
		Person[] arr2 = {p1, p4, p3, p2};
		Person[] arr3 = {p1, p2, p3, p4, p5, p6, p7, p8};
		
		List list0 = new ArrayList(arr0);
		List list1 = new ArrayList(arr1);
		List list2 = new ArrayList(arr2);
		List list3 = new ArrayList(arr3);
		
		int result = 0;
		int expected = 0;
		
		result = A4Exercises.distanceAway(list0, p1);
		expected = -1;
		displayResults(result==expected, "distanceAway(list0, p1)");

		result = A4Exercises.distanceAway(list1, p2);
		expected = -1;
		displayResults(result==expected, "distanceAway(list1, p2)");

		result = A4Exercises.distanceAway(list1, p1);
		expected = 0;
		displayResults(result==expected, "distanceAway(list1, p1)");
		
		result = A4Exercises.distanceAway(list2, p2);
		expected = 3;
		displayResults(result==expected, "distanceAway(list2, p2)");
		
		result = A4Exercises.distanceAway(list3, p3);
		expected = 2;
		displayResults(result==expected, "distanceAway(list3, p3)");

		// Add tests until you are sure your implementation 
		// produces the correct result for all inputs		
		
	}
	

	public static void testDistanceToTallest() {
		System.out.println("\nTesting distanceToTallest...");
		
		Person p1 = new Person("Ali", 165, 18); 
		Person p2 = new Person("Sam", 170, 21); 
		Person p3 = new Person("Lee", 140, 16); 
		Person p4 = new Person("Jo",  190, 24); 
		Person p5 = new Person("Tay", 170, 12); 
		Person p6 = new Person("Ali", 200, 20); 
		Person p7 = new Person("Ola", 177, 19); 
		Person p8 = new Person("Ali", 195, 18); 
		
		Person[] arr0 = {};
		Person[] arr1 = {p1};
		Person[] arr2 = {p1, p4, p3, p2};
		Person[] arr3 = {p4, p2, p2, p4};
		Person[] arr4 = {p1, p2, p3, p4, p5, p6, p7, p8};
		
		List list0 = new ArrayList(arr0);
		List list1 = new ArrayList(arr1);
		List list2 = new ArrayList(arr2);
		List list3 = new ArrayList(arr3);
		List list4 = new ArrayList(arr4);
		
		int result = 0;
		int expected = 0;	
		
		result = A4Exercises.distanceToTallest(list0);
		expected = 0;
		displayResults(result==expected, "distanceToTallest(list0, p1)");
		
		result = A4Exercises.distanceToTallest(list1);
		expected = 0;
		displayResults(result==expected, "distanceToTallest(list1)");
		
		result = A4Exercises.distanceToTallest(list2);
		expected = 1;
		displayResults(result==expected, "distanceToTallest(list2)");

		result = A4Exercises.distanceToTallest(list3);
		expected = 0;
		displayResults(result==expected, "distanceToTallest(list3)");
		
		result = A4Exercises.distanceToTallest(list4);
		expected = 5;
		displayResults(result==expected, "distanceToTallest(list4)");
		
		// Write more of your own tests here

	}
	
	
	public static void testNumberVisible() {
		System.out.println("\nTesting numberVisible...");
		
		Person p1 = new Person("Ali", 165, 18); 
		Person p2 = new Person("Sam", 170, 21); 
		Person p3 = new Person("Lee", 140, 16); 
		Person p4 = new Person("Jo",  190, 24); 
		Person p5 = new Person("Tay", 170, 12); 
		Person p6 = new Person("Ali", 200, 20); 
		Person p7 = new Person("Ola", 177, 19); 
		Person p8 = new Person("Ali", 195, 18); 
		
		Person[] arr1 = {p1};
		Person[] arr2 = {p1, p4, p3, p2};
		Person[] arr3 = {p4, p2, p2, p4};
		Person[] arr4 = {p1, p2, p3, p4, p5, p6, p7, p8};
		Person[] arr5 = {p6, p2, p2, p4};
		Person[] arr6 = {p1, p2, p6};
		
		List list1 = new ArrayList(arr1);
		List list2 = new ArrayList(arr2);
		List list3 = new ArrayList(arr3);
		List list4 = new ArrayList(arr4);
		List list5 = new ArrayList(arr5);
		List list6 = new ArrayList(arr6);
		
		int result = 0;
		int expected = 0;		
		
		result = A4Exercises.numberVisible(list1);
		expected = 1;
		displayResults(result==expected, "numberVisible(list1)");
		
		result = A4Exercises.numberVisible(list2);
		expected = 2;
		displayResults(result==expected, "numberVisible(list2)");

		result = A4Exercises.numberVisible(list3);
		expected = 1;
		displayResults(result==expected, "numberVisible(list3)");
		
		result = A4Exercises.numberVisible(list4);
		expected = 4;
		displayResults(result==expected, "numberVisible(list4)");

		result = A4Exercises.numberVisible(list5);
		expected = 1;
		displayResults(result==expected, "numberVisible(list5)");

		result = A4Exercises.numberVisible(list6);
		expected = 3;
		displayResults(result==expected, "numberVisible(list6)");
		
		// Write more of your own tests here
		
	}

	public static void testNumberOfAdultsInARow() {
		System.out.println("\n Testing numberOfAdultsInARow...");
		
		Person p1 = new Person("Ali", 165, 18); 
		Person p2 = new Person("Sam", 170, 21); 
		Person p3 = new Person("Lee", 140, 16); 
		Person p4 = new Person("Jo",  190, 24); 
		Person p5 = new Person("Tay", 170, 12); 
		Person p6 = new Person("Ali", 200, 20); 
		Person p7 = new Person("Ola", 177, 19); 
		Person p8 = new Person("Ali", 195, 18); 
		
		Person[] arr1 = {};
		Person[] arr2 = {p1, p4, p3, p2};
		Person[] arr3 = {p4, p3, p2, p1};
		Person[] arr4 = {p1, p2, p3, p4, p6, p7, p5, p8};
		Person[] arr5 = {p1};
		Person[] arr6 = {p5};
		
		List list1 = new ArrayList(arr1);
		List list2 = new ArrayList(arr2);
		List list3 = new ArrayList(arr3); //24, 16, 21, 18
		List list4 = new ArrayList(arr4);
		List list5 = new ArrayList(arr5);
		List list6 = new ArrayList(arr6);
		
		int result = 0;
		int expected = 0;
		
		result = A4Exercises.numberOfAdultsInARow(list1);
		expected = 0;
		displayResults(result==expected, "numberOfAdultsInARow(list1)");
		
		result = A4Exercises.numberOfAdultsInARow(list2);
		expected = 2;
		displayResults(result==expected, "numberOfAdultsInARow(list2)");
		
		result = A4Exercises.numberOfAdultsInARow(list3);
		expected = 2;
		displayResults(result==expected, "numberOfAdultsInARow(list3)");
		
		result = A4Exercises.numberOfAdultsInARow(list4);
		expected = 3;
		displayResults(result==expected, "numberOfAdultsInARow(list4)");

		result = A4Exercises.numberOfAdultsInARow(list5);
		expected = 1;
		displayResults(result==expected, "numberOfAdultsInARow(list6)");
		
		result = A4Exercises.numberOfAdultsInARow(list6);
		expected = 0;
		displayResults(result==expected, "numberOfAdultsInARow(list6)");
		// Write more of your own tests here
	
	}

	public static void testStackOperations() {
		System.out.println("\nTesting stack operations...");
		A4Stack<Integer> testStack = new A4Stack<Integer>();
		Integer result = 0;
		
		displayResults(testStack.isEmpty(), "stack initially empty");
				
		testStack.push(2);
		result = testStack.peek();
		displayResults(!testStack.isEmpty(), "stack no longer empty");
		displayResults(result.equals(2), "peek works after initial push");

		testStack.push(6);
		result = testStack.peek();
		displayResults(!testStack.isEmpty(), "stack no longer empty");
		displayResults(result.equals(6), "peek works after initial push");

		testStack.push(8);
		result = testStack.peek();
		displayResults(!testStack.isEmpty(), "stack no longer empty");
		displayResults(result.equals(8), "peek works after initial push");

		testStack.pop();
		result = testStack.peek();
		displayResults(!testStack.isEmpty(), "stack no longer empty");
		displayResults(result.equals(6), "peek works after initial push");


		
		// Write more of your own tests here
		
	}
	
	public static void testStackIsGeneric() {
		System.out.println("\nTesting generics...");
		A4Stack<Integer> s1 = new A4Stack<Integer>();
		A4Stack<String> s2 = new A4Stack<String>();
		A4Stack<Double> s3 = new A4Stack<Double>();
		
		Integer result1;
		String result2;
		Double result3;
		
		s1.push(3);
		s1.push(8);
		s2.push("CSC");
		s2.push("ENGR");
		s3.push(5.5);
		s3.push(9.1);

		result1 = s1.pop();
		result2 = s2.pop();
		result3 = s3.pop();
		
		displayResults(result1.equals(8), "Integer Stack");
		displayResults(result2.equals("ENGR"), "String Stack");
		displayResults(result3.equals(9.1), "Double Stack");		

		// Write more of your own tests here
				
	}
	
	public static void displayResults (boolean passed, String testName) {
		testCount++;
		if (passed)	{
			System.out.println ("Passed test: " + testCount);
			testPassCount++;
		} else {
			System.out.println ("Failed test: " + testName + " at line "
								+ Thread.currentThread().getStackTrace()[2].getLineNumber());
		}
	}
}