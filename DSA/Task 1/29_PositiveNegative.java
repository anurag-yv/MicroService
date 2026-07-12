public class 29_PositiveNegative{
 public static void main(String[] args){
 // foreach loop scenario
 int[] a={1,-2,3,-4}; int p=0,n=0; for(int x:a){if(x>=0)p++;else n++;} System.out.println(p+" "+n);
 }
}