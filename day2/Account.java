package day2;

public class Account {
    String  name;
    private double balance;
    static double aneualRate= 0.04;

    public Account(String name,double balance){
        this.name=name;
        this.balance=balance;


    }
    public static double getMonthlyRate(){
        double mor= aneualRate/12;

        return mor;
    }

    public void getMonthlyInt(double a){
  this.aneualRate=a;


    }
    public void deposit(double a){
       this.balance=+a;


    }
    public void withdrow(double a){
        this.balance=-a;


    }

    public double getBalance() {
        return balance;
    }
}
