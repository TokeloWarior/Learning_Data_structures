package BinaryTrees.BinarySearchTree.Java;

/**
   This class declares the worker methods for the Binary search tree
   the methods like Insert, search and traversals
**/
public class BSTree{
    private BSTNode root;
    
    public BSTree(){
      this.root = null;
    }
    
    public BSTNode Search(int key){
    /**
      Method to search an element in the tree
    **/
      return SearchRec(root, key);
    }
    
    private BSTNode SearchRec(BSTNode node, int key){
    /**
      recursive method to search the key effeciently and fast
    **/
      if(node==null){
        return null;
      }
      
      if(key<node.key){
        return SearchRec(node.left, key);
      }
      else if(key>node.key){
        return SearchRec(node.right, key);
      }
      else{
        return node;
      }

    }
    
    public void insert(int key){
    /**
      This method is to insert elements in the BST also avoiding duplicates in the tree
    **/
      root = insertRec(root, key);
    }
    
    private BSTNode insertRec(BSTNode node, int key){
    
      BSTNode pointer;     //pointer to avoid conflicts if the tree is already filled, it is standard but unecessary
      
      if(node == null){
         pointer = new BSTNode(key);
         return pointer;
      }
      
      if(key<node.key){
         node.left = insertRec(node.left, key);
      }
      else if(key>node.key){
         node.right = insertRec(node.right, key);
      }
      
      return node;         // To point back to the root of the BST and also to avoid duplcates.
    }
}