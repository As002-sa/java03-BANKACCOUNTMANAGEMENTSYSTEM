public class Bank {

    private BankAccount[] accounts;
    private int count;

    public Bank(int capacity) {
        accounts = new BankAccount[capacity];
        count = 0;
    }

    public void addAccount(BankAccount account) {

        if (count < accounts.length) {
            accounts[count] = account;
            count++;

            System.out.println("Account added successfully.");
        } else {
            System.out.println("Bank is full.");
        }
    }

    public BankAccount findAccount(int accountNumber) {

        for (int i = 0; i < count; i++) {

            if (accounts[i].getAccountNumber() == accountNumber) {
                return accounts[i];
            }
        }

        return null;
    }

    public void displayAccounts() {

        if (count == 0) {
            System.out.println("No accounts found.");
            return;
        }

        for (int i = 0; i < count; i++) {
            accounts[i].displayInfo();
        }
    }

    public void deleteAccount(int accountNumber) {

        for (int i = 0; i < count; i++) {

            if (accounts[i].getAccountNumber() == accountNumber) {

                accounts[i] = accounts[count - 1];
                accounts[count - 1] = null;
                count--;

                System.out.println("Account deleted successfully.");
                return;
            }
        }

        System.out.println("Account not found.");
    }

    public void deposit(int accountNumber, double amount) {

        BankAccount account = findAccount(accountNumber);

        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(int accountNumber, double amount) {

        BankAccount account = findAccount(accountNumber);

        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }
}
