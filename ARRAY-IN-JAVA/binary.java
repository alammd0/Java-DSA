package arrayinjava;

public class binary {

    public static int Search(int arr[], int key){
        int st = 0 ; 
        int ed = arr.length-1 ; 

        while(st <= ed){
            int mid = (st + ed) / 2 ; 
            
            if(arr[mid] == key){
                return mid ; 
            }

            if(arr[mid] < mid){
                st = mid + 1 ;
            }
            else{
                ed = mid - 1 ; 
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,8,4,3,9} ; 
        int key = 8 ; 

        System.out.println(Search(arr, key));
    }
}
