package crud;

import Sneakers.Sneakers;
import fileIO.FileIO;
import fileIO.FileIOInterface;

public class FileCrud implements Lab2CrudInterface {

	FileIOInterface fio;
	
	public FileCrud() {
		this.fio = new FileIO();
	}
	
	@Override
	public Sneakers readSneakers() {
		// TODO Auto-generated method stub
		return (Sneakers)fio.loadFromFile();
	}

	@Override
	public void updateSneakers(Sneakers sneakers) {
		fio.saveToFile(sneakers);
		
	}

}
