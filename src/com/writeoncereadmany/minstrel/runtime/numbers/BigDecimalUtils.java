package com.writeoncereadmany.minstrel.runtime.numbers;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by tom on 24/11/2013.
 */
public class BigDecimalUtils {

    public static BigInteger numerator(BigDecimal decimal)
    {
        return decimal.scaleByPowerOfTen(decimal.scale()).toBigInteger();
    }

    public static BigInteger denominator(BigDecimal decimal)
    {
        return BigDecimal.ONE.scaleByPowerOfTen(decimal.scale()).toBigInteger();
    }
}
