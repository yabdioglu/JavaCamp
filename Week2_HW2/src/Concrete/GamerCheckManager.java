package Concrete;

import Abstract.GamerCheckService;
import Entity.Gamer;

public class GamerCheckManager implements GamerCheckService {

	static boolean checkIfRealPerson(Gamer gamer) {
		if (!gamer.getFirstName().isEmpty() && 
				!gamer.getLastName().isEmpty() &&
				gamer.getYearOfBirth() < 2003 &&
				!gamer.getNationalityId().isEmpty()) {
				return true;
			}else {
				return false;
			}
	}

}
