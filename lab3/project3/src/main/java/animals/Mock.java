package animals;

import java.util.ArrayList;
import java.util.List;

public class Mock {
	private List<Animal> animalsList = new ArrayList<>();
	public Mock() {
		this.animalsList.add(new Animal("Tiger", 5, "qwerty"));
		this.animalsList.add(new Animal("Lion", 8, "asdfg"));
		this.animalsList.add(new Animal("Cat", 10, "zxcvb"));
	}

	public List<Animal> getAnimalsList() {
		return animalsList;
	}

	public void setAnimalsList(List<Animal> animalsList) {
		this.animalsList = animalsList;
	}
	
}
