import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui extends JFrame implements ActionListener {

	private ArrayList <JButton> botones;
	private JPanel panel1,panel2;
	private JLabel text;
	private JTextField CajaTexto;
	private ActionListener action;


	public Gui(){
		super("ejemplo de interfaz");
		accion();
		Crearbotones();
		//CrearText();
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}


	public void Crearbotones() {

		setLayout(new BorderLayout());
		panel1= new JPanel();
		panel1.setLayout(new GridLayout(5,5));
		botones= new ArrayList<JButton>();

		for(int i=0; i<10; i++) {
			botones.add(i,new JButton ("boton"+ (i+1)));

			panel1.add(botones.get(i));

			if(i<5) {
				botones.get(i).addActionListener(action);
			}else {
				botones.get(i).addActionListener(this);

			}
		}
	}

	public void accion() {

		action = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String opcion =(String)e.getActionCommand();

				if(opcion.equals ("boton 1")) {
					botones.get(0).setText("se oprimio");
				}
				else if(opcion.equals("boton 2")) {
					botones.get(0).setText("se oprimio");

				}
				else if(opcion.equals("boton 3")) {
					botones.get(0).setText("se oprimio");
				}
				else if(opcion.equals("boton 4")) {
					botones.get(0).setText("se oprimio");
				}
				else if(opcion.equals("boton 5")) {
					botones.get(0).setText("se oprimio");
				}

				
			}











		};
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}