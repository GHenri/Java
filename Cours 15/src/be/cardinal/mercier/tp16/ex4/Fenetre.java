package be.cardinal.mercier.tp16.ex4;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Fenetre extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panneau ;
	private JButton boutonCopier ;
	private JTextField saisie, copie ;
	
	public Fenetre(){
	
		setTitle ("Ma fenetre ") ;
		setSize (300, 150) ;
		setBounds (10, 20, 300, 200) ;
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);//Pour fermer directement le programme en quittant
		
		panneau = new JPanel ();
		getContentPane().add(panneau);
		setSize (300, 200) ;
		saisie = new JTextField (20) ;
		getContentPane().add(saisie) ;
		saisie.addActionListener(this) ;
		
		boutonCopier = new JButton ("Copier") ;
		getContentPane().setLayout(new FlowLayout()) ;
		getContentPane().add(boutonCopier) ;
		boutonCopier.addActionListener(this);
		
		copie = new JTextField (20) ;
		getContentPane().add(copie) ;
		copie.addActionListener(this) ;
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boutonCopier) { 
			String texte = saisie.getText() ;
			copie.setText(texte) ;
		}
		
	}
}
