// Merge Sort Code
// Send Feedback
// Sort an array A using Merge Sort.
// Change in the input array itself. So no need to return or print anything.
// Input format :
// Line 1 : Integer n i.e. Array size
// Line 2 : Array elements (separated by space)
// Output format :
// Array elements in increasing order (separated by space)
// Constraints :
// 1 <= n <= 1000
// Sample Input:
// 6 
// 2 6 8 5 4 3
// Sample Output:
// 2 3 4 5 6 8


public class solution {
    
    
    
   public static  void merge(int arr[], int start, int mid, int end) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = mid - start + 1; 
        int n2 = end - mid; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[start + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[mid + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = start; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
  public static   void sort(int arr[], int start, int end) 
    { 
        if (start < end) 
        { 
            // Find the middle point 
            int mid = (start+end)/2; 
  
            // Sort first and second halves 
            sort(arr, start, mid); 
            sort(arr , mid+1, end); 
  
            // Merge the sorted halves 
            merge(arr, start, mid, end); 
        } 
    } 
  
    
//     public static void mergesort(int[] input,int start,int end)
//     {
//         if(start>=end)
//         {return;}
        
//         int mid=(start+end)/2;
//         mergesort(input,start,mid);
        
//         mergesort(input,mid+1,end);
//         merge(input,start,mid,end);
        
//     }
    
    

	public static void mergeSort(int[] input){
		// Write your code here
       
		int p1=input.length-1;
        sort(input,0,p1);
        
        
	}
}
