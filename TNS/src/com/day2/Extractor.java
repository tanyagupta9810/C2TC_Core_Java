package com.day2;
import java.util.Scanner;
public class Extractor {
	public static void main(String[] args) {
	 EncapsulationDemo obj= new EncapsulationDemo();
	 System.out.println("Enter Laptop name, price and serial number:-");
	 Scanner sc= new Scanner(System.in);
	 obj.setLaptopName(sc.next());
	 obj.setPrice(sc.nextFloat());
	 obj.setSerialNumber(sc.nextInt());
	 System.out.println("Laptop details are:-\n"+obj);
	}
}