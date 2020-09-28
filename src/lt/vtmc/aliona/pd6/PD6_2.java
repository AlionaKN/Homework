package lt.vtmc.aliona.pd6;

import java.util.Scanner;

public class PD6_2 {

		public static void main(String[] args) {
			Scanner dataInput = new Scanner(System.in);
			int pirm, antr, trec, ketv, penkt, sum;
			System.out.println("Kiek paskaitu pirmadieni?");
			pirm = dataInput.nextInt();
			System.out.println("Kiek paskaitu antradieni?");
			antr = dataInput.nextInt();
			System.out.println("Kiek paskaitu treciadieni?");
			trec = dataInput.nextInt();
			System.out.println("Kiek paskaitu ketvirtadieni?");
			ketv = dataInput.nextInt();
			System.out.println("Kiek paskaitu penktadieni?");
			penkt = dataInput.nextInt();
			sum = pirm + antr + trec + ketv + penkt;
			System.out.println(" Is viso paskaitu per savaite:" + sum);
			System.out.println("Visos paskaitos sudaro laiko minutem:" + sum * 45);
		}



}

