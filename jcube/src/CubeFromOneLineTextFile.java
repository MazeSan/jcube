import static org.junit.Assert.assertEquals;

import java.io.IOException;

import jcube.Cube;

import org.junit.Before;
import org.junit.Test;

public class CubeFromOneLineTextFile {
	
	private Cube cube;
	
	@Before
	public void createCubeFromTextFile() throws IOException{
		this.cube = new Cube();
		cube = Cube.fromTextFile("templates/one-line.txt");
	}
	
	@Test
	public void cubeShouldBeOneFacedWithHi(){
		Cube expectedCube = (new Cube()).addFace("Hi");
		
		assertEquals(expectedCube, cube);
	}
	
	
	public void cubeShouldBeOneFaceWithCommentSortirDuCoursPlusTot() throws IOException {
		Cube expectedCube = (new Cube())
				.addFace("Comment sortir du cours plus t™t");

		Cube actualCube = Cube.fromTextFile("templates/one-line-cube.txt");		
		assertEquals(expectedCube, actualCube);
	}
}
