import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class CirculoTest {
	/*
	Fómula para calcular el Area = Π · r2
	*/

	double area;
	double radio;
	double perimetro;
	private Scanner reader;
	
	
	@Test
	void testArea() {
		area = 3.1416 * Math.pow(radio,2);;
	}

	/*
	 * Formula para calcular el perímetro Perímetro = 2 * PI * radio 
	 * */
	
	@Test
	void testPerimetro() {		 
		reader = new Scanner(System.in);
		radio = reader.nextDouble();;
	}


}
