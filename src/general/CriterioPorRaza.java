package general;

public class CriterioPorRaza implements Criterio {
 private String raza;
	@Override
	public boolean compare(Animal a) {
		return a.getRaza().equals(raza);
	}

}
