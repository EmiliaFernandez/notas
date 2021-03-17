package notas;
import java.util.Scanner;

/**
 * @author Emilia
 *
 */
public class Notas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int n = 0;
		String calificacion="";
		System.out.print("Introduzca una nota: ");
		n = reader.nextInt();
		 

		 calificacion = obtenerNota(n);

		 System.out.println (calificacion);
		 reader.close();
	}

	/**
	 * @param nota
	 * @return
	 */
	public static String obtenerNota(int nota) {
		String calificacion;
		if(nota>=0 && nota<5)
		 calificacion="Suspenso";
		 else
		 if(nota>=5 && nota<=10)
			 calificacion="Aprobado";
		 else
			 calificacion="La nota introducida no es correcta";
		return calificacion;
	}

}
