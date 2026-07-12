public class 23_CountVowels{
 public static void main(String[] args){
 // foreach loop scenario
 String[] a={"apple","sky"}; int c=0; for(String w:a) for(char ch:w.toCharArray()) if("aeiou".indexOf(ch)>=0)c++; System.out.println(c);
 }
}