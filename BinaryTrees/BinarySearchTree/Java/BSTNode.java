package BinaryTrees.BinarySearchTree.Java;

 /**
   The class is to declare the nodes of the search tree and its children
 **/
public class BSTNode {
  
    int key;
    BSTNode left;
    BSTNode right;
   
    public BSTNode(int key){
      this.key = key;
      this.left = null;
      this.right = null;
    }
}
