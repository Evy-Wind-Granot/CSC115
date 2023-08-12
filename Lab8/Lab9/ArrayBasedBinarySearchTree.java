public class ArrayBasedBinarySearchTree extends ArrayBasedBinaryTree{

    public ArrayBasedBinarySearchTree(){
        super();
    }
    public void insert(Integer value){
        if(data[0] == null){
            data[0] = value;
        }else{
            inserter(value);
        }
    }
    private void inserter(Integer value){
        int i = 0;
        while(data[i] != null){
            if(value <= data[i]){
                i = getLeft(i);
            }else if(value > data[i]){
                i = getRight(i);
            }
        }
        data[i] = value;
    }
    // private void insert(Integer value, int i){
    //     if(value <= data[i]){
    //         i = getLeft(i);
    //         if(data[i] != null){
    //             insert(value, i);
    //         }else{
    //             data[i] = value;
    //         }
    //     }else if(value > data[i]){
    //         i = getLeft(i);
    //         if(data[i] != null){
    //             insert(value, i);
    //         }else{
    //             data[i] = value;
    //         }
    //     }
    // }

    
    public static void main(String[] args) {
        ArrayBasedBinarySearchTree emptyTree = new ArrayBasedBinarySearchTree();
        
        ArrayBasedBinarySearchTree myTree = new ArrayBasedBinarySearchTree();
        myTree.insert(2);
        myTree.insert(1);
        myTree.insert(5);
        myTree.insert(7);
        myTree.insert(0);
        myTree.insert(4);
        myTree.insert(6);
        
        System.out.println("in");
        myTree.inOrder();
        System.out.println("pre");
        myTree.preOrder();
        System.out.println("post");
        myTree.postOrder();
        
        System.out.println("toString\n" + myTree);
    }

}
