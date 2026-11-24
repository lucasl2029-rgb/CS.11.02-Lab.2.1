/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
 * NAME: Lucas Lam
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        var twoNumberSum = add(3, 8);
        System.out.println(twoNumberSum);

        var fourNumberSum = add(3, 8, 4, 9);
        System.out.println(fourNumberSum);

        var morningMessage = morningGreeting("Toby Fox");
        System.out.println(morningMessage);

        var afternoonMessage = afternoonGreeting("Mac Miller");
        System.out.println(afternoonMessage);

        var tripledWord = triple("oohbaby");
        System.out.println(tripledWord);

        var halfValue = half(17);
        System.out.println(halfValue);

        var roundedPositive = roundPositiveValueToNearestInteger(8.5);
        System.out.println(roundedPositive);

        var roundedNegative = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(roundedNegative);
    }

    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int add(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        return add(add(firstNumber, secondNumber), add(thirdNumber, fourthNumber));
    }

    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    public static String triple(String text) {
        return text.repeat(3);
    }

    public static double half(int number) {
        return number / 2.0;
    }

    public static int roundPositiveValueToNearestInteger(double value) {
        return (int) (value + 0.5);
    }

    public static int roundNegativeValueToNearestInteger(double value) {
        return (int) (value - 0.5);
    }
}