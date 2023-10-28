public class Node {
    int data;
    Node left, right;

    public Node(int num) {
        this.data = num;

    }

    public void insert(int num) {
        if (num <= data) {
            if (left == null) {
                left = new Node(num);
            } else {
                left.insert(num);
            }
        }else{
            if(right ==null){
                right=new Node(num);
            }else{
                right.insert(num);
            }
        }
    }
    public boolean contains(int num){
        if(data==num){  //if the number i am looking for matched the value at the node
            return true;
        }else if (num<data){ //if the number i am looking for is less than node it's going to be one left
            if(left==null){  //if left node is empty then we definitely don't have the num
                return false;
            }else{
                return left.contains(num); //else we recursively call left.node and check one by one until one of the condition is satisfied.
            }
        }else{
            if(right==null){
                return false;
            }else{
                return right.contains(num);
            }
        }
    }
}
