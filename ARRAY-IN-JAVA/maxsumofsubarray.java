package arrayinjava;

public class maxsumofsubarray {

    public static void maxSumofsub(int arr[]){
        int currsum = 0 ; 
        int maxsum  = Integer.MIN_VALUE ; 

        for(int i = 0 ; i < arr.length ; i++){
            int star = i ; 
            for(int j = i ; j < arr.length ; j++){
                int end = j ;

                for(int k = star ; k < end ; k++){
                    currsum += arr[k] ; 
    
                    System.out.print(currsum + " ");
                }

                if(maxsum < currsum){
                    maxsum = currsum ;
                }

                System.out.print(maxsum + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8} ; 

        maxSumofsub(arr);
    }
}
