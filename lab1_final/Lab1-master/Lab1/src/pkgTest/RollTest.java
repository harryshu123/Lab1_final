package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Die;
import pkgCore.Roll;

public class RollTest {

	@Test
	public void TestRoll() {

		for (int a = 0; a < 10000; a++) {
			Roll r = new Roll();
			System.out.println(r.getScore());
			if (r.getScore()<2) {
				fail("out of range");
			}
			if (r.getScore()>12) {
				fail("out of low range");
			}
			
		}

	}

}
