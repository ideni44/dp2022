package sneakers;

import java.util.ArrayList;
import java.util.List;

public class Mock {
	private List<Sneaker> sneakerList = new ArrayList<>();
	
	
	public Mock () {		
		this.sneakerList.add(new Sneaker("Nike","nice",40));
		this.sneakerList.add(new Sneaker("Adidas","good",24));
		this.sneakerList.add(new Sneaker("New Balance","ok",19));
	}


	public List<Sneaker> getSneakerList() {
		return sneakerList;
	}


	public void setSneakerList(List<Sneaker> sneakerList) {
		this.sneakerList = sneakerList;
	}
	
}
