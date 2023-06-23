

import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.util.*;
class AlanFrequency {

    static void fun(String str,int n){
        String alpha="abcdefghijklmnopqestuvwxyz";

        Map<Character,Integer> map=new HashMap<>();
        for(char c:alpha.toCharArray()){
            map.put(c,0);
        }
        for(char c:str.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        for (Map.Entry<Character, Integer> et : map.entrySet()) {
            if (et.getValue()> 0 ) {
                Character key= et.getKey();
                Integer val = et.getValue();
                System.out.println(key+"-"+val);

            }
        }
    }






    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nm = br.readLine();                // Reading input from STDIN
        // Writing output to STDOUT
        int n=Integer.parseInt(nm);
        String str = br.readLine();
        // System.out.println(str);
        fun(str,n);
    }
}
