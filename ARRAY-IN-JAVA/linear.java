package arrayinjava;

public class linear {

    public static int Search(int arr[], int key){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == key){
                return i ; 
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5, 6,8,10,12,14} ; 

        System.out.println(Search(arr, 10));
    }
}
