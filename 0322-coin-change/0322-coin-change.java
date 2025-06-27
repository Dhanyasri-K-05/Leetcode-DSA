class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp=new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            
            Arrays.fill(dp[i],-1);
        }

        int ans= f(coins.length-1,amount,coins,dp);
        return ans==1000000009?-1:ans;
        
    }

  int  f(int index,int amount,int[] coins,int[][]dp){

if(index==0){
    if(amount%coins[0]==0) return amount/coins[0];
    else return 1000000009;
}

if(dp[index][amount]!=-1) return dp[index][amount];

int non=f(index-1,amount,coins,dp);
int take=1000000009;
if(coins[index]<=amount) take=1+f(index,amount-coins[index],coins,dp);

return dp[index][amount] =Math.min(non,take);




    }
}