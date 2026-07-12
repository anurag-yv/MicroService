public class 05_ReverseNumber{
 public static void main(String[] args){

 int n=1234,r=0; for(;n>0;n/=10) r=r*10+n%10; System.out.println(r);
 }
}