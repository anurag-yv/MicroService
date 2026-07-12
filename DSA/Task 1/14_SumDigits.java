public class 14_SumDigits{
 public static void main(String[] args){
 // while loop scenario
 int n=12345,s=0; while(n>0){s+=n%10;n/=10;} System.out.println(s);
 }
}