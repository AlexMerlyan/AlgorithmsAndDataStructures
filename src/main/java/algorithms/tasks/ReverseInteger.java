package algorithms.tasks;

public class ReverseInteger {

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverseInt(123456));
        System.out.println(reverseInteger.reverseInt(54321));
        System.out.println(reverseInteger.reverseInt(123));
    }

    private int reverseInt(int number, int length, int divider, int startPow) {
        if (length == 1) {
            return number / startPow;
        }
        int pow = (int) Math.pow(10, --length);
        int result = number % divider / (divider / 10) * pow;
        return result + reverseInt(number, length, divider * 10, startPow);
    }

    public int reverseInt(int number) {
        int length = getLength(number);
        int pow = (int) Math.pow(10, --length);
        int divider = 10;
        int result = number % divider * pow;
        return result + reverseInt(number, length, divider * 10, pow);
    }

    private int getLength(int number) {
        int length = 0;
        for (int i = 10; i > 0; i--) {
            int pow = (int) Math.pow(10, i -1);
            if (number / pow > 0) {
                length = i;
                break;
            }
        }
        return length;
    }

}
