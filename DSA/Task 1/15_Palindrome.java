public class 15_Palindrome{
 public static void main(String[] args){
 // while loop scenario
 int n=121,t=n,r=0; while(t>0){r=r*10+t%10;t/=10;} System.out.println(n==r);
 }
}