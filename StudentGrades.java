package myexercise;

public class StudentGrades {
    int flag=0;
    public int checkForValidInput(int grades[],int n)
    {
        int i;
        for(i=0;i<n;i++) {
            if ((grades[i] < 10) || (grades[i] > 100)) {
                flag = 1;

            }
        }
        return flag;

    }
    public float avgOfAll(int grades[], int n) {
        float avg=0;
        if (flag == 0) {
            int sum = 0;

            for (int i = 0; i < n; i++) {
                sum = sum + grades[i];
            }
            avg = sum / n;

        }
        return avg;
    }

    public int minOfAll(int grades[], int n) {
        int min=grades[0];
        if (flag == 0) {
            int i = 0;

            for (i = 0; i < n; i++) {
                if (min > grades[i])
                    min = grades[i];

            }

        }
        return min;
    }

    public int maxOfAll(int grades[], int n) {
        int max=grades[0];
        if (flag==0){
            int  i=0;

            for (i = 0; i < n; i++) {
                if (max < grades[i])
                    max = grades[i];

            }

        }
        return max;
    }
}