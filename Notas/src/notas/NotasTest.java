/**
 * 
 */
package notas;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Emilia
 *
 */
public class NotasTest {

	/**
	 * Test method for {@link notas.Notas#obtenerNota(int)}.
	 * Debemos probar los valores límites analizados anteriormente: -1,0,4,5,10 y 11
	 */
	@Test
	public void testObtenerNota() {
		assertEquals("El -1 no es una nota válida", "La nota introducida no es correcta", notas.Notas.obtenerNota(-4));
		assertEquals("El 0  es suspenso", "Suspenso", notas.Notas.obtenerNota(0));
		assertEquals("El 4  es suspenso", "Suspenso", notas.Notas.obtenerNota(4));
		assertEquals("El 5  es Aprobado", "Aprobado", notas.Notas.obtenerNota(5));
		assertEquals("El 10  es Aprobado", "Aprobado", notas.Notas.obtenerNota(10));
		assertEquals("El 11 no es una nota válida", "La nota introducida no es correcta", notas.Notas.obtenerNota(11));
	}

}
