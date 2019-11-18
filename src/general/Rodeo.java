package general;

import java.util.ArrayList;

public class Rodeo implements Hacienda {
	ArrayList<Hacienda> animales;

	public Rodeo() {
		animales = new ArrayList<Hacienda>();
	}

	@Override
	public double getPeso() {
		double suma = 0;
		for (Hacienda a : animales) {
			suma += a.getPeso();
		}
		return suma;
	}

	public double getPesoPromedio() {
		double suma = this.getPeso();

		if (animales.size() != 0) {
			return suma / animales.size();
		} else {
			return 0;
		}
	}

	@Override
	public int getCantidad() {
		int suma = 0;
		for (Hacienda a : animales) {
			suma += a.getCantidad();
		}
		return suma;
	}

	public double getEdad() {
		double result = 0;
		for (Hacienda a : animales) {
			result += a.getEdad();
		}
		if (animales.size() != 0) {
			return result / animales.size();
		} else {
			return 0;
		}
	}
	
	public void llenarCamion (Camion camion) {
		int sumar=0;
		while((sumar < camion.getCapacidad())&&()) {
			
		}
	}

}
