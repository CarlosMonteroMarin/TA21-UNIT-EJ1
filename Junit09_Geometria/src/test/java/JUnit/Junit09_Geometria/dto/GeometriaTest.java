package JUnit.Junit09_Geometria.dto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {
	
	Geometria geo= new Geometria();
	
	@BeforeAll
	public static void testBeforeClass() {
		System.out.println("beforeClass");
	}
	
	@BeforeEach
	public void before() {
		System.out.println("before()");
		geo = new Geometria();	
	}

	
	@AfterEach
	public void after() {
		System.out.println("after()");
	}
	
	@Test
	public void testGeometria() {
	}
	
	@Test
	public void testAreacuadrado() {
		int resultado= geo.areacuadrado(2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaCirculo() {
		double resultado= geo.areaCirculo(6);
		double esperado = 113;
		int delta= 1;
		assertEquals(esperado, resultado, delta);
	}

	@Test
	public void testAreatriangulo() {
		int resultado= geo.areatriangulo(5,6);
		int esperado = 15;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testArearectangulo() {
		int resultado= geo.arearectangulo(2, 3);
		int esperado = 6;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreapentagono() {
		int resultado= geo.areapentagono(5, 5);
		int esperado = 12;
		int delta = 1;
		assertEquals(esperado, resultado, delta);
	}

	@Test
	public void testArearombo() {
		int resultado= geo.arearombo(7, 3);
		int esperado = 10;
		int delta = 1;
		assertEquals(esperado, resultado, delta);
	}

	@Test
	public void testArearomboide() {
		int resultado= geo.arearomboide(10, 5);
		int esperado = 50;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreatrapecio() {
		int resultado= geo.areatrapecio(10, 4, 4);
		int esperado = 28;
		int delta = 1;
		assertEquals(esperado, resultado, delta);
	}

	
	@Test
	public void testFigura1() {
		String resultado= geo.figura(1);
		String esperado = "cuadrado";
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testFigura2() {
		String resultado= geo.figura(2);
		String esperado = "Circulo";
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testFigura3() {
		String resultado= geo.figura(3);
		String esperado = "Triangulo";
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testFigura4() {
		String resultado= geo.figura(4);
		String esperado = "Rectangulo";
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testFigura5() {
		String resultado= geo.figura(5);
		String esperado = "Pentagono";
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testFigura6() {
		String resultado= geo.figura(6);
		String esperado = "Rombo";
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testFigura7() {
		String resultado= geo.figura(7);
		String esperado = "Romboide";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testFigura8() {
		String resultado= geo.figura(8);
		String esperado = "Trapecio";
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testFigura9() {
		String resultado= geo.figura(10);
		String esperado = "Default";
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testSetters() {
		geo.setId(70);
		geo.setNom("TRIANGULO");
		geo.setArea(50);
	}
	
	@Test
	public void testGetters() {
		System.out.println(geo.getId());
		System.out.println(geo.getNom());
		System.out.println(geo.getArea());
	}
	
	
	
	@Test
	public void testToString() {
		System.out.println(geo.toString());
	}
	

	@AfterAll
	public static void afterClass() {
		System.out.println("afterClass");
	}

}
