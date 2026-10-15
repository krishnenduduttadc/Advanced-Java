package Contracts;


class BankAccount {

    private int balance;

    BankAccount(int balance) {

        if (balance < 0) {
            throw new IllegalArgumentException(
                    "Initial balance cannot be negative"
            );
        }

        this.balance = balance;
    }

    public void withdraw(int amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Amount must be positive"
            );
        }

        if (amount > balance) {
            throw new IllegalArgumentException(
                    "Insufficient balance"
            );
        }

        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}

public class ContractDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        account.withdraw(300);

        System.out.println(account.getBalance());
    }
}

