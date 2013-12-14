package com.writeoncereadmany.minstrel.runtime.numbers.formatter;

import com.writeoncereadmany.minstrel.runtime.numbers.Rational;

import java.math.BigInteger;

/**
 * Created by tom on 24/11/2013.
 */
public class FractionFormatter implements Formatter<Rational> {

    @Override
    public String format(Rational fractionalNumber)
    {
        if(BigInteger.ONE.equals(fractionalNumber.getDenominator()))
        {
            return fractionalNumber.getNumerator().toString();
        }
        return fractionalNumber.getNumerator().toString() + " / " + fractionalNumber.getDenominator().toString();

    }
}
