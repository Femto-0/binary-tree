public class TreeApplicationClass {
    public static void main(String[] args) {
        Node node= new Node(2);
        node.insert(1);
        node.insert(10);
        node.insert(4);
        node.insert(3);
        node.insert(5);
        node.insert(6);
        System.out.println(node.contains(1));
       System.out.println(node.contains(100));
        System.out.print("In Order Traversing: ");
        node.inOrderTraversing();
        System.out.println(" ");
        System.out.print("Pre Order Traversing: ");
        node.preOrderTraversing();
        System.out.println(" ");
        System.out.print("Post Order Traversing: ");
        node.postOrderTraversing();

    }
}
