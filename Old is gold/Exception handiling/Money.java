class InsufficientBalance extends Exception {
    public InsufficientBalance(String str) {
        super(str);
    }
}

public class Money {
    static void withdraw(float balance, float withdraw) throws InsufficientBalance {
        if (balance < withdraw) {
            throw new InsufficientBalance("Unable to withdraw");
        } else {
            System.out.println("Successfull");
            balance = balance - withdraw;
            System.out.println(balance);
        }
    }

    public static void main(String args[]) {
        try {
            withdraw(20000, 10000);
        } catch (InsufficientBalance e) {
            System.out.println("Not enough balance");
        }
    }
}
