package Objects.Ushtrimi6;

public class main {
    public static void main(String[] args) {



        Employe employe=new Employe("besmir","ekonomist",50000);
        Employe employe2=new Employe("bora","infermiere",60000);

        System.out.println("paga e puntorit te pare; "+employe.getName()+employe.jobTitle+employe.getSalary());
        System.out.println("paga e puntorit te dyte; "+employe2.getName()+employe2.jobTitle+employe2.getSalary());

        System.out.println("paga me rritje eshte;");
        System.out.println(employe.getName()+employe.rritjepage(100));
        System.out.println(employe2.getName()+employe2.rritjepage(12));
    }
}
