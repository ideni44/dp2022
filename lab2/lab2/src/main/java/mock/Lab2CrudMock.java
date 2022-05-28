package mock;

import Sneakers.Sneakers;
import crud.Lab2CrudInterface;

public class Lab2CrudMock implements Lab2CrudInterface {

	@Override
	public Sneakers readSneakers() {
		// TODO Auto-generated method stub
		return new Sneakers("nike", "air force", 23);
	}

	@Override
	public void updateSneakers(Sneakers sneakers) {
		// TODO Auto-generated method stub

	}

}
