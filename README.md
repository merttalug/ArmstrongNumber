# ArmstrongNumber
A program that finds whether a number between 0-1000 that it receives as input from users is an Armstrong number.
![img](https://i.ytimg.com/vi/OvANihsVDI8/maxresdefault.jpg)

## What is Armstrong Number?
An n-digit number is called an Armstrong number if the sum of the nth powers of the digits is equal to the number itself.

* Let's take the number 407 for example. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407. This shows that 407 is an armstrong number.
* Let's also look at the number 1342. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 is not an armstrong number because it is not equal to 1342.
* 1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634
* 54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748



## Sample Scope

```

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





```
