package myexercise;

 public class PowerOfFour {
    public String powerOfFourChecker(int number)
    {
        int copyNum=number;
        while(copyNum!=1)
        {
            if(copyNum%4!=0)
                return("Not a Power of 4");
            copyNum=copyNum/4;
        }
        return("Yess,it is a power of 4");
    }
}
