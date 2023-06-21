public class EquilibriumElement {
    static  int EquilibriumElement(int[] arr){
        int sum=0;
        int lsum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        for(int j=0;j<arr.length;j++){
            sum-=arr[j];
            if(sum==lsum)
                return j+1;

            lsum+=arr[j];
        }
        return -1;
    }

    public static void main(String args[] ) throws Exception {

        int[] arr= {3,3,5,5,1};

        int ans=EquilibriumElement(arr);
        System.out.println(ans);
    }
}
