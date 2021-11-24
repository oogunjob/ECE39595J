public class Node {

    private int data;
    private Node left;
    private Node right;

    //  constructs a node with the given data
    public Node(int _data) {
        data = _data;
        left = null;
        right = null;
    }

    // a copy constructor
    public Node(Node node) {
        data = node.getData();
        copy(this, node);
    }

    // static void addNode(Node node, int d), which starting at the root of a tree, or a sub-tree, inserts
    // a node with data whose value is d into the tree. An in-order traversal should print a sorted list.
    public static void addNode(Node node, int d){
        // If the tree or sub-tree already contains a node with data d, nothing is done
        if(node.data == d){
            return;
        }

        // If the value of the d is less than the value of the data at the current node, the data will be placed in a node in the left subtree of the current node
        else if(node.data > d){
            if(node.left != null){
                addNode(node.left, d);
            }
            else{
                node.left = new Node(d);
            }
        }

        // vice versa for when the vaue of d is larger
        else if(node.data < d){
            if(node.right != null){
                addNode(node.right, d);
            }
            else{
                node.right = new Node(d);
            }
        }
    }

    // static void printInOrder(Node node) does an in-order traversal of the tree or sub-tree rooted at
    // node, and prints out the value of the nodes. The statement System.out.print(""+node.data+" ");
    // can be used to print the value. There is no need for new lines. 
    public static void printInOrder(Node node){
        if (node == null)
            return;

        // traverses left side of the tree
        printInOrder(node.getLeft());

        // prints data of the node
        System.out.print(node.getData() + " ");

        // traverses right side of the tree
        printInOrder(node.getRight());
    }

    // public getters for the tree
    public Node getLeft(){
        return left;
    }

    public Node getRight(){
        return right;
    }
    
    public int getData(){
        return data;
    }

    // , where fromRoot is the tree being copied, and
    // toRoot is the tree that will be a copy of the tree or sub-tree rooted at fromRoot. The copy
    // function is called from the copy constructor of Tree to copy a tree, and recursively from copy.
    static void copy(Node toRoot, Node fromNode){

        if(fromNode.left != null) {
            toRoot.left = new Node(fromNode.left);
        }

        if(fromNode.right != null) {
            toRoot.right = new Node(fromNode.right);
        }
    }

}
