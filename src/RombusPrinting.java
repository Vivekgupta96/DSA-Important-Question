
import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.util.*;
class RombusPrinting {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt( br.readLine());                // Reading input from STDIN


        for(int i=0; i<=n; i++){
            StringBuilder sb=new StringBuilder();
            for(int j=i; j<n; j++)
            {

                sb.append(" ").append(" ");
            }
            for(int j=0; j<=i; j++)
            {

                sb.append(j).append(" ");
            }
            for(int j=i-1; j>=0; j--)
            {

                sb.append(j).append(" ");
            }
            System.out.println(sb);

        }
        for(int i=n-1; i>=0; i--){
            StringBuilder sb=new StringBuilder();
            for(int j=i; j<n; j++)
            {
                sb.append(" ").append(" ");
            }
            for(int j=0; j<=i; j++)
            {
                sb.append(j).append(" ");
            }
            for(int j=i-1; j>=0; j--)
            {
                sb.append(j).append(" ");
            }
            System.out.println(sb);
        }


    }
}
