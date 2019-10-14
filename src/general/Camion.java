package general;

import java.util.ArrayList;

public class Camion {
	private int capacidad;
	private ArrayList<Criterio> condiciones;
	private ArrayList<Animal> animales;

	public Camion(int capacidad) {
		this.capacidad = capacidad;
		this.condiciones = new ArrayList<Criterio>();
	}

	public int getCapacidad() {
		return capacidad;
	}
	
	public void addCondicion(Criterio c) {
		condiciones.add(c);
	}
	public void removeCondicion(Criterio c) {
		condiciones.remove(c);
	}
    
	public void addAnimal(Animal a) {
		for (Criterio c : condiciones) {
			if(c.compare(a)&&(capacidad>=animales.size())){
				animales.add(a);
			}
		}

	}
	

//	public void setCapacidad(int capacidad) {dudo q sea necesario
//		this.capacidad = capacidad;
//	}

	
}
