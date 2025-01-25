import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        String name;
        int age;
        long phno;
        // System.out.println("plz enter ur name, age, and phone no");
        Scanner sc = new Scanner(System.in);
        System.out.println("plz enter your name");
        name = sc.nextline();
        System.out.println("plz enter your age");
        age = sc.nextInt();
        System.out.println("plz enter ur phno no");
        phno=sc.nextlong();
        System.out.println("Hello" + name+" your age is" + age + "and your phone number is" + phno);
        sc.close();

    }
}
