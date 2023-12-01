import java.util.Scanner;

public class ATM_MACHINE {
   static float balance=0;
    static void check()
    {

        System.out.println("YOUR AVAILABLE BALANCE : " +balance );

    }
    static  void desposit()
    {
        System.out.println("ENTRE AMOUNT TO DEPOSIT : ");
        Scanner sc = new Scanner(System.in);
        float c = sc.nextFloat();
        System.out.println(c+ "  DEPOSIT AMOUNT ARE SUCCESSFULLY!!");
        balance = balance + c;
        check();
    }

    static void withdraw()
    {
        System.out.println("ENTRE THE WITHDRAW AMOUNT ");
        Scanner with = new Scanner(System.in);
        float d= with.nextFloat();
        if (d > balance){
            System.out.println("INSUFFICIENT BALANCE !!");
        }
        else{
            balance = balance - d ;
            System.out.println("THE WITHDRAW AMOUNT ARE SUFFICIENT !!");
        }
        check();
    }
    public static void main(String[] args){
        int atmnumber = 91611;
        int atmpin = 735;
     ///   float balance = 0;
        System.out.println("Enter the ATM Number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the ATM Pin : ");
        Scanner pin = new Scanner(System.in);
        int b = sc.nextInt();
        if ((a==atmnumber)&&(b==atmpin))
        {
            while(true)
            {
                System.out.println("1. CHECK THE BALANCE \n" +
                        "2. WITHDRAW THE AMOUNT\n"+
                        "3. DEPOSIT THE AMOUNT \n"+
                        "4. EXIT ");
                System.out.println("\n ENTER YOUR CHOICE");
                Scanner choice =new Scanner(System.in);
                int ch = choice.nextInt();
                if (ch==1){
                    check();
                }
                else if (ch==2) {
                     withdraw();
                }
                else if (ch==3) {
                   desposit();
                }
                else if (ch==4) {
                    System.out.println("COLLECT YOUR ATM CARD!!");
                    break;
                }
                else {
                    System.out.println("PLEASE ENTER THE CORRECT CHOICE ");
                }
            }
        }
        else{
            System.out.println("INVAILD ATM NUMBER AND ATM PIN ");
        }

    }
}
