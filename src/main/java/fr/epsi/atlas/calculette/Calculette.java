package fr.epsi.atlas.calculette;

public class Calculette {
	public int add(String valeur) throws DoubleSeparateurException{
		int total = 0;
		if(valeur.equals(""))
			return 0;
		String[] tab = valeur.split("[,\\n]");
		for(String nb : tab) {
			if(nb.contentEquals("")) {
				throw new DoubleSeparateurException();
			}else {
				total += Integer.valueOf(nb);
			}
		}
		return total;
	}
}
	
