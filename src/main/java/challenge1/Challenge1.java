package challenge1;

import java.util.LinkedList;
import java.util.List;

public class Challenge1 {

    private List<Integer> A;
    private List<Integer> B;

    public Challenge1(List<Integer> A, List<Integer> B){
        this.A = A;
        this.B = B;
    }

    public Integer findIntersectingNode(){
        Integer node = 0;
        for(Integer num : A){
            node++;
            if(B.contains(num)){
                return node;
            }
        }
        return 0;
    }
}
