package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		List<Product> list = new ArrayList<>();

		File path = new File(strPath);
		
		String strFile = path.getParent();

		boolean success = new File(strFile + "//out").mkdir();
		System.out.println();
		System.out.println("Directory created successfully: " + success);
		System.out.println();
		String strPathFile = strFile + "//out//summary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				
				String[] vect = line.split(";");
			
				String nameProd = vect[0];
				double priceProd = Double.parseDouble(vect[1]);
				int quantityProd = Integer.parseInt(vect[2]);

				list.add(new Product(nameProd, priceProd, quantityProd));
				
				line = br.readLine();
			}
			

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(strPathFile))) {

			for (Product produ : list) {
				bw.write(produ.getName() + ", " + produ.subTotal());
				bw.newLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();

	}

}
