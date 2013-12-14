package com.writeoncereadmany.minstrel.runtime;

import com.writeoncereadmany.minstrel.runtime.numbers.BigDecimalUtils;
import com.writeoncereadmany.minstrel.runtime.numbers.Rational;
import com.writeoncereadmany.minstrel.runtime.numbers.formatter.Formatter;
import com.writeoncereadmany.minstrel.runtime.numbers.formatter.FractionFormatter;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static com.writeoncereadmany.minstrel.runtime.numbers.GreatestCommonDivisor.gcd;
import static java.math.BigInteger.ONE;
import static java.math.BigInteger.valueOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

/**
 * Created by tom on 24/11/2013.
 */
public class RationalTest {

    private static final Formatter<Rational> fractionFormatter = new FractionFormatter();

    @Test
    public void convertBigDecimalToNumeratorAndDivisor()
    {
        BigDecimal tenScaledBy100 = new BigDecimal("10.00");
        assertThat(BigDecimalUtils.numerator(tenScaledBy100), is(new BigInteger("1000")));
        assertThat(BigDecimalUtils.denominator((tenScaledBy100)), is(new BigInteger("100")));
    }

    @Test
    public void gcdOfCoprimeNumbersIs1()
    {
        assertThat(gcd(valueOf(19), valueOf(37)), is(ONE));
    }

    @Test
    public void gcdOfSameNumbersIsThatNumber()
    {
        assertThat(gcd(valueOf(212), valueOf(212)), is(valueOf(212)));
    }

    @Test
    public void gcdOfNumbersWithLargeCommonFactorCorrectlyIdentified()
    {
        BigInteger largeFactor = valueOf(103988349284102L);
        // 191 and 503 are coprime
        BigInteger large1 = valueOf(191).multiply(largeFactor);
        BigInteger large2 = valueOf(503).multiply(largeFactor);

        assertThat(gcd(large1, large2), is(largeFactor));
    }

    @Test
    public void gcdOfLargeAndSmallNumbersCalculatesReasonablyFast()
    {
        BigInteger large = valueOf(103988349284102L);
        BigInteger small = valueOf(3);

        assertThat(gcd(large, small), is(ONE));
    }

    @Test
    public void fractionalStringOfIntegerOnlyMentionsNumerator()
    {
        Rational seven = new Rational(valueOf(7), ONE);
        assertThat(fractionFormatter.format(seven), is("7"));
    }

    @Test
    public void fractionalStringOfSimpleFractionsMentionsNumeratorAndDivisor()
    {
        Rational oneEighth = new Rational(ONE, valueOf(8));
        assertThat(fractionFormatter.format(oneEighth), is("1 / 8"));
    }

    @Test
    public void simplifiesFractionsWherePossible()
    {
        Rational twelveSixths = new Rational(valueOf(12), valueOf(6));
        assertRationalIs(twelveSixths, 2);
    }

    @Test
    public void canRepresentZero()
    {
        Rational zero = new Rational(valueOf(0));
        assertRationalIs(zero, 0);
    }

    @Test
    public void parsesIntegersFromStrings()
    {
        Rational nineteen = Rational.parseRational("19");
        assertRationalIs(nineteen, 19);
    }

    @Test
    public void parsesAndSimplifiesFractionsFromStrings()
    {
        Rational oneSixteenth = Rational.parseRational("0.0625");
        assertRationalIs(oneSixteenth, 1, 16);
    }

    @Test
    public void twoRationalsCreatedDifferentlyAreEqual()
    {
        Rational threeQuartersA = Rational.parseRational("0.75");
        Rational threeQuartersB = new Rational(valueOf(300), valueOf(400));
        assertEquals(threeQuartersA, threeQuartersB);
    }

    @Test
    public void twoRationalsCreatedDifferentlyCompareEqual()
    {
        Rational threeQuartersA = Rational.parseRational("0.75");
        Rational threeQuartersB = new Rational(valueOf(300), valueOf(400));
        assertThat(threeQuartersA.compareTo(threeQuartersB), is(0));
    }

    @Test
    public void slightlySmallerComparesBeforeWhenDenominatorSmaller()
    {
        Rational lower = Rational.parseRational("0.4");
        Rational higher = Rational.parseRational("0.41327");
        assertThat(lower.compareTo(higher), is(-1));
    }

    @Test
    public void slightlySmallerComparesBeforeWhenDenominatorLarger()
    {
        Rational lower = Rational.parseRational("0.39283");
        Rational higher = Rational.parseRational("0.4");
        assertThat(lower.compareTo(higher), is(-1));
    }

    @Test
    public void slightlyLargerComparesAfterWhenDenominatorLarger()
    {
        Rational lower = Rational.parseRational("0.4");
        Rational higher = Rational.parseRational("0.41327");
        assertThat(higher.compareTo(lower), is(1));
    }

    @Test
    public void slightlyLargerComparesAfterWhenDenominatorSmaller()
    {
        Rational lower = Rational.parseRational("0.39283");
        Rational higher = Rational.parseRational("0.4");
        assertThat(higher.compareTo(lower), is(1));
    }

    @Test
    public void normalisesNegativesSoOnlyNumeratorNegative()
    {
        Rational silly3 = new Rational(valueOf(-9), valueOf(-3));
        assertRationalIs(silly3, 3);
    }

    @Test
    public void canAddIntegers()
    {
        Rational seven = new Rational(valueOf(7));
        Rational twelve = new Rational(valueOf(12));
        Rational nineteen = new Rational(valueOf(19));
        assertThat(seven.plus(twelve), is(nineteen));
    }

    @Test
    public void canAddFractionsWithSameDenominator()
    {
        Rational twoSevenths = new Rational(valueOf(2), valueOf(7));
        Rational fourSevenths = new Rational(valueOf(4), valueOf(7));
        assertRationalIs(twoSevenths.plus(fourSevenths), 6, 7);
    }

    @Test
    public void canAddFractionsWithDifferentDenominators()
    {
        Rational oneThird = new Rational(valueOf(1), valueOf(3));
        Rational oneQuarter = new Rational(valueOf(1), valueOf(4));
        assertRationalIs(oneThird.plus(oneQuarter), 7, 12);
    }

    @Test
    public void canNegateFractions()
    {
        Rational fiveSixths = new Rational(valueOf(5), valueOf(6));
        assertRationalIs(fiveSixths.negate(), -5, 6);
    }

    @Test
    public void negatingANegativeNumberMakesItPositive()
    {
        Rational minusThirteenSevenths = new Rational(valueOf(-13), valueOf(7));
        assertRationalIs(minusThirteenSevenths.negate(), 13, 7);
    }

    @Test
    public void canSubtractIntegers()
    {
        Rational oneThird = new Rational(valueOf(14));
        Rational oneQuarter = new Rational(valueOf(9));
        assertRationalIs(oneThird.minus(oneQuarter), 5);
    }

    @Test
    public void canSubtractToZero()
    {
        Rational twelvety = new Rational(valueOf(120));
        assertRationalIs(twelvety.minus(twelvety), 0);
    }

    @Test
    public void canSubtractFractions()
    {
        Rational oneThird = new Rational(valueOf(1), valueOf(3));
        Rational oneQuarter = new Rational(valueOf(1), valueOf(4));
        assertRationalIs(oneThird.minus(oneQuarter), 1, 12);
    }

    @Test
    public void canMultiplyIntegers()
    {
        Rational nine = new Rational(valueOf(9));
        Rational six = new Rational(valueOf(6));
        assertRationalIs(nine.multipliedBy(six), 54);
    }

    @Test
    public void canMultiplyFractions()
    {
        Rational oneHalf = new Rational(valueOf(1), valueOf(2));
        Rational twoThirds = new Rational(valueOf(2), valueOf(3));
        assertRationalIs(oneHalf.multipliedBy(twoThirds), 1, 3);
    }

    @Test
    public void canMultiplyByZero()
    {
        Rational nineteen = new Rational(valueOf(19));
        Rational zero = new Rational(valueOf(0));
        assertRationalIs(nineteen.multipliedBy(zero), 0);
    }

    @Test
    public void canDivideIntegers()
    {
        Rational fifteen = new Rational(valueOf(15));
        Rational three = new Rational(valueOf(3));
        assertRationalIs(fifteen.dividedBy(three), 5);
    }

    @Test
    public void canDivideFractions()
    {
        Rational twoThirds = new Rational(valueOf(2), valueOf(3));
        Rational fourFifths = new Rational(valueOf(4), valueOf(5));
        assertRationalIs(twoThirds.dividedBy(fourFifths), 5, 6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideByZeroThrowsAnError()
    {
        Rational zero = new Rational(valueOf(0));
        Rational nineteen = new Rational(valueOf(19));
        nineteen.dividedBy(zero);
    }



    private void assertRationalIs(Rational nineteen, int numerator) {
        assertThat(nineteen.getNumerator(), is(valueOf(numerator)));
        assertThat(nineteen.getDenominator(), is(valueOf(1)));
    }

    private void assertRationalIs(Rational nineteen, long numerator, long denominator) {
        assertThat(nineteen.getNumerator(), is(valueOf(numerator)));
        assertThat(nineteen.getDenominator(), is(valueOf(denominator)));
    }
}
