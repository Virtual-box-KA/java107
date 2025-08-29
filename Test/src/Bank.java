public class Bank {
    private int balance = 12000;
    public void withdrawal(int amount){
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient Balance");
        }else{
            balance = balance-amount;
            System.out.println("Withdrawal Successfull, Remaining balanace "+balance);
        }
    }
}

