// find Largest 4 digit number divisible by 10 and 13

public class LargestDivisibleNumber {

    // Computing the greatest common divisor (GCD)
    public static int gcd(int x, int y) {
        if (y == 0)
            return x;
        return gcd(y, x % y);
    }

    //Computing the least common multiple (LCM)
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int number_1 = 10;
        int number_2 = 13;
        int lcm = lcm(number_1, number_2);
        int largestFourDigit = 9999;

        //Largest number less than or equal to 9999 divisible by the LCM
        int result = (largestFourDigit / lcm) * lcm;

        System.out.println("The largest four-digit number divisible by both " + number_1 + " and " + number_2 + " is: " + result);
    }
}