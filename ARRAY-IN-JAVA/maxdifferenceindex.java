package arrayinjava;

public class maxdifferenceindex {
    public static int maxIndexDiff(int arr[], int n) {
        // code here
        // int ans = 0 ; 
        // for(int i = 0 ; i < n ; i++){
        //     for(int j = i + 1 ; j < n ; j++){
        //         if(arr[i] <= arr[j]){
        //             ans = Math.max(ans , j-i);
        //         }
        //     }
        // }
        // return ans ;
        int left = 0 ; 
        int right = n - 1 ; 
        int ans = 0 ; 
        
        while(left < right){
            if(arr[left] <= arr[right]){
                ans = Math.max(ans, right - left) ; 
                left++ ; 
                right = n - 1;
            }
            else{
                right-- ; 
            }
        }
    return ans ; 
    }
    public static void main(String[] args) {
        int arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        System.out.println(maxIndexDiff(arr, 9));
    }
}

