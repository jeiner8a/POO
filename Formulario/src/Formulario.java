import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Formulario extends JFrame implements ActionListener{
	JButton boton1;
	
	public Formulario() {
		setLayout(null);
		
		boton1=new JButton("aceptar");
		boton1.setBounds (300, 250, 100, 30);
		add(boton1);
		boton1.addActionListener(this);
		
	}
	
@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==boton1) {
			System.exit(0);
		}		
	}

}
