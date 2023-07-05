package arrayinjava ; 

public class printsubarray{

    public static void Subarray(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            int star = i;
            for(int j = i ; j < arr.length ; j++){
                int end = j ; 

                for(int k = star ; k <= end ; k++){
                    System.out.print(arr[k] + ",");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         int a[] = {2, 4, 6, 8, 10} ; 

         Subarray(a);
    }
}