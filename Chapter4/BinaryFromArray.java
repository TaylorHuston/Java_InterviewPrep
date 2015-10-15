package Chapter4;

/*Build a BST from an already sorted array*/
public class BinaryFromArray {

    static class Node {
        public int id;
        public Node left;
        public Node right;

        Node(int id) {
           this.id = id;
        }
    }

    public static Node buildTree(int[] arr) {
        return buildTree(arr, 0, arr.length-1);
    }

    private static Node buildTree(int[] arr, int start, int end) {
        if (end < start) {
            return null;
        }
        int mid  = (start+end)/2;
        Node head = new Node(arr[mid]);
        head.left = buildTree(arr, start, mid-1);
        head.right = buildTree(arr, mid+1, end);
        return head;
    }

    public static void main (String args[]) {
        int[] sorted = new int[10];
        for (int i = 0; i < 10; i++) {
            sorted[i] = i;
        }
        Node myBST = buildTree(sorted);
    }
}
