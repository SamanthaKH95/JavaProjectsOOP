
import java.util.Random;
import java.util.Arrays;
import java.util.Vector;

public class BetterSlot
{
    public int [] pullTheLever()
    {
        //generates a 5-integer array with random numbers from 1-50 inclusive to return for use in payout
        int intArray[] = new int[5];

        //creating instance of Random class for random number generation
        Random rand = new Random();

        for (int i = 0; i < intArray.length; i++)
        {
            int randInt = rand.nextInt(50) + 1; //because its 0-49, you want it to be 1-50
            intArray[i] = randInt;
        }

        return intArray;

    }

    public int payOff (int [] values)
    {
        //primary states
        int payOff = 0;
        boolean passed = false;
        int first = values[0];
        int second = values[1];
        int third = values[2];

        //rules 1-5 are mutually exclusive with the highest value payout, so check in descending payout order
        //stop checking for rules 1-5 once condition of one of them has been met, do not want to duplicate

        //case 1: all 5 numbers are the same, pay 1000000
        boolean allFiveSame = true;
        for(int i = 1; i < 5 && allFiveSame; i++)
        {
            if (values[i] != first) allFiveSame = false;
        }

        if (allFiveSame)
        {
            passed = true; //so the rest of the tests don't get tested
            payOff = payOff + 1000000;
        }

        //case 2: If four numbers are the same (and the fifth number does not match), pay $10000
        //assume that the first rule did not pass so automatically not all 5 items are the same
        //only need to check if it equals to 4 same numbers exactly - counter will be 3

        int counter1 = 0;
        int counter2 = 0;
        for(int i = 1; i < 5; i++)
        {
            //comparing everything to the first element, counter will be 3 if the first element is the majority element
            if (values[i] == first)
            {
                counter1++;
            }
        }

        for(int i = 2; i < 5; i++)
        {
            //case if first element is not majority element
            //comparing everything to the second element, counter will be 3 if the second element is the majority element
            if (values[i] == second)
            {
                counter2++;
            }
        }

        if ((counter1 == 3 || counter2 == 3) && passed ==false)
        {
            passed = true;
            payOff = payOff + 10000;
        }


        //case 3 and 4:
        //If three numbers are the same AND the remaining two numbers match each other (but not the previous three --
        // a "full house"), pay $5000.
        //If three numbers are the same and the remaining two numbers are different
        // (both from the set of three and each other), pay $100

        Vector<Integer> indexes1 = new Vector<>(); //should only have 2 elements if there are 3 matching numbers
        Vector<Integer> indexes2 = new Vector<>();
        Vector<Integer> indexes3 = new Vector<>();
        int index1 = 0; //
        int index2 = 0; //careful, might alwayas be 0 if not careful
        int counter3= 0;
        int counter4= 0;
        int counter5= 0;

        for(int i = 1; i < 5; i++)
        {
            //comparing everything to the first element, counter will be 2 if the first element is the majority element
            if (values[i] == first)
            {
                counter3++;
            }
            if (values[i] != first)
            {
                indexes1.add(i);
            }
        }


        indexes2.add(0);
        for(int i = 2; i < 5; i++)
        {
            //case if first element is not majority element
            //comparing everything to the second element, counter will be 2 if the second element is the majority element
            if (values[i] == second)
            {
                counter4++;
            }
            if (values[i] != second)
            {
                indexes2.add(i);
            }
        }

        indexes3.add(0);
        indexes3.add(1);
        for(int i = 3; i < 5; i++)
        {
            //case if first element is not majority element
            //comparing everything to the third element, counter will be 2 if the third element is the majority element
            if (values[i] == third)
            {
                counter5++;
            }
            if (values[i] != third)
            {
                indexes3.add(i);
            }
        }

        if (counter3 == 2)
        {
            index1 = indexes1.get(0);
            index2 = indexes1.get(1);
        }

        if (counter4 == 2)
        {
            index1 = indexes2.get(0);
            index2 = indexes2.get(1);
        }

        if (counter5 == 2)
        {
            index1 = indexes3.get(0);
            index2 = indexes3.get(1);
        }


        if ((counter3 == 2 || counter4 == 2 || counter5 == 2)  && passed == false)
        {
            if (values[index1] == values[index2])
            {
                passed = true;
                payOff = payOff + 5000;
            }
            if (values[index1] != values[index2])
            {
                passed = true;
                payOff = payOff + 100;
            }
        }


        //Case 5: If any two numbers are the same (but no previous rule applies), pay $10.
        boolean twoNums = false;

        //comparing with 1st value
        if((values[0] == values[1]) || (values[0] == values[2]) || (values[0] == values[3]) || (values[0] == values[4]))
        {
            twoNums = true;
        }

        //comparing with 2nd value
        if((values[1] == values[2]) || (values[1] == values[3]) || (values[1] == values[4]))
        {
            twoNums = true;
        }

        //comparing with 3rd value

        if((values[2] == values[3]) || (values[2] == values[4]))
        {
            twoNums = true;
        }

        //comparing with 4th value
        if(values[3] == values[4])
        {
            twoNums = true;
        }

        if (twoNums == true && passed == false)
        {
            passed = true;
            payOff = payOff + 10;
        }


        /* ========================================================================================================== */
        //rules that happen not mutually exclusively but at most once per spin
        //If one or more of the five numbers is a perfect (integer) square, add $7 to the payout (at most once per spin).
        //              sqrt should be a whole number if it is a perfect square
        //If one or more of the five numbers is 42, add $2 (at most once per spin).
        //If one or more of the five numbers is a power of two, add $3 (at most once per spin).
        //1 is both a perfect square and a power of 2^0

        boolean perfectSquare = false;
        boolean fourtyTwo = false;
        boolean powerOfTwo = false;

        for(int i = 0; i < 5; i++)
        {
            int root = (int)Math.sqrt(values[i]);
            if (root * root == values[i])
            {
                perfectSquare = true;
            }

        }

        if (perfectSquare)
        {
            payOff = payOff + 7;
        }

        for(int i = 0; i < 5; i++)
        {
            if (values[i] == 42)
            {
                fourtyTwo = true;
            }

        }

        if (fourtyTwo)
        {
            payOff = payOff + 2;
        }

        for(int i = 0; i < 5; i++)
        {
            if ((int)(Math.ceil((Math.log(values[i]) / Math.log(2)))) == (int)(Math.floor(((Math.log(values[i]) / Math.log(2))))))
            {
                powerOfTwo = true;
            }


        }

        if (powerOfTwo)
        {
            payOff = payOff + 3;
        }

        return payOff;
    }

}



/*


Your BetterSlot is not required to provide a main method, but may do so for your own testing purposes.
You are strongly encouraged to run your JUnit tests against your BetterSlot implementation; however,
be sure that your final commit has the tests targeting a SlipperySlot instance.
 */