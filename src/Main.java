import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Scanner kinput = new Scanner(System.in);

        System.out.println("Enter your first name");
        String First = kinput.next();
        System.out.println("Enter your last name");
        String Second = kinput.next();
        String together = ("Your full name is " +First +" " +Second);
        System.out.println(together);

    }}
