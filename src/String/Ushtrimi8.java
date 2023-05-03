package String;

import Objects.Ushtrimi14.School;

import javax.swing.*;
import java.math.BigInteger;
import java.math.MathContext;
import java.sql.Connection;
import java.util.Scanner;

/*8. Write a Java program to test if a given string contains the specified sequence of char values. Go to the editor

        Sample Output:

        Original String: PHP Exercises and Python Exercises
        Specified sequence of char values: and
        true*/
public class Ushtrimi8 {
    String dog;
    int age;


    public static void main(String[] args) {
        Ushtrimi8 QENI= new Ushtrimi8("xhoni",12);
        System.out.println(QENI.setAge(34));
        System.out.println(QENI.getAge());



        String emri="shkrela";
        String emri1="shkrela";
        String emri3="shkrela";
        int x=15;
        int y=25;
        System.out.println(emri.contains("shkrela"));
        System.out.println(emri1.equals(emri));
        System.out.println(emri1==emri);
        System.out.println(emri.codePointCount(1,3));
        System.out.println(emri.intern());
        System.out.println(emri.replace("s","r"));
        System.out.println(emri.indexOf("h",2));
        int a=emri.indexOf("d",0);
        int b = emri.indexOf("a", 1);
        System.out.println(b);

        JPanel panel=new JPanel();
        panel.setLocation(x,y);
panel.setVisible(true);

    }

    public String getDog() {
        return dog;
    }

    public void setDog(String dog) {
        this.dog = dog;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        this.age = age;
        return age;
    }

    public Ushtrimi8(String name, int age) {
       dog = name;
        this.age = age;
    }
}

