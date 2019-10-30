import org.junit.jupiter.api.*; //added junit 5 to class path, added junit jar file to classpath as a dependency
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions.*;
//test cases are methods within this class
//@BeforEach, @AfterEach, @BeforeAll, @AfterAll
//assertions: Assertions.assertTrue, Assertions.assertEqual,
//AssertEquals(expected, actual, errmessage)


public class TestSlipperySlot
{

    //all elements same variations
    @Test
    public void allElementsSame()
    {
        int values[] = new int[]{3,3,3,3,3}; //isnt anything else
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 1000000;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void AllElementsSameandFourtyTwo()
    {
        int values[] = new int[]{42,42,42,42,42};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 1000002;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void allElementsSameandPerfectSquare()
    {
        int values[] = new int[]{9,9,9,9,9};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 1000007;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void allElementsSameandPowerTwo()
    {
        int values[] = new int[]{8,8,8,8,8};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 1000003;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void allElementsSameAndPowertwoandPerfectSquare()
    {
        int values[] = new int[]{4,4,4,4,4};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 1000010;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void allElementsSameAndPowertwoandPerfectSquareIsOne()
    {
        int values[] = new int[]{1,1,1,1,1};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 1000010;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void oneIsPowerTwoAndPerfectSquare()
    {
        int values[] = new int[]{1,7,12,19,5};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 10;
        Assertions.assertEquals(expected, actual);

    }

    //exactly four numbers same variations
    @Test
    public void exactlyFourNumbersSame()
    {
        int values[] = new int[]{7,7,7,7,3};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 10000;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void exactlyFourNumbersSameAndPerfectSquare()
    {
        int values[] = new int[]{7,7,7,7,9};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 10007;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void exactlyFourNumbersSameAndFourtyTwo()
    {
        int values[] = new int[]{7,7,7,7,42};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 10002;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void exactlyFourNumbersSameAndPowerTwo()
    {
        int values[] = new int[]{7,7,7,7,2};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 10003;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void exactlyFourNumbersSamePowerTwoAndPerfectSquare()
    {
        int values[] = new int[]{7,7,7,7,4};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 10010;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void exactlyFourNumbersSamePowerTwoAndPerfectSquareandFourtyTwo()
    {
        int values[] = new int[]{42,42,42,42,4};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 10012;
        Assertions.assertEquals(expected, actual);

    }

    //exactly three numbers same and two matching variations

    @Test
    public void exactlyThreeNumbersSameandTwoMatching()
    {
        int values[] = new int[]{3,3,3,7,7};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 5000;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void exactlyThreeNumbersSameandTwoMatchingAndPerfectSquare()
    {
        int values[] = new int[]{3,3,3,9,9};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 5007;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void exactlyThreeNumbersSameandTwoMatchingAndFourtyTwo()
    {
        int values[] = new int[]{7,7,7,42,42};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 5002;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void exactlyThreeNumbersSameandTwoMatchingAndPowerTwo()
    {
        int values[] = new int[]{3,3,3,2,2};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 5003;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void exactlyThreeNumbersSameandTwoMatchingAndPerfectSquareAndPowerTwo()
    {
        int values[] = new int[]{7,7,7,4,4};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 5010;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void exactlyThreeNumbersSameandTwoMatchingAndPerfectSquareandFourtyTwo()
    {
        int values[] = new int[]{42,42,42,9,9};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 5009;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void exactlyThreeNumbersSameandTwoMatchingAndPerfectSquareandFourtyTwoandPowTwo()
    {
        int values[] = new int[]{42,42,42,4,4};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 5012;
        Assertions.assertEquals(expected, actual);

    }

    //exactly three numbers same and two not matching variations

    @Test
    public void exactlyThreeNumbersSameandTwoNOTMatching()
    {
        int values[] = new int[]{3,3,3,7,11};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 100;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void exactlyThreeNumbersSameandTwoNOTMatchingAndPerfectSquare()
    {
        int values[] = new int[]{3,3,3,9,10};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 107;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void exactlyThreeNumbersSameandTwoNOTMatchingAndFourtyTwo()
    {
        int values[] = new int[]{7,7,7,3,42};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 102;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void exactlyThreeNumbersSameandTwoNOTMatchingAndPowerTwo()
    {
        int values[] = new int[]{3,3,3,8,2};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 103;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void exactlyThreeNumbersSameandTwoNOTMatchingAndPerfectSquareAndPowerTwo()
    {
        int values[] = new int[]{7,7,7,1,4};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 110;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void exactlyThreeNumbersSameandTwoNOTMatchingAndPerfectSquareandFourtyTwo()
    {
        int values[] = new int[]{42,42,42,3,9};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 109;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void exactlyThreeNumbersSameandTwoNOTMatchingAndPerfectSquareandFourtyTwoandPowTwo()
    {
        int values[] = new int[]{42,42,42,1,4};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 112;
        Assertions.assertEquals(expected, actual);

    }

    //exactly 2  matching variations

    @Test
    public void twoMatching()
    {
        int values[] = new int[]{3,3,7,7,11};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 10;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void twoMatchingAndPerfectSquare()
    {
        int values[] = new int[]{3,3,7,9,10};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 17;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void twoMatchingAndFourtyTwo()
    {
        int values[] = new int[]{7,7,11,42,42};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 12;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void twoMatchingAndPowerTwo()
    {
        int values[] = new int[]{3,3,7,8,2};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 13;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void twoMatchingAndPerfectSquareAndPowerTwo()
    {
        int values[] = new int[]{7,7,47,1,4};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 20;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void twoMatchingAndPerfectSquareandFourtyTwo()
    {
        int values[] = new int[]{42,42,7,3,9};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 19;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void twoMatchingAndPowTwoandFourtyTwo()
    {
        int values[] = new int[]{42,42,8,3,7};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 15;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void twoMatchingAndPerfectSquareandFourtyTwoandPowTwo()
    {
        int values[] = new int[]{42,42,2,1,4};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 22;
        Assertions.assertEquals(expected, actual);

    }

    //none matching but combination rules variations
    @Test
    public void powerTwo()
    {
        int values[] = new int[]{11,2,3,7,5};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 3;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void FourtyTwo()
    {
        int values[] = new int[]{17,19,11,7,42};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 2;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void perfSquare()
    {
        int values[] = new int[]{25,3,13,11,7};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 7;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void powerTwoAndPerfSquare()
    {
        int values[] = new int[]{1,2,3,4,5};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 10;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void powerTwoAndFourtyTwo()
    {
        int values[] = new int[]{7,3,11,2,42};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 5;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void perfSquareAndFourtyTwo()
    {
        int values[] = new int[]{42,3,13,25,7};
        SlipperySlot instance = new SlipperySlot();
        int actual = instance.payOff(values);
        int expected = 9;
        Assertions.assertEquals(expected, actual);

    }




}
