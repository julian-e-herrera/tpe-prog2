package general;

public class CriterioNot implements Criterio{
	private Criterio c1;

	public CriterioNot(Criterio uno) {
		this.c1 = uno;
	}

	public boolean compare(Animal a) {
		return (!c1.compare(a));
	}
}
