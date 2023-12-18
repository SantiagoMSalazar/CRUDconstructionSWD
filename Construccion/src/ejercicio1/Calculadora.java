package ejercicio1;

public interface Calculadora {
	public Double ejecutar (Double n1,Double n2);
	public default Double restar(Double n1,Double n2) {
		return n1-n2;
	}
}
