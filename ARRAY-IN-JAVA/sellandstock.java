package arrayinjava;

public class sellandstock {

    public static int maxProfit(int price[]){
        int byprice = Integer.MAX_VALUE ; 
        int maxprof = 0 ; 

        for(int i = 0 ; i < price.length ; i++){
            if(byprice < price[i]){
                int profit = price[i] - byprice ; 
                maxprof = Math.max(maxprof,  profit) ; 
            }
            else{
                byprice = price[i] ; 
            }
        }
        return maxprof ; 
    }
    public static void main(String[] args) {
        int price[] = {7, 1, 5, 3, 6, 4} ; 

        System.out.println(maxProfit(price));
    }
}
