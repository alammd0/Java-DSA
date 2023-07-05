package arrayinjava ;
import java.util.* ; 

public class kadans {

    public static int maxsub(int arr[]){

        int cs = 0 ; 
        int ms = Integer.MIN_VALUE ; 

        for(int i = 0 ; i < arr.length ; i++){
            cs = cs + arr[i] ; 
            if(cs < 0 ){
                cs = 0 ; 
            }
            ms = Math.max(ms, cs) ; 
        }
        return ms ; 
    }
    public static void main(String[] args) {
        int arr[] = {1, -1, 5, 4, 7} ; 
        System.out.println(maxsub(arr));
    }
}
