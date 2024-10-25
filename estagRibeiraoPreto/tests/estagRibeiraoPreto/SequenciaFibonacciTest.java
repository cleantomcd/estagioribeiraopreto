package estagRibeiraoPreto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SequenciaFibonacciTest {
	SequenciaFibonacci sf = new SequenciaFibonacci();
	

	@Test
	void testaNumeroPresenteNaSequencia() {
		assertEquals(sf.verificaNumeroNaSequenciaFibonacci(34), "O número está presente na sequência.");
	}
	
	@Test
	void testaNumeroNaoPresenteNaSequencia() {
		assertEquals(sf.verificaNumeroNaSequenciaFibonacci(77), "O número não está presente na sequência.");
	}

}
