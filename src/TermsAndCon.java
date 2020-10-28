import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextArea;

public class TermsAndCon extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TermsAndCon dialog = new TermsAndCon();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TermsAndCon() {
		setBounds(100, 100, 692, 330);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JTextArea txtrTermsAndCondition = new JTextArea();
		txtrTermsAndCondition.setText("Terms and condition for creating a user in Best Property.\n\nPlease read below and agree to terms and conditions if you want to create a user in our system.\n\n    Lorem, ipsum dolor sit amet consectetur adipisicing elit. Molestias, autem. Facilis, distinctio\n nesciunt. Molestiae veniam maiores quam amet. Voluptatem quidem ipsam beatae, dignissimos\n laborum soluta cumque suscipit nostrum fugiat possimus.     Lorem, ipsum dolor sit amet consectetur adipisicing elit. Molestias, autem. Facilis, distinctio\n nesciunt. Molestiae veniam maiores quam amet. Voluptatem quidem ipsam beatae, dignissimos\n laborum soluta cumque suscipit nostrum fugiat possimus.    \n\nLorem, ipsum dolor sit amet consectetur adipisicing elit. Molestias, autem. Facilis, distinctio\n nesciunt. Molestiae veniam maiores quam amet. Voluptatem quidem ipsam beatae, dignissimos\n laborum soluta cumque suscipit nostrum fugiat possimus. ");
		txtrTermsAndCondition.setBounds(31, 17, 625, 230);
		contentPanel.add(txtrTermsAndCondition);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
						}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}


