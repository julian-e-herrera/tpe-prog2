package general;

public class Animal implements Hacienda{
	private String nombre;
	private int id;
	private double edad;
	private double peso;
	private String raza;
	private String sexo;
	private boolean capado;
	private boolean haParido;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public double getPeso() {//este es el q hereda
		return peso;
	}
	public int getCantidad() {//este es el q hereda
		return 1;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public boolean isCapado() {
		return capado;
	}

}
