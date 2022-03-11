import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        int number, digitnumber = 0, digitvalue = 1, res = 0, digitpow, tempnumber = 0;
        boolean asknumber = false;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please enter a number: ");
            number = input.nextInt();
            if (number > 0 && number <= 999) {
                asknumber = true;
            }
        }
        while (!asknumber);

        tempnumber = number;

        while (tempnumber != 0) {
            tempnumber /= 10;
            digitnumber++;
        }

        tempnumber = number;

        while (tempnumber != 0) {
            digitvalue = tempnumber % 10;
            digitpow = 1;
            for (int i = 1; i <= digitnumber; i++) {
                digitpow *= digitvalue;
            }
            res += digitpow;
            tempnumber /= 10;
        }

        if (res == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");


        }

    }
}

