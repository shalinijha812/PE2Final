package myexercise;

public class Reverse {
    public String palindromeChecker(int inputNumber) {
        int copyInput, lastDigit, reverseNum=0;
        copyInput = inputNumber;

        while (copyInput != 0) {
            lastDigit = copyInput % 10;   /*Calulating the last digit*/

            reverseNum = reverseNum * 10 + lastDigit;/*Reverse of number calculated*/
            copyInput = copyInput / 10;
        }
        if (reverseNum == inputNumber)
            return ("Yess it is a palindrome");
        else
            return ("Not a Palindrome");
    }
}

