package practice;

public class CardAccount extends BankAccount {

    @Override
    public void take(double amountToTake) {
        double bankFee = amountToTake + ((amountToTake / 100) * 1);
        super.take(bankFee);
    }
}
