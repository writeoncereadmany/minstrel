package com.writeoncereadmany.minstrel.runtime.numbers;

import java.math.BigDecimal;
import java.math.BigInteger;

import static com.writeoncereadmany.minstrel.runtime.numbers.GreatestCommonDivisor.gcd;

/**
 * Created by tom on 24/11/2013.
 */
public final class Rational implements Comparable<Rational> {

    private final BigInteger numerator;
    private final BigInteger denominator;

    public Rational(BigInteger integralValue)
    {
        this(integralValue, BigInteger.ONE);
    }

    public Rational(BigInteger numerator, BigInteger denominator)
    {
        BigInteger greatestCommonDenominator = gcd(numerator, denominator);
        if(denominator.equals(BigInteger.ZERO))
        {
            throw new IllegalArgumentException("Division by zero error");
        }
        BigInteger simplifiedNumerator = numerator.divide(greatestCommonDenominator);
        BigInteger simplifiedDenominator = denominator.divide(greatestCommonDenominator);
        if(isNegative(denominator))
        {
            this.numerator = simplifiedNumerator.negate();
            this.denominator = simplifiedDenominator.negate();
        }
        else
        {
            this.numerator = simplifiedNumerator;
            this.denominator = simplifiedDenominator;
        }
    }

    private boolean isNegative(BigInteger denominator) {
        return denominator.signum() == -1;
    }

    public static Rational parseRational(String literalDecimal)
    {
        BigDecimal decimalRepresentation = new BigDecimal(literalDecimal);
        int scale = decimalRepresentation.scale();
        BigInteger numerator = decimalRepresentation.scaleByPowerOfTen(scale).toBigInteger();
        BigInteger denominator = BigDecimal.ONE.scaleByPowerOfTen(scale).toBigInteger();
        return new Rational(numerator, denominator);
    }

    @Override
    public boolean equals(Object o)
    {
        if(o == this) return true;
        if(!(o instanceof Rational)) return false;
        Rational other = (Rational) o;

        // Relies on always simplifying Rational to its simplest form
        return numerator.equals(other.numerator) && denominator.equals(other.denominator);
    }

    public BigInteger getNumerator()
    {
        return numerator;
    }

    public BigInteger getDenominator()
    {
        return denominator;
    }

    private BigInteger normalisedNumerator(Rational other)
    {
        return numerator.multiply(other.denominator);
    }

    private BigInteger normalisedDenominator(Rational other)
    {
        return denominator.multiply(other.denominator);
    }

    @Override
    public int compareTo(Rational other) {
        BigInteger normalisedThis = normalisedNumerator(other);
        BigInteger normalisedOther = other.normalisedNumerator(this);
        return normalisedThis.compareTo(normalisedOther);
    }

    public Rational plus(Rational other) {
        BigInteger normalisedNumerator1 = this.normalisedNumerator(other);
        BigInteger normalisedNumerator2 = other.normalisedNumerator(this);

        return new Rational(normalisedNumerator1.add(normalisedNumerator2),
                            normalisedDenominator(other));
    }

    public Rational minus(Rational other)
    {
        return plus(other.negate());
    }

    public Rational negate()
    {
        return new Rational(numerator.negate(), denominator);
    }

    public Rational multipliedBy(Rational other) {
        return new Rational(numerator.multiply(other.numerator), denominator.multiply(other.denominator));
    }

    public Rational dividedBy(Rational divisor) {
        return multipliedBy(divisor.reciprocal());
    }

    private Rational reciprocal() {
        return new Rational(denominator, numerator);
    }
}
