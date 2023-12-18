package ejercicio4;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class MiApp {

	public static void main(String[] args) {
		AtomicInteger total = new AtomicInteger(0);
		IntStream.range(1, 14).forEach(i-> total.set(total.get()+i));
		//Presentar e n pantall
		System.out.println(total.get());
	}

}
