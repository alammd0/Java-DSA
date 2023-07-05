package arrayinjava;

public class largest {

    public static int largest(int arr[]){
        int largest = Integer.MIN_VALUE ; 

        for(int i = 0 ; i < arr.length ; i++){
            if(largest < arr[i]){
                largest = arr[i] ; 
            }
        }
        return largest ; 
    }
     public static void main(String[] args) {
         int arr[] = {2,3,4,6,8,7} ; 

        System.out.println(largest(arr));
     }
}
