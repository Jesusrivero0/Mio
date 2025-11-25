package Ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner scanner = new Scanner(System.in);

		System.out.println("Indica una cadena de texto separadas por ,");
		String cad = scanner.nextLine();

		String[] arrayCad = cad.split(",");

		for (int i = 0; i < arrayCad.length; i++) {
			if (arrayCad[i].length() < 1) {
				for (String string : arrayCad) {
					System.out.print(string.toUpperCase() + ",");
				}
				// if(arrayCad[j].compareTo(arrayCad[j]+1) <0) {
				// String pal = arrayCad[j];

				// }

			}
		}
		

		System.out.println(arrayCad.length);
		scanner.close();
	}
*/
		        Scanner scanner = new Scanner(System.in);
		        String[] arrayCad;

		        while (true) {
		            System.out.println("Introduce una lista de caracteres separados por comas:");
		            String cad = scanner.nextLine().trim();
		            if (cad.isEmpty()) {
		                System.out.println("Error: la lista no puede estar vacía.\n");
		            }
		            arrayCad = cad.split(",");
		            boolean valido = true;
		           
		            for (String c : arrayCad) {
		                if (c.length() != 1) {
		                    valido = false;
		                    break;
		                }
		            }

		            if (!valido) {
		                System.out.println("Error: todos los elementos deben ser un solo carácter.\n");
		            } else {
		                break; // La lista es válida, podemos continuar
		            }
		        }

		        // Convertir a mayúsculas
		        for (int i = 0; i < arrayCad.length; i++) {
		            arrayCad[i] = arrayCad[i].toUpperCase();
		        }

		        // Ordenar manualmente (método burbuja)
		        for (int i = 0; i < arrayCad.length - 1; i++) {
		            for (int j = 0; j < arrayCad.length - 1 - i; j++) {
		                if (arrayCad[j].compareTo(arrayCad[j + 1]) > 0) {
		                    // Intercambio
		                    String temp = arrayCad[j];
		                    arrayCad[j] = arrayCad[j + 1];
		                    arrayCad[j + 1] = temp;
		                }
		            }
		        }

		        // Mostrar resultado
		        System.out.println("Lista válida en mayúsculas y ordenada:");
		        for (String string : arrayCad) {
		        	System.out.print(("," + string));
					
				}

		        scanner.close();
		    }
		}


