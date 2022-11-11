import java.util.ArrayList;
import java.util.List;

public class leftRotationArray {
    public static void main(String[] args) {
        List<Integer> op = new ArrayList<>();
        op.add(1);
        op.add(2);
        op.add(3);
        op.add(4);
        op.add(5);
        System.out.println(rotateLeft(2,op));
    }
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        List<Integer> res = new ArrayList<>();
        int j = d;
        while(j<arr.size()){
            res.add(arr.get(j));
            j++;
        }
        j = 0;
        while(j<d){
            res.add(arr.get(j));
                    j++;
        }
        return res;
    }
}