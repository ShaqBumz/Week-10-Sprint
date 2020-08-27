import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Welcome {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Welcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 579, 358);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\imageedit_5_7691391361.png"));
		lblNewLabel.setBounds(77, 0, 447, 164);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnBook = new JButton("");
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Booker Change = new Booker();
				Change.Book();
				
				frame.setVisible(false);
				
			}
		});
		btnBook.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\button.png"));
		btnBook.setBounds(199, 202, 177, 59);
		frame.getContentPane().add(btnBook);
		btnBook.setOpaque(false);
		btnBook.setContentAreaFilled(false);
		btnBook.setBorderPainted(false);
		
	}
}
