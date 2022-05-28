package fileIO;

import Sneakers.Sneakers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sneakers sneakers = new Sneakers("Adidas", "Random", 34);
		
		FileIOInterface fio = new FileIO();
		
		fio.saveToFile(sneakers);
		
		System.out.println((Sneakers) fio.loadFromFile());
	}

}
