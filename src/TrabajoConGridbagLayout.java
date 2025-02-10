import javax.swing.*;
import java.awt.*;

class VentanaInicio extends JFrame{
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	public VentanaInicio() {
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("GridBagLayaout");
		setVisible(true);
		setSize(400,400);
		setLocationRelativeTo(null);

		gbc.fill = GridBagConstraints.HORIZONTAL;

		JLabel txt1 = new JLabel("The clasic form includes all visible fields for this list.");
		
		agregarComponente(txt1, 0, 0, 1, 1);

		JLabel title2 = new JLabel("Form option");
		agregarComponente(title2, 0, 1, 1, 1);

		JPanel opcionVaciaCorreo = new JPanel();
		agregarComponente(opcionVaciaCorreo, 1, 0, 1, 17);

		JLabel txt2 = new JLabel("Include the following");
		agregarComponente(txt2, 0, 2, 1, 1);

		JCheckBox Check1 = new JCheckBox("A tittle for your form");
		agregarComponente(Check1, 0, 3, 1, 1);

		JTextArea txtArea1 = new JTextArea("Subscribe to our mailing list");
		agregarComponente(txtArea1, 0, 4, 1, 1);

		JCheckBox check2 = new JCheckBox("Only required fields");
		agregarComponente(check2, 0, 5, 1, 1);

		JCheckBox check3 = new JCheckBox("all fields");
		agregarComponente(check3, 0, 6, 1, 1);

		JLabel txtDescrip1 = new JLabel("(edit required fields the forms builder)");
		agregarComponente(txtDescrip1, 0, 7, 1, 1);

		JCheckBox check4 = new JCheckBox("interest group fields");
		agregarComponente(check4, 0, 8, 1, 1);

		JCheckBox check5 = new JCheckBox("requiered field indicators");
		agregarComponente(check5, 0, 9, 1, 1);

		JLabel txt3 = new JLabel("Set form width");
		agregarComponente(txt3, 0, 10, 1, 1);

		JTextArea txtArea2 = new JTextArea();
		agregarComponente(txtArea2, 0, 11, 1, 1);



	}
	public void agregarComponente(JComponent componente, int x, int y, int w, int h) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gbl.setConstraints(componente, gbc);
		add(componente);
	}
}

public class TrabajoConGridbagLayout {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new VentanaInicio();
			}
		});

	}

}
