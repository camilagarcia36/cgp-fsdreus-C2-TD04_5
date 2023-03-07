package ejercicio5;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = 20;
		int B = 10;
		int C = 5;
		int D = 3;

		B = C;

		System.out.println(B);

		C = A;

		System.out.println(C);

		A = D;

		System.out.println(A);
		
		D = B; //Toma el ultimo valor que es 5. 
		
		System.out.println(D);

	}

}
