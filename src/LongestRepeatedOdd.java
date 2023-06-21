import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestRepeatedOdd {

    static boolean checkodd(List<Integer> list){

        int el=list.get(0);
        if( el%2==0){
            return false;
        }

        for(int i=1;i<list.size();i++){
            if(el!=list.get(i)){
                return false;
            }
        }
        return true;
    }
    static  int longestRepeatedOdd(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            List<Integer> list=new ArrayList<>();

            for(int j=i;j<arr.length;j++){
                list.add(arr[j]);
                if(checkodd(list)&&list.size()>max){
                    max=list.size();
                }
            }

        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=longestRepeatedOdd(arr);
        System.out.println(res);
    }
}
