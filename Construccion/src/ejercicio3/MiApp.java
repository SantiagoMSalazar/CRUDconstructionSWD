package ejercicio3;

import java.util.List;

public class MiApp {

	public static void main(String[] args) {
		List<String> paises = List.of("Ecuador","Colombia","Uruguay","Brazil");
		paises.forEach(pais->System.out.println(pais));
	}

}
