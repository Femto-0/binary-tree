public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;

    }

    public void insert(int num) {
        if (num <= data) {
            if (left == null) {
                left = new Node(num);
            } else {
                left.insert(num);
            }
        } else {
            if (right == null) {
                right = new Node(num);
            } else {
                right.insert(num);
            }
        }
    }
/*
method to check if the tree contains a certain number or not
 */
    public boolean contains(int num) {
        if (data == num) {  //if the number i am looking for matched the value at the node
            return true;
        } else if (num < data) { //if the number i am looking for is less than node it's going to be one left
            if (left == null) {  //if left node is empty then we definitely don't have the num
                return false;
            } else {
                return left.contains(num); //else we recursively call left.node and check one by one until one of the condition is satisfied.
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(num);
            }
        }
    }

    public void inOrderTraversing() {  // left --> node--> right
        if (left != null) {
            left.inOrderTraversing();
        }
        System.out.print(data + " ");
        if (right != null) {
            right.inOrderTraversing();
        }
    }

    public void postOrderTraversing() {  // left--> right --> node
        if (left != null) {
            left.postOrderTraversing();
        }
        if (right != null) {
            right.postOrderTraversing();
        }
        System.out.print(data + " ");
    }

    public void preOrderTraversing() {    // node--> left --> right
        System.out.print(data + " ");
        if (left != null) {
            left.preOrderTraversing();
        }
        if (right != null) {
            right.preOrderTraversing();
        }
    }

}
