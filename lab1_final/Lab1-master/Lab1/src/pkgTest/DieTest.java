package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Die;

public class DieTest {

	@Test
	public void TestDie() {
		for (int a = 0; a < 10000; a++) {
			Die A = new Die();
			System.out.println(A.getDieValue());
			if (A.getDieValue()>6) {
				fail("out of range");
			}
			if (A.getDieValue()<1) {
				fail("out of low range");
			}
			
		}

	}

}
