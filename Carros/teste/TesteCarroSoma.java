import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteCarroSoma {
	
	CarroDeCorrida carro;
	
	@BeforeEach
	public void inicializaCarro() {
		carro = new CarroSoma("teste", 10, 100);
	}
	
	@Test
	void testCarroParado() {
		assertEquals(0, carro.getVelocidade());
	}

	@Test
	void testAcelarar() {
		carro.acelerar();
		assertEquals(10, carro.getVelocidade());
	}
	
	@Test
	void testFrear() {
		carro.acelerar();
		carro.frear();
		assertEquals(5, carro.getVelocidade());
	}
	
	@Test
	void testFrearAteZero() {
		carro.acelerar();
		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();
		assertEquals(0, carro.getVelocidade());
	}
	
	@Test
	void testAcelararAteVelocidadeMaxima() {
		for (int i=0; i<14; i++) {
			carro.acelerar();
		}
		assertEquals(100, carro.getVelocidade());
	}

}
