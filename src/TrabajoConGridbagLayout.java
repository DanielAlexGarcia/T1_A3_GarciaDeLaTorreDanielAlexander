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

		JLabel txt1 = new JLabel("The clasic form includes all visible fields for \nthis list.");
		
		agregarComponente(txt1, 0, 0, 1, 1);

		JLabel title2 = new JLabel("Form option");
		agregarComponente(title2, 0, 1, 1, 1);

		

		JPanel opcionVaciaCorreo = new JPanel(new GridBagLayout());
			GridBagConstraints gbcPanel = new GridBagConstraints();
			JLabel panelTxt1 = new JLabel("Email Address");
			agregarComponente(opcionVaciaCorreo, panelTxt1, 0, 0, 1, 1, gbcPanel);

			JTextArea panelArea1 = new JTextArea();
			agregarComponente(opcionVaciaCorreo, panelArea1, 0, 1, 1, 1, gbcPanel);

			JLabel panelTxt2 = new JLabel("First Name");
			agregarComponente(opcionVaciaCorreo, panelTxt2, 0, 2, 1, 1, gbcPanel);

			JTextArea PanelArea2 = new JTextArea();
			agregarComponente(opcionVaciaCorreo, PanelArea2, 0, 3, 1, 1, gbcPanel);

			JLabel PanelTxt3 = new JLabel("Last Name");
			agregarComponente(opcionVaciaCorreo, PanelTxt3, 0, 4, 1, 1, gbcPanel);

			JTextArea panelArea3 = new JTextArea();
			agregarComponente(opcionVaciaCorreo, panelArea3, 0, 5, 1, 1, gbcPanel);

			JButton PanelButon1 = new JButton("Subscribe");
			agregarComponente(opcionVaciaCorreo, PanelButon1, 0, 6, 1, 1, gbcPanel);

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

		JLabel txt4 = new JLabel("Enhance your form");
		agregarComponente(txt4, 0, 12, 1, 1);

		JCheckBox check6 = new JCheckBox("enable evil popup mode");
		agregarComponente(check6, 0, 13, 1, 1);

		JCheckBox check7 = new JCheckBox("disable all JavaScrip");
		agregarComponente(check7, 0, 14, 1, 1);

		JCheckBox check8 = new JCheckBox("include archive link");
		agregarComponente(check8, 0, 15, 1, 1);

		JCheckBox check9 = new JCheckBox("include MonkeyRewads link");
		agregarComponente(check9, 0, 16, 1, 1);

		


	}
	public void agregarComponente(JComponent componente, int x, int y, int w, int h) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gbl.setConstraints(componente, gbc);
		add(componente);
	}
	public void agregarComponente(JPanel Panel, JComponent componente, int x, int y, int w, int h, GridBagConstraints gbcc) {
		gbcc.gridx = x;
		gbcc.gridy = y;
		gbcc.gridwidth = w;
		gbcc.gridheight = h;
		gbcc.fill = GridBagConstraints.HORIZONTAL;
		Panel.add(componente, gbcc);
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
