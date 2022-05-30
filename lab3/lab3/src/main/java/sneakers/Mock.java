package sneakers;

import java.util.ArrayList;
import java.util.List;

public class Mock {
	
	
	private List<Sneaker> sneakerList = new ArrayList<>();

	public Mock() {
		this.sneakerList.add(new Sneaker("Nike","Comfortable", 44));
		this.sneakerList.add(new Sneaker("Adidas","Good", 40));
		this.sneakerList.add(new Sneaker("New Balance","Comfortable", 39));
	}
	public List<Sneaker> getSneakerList() {
		return sneakerList;
	}

	public void setSneakerList(List<Sneaker> sneakerList) {
		this.sneakerList = sneakerList;
	}
	 
}
