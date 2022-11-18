import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scr= new Scanner(System.in);
		System.out.println("Que salario quieres conocer?");
		System.out.println("1. Backend");
		System.out.println("2. Frontend");
		
		Object scanner;
		int opcion=((Object) scanner).nextIn();
	
		switch(opcion) {
		  case 1;
		    Backend();
		    break;
		  case 2;
		    Frontend();
		    break;
		
		}
		
		
	}

	private static void Backend() {
		System.out.println("SALARIO_BACKEND");
		
	}

	private static void Frontend("SAlARIO_FRONTEND") {
		
	}

}
