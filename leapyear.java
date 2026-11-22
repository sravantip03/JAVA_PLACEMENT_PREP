import java.util.Scanner ;
class leapyear {
 public static void main(String[]args) {
 Scanner sc= new Scanner(System.in);
 System.out.print("enter n");
 int n =sc.nextInt();
   if (n%400==0 || n%4==0 && n%100!=0 ) {
 System.out.println("This is a leap year");
}
   else {
 System.out.println("This is not a leap year");
}
}}