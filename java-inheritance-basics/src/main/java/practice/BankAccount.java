package practice;

public class BankAccount {

  private double clientBankAccount;

  public double getAmount() {
    return clientBankAccount;
  }

  public void put(double amountToPut) {
    if (amountToPut > 0) {
      clientBankAccount += amountToPut;
    }
  }

  public void take(double amountToTake) {
    if (amountToTake < clientBankAccount) {
      clientBankAccount -= amountToTake;
    }
  }
}
