  import java.util.Scanner ;
  class largestofthree {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter n ");
        int n = sc.nextInt();
        System.out.print("enter n1 ");
        int n1=sc.nextInt();
        System.out.print("enter n2 ");
        int n2=sc.nextInt();
        if(n>=n1 && n>=n2){
           System.out.println("the largest is n " );
          }
        else if(n1>=n && n1>=n2){
           System.out.println("the largest is n1 ");
          }
        else{
            System.out.println("the largest is n2" ); }}
            }