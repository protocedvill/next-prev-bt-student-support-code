import java.util.ArrayList;


public class BinaryTree<T> implements Sequence<T>, ReverseSequence<T> {

    private Node root;

    public Node getRoot() {
	return this.root;
    }
    
    public void setRoot(Node root) {
        this.root = root;
    }

    public BinaryTree() {
        root = null;
    }

    private Node build_inorder(ArrayList<T> A, int begin, int end) {
        if (begin == end) {
            return null;
        } else if (begin + 1 == end) {
            return new Node(A.get(begin), null, null, null);
        } else {
            int mid = begin + ((end - begin) / 2);
            Node n = new Node(A.get(mid), null, null, null);
            Node left = build_inorder(A, begin, mid);
            Node right = build_inorder(A, mid+1, end);
            n.left = left;
            n.right = right;
            if (left != null)
                left.parent = n;
            if (right != null)
                right.parent = n;
            return n;
        }
    }

    // Build a tree from the array, inorder.
    public BinaryTree(ArrayList<T> L) {
        root = build_inorder(L, 0, L.size());
    }

    public BinaryTree(Node r) {
        root = r;
    }

    @Override
    public Iter begin() {
        if (root == null)
            return new Iter(null);
        else
            return new Iter(root.first());
    }

    @Override
    public Iter end() {
        return new Iter(null);
    }

    @Override
    public Iter rbegin() {
        if (root == null)
            return new Iter(null);
        else
            return new Iter(root.last());
    }

    @Override
    public Iter rend() {
        return new Iter(null);
    }

    class Node {
        T data;
        Node left, right, parent;

        public String toString() {
            return data.toString();
        }

        public Node(T d, Node l, Node r, Node p) {
            data = d;
            left = l;
            right = r;
            parent = p;
        }

        // Return the first node wrt. inorder in this subtree.
        public Node first() {
            // student implements
            return null; // DELETE THIS LINE AND INSERT YOUR CODE
        }

        // Return the last node wrt. inorder in this subtree.
        public Node last() {
            // student implements
            return null; // DELETE THIS LINE AND INSERT YOUR CODE
        }

        // Return the first ancestor that is next wrt. inorder
        // or null if there is none.
        public Node nextAncestor() {
            // student implements
            return null; // DELETE THIS LINE AND INSERT YOUR CODE
        }

        // Return the first ancestor that is previous wrt. inorder
        // or null if there is none.
        public Node prevAncestor() {
            // student implements
            return null; // DELETE THIS LINE AND INSERT YOUR CODE
        }

        // Return the next node wrt. inorder in the entire tree.
        public Node next() {
            // student implements
            return null; // DELETE THIS LINE AND INSERT YOUR CODE
        }

        // Return the previous node wrt. inorder in the entire tree.
        public Node previous() {
            // student implements
            return null; // DELETE THIS LINE AND INSERT YOUR CODE
        }

    }

    class Iter implements Iterator<T>, ReverseIterator<T> {
        private Node curr;

        Iter(Node c) {
            curr = c;
        }

        public String toString() {
            if (curr == null) return "null";
            else return curr.toString();
        }

        @Override
        public T get() {
            // student implements
            // YOUR CODE
        }

        @Override
        public void retreat() {
            // student implements
            // YOUR CODE
        }

        @Override
        public void advance() {
            // student implements
            // YOUR CODE
        }

        @Override
        public boolean equals(Object other) {
            // student implements
            // YOUR CODE
        }

        @Override
        public Iter clone() {
            // student implements
            // YOUR CODE
        }
    }
}
