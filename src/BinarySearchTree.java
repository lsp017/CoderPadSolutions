
import java.util.*;

public class BinarySearchTree {

    /* Class containing left and right child of current node and key value*/
    class Node {
        int key;
        int hd;
        Node left, right;

        public Node(int item) {
            key = item;
            hd = Integer.MAX_VALUE;
            left = right = null;
        }
    }

    // Root of BST
    Node root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    // This method mainly calls insertRec()
    void insert(int key) {
        root = insertRec(root, key);
    }

    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int key) {

        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
    }

   public Node searchKey(Node root,int key){
        if (root==null || root.key==key){
            return root;
        }

        if(key<root.key)
            return searchKey(root.left,key);

        return searchKey(root.right,key);

    }

    // This method mainly calls InorderRec()
    void inorder()  {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()){
        Node pr = q.poll();
            System.out.println(pr.key);
        if(pr.left!=null)
        q.add(pr.left);
        if(pr.right!=null)
        q.add(pr.right);
        }
    }

    private void leftViewTree(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);

        while (!q.isEmpty()){
            Node check = q.peek();
                if(check!=null){
                    System.out.println(check.key);

                    while(q.peek()!=null){
                        if(q.peek().left!=null)
                            q.offer(q.peek().left);
                        if(q.peek().right!=null)
                            q.offer(q.peek().right);

                        q.remove();
                    }
                    q.offer(null);
                }
            q.remove();
        }

    }

    private void rightViewTree(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);

        while (!q.isEmpty()) {
            Node ch = q.peek();
                if(ch!=null){
                    System.out.println(ch.key);
                    Node it =q.peek();
                    while(it!=null){
                        if(it.right!=null)
                            q.offer(it.right);
                        if(it.left!=null)
                            q.offer(it.left);
                        q.remove();
                        it =q.peek();
                    }
                    if(it==null) q.offer(null);
                }
                q.remove();
        }

    }

    private void bottomView(Node root) {
        Queue<Node> q = new LinkedList<>();
        root.hd=0;
        q.add(root);
        TreeMap<Integer,Node> map = new TreeMap<>();

        while(!q.isEmpty()){
            Node temp = q.remove();
            map.put(temp.hd,temp);
                if(temp.left!=null){
                    temp.left.hd=temp.hd-1;
                    q.add(temp.left);
                }
            if(temp.right!=null){
                temp.right.hd=temp.hd+1;
                q.add(temp.right);
            }
        }
        map.forEach((k,v) -> System.out.println("key "+k + " value " + v.key));
    }

    private void topView(Node root) {
        Queue<Node> q = new LinkedList<>();
        root.hd=0;
        q.add(root);
        TreeMap<Integer,Node> map = new TreeMap<>();

        while(!q.isEmpty()){
            Node temp = q.remove();
            if(!map.containsKey(temp.hd)){
                map.put(temp.hd,temp);
            }
            if(temp.left!=null){
                temp.left.hd=temp.hd-1;
                q.add(temp.left);
            }
            if(temp.right!=null){
                temp.right.hd=temp.hd+1;
                q.add(temp.right);
            }
        }
        map.forEach((k,v) -> System.out.println("key "+k + " value " + v.key));
    }

    private void verticalOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        root.hd=0;
        q.add(root);

        TreeMap<Integer, List<Node>> map = new TreeMap<>();

        while(!q.isEmpty()){
            Node temp = q.remove();
            if(!map.containsKey(temp.hd)){
                List<Node> list = new ArrayList<>();
                list.add(temp);
                map.put(temp.hd,list);
            }
            else {
                List<Node> list = map.get(temp.hd);
                list.add(temp);
                map.put(temp.hd,list);
            }
            if(temp.left!=null){
                temp.left.hd=temp.hd-1;
                q.add(temp.left);
            }
            if(temp.right!=null){
                temp.right.hd=temp.hd+1;
                q.add(temp.right);
            }
        }
//       map.forEach((k,v) -> System.out.println("key "+k + " value " + v.forEach(()->(System.out.println()))));
            for(Map.Entry<Integer,List<Node>> e : map.entrySet()){
//                System.out.print("key " + e.getKey() + " value ");
                e.getValue().forEach((a) -> System.out.print(a.key + " "));
                System.out.println();
        }
    }


    // Driver Program to test above functions
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.insert(45);
        tree.insert(55);

        // print inorder traversal of the BST
//        tree.inorder();
//        tree.levelOrder();
//        tree.leftViewTree();
//        tree.rightViewTree();

//        tree.searchKey(00);

//        tree.bottomView();
      //  tree.topView();

        tree.verticalOrder();
    }

    private void verticalOrder() {
        verticalOrder(root);
    }



    private void topView() {
        topView(root);
    }


    private void bottomView() {
        bottomView(root);
    }


    private void searchKey(int i) {
        Optional<Node> ch = Optional.ofNullable(searchKey(root, i));
//        System.out.println(searchKey(root,i).key==i);
        System.out.println(ch.isPresent());
    }

    private void rightViewTree() {
        rightViewTree(root);
    }

    private void leftViewTree() {
        leftViewTree(root);
    }



    private void levelOrder() {
        levelOrder(root);
    }
}