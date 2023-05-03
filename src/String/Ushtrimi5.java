package String;
/*5. Write a Java program to compare two strings lexicographically. Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions. Go to the editor

        Sample Output:

        String 1: This is Exercise 1
        String 2: This is Exercise 2
        "This is Exercise 1" is less than "This is Exercise 2"*/
public class Ushtrimi5 {
    public static void main(String[] args) {
      String str1="besirrrr" ;
      String str2="bes";
      String str3="ajnayy";
      int result=str1.compareTo(str2);

        if(result>0){
            System.out.println("str1 eshte me e madhe se str2");
        } else if (result ==0) {
            System.out.println("str1 eshte e barabarte me str2");

        }else {
            System.out.println("rezultat i pavlefshem");
        }

        System.out.println(str1.contains("eesmi"));
    }
}
