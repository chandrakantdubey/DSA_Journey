public class OOPS {
    public static void main(String[] args) {
    }
}

class Student {
    String name;
    int age;

    // public void printInfo() {
    // System.out.println(this.name);
    // System.out.println(this.age);
    // }

    // Propeties of constructor:
    // 1. Name of class and constructor are same.
    // 2. It is called only once while creating an object.
    // 3. It does not have any return type and nor does it return anything.

    // 1. if no non-parametrised constructor is written it is created by default
    // 2. parameterised constructor takes parameter
    // 3. copy constructor: user-defined.
    // copies one object to other object.

    // Student(String name, int age) {
    // this.name = name;
    // this.age = age;
    // }

    // Student(Student s2) {
    // this.name = s2.name;
    // this.age = s2.age;
    // }
    // Student() {
    // }

    // Polymosphism: function overaloading(compile-time) and
    // function overiding(run-time).
    // function overloading: same name different task.
    // to distguish the function
    // 1. reuturn type should be different or
    // 2. no of arguments should be different(type/count)
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(age);
        System.out.println(name);
    }

}

// inheritance: to inherit properties
// reusability of the code by inheriting
// 1. single level inheritance
// 2. multi level inheritance
// 3. Hierarchial inheritance: multiple child classes
// 4. Hybrid inheritance
// 5. multiple iheritance using interfaces.

class Shape {
    // base class/parent class
    String color;

    public void area() {
        System.out.println("displays area");
    }
}

// child class extends base class
class Triangle extends Shape {
    // child class
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

// Access modifiers
// public: accessible to all
// private: cannot be accessed outside the class
// getters(to get) and setters(to set) are used for private
// protected: can be accessd by only sub-classes of other package.
// default: not needed to specify, can be accessed in its package.

// Encapsulation: data + function bind together and hidden
// Abstraction: to show only what is important
