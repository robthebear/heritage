package heritage;



    import heritage.Apprenants.Os;

/**
 * @author Philippe
 *
 */
public class TestHeritage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Apprenants phil = new Apprenants("Philippe",54,"Montreuil", Os.WINDOWS);

		phil.bonjour();
		phil.travailler();
		phil.manger("banane");
		phil.chomer();
		phil.dormir();

		Personne jojo = new Personne("Josselin",34);

		jojo.bonjour();
		jojo.manger("pizza");
		jojo.dormir();

		Personne anissa = new Apprenants("Anissa",23, "Montreuil",Os.MAC);
		anissa.bonjour();
		anissa.manger("chocolat");
		anissa.dormir();
	}
}

