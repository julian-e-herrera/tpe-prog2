package general;

public class CriterioAnd implements Criterio {
	private Criterio c1;
	private Criterio c2;

	public CriterioAnd(Criterio uno, Criterio dos) {
		this.c1 = uno;
		this.c2 = dos;
	}

	public boolean compare(Animal a) {
		return (c1.compare(a) && c2.compare(a));
	}

}
