import static org.junit.Assert.assertEquals;

import java.io.IOException;

import jcube.Cube;

import org.junit.Before;
import org.junit.Test;

public class CubeFromOneLineTextFile {
	
	private Cube cube;
	
	@Before
	public void createCubeFromTextFile(){
		this.cube = new Cube();
		cube = Cube.fromTextFile("templates/one-line.txt");
	}

	@Test
	public void cubeShouldHaveOneFace() {
		assertEquals(new Integer(1) , this.cube.numberOfFaces());
	}
	
	@Test
	public void titleOfFaceShouldBeHi() throws IOException{
		assertEquals("Hi", this.cube.getTitreFace(0));
	}
}
