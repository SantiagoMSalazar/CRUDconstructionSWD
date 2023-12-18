package ejercicio2;

public class Producto {
	private String nombre;
	private double precio;
	public Producto(String vnombre,double vprecio) {
		this.nombre=vnombre;
		this.precio=vprecio;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public double getPrecio() {
		return this.precio;
	}
	public void setPrecio(double precio) {
		this.precio=precio;;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nombre+"\n"+this.precio;
	}
}
