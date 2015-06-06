package be.cardinal.mercier.tp16.ex3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Fenetre extends JFrame implements ActionListener  {
	private JPanel panneau ;
	private JButton monBouton ;
	private JLabel affichageClics ;
	private int cpt;
	
	public Fenetre (){
		
		cpt=0;
	
		setTitle ("Ma fenetre ") ;
		setSize (300, 150) ;
		setBounds (10, 20, 300, 200) ;
		panneau = new JPanel ();
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);//Pour fermer directement le programme en quittant
		
		getContentPane().add(panneau);
		setSize (300, 200) ;
		monBouton = new JButton ("Compteur") ;
		getContentPane().setLayout(new FlowLayout()) ;
		getContentPane().add(monBouton) ;
		monBouton.addActionListener(this);
		
		affichageClics = new JLabel ("nombre de clics sur COMPTEUR = "+ cpt) ;
		getContentPane().add(affichageClics) ;
		
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent ev) {
		
		cpt++;
		affichageClics.setText("nombre de clic sur compteur "+cpt);
		//System.out.println ("nombre de clic sur compteur "+cpt);
		
		
	}

}
