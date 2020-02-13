package fr.epsi.atlas.calculette;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculetteTest {

	private Calculette sut;

	@Before
	public void initCalculette() {
		sut = new Calculette();
	}
	//exercise 1
	@Test
	public void add_chaineVide_returnZero() throws Exception {
		String valeur = "";

		int resultat = sut.add(valeur);

		assertEquals(0, resultat);

	}

	@Test
	public void add_chaineRepresentantUn_returnUn() throws Exception {
		int resultat = sut.add("1");

		assertEquals(1, resultat);

	}

	@Test
	public void add_chaineRepresentantDeuxEntiers_returnLaSommeDeSesNombres() throws Exception {
		int resultat = sut.add("1,2");

		assertEquals(3, resultat);

	}
	//Exercise3
	
	@Test
	public void add_avecSautDeLigne() throws Exception {
		int resultat = sut.add("1\n2,3");
		assertEquals(6, resultat);
	}
	// exercise 4
	@Test
	public void add_avecVirguleEtSautDeLigneALaSuite_renvoiUneErreur() throws Exception {
		try {
			int resultat = sut.add("1,\n2");
			fail("virugle suivi du saut de ligne");
		}catch(DoubleSeparateurException e) {};
	}
}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
