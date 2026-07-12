public class 09_LargestArray{
 public static void main(String[] args){
 // for loop scenario
 int[] arr={3,9,2,8}; int m=arr[0]; for(int i=1;i<arr.length;i++) if(arr[i]>m)m=arr[i]; System.out.println(m);
 }
}