import java.util.*;
class bank {
    String name;
    String address;
    static int c=1001;
    double bal;
    int accno;

    bank(String name,String address,double bal)
    {
        this.name=name;
        this.address=address;
        this.bal=bal;
        this.accno=c++;
    }

    void display()
    {
        System.out.println("Account Details: ");
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Balance: "+bal);
    }

    void Deposite(double add)
    {
        if(add>0){
            bal=bal+add;
            System.out.println("Amount added");
        }
        else
        {
            System.out.println("Invalid amount");
        }
    }

    void withdraw(double sub)
    {
        if(sub>0&&sub<=bal)
        {
            bal=bal-sub;
            System.out.println("Amount withdrawal");
        }
        else
        {
            System.out.println("Invalid withdrawal");
        }
    }

    void changeaddress(String adrs)
    {
        this.address=adrs;
        System.out.println("Adrs updated");
    }
    int getAccountNumber()
    {
        return accno;
    }

}
class bankmanagement
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of depositer: ");
        int n=sc.nextInt();
        sc.nextLine();
        bank[] b=new bank[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for depositor " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();
            System.out.print("Initial Balance: ");
            double balance = sc.nextDouble();
            sc.nextLine(); // Consume newline

            b[i] = new bank(name, address, balance);
        }

        while (true) {
            System.out.println("\nOperations:");
            System.out.println("1 - Display details of a depositor");
            System.out.println("2 - Deposit money");
            System.out.println("3 - Withdraw money");
            System.out.println("4 - Change address");
            System.out.println("5 - Exit");
            System.out.print("Choose an operation: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter account number: ");
            int accNum = sc.nextInt();
            sc.nextLine(); // Consume newline

            bank selectedAccount = null;

            for (bank acc : b) {
                if (acc.getAccountNumber() == accNum) {
                    selectedAccount = acc;
                    break;
                }
            }

            if (selectedAccount == null) {
                System.out.println("Account not found!");
                continue;
            }

            switch (choice) {
                case 1:
                    selectedAccount.display();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    selectedAccount.Deposite(depositAmount);
                    selectedAccount.display();
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    selectedAccount.withdraw(withdrawAmount);
                    selectedAccount.display();
                    break;
                case 4:
                    System.out.print("Enter new address: ");
                    String newAddress = sc.nextLine();
                    selectedAccount.changeaddress(newAddress);
                    selectedAccount.display();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}
 
