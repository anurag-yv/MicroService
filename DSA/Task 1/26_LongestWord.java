public class 26_LongestWord{
 public static void main(String[] args){
 // foreach loop scenario
 String[] a={"Java","Programming","Code"}; String l=""; for(String x:a) if(x.length()>l.length()) l=x; System.out.println(l);
 }
}