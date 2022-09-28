package main;


public class suma {

	public static void main(String[] args) {
		int resultado;
		int a=3,b=2, c=5;
		resultado = suma(a,b,c);
		System.out.print("el resultado de la suma de "+ a + " +" + b + " +" + c + " es:" + resultado );
	}

public static int suma(int a, int b, int c) {
	return a + b +c;
   }

}



