package condicionalesYCiclos;
import java.util.Scanner;
public class ejerciciosCondicionalesYCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * condicionales
		 * 
		 * 
		 * if
		 * else
		 * else if
		 * switch
		 * 
		 * 
		 * */
		
		
		System.out.println("Programa para calcular la hora");
		
		//Para usar el Scanner
		
		Scanner hora = new Scanner(System.in); // Declaro la variable pidiendo algo en la consola
		
		System.out.println("Por favor ingresa una hora en formato 24 horas");
		
		int valorIngresado= hora.nextInt();
		
		if(valorIngresado >= 0 && valorIngresado <=23) {
			if(valorIngresado >=7 && valorIngresado <= 11) {
				System.out.println("Buenos días solecitos c:");
			}else if(valorIngresado >=12 && valorIngresado <=18) {
				
				System.out.println("Buenas tardes solecitos c:");
				
				
			}else if(valorIngresado >=19 && valorIngresado <=23) {
				System.out.println("Buenas noches solecitos c:");
				
			}else {
				
				System.out.println("Buenas madrugadas solecitos c:");
			}
			
			
			
			
		} else {
			System.out.println("Ingresa una hora valida c:");
		}
		
		hora.close();
		
	}

}
