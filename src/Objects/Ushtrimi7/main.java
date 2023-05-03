package Objects.Ushtrimi7;
/*7. Write a Java program to create a class called "Bank" with a collection of accounts and methods
        to add and remove accounts, and to deposit and withdraw money.
        Also define a class called "Account" to maintain account details of a particular customer*/
public class main {
    public static void main(String[] args) {

        bank union=new bank("besmir",00003,100000);
       bank bkt=new bank("besir",00002,200000);
       bank rfz=new bank("beir",00001,40000);

        System.out.println("gjendja ne llogarine e "+ union.getName() + "eshte"+ union.getBalance());
        System.out.println("gjendja ne llogarine e "+ bkt.getName() + "eshte"+ bkt.getBalance());
        System.out.println("gjendja ne llogarine e "+ rfz.getName() + "eshte"+ rfz.getBalance());


union.depozite(45454);
bkt.depozite(55);
rfz.depozite(100);
bkt.terheqje(5);
        bkt.terheqje(5);
        bkt.terheqje(5);
        bkt.terheqje(30000);
        System.out.println(union.balance);
        System.out.println(bkt.balance);
        System.out.println(rfz.balance);

    }
}
