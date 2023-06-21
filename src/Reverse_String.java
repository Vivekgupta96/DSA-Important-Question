public class Reverse_String {

    static String reverseString(String str){

        String res="";
        for(int i=str.length()-1;i>=0;i--){
            res+=str.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
      String input="ram" ;

      String res=reverseString(input);
        System.out.println(res);
    }
}
