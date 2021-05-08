package Abstract;

import Entity.Gamer;

public interface GamerCheckService {
	static boolean checkIfRealPerson(Gamer gamer) {
		return false;
	}

}
