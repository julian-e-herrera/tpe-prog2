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
		if (animales.size() != 0) {
			return suma / animales.size();
		} else {
			return 0;
		}
	}

	@Override
	public int cantidad() {
		int suma = 0;
		for (Hacienda a : animales) {
			suma += a.cantidad();
		}
		return suma;
	}
	public double getEdad() {
	 double result =0;
	 for (Hacienda a : animales) {
			result += a.getEdad();
		}
		if (animales.size() != 0) {
			return result / animales.size();
		} else {
			return 0;
		}
	}

}
