package Objects.Ushtrimi7;
/*7. Write a Java program to create a class called "Bank" with a collection of accounts and methods
        to add and remove accounts, and to deposit and withdraw money.
        Also define a class called "Account" to maintain account details of a particular customer*/
public class bank {

private  String name;
private int nrllog;
 double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNrllog() {
        return nrllog;
    }

    public void setNrllog(int nrllog) {
        this.nrllog = nrllog;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
   public bank(String name,int nrllog,double balance){
        this.name=name;
        this.nrllog=nrllog;
        this.balance=balance;


   }

   public void depozite(double shuma){
      balance=balance+shuma;
   }
    public void terheqje(double shuma){
        balance=balance-shuma ;
    }




}
