package be.cardinal.mercier.tp15.ex1;

import java.util.ArrayList;

public class Etudiant {
	private String nom;
	private static int dernierNumAttribue = 0;
	private int num;
	private ArrayList<Integer> listePoints = new ArrayList<Integer>();



//public static Etudiant listeEtu = new Etudiant ();

	public Etudiant(String nom){
		this.nom = nom;
		this.num = ++ dernierNumAttribue; //pré-incrémentation
	}
	public double moyenne(){
		double somme = 0;
		for (Integer points ; points < ) {
			somme += points;
		}
		if (listePoints.size() == 0) return 0;
		return somme / listePoints.size();
	}
	
}