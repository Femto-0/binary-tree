import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TreeApplicationClass {
    /*
    reading from a file called bTree.txt. The txt file is written in such a way that:
    --> It represents a binary tree. Every line contains the content of a node, followed by the content of its left and right node.
    Note –-> Either or both could be null. Assume no duplicates in the tree.
     */
    public static void main(String[] args) throws IOException {
        Node node = null;
        try (BufferedReader br = new BufferedReader(new FileReader("src/bTree.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(" ");
                for(int i=0; i<arr.length-1; i++) {
                    if (arr[i] != null) {  //making sure that we don't insert any null value into the tree because it is a possibility.
                        int data = Integer.parseInt(arr[i]);
                        if (node == null) {  //checking if the tree has a root or not, if not, create one
                            node = new Node(data);
                        } else {
                            node.insert(data); //if a root is found, insert rest
                        }
                    }
                }
            }
        }
        System.out.print("In Order Traversing: ");
        if (node != null) {
            node.inOrderTraversing();  //In order traversing || left --> node --> right
        }
        System.out.println(" ");
        System.out.print("Pre Order Traversing: ");
        if (node != null) {
            node.preOrderTraversing();  //Pre order traversing || node --> left --> right
        }
        System.out.println(" ");
        System.out.print("Post Order Traversing: ");
        if (node != null) {
            node.postOrderTraversing();  //Post order traversing  || left --> right --> node
        }

    }
}
