class Solution {
    public int getLucky(String s, int k) {
        StringBuilder str=new StringBuilder();

        for(int i=0;i<s.length();i++){
            int curr=s.charAt(i)-96;
            str.append(curr);
        }

 

        return add(str.toString(),k);
    }


   int add(String numStr, int k) {
        while (k-- > 0) {
            int sum = 0;
            for (int i = 0; i < numStr.length(); i++) {
                sum += numStr.charAt(i) - '0';
            }
            numStr = Integer.toString(sum);
        }
        return Integer.parseInt(numStr);
    }
    
}