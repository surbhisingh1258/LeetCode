// Last updated: 8/20/2025, 10:06:06 PM
import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger x= new BigInteger(num1);
        BigInteger y= new BigInteger(num2);
        BigInteger z= x.add(y);
        return String.valueOf(z);
    }
}