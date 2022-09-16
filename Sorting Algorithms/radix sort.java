import java.io.*;
import java.util.*;
public class Radix {
    static int getMax(int arr[], int n){
        int mx = arr[0];
        for (int i = 1; i < n; i++){
            if (arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }
 
    static void countSort(int arr[], int n, int exp){
        int output[] = new int[n]; 
        int i;
        int count[] = new int[10];
        Arrays.fill(count,0);
 
        for (i = 0; i < n; i++){
            count[ (arr[i]/exp)%10 ]++;
        }
        for (i = 1; i < 10; i++){
            count[i] += count[i - 1];
        }
 
        for (i = n - 1; i >= 0; i--){
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
            count[ (arr[i]/exp)%10 ]--;
        }