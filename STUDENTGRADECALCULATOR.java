import java.util.Scanner;

public class STUDENTGRADECALCULATOR {
    public static void main (String[] args){
        System.out.print("Enter the number of subject : ");
        Scanner numberofsubject = new Scanner(System.in);
        int n = numberofsubject.nextInt();
        int sum =0;
        for (int i=1; i<=n; i++)
        {
            System.out.print("enter the " +i+ " subject: ");
            Scanner m = new Scanner(System.in);
            int s =m.nextInt();
            sum = sum + s;
        }

        int percent;
        percent = sum / n;
        System.out.println("you have got total marks : "+sum);
        System.out.println("you have got average percent : "+percent);
        if (percent >= 70){
            System.out.println("you have got : A grade");
        } else if (70 >percent && percent >= 60) {
            System.out.println("you have got : B grade ");
        } else if (60 > percent && percent >= 50 ) {
            System.out.println("you have got : C grade");
        } else if (50 > percent && percent>= 40) {
            System.out.println("you have got : D grade");
        }
        else if (40 > percent && percent >= 33){
            System.out.println("you have got : E grade");
        }
        else {
            System.out.println("you are fail ");
        }
    }
}
