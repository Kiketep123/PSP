```java


Algoritmo de verificacion dni simple.

public class ValidacionDNI {

	public static boolean ValidarDNI(String dni) {
		boolean verificarDni = false;
		int i = 0, caracteresASCII = 0, DNI = 0, resto = 0;
		char Letra = ' ';
		char[] asignacionLetra = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
				'V', 'H', 'L', 'C', 'K', 'E' };// Letras Posibles DNI

		if (dni.length() == 9 && Character.isLetter(dni.charAt(8))) {// Verificas el tamaño i que acabe en letra el dni.
			do {

				caracteresASCII = dni.codePointAt(i);// Sacas el valor ascii del dni
				verificarDni = (caracteresASCII > 47 && caracteresASCII < 58);// Devuelve true si la variable anterior
												// Contiene caracteres comprendidos
												// entre 0 y 9
				i++;

			} while (i < dni.length() - 1 && verificarDni);

		}
		if (verificarDni) {
			Letra = Character.toUpperCase(dni.charAt(i));// Sacas la letra del dni
			DNI = Integer.parseInt(dni.substring(0, 8));// PAsas a numerico el dni
			resto = DNI % 23;// Calculas el resto a partir de la variable anterior
			verificarDni = (Letra == asignacionLetra[resto]);// Si el valor del resto coincide con la letra previamente
																// declarada,devuelve true.

		}
		return verificarDni;
	}
}






´´´
