public class Transaction {

    private int accountNumber;
    private String type;
    private double amount;

    public Transaction(int accountNumber, String type, double amount) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.amount = amount;
    }

    public void displayTransaction() {
        System.out.println("----------------------------");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Transaction Type: " + type);
        System.out.println("Amount: " + amount);
        System.out.println("----------------------------");
    }
}