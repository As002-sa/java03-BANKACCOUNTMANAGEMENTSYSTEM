import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Bank bank = new Bank(100);

        int choice;

        do {

            System.out.println();
            System.out.println("===== BANK ACCOUNT MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Display All Accounts");
            System.out.println("3. Search Account");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Delete Account");
            System.out.println("7. Show Transaction");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter account number: ");
                    int accountNumber = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter owner name: ");
                    String ownerName = scanner.nextLine();

                    System.out.print("Enter initial balance: ");
                    double balance = scanner.nextDouble();
                    scanner.nextLine();

                    BankAccount account =
                            new BankAccount(accountNumber, ownerName, balance);

                    bank.addAccount(account);

                    break;

                case 2:

                    bank.displayAccounts();

                    break;

                case 3:

                    System.out.print("Enter account number: ");
                    int searchNumber = scanner.nextInt();
                    scanner.nextLine();

                    BankAccount foundAccount =
                            bank.findAccount(searchNumber);

                    if (foundAccount != null) {
                        foundAccount.displayInfo();
                    } else {
                        System.out.println("Account not found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter account number: ");
                    int depositAccount = scanner.nextInt();

                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine();

                    bank.deposit(depositAccount, depositAmount);

                    break;

                case 5:

                    System.out.print("Enter account number: ");
                    int withdrawAccount = scanner.nextInt();

                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine();

                    bank.withdraw(withdrawAccount, withdrawAmount);

                    break;

                case 6:

                    System.out.print("Enter account number: ");
                    int deleteNumber = scanner.nextInt();
                    scanner.nextLine();

                    bank.deleteAccount(deleteNumber);

                    break;

                case 7:

                    System.out.print("Enter account number: ");
                    int transactionAccount = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter transaction type: ");
                    String transactionType = scanner.nextLine();

                    System.out.print("Enter amount: ");
                    double transactionAmount = scanner.nextDouble();
                    scanner.nextLine();

                    Transaction transaction =
                            new Transaction(
                                    transactionAccount,
                                    transactionType,
                                    transactionAmount
                            );

                    transaction.displayTransaction();

                    break;

                case 0:

                    System.out.println("Thank you for using the Bank System.");

                    break;

                default:

                    System.out.println("Invalid choice.");

                    break;
            }

        } while (choice != 0);

        scanner.close();
    }
}
