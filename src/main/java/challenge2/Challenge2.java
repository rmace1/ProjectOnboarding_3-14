package challenge2;

import challenge1.Challenge1;

public class Challenge2 {

    private Node head;
    private Node tail;

    public void push(Node node){
        node.setNextNode(head);
        head = node;
    }

    public void push(Integer num){
        Node node = new Node();
        node.setValue(num);
        if(head == null && tail == null){
            this.head = node;
            this.tail = node;
        }else {
            push(node);
        }
    }

    public Node pop() throws NullPointerException{
        Node result = this.head;
        if(result == null){
            throw new NullPointerException("Cannot pop from list as it is empty.");
        }
        head = head.getNextNode();
        if(head == null){
            tail = null;
        }
        return result;
    }

    public Integer max() throws NullPointerException{
        if(head == null){
            throw new NullPointerException("List is empty and has no max value.");
        }
        Integer num = head.getValue();
        Node node = head;

        if(node.getNextNode() == null){
            return node.getValue();
        }
        do{
            node = node.getNextNode();

            if(num < node.getValue()){
                num = node.getValue();
            }
        }while(node.getNextNode() != null);
        return num;
    }

    public Integer size(){
        Integer size = 0;
        Node node = head;
        while(node != null){
            size++;
            node = node.getNextNode();
        }
        return size;
    }
}
