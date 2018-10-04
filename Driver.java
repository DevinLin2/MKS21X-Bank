public class Driver{
  public static void main(String[]args){
    BankAccount x = new BankAccount(10000.39,21823,"ILoveCS");
    System.out.println("ID: " + x.getID() + "\t" + "Balance: " + x.getBal() + "\t" + "Password: " + x.getpass());
    x.setPass("IAlsoLoveTheTeacher");
    System.out.println("ID: " + x.getID() + "\t" + "Balance: " + x.getBal() + "\t" + "Password: " + x.getpass());
    System.out.println(x.deposit(500));
    System.out.println("New Balance: " + x.getBal());
    System.out.println(x.deposit(-100000));
    System.out.println("New Balance: " + x.getBal());
    System.out.println(x.withdraw(500));
    System.out.println("New Balance: " + x.getBal());
    System.out.println(x.withdraw(99999));
    System.out.println("New Balance: " + x.getBal());
  }
}
