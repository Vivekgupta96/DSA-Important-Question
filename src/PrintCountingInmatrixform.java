

import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.util.*;
class PrintCountingInmatrixform {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count=1;
        for(int i=0;i<n;i++){

            StringBuilder sb=new StringBuilder();

            for(int j=0;j<n;j++){
                sb.append(count).append(" ");
                count++;
            }

            System.out.println(sb);
        }
    }
}
