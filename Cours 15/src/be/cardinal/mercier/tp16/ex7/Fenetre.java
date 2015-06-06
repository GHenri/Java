package be.cardinal.mercier.tp16.ex7;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;



public class Fenetre  extends JFrame implements ActionListener, ItemListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private String[] couleurs = {"rouge", "bleu", "gris", "vert","jaune", "noir" } ;
	private JComboBox combo ;
	
	public Fenetre () {
		
		setTitle ("Combo box avec couleur") ;
		setSize (300, 160) ;
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);//Pour fermer directement le programme en quittant
		
		Container contenu = getContentPane() ;
		contenu.setLayout (new FlowLayout() ) ;
		combo = new JComboBox(couleurs) ;
		combo.setEditable (true) ;
		contenu.add(combo) ;
		combo.addActionListener (this) ;
		combo.addItemListener (this) ;
		
	}

	

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		System.out.print ("item combo : ") ;
		Object valeur = combo.getSelectedItem() ;
		System.out.println ((String) valeur) ;
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.print ("action combo : ") ;
		Object valeur = combo.getSelectedItem() ;
		System.out.println ((String) valeur) ;
		
	}

}
