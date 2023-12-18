package ejercicio2;

public class MiApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Impresora<String> imprimirStr = (Tstr)->{
			System.out.println(Tstr);
			//Cómo se ejecuta el método funcional
		};
		imprimirStr.imprimir("Holii mundoss");
		Impresora<Producto> imprimirProducto = (producto)->{
			System.out.println(producto.toString());
		};
		Producto telefono = new Producto("Iphone 15", 1500.00);
		imprimirProducto.imprimir(telefono);
	}

}
