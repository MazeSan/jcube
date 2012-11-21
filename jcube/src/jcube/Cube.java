package jcube;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Cube {

	private String url;
	
	public static Cube fromTextFile(String adresse) {
		Cube cube = new Cube();
		return cube.setUrl(adresse);
	}

	public Integer numberOfFaces() {
		// TODO Auto-generated method stub
		return 1;
	}

	public Object getTitreFace(int i) throws IOException {
		
		BufferedReader reader = new BufferedReader(new FileReader(new File("templates/one-line.txt")));

		String line = reader.readLine(); 		
		reader.close();
		
		Face face = new Face(line.substring(2));
		
		return face.getTitre();
	}

	public String getUrl() {
		return url;
	}

	public Cube setUrl(String url) {
		this.url = url;
		return this;
	}

}
