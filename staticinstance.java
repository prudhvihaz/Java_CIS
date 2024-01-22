public class staticinstance {

    public void display1() {  //instance method
        System.out.println("Inside display1 Instance method");
    }

    public static void display2() {    // static method
        System.out.println("Inside display2 Static method");
    }

    public static void main(String[] args ) {

        staticinstance.display2(); // calling static method

        staticinstance obj1 = new staticinstance();
        obj1.display1();  //calling instance method
    }
}
