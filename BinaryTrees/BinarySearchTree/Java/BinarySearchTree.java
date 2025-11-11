package BinaryTrees.BinarySearchTree.Java;

public class BinarySearchTree {
    
    public static void main(String[] args) {
        BSTree tree = new BSTree();
        
        // Inserting elements into the BST
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        
        // Searching for an element
        int keyToSearch = 90;
        BSTNode result = tree.Search(keyToSearch);
        
        if(result != null) {
            System.out.println("Element " + keyToSearch + " found in the BST.");
        } else {
            System.out.println("Element " + keyToSearch + " not found in the BST.");
        }
    }
}
