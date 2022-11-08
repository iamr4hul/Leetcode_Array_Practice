import java.util.ArrayList;
import java.util.List;

public class gfg_Practice {
    public static void main(String[] args) {
      //  gfg_Practice calling = new gfg_Practice();
       // ArrayList<Integer> arr = calling.valueEqualToIndex(new int[]{7, 2, 6, 9, 0},4);
        System.out.println(valueEqualToIndex(new int[]{7, 2, 6, 9, 0},4));
    }
  static   ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> list  =new ArrayList<>();
        for (int i =0;i<n;i++){
            if(arr[i]==i+1){
                list.add(arr[i]);
            }
        }
    return list;
    }
}
