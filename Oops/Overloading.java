package Oops;

public class Overloading {
    public static void main(String[] args) {
        OverLoad demo = new OverLoad();
        demo.test();
        demo.test(26);
        demo.test("Chandrakant", 26);
        System.out.println(demo.num1);
    }
}

class OverLoad {
    int num1 = 46;
    public int num2 = 64;
    private int num3 = 4646;

    int getc() {
        return num2;
    }

    void setc(int num) {
        num = num3;
    }

    void test() {
        System.out.println("No parameters passed");
    }

    void test(int num) {
        System.out.println("One parameter passed of type int value: " + num);
    }

    void test(String name, int age) {
        System.out.println("My name is ${name} and I am ${age} years of age.");
    }
}
