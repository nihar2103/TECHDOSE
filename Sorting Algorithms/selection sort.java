import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                if(arr[i]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                }
            }
        }
        for(int i=0;i<a;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}