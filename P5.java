package Default;
import java.util.Scanner;
public class P5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String contra = "", contra2, contrae;
		int f=0, j=0;
		while (f==0) {
			System.out.println("elija su contraseņa");
			contra = sc.next();
			System.out.println("valide su contraseņa");
			contra2 = sc.next();
			if (contra.equals(contra2)) {
				f=1;
				System.out.println("contraseņa validada");
			}else {
				System.out.println("error contraseņas distintas vuelva a intentarlo");
			}
				
		}
		while (j==0) {
			System.out.println("ingrese su contraseņa");
			contrae = sc.next();
			if (contrae.equals(contra)) {
				System.out.println("contraseņa ingresada correctamente");
				j=1;
			}else {
				System.out.println("error intentelo de nuevo");
			}
				
			
		}

	}

}
