import challenge1.Challenge1;
import challenge2.Challenge2;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Boolean challenge1 = false;
        Boolean challenge2 = true;

        if(challenge1) {
            List<Integer> A = new LinkedList<>();
            List<Integer> B = new LinkedList<>();

            A.add(3);
            A.add(7);
            A.add(8);
            A.add(10);

            B.add(99);
            B.add(1);
            B.add(8);
            B.add(10);

            Challenge1 ch1 = new Challenge1(A, B);
            System.out.println(ch1.findIntersectingNode());
        }

        if(challenge2){
            Challenge2 ch2 = new Challenge2();

            ch2.push(1);
            ch2.push(8);
            ch2.push(2);

            System.out.println("Size: " + ch2.size());
            System.out.println();

            System.out.println("Current max value: " + ch2.max());
            System.out.println("Head value: " + ch2.pop().getValue());
            System.out.println("Size: " + ch2.size());
            System.out.println();

            System.out.println("Current max value: " + ch2.max());
            System.out.println("Head value: " + ch2.pop().getValue());
            System.out.println("Size: " + ch2.size());
            System.out.println();

            System.out.println("Current max value: " + ch2.max());
            System.out.println("Head value: " + ch2.pop().getValue());
            System.out.println("Size: " + ch2.size());
            System.out.println();

            try {
                ch2.pop();
                ch2.pop();
                ch2.pop();
                ch2.pop();
            }catch (NullPointerException e){
                e.printStackTrace();
            }
            
            try {
                System.out.println(ch2.max());
            }catch (NullPointerException e){
                e.printStackTrace();
            }
            System.out.println("Size: " + ch2.size());
            ch2.push(7);
            ch2.push(88);
            System.out.println("Current max value: " + ch2.max());
            System.out.println("Size: " + ch2.size());

        }




    }
}
