import java.util.Scanner;

public class CalculateArea
{
    public void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int c;
        System.out.print("enter accountnumber and the primary balance neme of owner : ");
        BankAccount b=new BankAccount(s.nextLong(),s.nextDouble(),s.nextLine());
        System.out.println("welcome to the bank:");
        do {
            System.out.print("1.deposite\n2.withdraw\n3.show info\n4.exite\n");
            c=s.nextInt();
            switch(c)
            {
                case 1:
                    System.out.println("enter the amount of money:");
                    double m=s.nextDouble();
                    b.deposite(m);
                    break;
                case 2:
                    System.out.println("enter the amount of money:");
                    double m1=s.nextDouble();
                    b.withdraw(m1);
                    break;
                case 3:
                    b.displayAccountinfo();
                    break;
                case 4:
                    System.out.println("exit the site!");
                    break;
            }
        }while(c!=4);
    }
    class BankAccount
    {
        private long accountNumber;
        private String ownerName;
        private double balance;
        private int interseRate;
        public BankAccount(long accountNumber,double balance,String ownerName)
        {
            this.accountNumber=accountNumber;
            this.ownerName=ownerName;
            this.balance=balance;
        }
        public void deposite(double amount)
        {
            balance+=amount;
            System.out.printf("noe you have %d $",balance);
        }
        public void withdraw(double amount)
        {
            if(amount>balance) System.out.println("not enough balance");
            else
            {
                balance-=amount;
                System.out.println("ypur balance: "+balance);
            }
        }
        public void displayAccountinfo()
        {
            System.out.printf("\nowner of account: %s\taccount number: %d\tbalance: %f",ownerName,accountNumber,balance);
        }
    }
}
