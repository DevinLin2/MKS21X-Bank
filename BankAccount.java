public class BankAccount{
  private double bal;
  private int ID;
  private String pass;
  public BankAccount(double balance, int accountID, String password){
    bal = balance;
    ID = accountID;
    pass = password;
  }
  public double getBal(){
    return bal;
  }
  public int getID(){
    return ID;
  }
  public void setPass(String newpass){
    pass = newpass;
  }
  public String getpass(){
    return pass;
  }
  public String toString(){
    return "Account ID: " + ID + "\t" + "Account balance: " + bal;
  }
  public boolean deposit(double money){
    if (money > 0){
      bal += money;
      return true;
    }
    return false;
  }
  public boolean withdraw(double money){
    if (money > bal){
      return true;
    }
    bal -= money;
    return false;
  }
}
