package Array;
/*5. Write a Java program to test if an array contains a specific value. Go to the editor*/
public class Ushtrimi5 {
    public static void main(String[] args) {

        int[] myarray = {12, 13, 14, 15, 116, 17, 18, 90};
        int specifikvalue = 12;

        for (int i = 0; i < myarray.length; i++) {
            if (myarray[i] == specifikvalue) {
                System.out.println("vlera specifike eshte ne arrayliste:" + specifikvalue);
                break;
                //else if ()System.out.println("nuk ka vlere te njejte");
            }
            if (!(myarray[i] == specifikvalue)) {
                System.out.println("nuk ka vlere te ngjashme ne arrayin e mesiperm:" );
                break;
            }


        }

        /*for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};
        System.out.println(contains(my_array1, 2013));
        System.out.println(contains(my_array1, 2015));*/

    }}
