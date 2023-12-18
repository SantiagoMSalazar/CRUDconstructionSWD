package ejercicio1;

public class MiApp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora sumar = new Calculadora() {

			@Override
			public Double ejecutar(Double n1, Double n2) {
				return n1+n2;
			}
		};

		System.out.println(sumar.ejecutar(2.5, 4.7));
		/*
		 * La lógica del método multiplicar implementada mediante una expresión lamda
		 */
		Calculadora multiplicar = (n1,n2) -> n1*n2;
		
		System.out.println(multiplicar.ejecutar(2.6, 1.9));
		//Division
		Calculadora c1 = (n1,n2)->{
			System.out.println("Dividiendo");
			return n1/n2;
		};
		
		System.out.println(c1.ejecutar(250.0, 2.5));
		System.out.println(c1.restar(250.0, 1.78));
	}

}
