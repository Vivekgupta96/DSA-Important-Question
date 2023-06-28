public class Rhombus {
  public static  void rhombus(int n) {

      for(int i=0;i<(n*2)+1;i++){

          StringBuilder sb=new StringBuilder();
          for(int j=0;j<=n;j++){
              if(i==j){
                  sb.append(j+" ");
              }else {
                  sb.append(j+" ");
              }
          }

          for(int j=n-1;j>=0;j--){
              if(j==0){
                  sb.append(0+" ");
              }else {
                  sb.append(j+" ");
              }
          }
          System.out.println(sb);

      }
  }
    public static void main(String[] args) {
        int n=5;
        rhombus(n);
    }
}
