import java.math.BigInteger;
class Solution {
    public int countGoodNumbers(long n) {
     long even = (n + 1) / 2;
        long odd = n / 2;
        int mod = 1000000007;

        BigInteger five = BigInteger.valueOf(5);
        BigInteger four = BigInteger.valueOf(4);
        BigInteger modulo = BigInteger.valueOf(mod);

        BigInteger evenPow = five.modPow(BigInteger.valueOf(even), modulo);
        BigInteger oddPow = four.modPow(BigInteger.valueOf(odd), modulo);

        BigInteger result = evenPow.multiply(oddPow).mod(modulo);
        return result.intValue();
        
    }
}