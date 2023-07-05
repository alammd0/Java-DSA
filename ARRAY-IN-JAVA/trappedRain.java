package arrayinjava;

public class trappedRain {

    public static int rainwater(int arr[]) {
        int n = arr.length;
        // calculate the leftmax
        int leftmax[] = new int[n];
        leftmax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftmax[i] = Math.max(arr[i], leftmax[i-1]);
        }
        // calculate the rightmax
        int rightmax[] = new int[n];
        rightmax[n-1] = arr[n-1] ; 
        for (int i = n - 2; i >= 0 ; i--) {
             rightmax[i] = Math.max(arr[i],rightmax[i+1]);
        }
        // cal trappaid rain water

        int trapp = 0  ; 

        for(int i = 0 ; i < n ; i++){
            int waterlevel = Math.min(leftmax[i], rightmax[i]) ; 
            trapp += waterlevel - arr[i] ; 
        }
        return trapp ; 
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };

        System.out.println(rainwater(arr));
    }
}
