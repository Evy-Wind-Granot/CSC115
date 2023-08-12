// /*
//  * ArrayBasedBinaryTree.java
//  *
//  * An array-based BinaryTree meant to store values of type Integer
//  */
// public class ArrayBasedBinaryTree implements BinaryTree {
//     private static final int CAPACITY = 5;
//     protected Integer[] data;
//     protected int root;
//     protected int size;
    
// 	public ArrayBasedBinaryTree() {
// 		// TODO...
// 		// allocate space for data array.
// 		// What index are you choosing the root to be?
// 		// initialize your size as the number of elements in the empty tree
// 		data = new Integer[CAPACITY];
// 		root = 0;
// 		size = 0;
// 	}

// 	/*
// 	 * Purpose: inserts the given value into data at next available
// 	 *  position in a level-order traversal
// 	 *  The tree remains complete after insertion.
// 	 * Parameters: Integer value - value to insert
// 	 * Returns: nothing
// 	 */
// 	public void insert(Integer value) {
// 		// TODO...
// 		// NOTE: The underlying data structure is an array,
// 		//  but we are just USING the array to store the data.
// 		//  The way we traverse the data will expose its binary tree structure
// 		System.out.println(size);
// 		if(size >= data.length){
// 			expandAndCopy();
// 		}
// 		if(size == 0){
// 			root = 1;
// 			data[size] = value;
// 			System.out.println(size);
// 			size++;
// 		}else{
// 			data[size] = value;//might need to change to size
// 			System.out.println(size);
// 			size++;
// 			insertRec(value, size, false);
// 		}
// 	}
// 	private void insertRec(Integer value, int i, boolean inserted){
// 		if(inserted){
// 			return;
// 		}
		
// 		Integer temp = null;
// 		if(value > data[(i)/2]){
// 			temp = data[(i)/2];
// 			data[(i)/2] = value;
// 			data[i] = temp;
// 			insertRec(value, (i)/2, inserted);
// 		}else if (value <= data[(i)/2]){
// 			inserted = true;
// 			//size++;
// 			insertRec(value, i, inserted);
// 		}
// 	}

// 	protected void expandAndCopy() {
// 		Integer[] newData = new Integer[data.length*2];
// 		for(int i=1; i<data.length; i++) {
// 			newData[i] = data[i];
// 		}
// 		data = newData;
// 	}

// 	/*
// 	 * Purpose: calculates and returns the index of t's left child
// 	 * Parameters: int t - index of current element in this ArrayBasedBinaryTree
// 	 * Returns: int - index of left child
// 	 */
// 	protected int getLeft(int t) {
// 		// TODO...
// 		int leftIndex = (2 * t);
//         return leftIndex;
// 	}

// 	/*
// 	 * Purpose: calculates and returns the index of t's right child
// 	 * Parameters: int t - index of current element in this ArrayBasedBinaryTree
// 	 * Returns: int - index of right child
// 	 */
// 	protected int getRight(int t) {
// 		// TODO...
// 		int rightIndex = (2 * t) + 1;
//         return rightIndex;
// 	}


// 	public void inOrder() {
//         inOrderRec(root);
//         System.out.println();
//     }

//     private void inOrderRec(int i) {
//         if (i != 0) {
//             return;
//         }
//         inOrderRec(getLeft(i));
//         System.out.print(data[i] + " ");
//         inOrderRec(getRight(i));
//     }


// 	public void preOrder() {
//         preOrderRec(root);
// 		System.out.println();
//     }
// 	private void preOrderRec(int i){
// 		if(i != -1){
// 			return;
// 		}
// 		System.out.print(data[i] + " ");
// 		preOrderRec(getLeft(i));
// 		preOrderRec(getLeft(i));
// 	}


// 	public void postOrder() {
// 		postOrderRec(root);
// 		System.out.println();
//     }
// 	private void postOrderRec(int i){
// 		if(i != -1){
// 			return;
// 		}
// 		preOrderRec(getLeft(i));
// 		preOrderRec(getLeft(i));
// 		System.out.print(data[i] + " ");
// 	}


// 	public int height() {
// 		return height(root);
// 	}

// 	/*
// 	 * Purpose: computes and returns the height of a 
// 	 *          binary tree rooted at index t 
// 	 * Parameters: TreeNode t - the BinaryTree
// 	 * Returns: int - the height
// 	 * NOTE: a BinaryTree with no nodes is height -1
// 	 *       a BinaryTree with just a root is height 0
// 	 *
// 	 *       the height of a node in a tree is equal to 
// 	 *       1 + the height of its largest subtree
// 	 */
// 	protected int height(int t) {
// 		if (t >= size) {
//             return -1;
//         } 
// 		// TODO: complete the rest}
// 		return 1 + Math.max(height(getLeft(t)), height(getRight(t)));
// 	}
	

// 	/*
// 	 * Purpose: returns a String reprensentation of a in-order traversal
// 	 *     of this ArrayBasedBinaryTree
// 	 * Parameters: none
// 	 * Returns: String - the representation
// 	 */
// 	// written for you - do not change
// 	// NOTICE: we use the helper methods to get the index of the left/right
// 	//   children of the current position in the tree.
// 	// This method will not work until you have completed those methods correctly.
// 	public String toString() {
// 		return toString(root);
// 	}

// 	private String toString(int t) {
//         if (t >= size) {
//             return "";
//         } 
//         String s = "";
//         s += toString(getLeft(t));
//         s += data[t] + " ";
//         s += toString(getRight(t));

//         return s;
// 	}

// 	public static void main(String[] args) {
		
// 		ArrayBasedBinaryTree myTree = new ArrayBasedBinaryTree();
// 		for(int i=2; i<8; i++) {
// 			myTree.insert(i);
// 		}
// 		System.out.println("in");
// 		myTree.inOrder();
// 		System.out.println("pre");
// 		myTree.preOrder();
// 		System.out.println("post");
// 		myTree.postOrder();
		
// 		System.out.println("toString\n" + myTree);
// 	}
    
// }
public class ArrayBasedBinaryTree implements BinaryTree {
    private static final int CAPACITY = 100;
    protected Integer[] data;
    protected int root;
    protected int size;
    
    public ArrayBasedBinaryTree() {
        data = new Integer[CAPACITY];
        root = 0;
        size = 0;
    }

    public void insert(Integer value) {
        if(size >= data.length){
			expandAndCopy();
		}
        data[size] = value;
		System.out.println(value);
        size++;
    }
    protected void expandAndCopy() {
		Integer[] newData = new Integer[data.length*2];
		for(int i=0; i<data.length; i++) {
			newData[i] = data[i];
		}
		data = newData;
	}

    protected int getLeft(int t) {
        return (2 * t) + 1;
    }

    protected int getRight(int t) {
        return (2 * t) + 2;
    }

    public void inOrder() {
        inOrder(root);
        System.out.println();
    }

    private void inOrder(int t) {
        if (t >= size) {
			return;
		}
        inOrder(getLeft(t));
        System.out.print(data[t] + " ");
        inOrder(getRight(t));
    }

    public void preOrder() {
        preOrder(root);
        System.out.println();
    }

    private void preOrder(int t) {
        if (t >= size) {
			return;
		}
        System.out.print(data[t] + " ");
        preOrder(getLeft(t));
        preOrder(getRight(t));
        
    }

    public void postOrder() {
        postOrder(root);
        System.out.println();
    }

    private void postOrder(int t) {
		if (t >= size) {
			return;
		}
        postOrder(getLeft(t));
        postOrder(getRight(t));
        System.out.print(data[t] + " ");
    }

    public int height() {
        return height(root);
    }

    protected int height(int t) {
        if (t >= size) {
            return -1;
        }
        int leftHeight = height(getLeft(t));
        int rightHeight = height(getRight(t));
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public String toString() {
        return toString(root);
    }

    private String toString(int currentIndex) {
        if (currentIndex >= size) {
            return "";
        }
        String leftString = toString(getLeft(currentIndex));
        String rightString = toString(getRight(currentIndex));
        return leftString + data[currentIndex] + " " + rightString;
    }

    public static void main(String[] args) {
        ArrayBasedBinaryTree myTree = new ArrayBasedBinaryTree();
        for (int i = 2; i < 8; i++) {
            myTree.insert(i);
        }

        System.out.println("In-order traversal:");
        myTree.inOrder();

        System.out.println("Pre-order traversal:");
        myTree.preOrder();

        System.out.println("Post-order traversal:");
        myTree.postOrder();

        System.out.println("toString\n" + myTree);
    }
}