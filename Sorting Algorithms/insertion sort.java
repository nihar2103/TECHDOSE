import java.util.*;
class Main{
   public static void main(String[] args){
      int a,i,j,temp;
      Scanner sc = new Scanner(System.in);
      a = sc.nextInt();
      int[] arr = new int[a];
      for(i=0;i<a;i++){
         arr[i] = sc.nextInt();
      }
      for(i=1;i<a;i++){
          temp = arr[i];
          for(j=(i-1);j>=0 && arr[j]>temp;j--){
              arr[j+1] = arr[j];
          }
          arr[j+1] = temp;
      }
      for(i=0;i<a;i++){
         System.out.print(arr[i]+ " ");
   }
}