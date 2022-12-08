import java.util.Scanner;

class Account{

    String customer_name = new String();
    int account_number;

}
class Current extends Account{

    int balance;
    Scanner s = new Scanner(System.in);

    Current (){
        System.out.println("Enter customer name and account number:");
        customer_name = s.next();
        account_number = s.nextInt();
        balance = 0;
    }
    void deposit (){
        System.out.println("Enter the amount to deposit:");
        balance += s.nextInt();

        if (balance < 500){
            System.out.println("500 INR service charge. Account balance falls below minumum required balance 500 INR");
        }
    }
    void display (){
        System.out.printf("\nName: %s\nAccount number: %d\nAccount type: Current Account\nBalance: %d", customer_name, account_number, balance);
    }
    void withdraw (){
        int with;

        System.out.println("Enter the amount to withdraw:");
        with = s.nextInt();

        if (with > balance){
            System.out.println("Balance is less than withdraw amounth!");
        }
        else{
            balance -= with;
        }
    }

}

class Savings extends Account{

    double balance;
    Scanner s = new Scanner(System.in);

    Savings (){
        System.out.println("Enter customer name and account number:");
        customer_name = s.next();
        account_number = s.nextInt();
        balance = 0;
    }
    void deposit (){
        System.out.println("Enter the amount to deposit:");
        balance += s.nextInt();
    }
    void display (){
        System.out.printf("\nName: %s\nAccount number: %d\nAccount type: Savings Account\nBalance: %d", customer_name, account_number, balance);
    }
    void withdraw (){
        int with;

        System.out.println("Enter the amount to withdraw:");
        with = s.nextInt();
        if (with>balance){
            System.out.println("Balance is less than withdraw amounth!");
        }
        else{
            balance -= with;
        }
    }
}
class Bank{
    public static void main(String[] args) {
        int choice, x=0;
        Scanner s = new Scanner(System.in);

        System.out.printf("\n1:Create current account\n2:Create savings account\n");
        choice = s.nextInt();

        switch (choice){

            case 1:Current c1 = new Current();

            while (x==0){

                System.out.printf("\n1:Deposit\n2:Withdraw\n3:Display balance\n4:Exit\n");
                choice = s.nextInt();

                switch (choice){

                    case 1:c1.deposit();
                    break;

                    case 2:c1.withdraw();
                    break;

                    case 3:c1.display();
                    break;

                    case 4:x=1;
                    break;

                    default:System.out.println("Enter a valid input!");
                    break;
                }
            }
            break;

            case 2:Savings s1 = new Savings();

            while (x==0){

                System.out.printf("\n1:Deposit\n2:Withdraw\n3:Display balance\n");
                choice = s.nextInt();

                switch (choice){

                    case 1:s1.deposit();
                    break;

                    case 2:s1.withdraw();
                    break;

                    case 3:s1.display();
                    break;

                    case 4:x=1;
                    break;

                    default:System.out.println("Enter a valid input!");
                    break;
                }
            }
            break;

            default:System.out.println("Enter a valid input!");
        }
        s.close();
    }
}