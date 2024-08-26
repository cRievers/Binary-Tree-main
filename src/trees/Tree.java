package trees;

public class Tree {
    private Node root;
    private int size = 0;
    
    public Tree(){
        this.root = new Node();
    }
    
    public Node getRoot(){
        return this.root;
    }
    
    public void printPreOrder(Node root){
        if(root != null){
            System.out.print(root.key + "(");
            printPreOrder(root.left);
            printPreOrder(root.right);
            System.out.print(")");
        }
    }
    
    public void printInOrder(Node root){
        if(root != null){
            printInOrder(root.left);
            System.out.print(root.key + " ");
            printInOrder(root.right);
        }
    }
    
    public void printPosOrder(Node root){
        if(root != null){
            printPosOrder(root.left);
            printPosOrder(root.right);
            System.out.print(root.key + " ");
        }
    }
    
    public Node insert(Node root, Node no){
        if(this.size == 0){
            this.root = no;
            size++;
            return no;
        }
        if(root == null){
            root = no;
            size++;
            return root;
        }
        else if(no.key < root.key)
            root.left = insert(root.left, no);
        else
            root.right = insert(root.right, no);
        return root;
    }
    
    public void insert(int value){
        Node no = new Node(value);
        insert(this.getRoot(), no);
    }
    
    public int getSize(){
        return this.size;
    }
    
    public int countElements(Node root){
        if(root == null)
            return 0;
        else
            return countElements(root.left) + 1 + countElements(root.right);
    }
    
    public boolean isThere(Node root, int num){
        if(findValue(root, num) == null)
            return false;
        return true;
    }

    /*
    public boolean isSubTree(Node t, Node s){
        if (s == null) return true;
        if (t == null) return false;
        Node no = findValue(t, s.key);
        return (equals(no, s));
    }

    public boolean equals(Node tree, Node subt){
        if (subt == null) return true;
        else if (tree == null) return false;
        if (tree.key == subt.key) return true;
        
        return (equals(tree.left, subt.left) && equals(tree.right, subt.right));
    }

    public Node findValue(Node root, int num){
        if (root == null) return(null);
        if (root.key == num) return(root);
        if (root.key > num)
            return(findValue(root.left, num));
        return(findValue(root.right, num));
    }
    */

    public boolean isSubTree(Node t, Node s) {
        if (s == null) return true;
        if (t == null) return false;
    
        Node no = findValue(t, s.key);
        if (no == null) return false;
        return equals(no, s);
    }
    
    public boolean equals(Node tree, Node subt) {
        if (subt == null) return true;
        if (tree == null) return false;
        if (tree.key != subt.key) return false;
        return equals(tree.left, subt.left) && equals(tree.right, subt.right);
    }
    
    public Node findValue(Node root, int num) {
        if (root == null) return null;
        if (root.key == num)
            return root;
        if (root.key > num) 
            return findValue(root.left, num);
        return findValue(root.right, num);
    }

}