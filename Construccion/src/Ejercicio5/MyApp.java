package Ejercicio5;

import java.util.UUID;
import java.util.function.Supplier;

public class MyApp {

	public static void main(String[] args) {
		/*Referencia a un método estático*/
		//Supplier<UUID> getToken = ()->UUID.randomUUID();
		Supplier<UUID> getToken = UUID::randomUUID;
		System.out.println(getToken.get());
		
		/*Referencia por objeto*/
		
		
		/*Referencia por constructor*/
		
		
		
		/*Referencia arbitraria*/
	}

}
