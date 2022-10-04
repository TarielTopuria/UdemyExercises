package Exercises.Section6.Exercise34;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add (double real, double imaginary){
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
    }

    public void add (ComplexNumber anotherNum){
        this.real = this.real + anotherNum.getReal();
        this.imaginary = this.imaginary + anotherNum.getImaginary();
    }

    public void subtract(double real, double imaginary){
        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;
    }

    public void subtract(ComplexNumber anotherNum){
        this.real = this.real - anotherNum.getReal();
        this.imaginary = this.imaginary - anotherNum.getImaginary();
    }
}
