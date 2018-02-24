package pkgCore;
import java.util.Random;
public class Die {

	private int DieValue;

	public Die() {
		DieValue = new 	Random().nextInt(6) + 1;
				
	}

	public int getDieValue() {
		return DieValue;
	}
}
