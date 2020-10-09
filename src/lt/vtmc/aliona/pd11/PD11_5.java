package lt.vtmc.aliona.pd11;
import java.util.ArrayList;
public class PD11_5 {

private double moneyTotal ;
private int count=0;
private double average;

//public PD11_5(){
//	this.moneyTotal =0;
//}


public void addMoneyInput(double moneyInput) {

	 if (moneyInput > 1000) {
		System.out.println("Nepriimame daugiau 1000 euru");
	}
	else {
		count++;
	this.moneyTotal += moneyInput;
	System.out.println("Jus idejote: " + moneyInput + " Jus save saskaitoje dabar turite: " + this.moneyTotal);
	}
}

public void withdrawMoney (double moneyInput) {
	
	if (this.moneyTotal == 0) {
		System.out.println("Jusu saskaita tuscia, nera ko issimti");
	}
	
	else if (moneyInput > this.moneyTotal) {
		System.out.println("Jus bandote issimti daugiau pinigu nei yra saskaitoje");
	}
	
	else if (this.moneyTotal - moneyInput == 0) {
		System.out.println("Jus issiemete visus pinigus ir jusu saskaita liko tuscia");
	}
	
	else {
		this.moneyTotal -= moneyInput;
		System.out.println("Jus issimete: " + moneyInput + " Jus save saskaitoje dabar turite: " + this.moneyTotal);
	}
	
}

public double getAverageInput() {
	this.average = this.moneyTotal / count;
	return this.average;	
}

public double getMoneyTotal() {
if (this.moneyTotal == 0) {
	System.out.println("Jusu saskaita tuscia, prasome ideti pinigu");
}
	return this.moneyTotal;
		
}


@Override
public String toString() {
	return "PD11_5 [moneyTotal=" + moneyTotal + "]";
}







}
