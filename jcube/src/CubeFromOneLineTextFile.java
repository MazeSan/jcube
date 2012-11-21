import static org.junit.Assert.assertEquals;
import jcube.Cube;

import org.junit.Before;
import org.junit.Test;

public class CubeFromOneLineTextFile {
	
	private Cube cube;
	
	@Before
	public void creerClasse(){
		//this.cube = new Cube();
	}

	@Test
	public void cubeShouldHaveOneFace() {
		cube = Cube.fromTextFile("templates/git-cheat.txt");
		assertEquals(new Integer(1) , cube.numberOfFaces());
	}
	
	
}
