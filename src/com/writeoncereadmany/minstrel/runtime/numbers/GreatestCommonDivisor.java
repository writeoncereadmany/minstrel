package com.writeoncereadmany.minstrel.runtime.numbers;

import sun.security.util.BigInt;

import java.math.BigInteger;

import static java.math.BigInteger.ONE;

/**
 * Created by tom on 24/11/2013.
 */
public class GreatestCommonDivisor {

    public static BigInteger gcd(BigInteger first, BigInteger second)
    {
        if(first.equals(ONE) || second.equals(ONE))
        {
            return ONE;
        }
        return gcd_normalised_to_positive(first.abs(), second.abs());
    }

    public static BigInteger gcd_normalised_to_positive(BigInteger first, BigInteger second)
    {
        if(second.equals(BigInteger.ZERO))
        {
            return first;
        }
        else if(first.equals(BigInteger.ZERO))
        {
            return second;
        }
        else if(first.compareTo(second) > 0) // ie first is greater than second
        {
            BigInteger remainder = first.remainder(second);
            return gcd_normalised_to_positive(second, remainder);
        }
        else
        {
            BigInteger remainder = second.remainder(first);
            return gcd_normalised_to_positive(first, remainder);
        }
    }
}
