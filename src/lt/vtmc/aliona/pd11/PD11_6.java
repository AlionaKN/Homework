package lt.vtmc.aliona.pd11;

public class PD11_6 {
private double firstNumber;
private double secondNumber;
private double numberResult;

public void add(double firstNumber,double secondNumber) {
	this.numberResult = firstNumber + secondNumber;
	System.out.println("The sum of your numbers is: " + this.numberResult);
}
public void substract(double firstNumber,double secondNumber) {
	this.numberResult = firstNumber - secondNumber;
	System.out.println("The result is: " + this.numberResult);
}
public void multiply(double firstNumber,double secondNumber) {
	this.numberResult = firstNumber * secondNumber;
	System.out.println("The result is: " + this.numberResult);
}
public void divide(double firstNumber,double secondNumber) {
	this.numberResult = firstNumber / secondNumber;
	System.out.println("The result is: " + this.numberResult);
}
public void percentage(double firstNumber,double secondNumber) {
	this.numberResult = firstNumber / 100 * secondNumber;
	System.out.println("The result is: " + this.numberResult);
}
public void sqrt(double firstNumber) {
	this.numberResult = Math.sqrt(firstNumber);
	System.out.println("The result is: " + this.numberResult);
}
public void pow(double firstNumber, double secondNumber) {
	this.numberResult = Math.pow(firstNumber, secondNumber);
	System.out.println("The result is: " + this.numberResult);
}
public void sin(double firstNumber) {
	this.numberResult = Math.sin(Math.toRadians(firstNumber));
	System.out.println("The result is: " + this.numberResult);
}
public void cos(double firstNumber) {
	this.numberResult = Math.cos(firstNumber);
	System.out.println("The result is: " + this.numberResult);
}
public void tan(double firstNumber) {
	this.numberResult = Math.tan(Math.toRadians(firstNumber));
	System.out.println("The result is: " + this.numberResult);
}
}