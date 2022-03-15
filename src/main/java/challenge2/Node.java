package challenge2;

public class Node {

    private Node nextNode;
    private Integer value;

    public void setNextNode(Node node){
        nextNode = node;
    }

    public void setValue(Integer num){
        this.value = num;
    }

    public Integer getValue(){
        return this.value;
    }


    public Node getNextNode() {
        return nextNode;
    }
}
