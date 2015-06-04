package be.cardinal.mercier.tp15.ex2;

import javax.swing.* ;
import java.awt.event.* ;

public class MaFenetre extends JFrame implements MouseListener {
	public MaFenetre (){ // constructeur
	 setTitle ("Ma fenetre ") ;
	 setSize (300, 150) ;
	 setBounds (10, 20, 300, 200) ;
	 addMouseListener (this) ; // la fenetre sera son propre écouteur
	 						
	}
	public void mouseClicked(MouseEvent ev){ // methode gerant un clic souris
		int x = ev.getX() ;
		int y = ev.getY() ;
		System.out.println ("clic au point de coordonnees " + x + ", " + y ) ;
	}
	
	public void mousePressed (MouseEvent ev) {}
	public void mouseReleased(MouseEvent ev) {}
	public void mouseEntered (MouseEvent ev) {}
	public void mouseExited (MouseEvent ev) {}
	 
}
