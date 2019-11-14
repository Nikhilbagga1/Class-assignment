import java.util.*;
public class BinarySearchTree { 
  
  
   
 class Node { 
        int key;
 
        Node left, right; 

  
        public Node(int item)
 { 
            key = item; 
            left = right = null; 
        } 
    } 
  

   static Node root; 
  

   
    BinarySearchTree() {  
        root = null;  
    } 

  
   
    void insert(int key) { 
       root = insertRec(root, key); 
    } 
      
   
    Node insertRec(Node root, int key) { 
  
      
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
  
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
  
        return root; 
    }
     static int height(Node root) 
    { 
        //int a=0
        if (root == null) 
           return 0; 
        else
        { 
            int lheight = height(root.left); 
            int rheight = height(root.right); 
            if (lheight >= rheight) 
                 return(lheight+1); 
            else 
                return(rheight+1);  
        } 
    } 
 
        void printLevelOrder() 
    { 
        int h = height(root); 
        int i; 
        for (i=1; i<=h; i++) 
            printGivenLevel(root, i); 
    }
    void printGivenLevel (Node root ,int level) 
    { 
        if (root == null) 
            return; 
        if (level == 1) 
            System.out.print(root.key + " "); 
        else if (level > 1) 
        { 
            printGivenLevel(root.left, level-1); 
            printGivenLevel(root.right, level-1); 
        } 
    } 
    

     
    public static void main(String[] args){
        BinarySearchTree tr=new BinarySearchTree();
     tr.insert(40);
     tr.insert(30);
     tr.insert(20);
     tr.insert(35);
     tr.insert(70);
     tr.insert(50);
     tr.insert(80);
     int h=height(root);
     System.out.println(h);
     tr.printLevelOrder();

    }
}
  