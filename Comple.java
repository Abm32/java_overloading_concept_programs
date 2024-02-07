class Complex {
    private double real;
    private double imaginary;

    // Constructor with no arguments (default constructor)
    public Complex() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    // Constructor with one argument to initialize real part
    public Complex(double real) {
        this.real = real;
        this.imaginary = 0.0;
    }

    // Constructor with two arguments to initialize both real and imaginary parts
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to display the complex number
    public void display() {
        System.out.println("Complex Number: " + real + " + " + imaginary + "i");
    }
}

public class Comple {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Complex complex1 = new Complex(); // No arguments, default constructor
        Complex complex2 = new Complex(3.5); // One argument, initializes real part
        Complex complex3 = new Complex(2.0, 4.0); // Two arguments, initializes real and imaginary parts

        // Displaying the complex numbers
        complex1.display();
        complex2.display();
        complex3.display();
    }
}
