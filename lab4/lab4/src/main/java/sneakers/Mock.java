package sneakers;

import java.util.ArrayList;
import java.util.List;

public class Mock {
	
	private List<Sneakers> sneakersList = new ArrayList<>();
	
	
	public Mock () {		
		this.sneakersList.add(new Sneakers(0,"Mac","assets/mac.jpg","The MacBook Pro is the most powerful sneaker"));
		this.sneakersList.add(new Sneakers(1,"HP","assets/spectre.jpg","Spectre x360 14"));
		this.sneakersList.add(new Sneakers(2,"Dell","assets/xps.jpg","Dell�s latest XPS 13 2-in-1"));
	}

	public List<Sneakers> getSneakerList() {
		return sneakersList;
	}

	public void setSneakersList(List<Sneakers> sneakersList) {
		this.sneakersList = sneakersList;
	}

}
