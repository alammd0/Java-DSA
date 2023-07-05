package arrayinjava;

public class reverse {

    public static void Reverse(int arr[]){
        int first = 0 ; 
        int last = arr.length - 1 ; 

        while(first < last){
            int temp = arr[last] ; 
            arr[last] = arr[first] ; 
            arr[first] = temp ; 

            first++ ; 
            last--;
        }

        // System.out.println("Reverse array is : "+ arr);
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10} ; 

        Reverse(arr);

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
