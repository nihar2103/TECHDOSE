class Solution {
    static int findInversionCount(int arr[], int n) {
      int invCount = 0;
      for (int ii = 0; ii < n - 1; ii++) 
        for (int jj = ii + 1; jj < n; jj++) 
          if (arr[ii] > arr[jj]) {
            invCount++;
            
            System.out.print("{" + arr[ii] + "," + arr[jj] + "}, ");
          }
      return invCount;
    }
  
    public static void main(String[] args)
  
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Size of Array:");
      int n = sc.nextInt();
      int arr[] = new int[n];
  
      System.out.println("Enter Array:");
      for (int x = 0; x < n; x++)
        arr[x] = sc.nextInt();
      System.out.println("\nInversion Count:" +
        findInversionCount(arr, arr.length));
    }
  }
