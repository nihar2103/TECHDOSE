import java.util.*;
public class Main{
   static void count_sort(int[] arr){
      int max_val = Arrays.stream(arr).max().getAsInt();
      int min_val = Arrays.stream(arr).min().getAsInt();
      int range = max_val - min_val + 1;
      int count[] = new int[range];
      int result[] = new int[arr.length];
      for (int i = 0; i < arr.length; i++){
         count[arr[i] - min_val]++;
      }
      for (int i = 1; i < count.length; i++){
         count[i] += count[i - 1];
      }
      for (int i = arr.length - 1; i >= 0; i--){
         result[count[arr[i] - min_val] - 1] = arr[i];
         count[arr[i] - min_val]--;
      }
      for (int i = 0; i < arr.length; i++){
         arr[i] = result[i];
      }
   }
   static void printVal(int[] arr){
      for (int i = 0; i < arr.length; i++){
         System.out.print(arr[i] + " ");
      }  
      System.out.println("");
   }
   public static void main(String[] args){
      int[] arr = {-5, 0, -3, 8, 34, 56, 89, -11, -95, -1, 10};
      System.out.println("The array contains");
      for (int i = 0; i < arr.length; i++){
         System.out.print(arr[i] + " ");
      }
      System.out.println();
      System.out.println("Implementing Counting Sort in Java results in : ");
      count_sort(arr);
      printVal(arr);
   }  
}