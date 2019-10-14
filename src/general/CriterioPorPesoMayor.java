package general;

public class CriterioPorPesoMayor implements Criterio{

	private double peso;

	@Override
	public boolean compare(Animal a) {
		return a.getPeso()>peso;  
	}
	
	
	
}
