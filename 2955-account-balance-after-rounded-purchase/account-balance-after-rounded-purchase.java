class Solution {
    public int accountBalanceAfterPurchase(int purchase) {
        int temp=purchase;
        if((purchase%10)==0) return 100-purchase;
        while((temp%10)!=0){
            if((purchase%10)>=5){
                temp++;
            }
            else{
                temp--;
            }
        }
        return 100-temp;
    }
}