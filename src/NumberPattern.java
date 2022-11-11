import java.util.ArrayList;

public class NumberPattern {
    public static void main(String[] args) {
        System.out.println(numberPattern(4));
    }

    //       static ArrayList<String> numberPattern(int N) {
//            // code here
//            ArrayList<String> list = new ArrayList<>();
//            list.add(0,"1");
//            for(int i =1;i<N; i++){
//                for(int j=0;j<i; j++){
//                list =
//                }
//            }
//
//            return list;
//    }
//    static ArrayList<String> numberPattern(int N) {
//        // code here
//        ArrayList<String> arrayList = new ArrayList<>();
//        String L = "1", R = "1";
//        arrayList.add("1");
//        for (int i = 2; i <= N; i++) {
//            arrayList.add(L + i + R);
//            L = L + i;
//            R = i + R;
//        }
//        return arrayList;
//    }
    static ArrayList<String> numberPattern(int N){
        // code here
        String s="";
        ArrayList<String> str=new ArrayList<String>();
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                s += String.valueOf(j);
            }
            for(int j=i-1; j>0; j--){
                s +=String.valueOf(j);
            }
            str.add(s);
            s = "";
        }
        return str;
    }


}

