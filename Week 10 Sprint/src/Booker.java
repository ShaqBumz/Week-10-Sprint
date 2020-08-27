import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Button;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Booker {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Book() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Booker window = new Booker();
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
	public Booker() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(210, 105, 30));
		frame.setBounds(100, 100, 586, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\button (1).png"));
		lblNewLabel.setBackground(new Color(204, 102, 0));
		lblNewLabel.setBounds(230, 195, 111, 32);
		frame.getContentPane().add(lblNewLabel);

		JComboBox cmbMovie = new JComboBox();

		JLabel lblSeat = new JLabel("---");
		JLabel lblMovie = new JLabel("---");

		JButton btnA3 = new JButton("");
		btnA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (cmbMovie.getSelectedIndex() == 1) {
					Boolean isBookedA3 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA3 = "A3";

// Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

// Declare the JDBC Objects.
					Connection con = null;

					try {
// Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

// Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[Frozen] WHERE Seats = '" + SeatA3 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA3.setIcon(iconBackground);
							isBookedA3 = true;
							JOptionPane.showMessageDialog(null, "Seat already Booked!");

						}
						if (isBookedA3 == false) {
							// Change
							lblSeat.setText("A3");
							lblMovie.setText("Frozen");

							// Declare the JDBC Objects.

							Statement stmt = null;

							try {
								// Establish the connection.
								Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
								con = DriverManager.getConnection(connectionUrl);

								// Create and execute an SQL statement that returns some data
								// Change/////////////
								String SQLstd = "INSERT INTO [dbo].[Frozen] ([Seats]) VALUES ('" + SeatA3 + "')";

								stmt = con.createStatement();
								stmt.execute(SQLstd);

								JOptionPane.showMessageDialog(null, "Successfully Booked A Seat!");

							}

							catch (Exception e1) {

								e1.printStackTrace();
							}
						}

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}
				if (cmbMovie.getSelectedIndex() == 2) {

					Boolean isBookedA3 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA3 = "A3";

//Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

//Declare the JDBC Objects.
					Connection con = null;

					try {
//Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

//Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[TheKissingBooth] WHERE Seats = '" + SeatA3 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA3.setIcon(iconBackground);
							isBookedA3 = true;
							JOptionPane.showMessageDialog(null, "Seat already Booked!");

						}
						if (isBookedA3 == false) {
//Change
							lblSeat.setText("A3");
							lblMovie.setText("The Kissing Booth");

// Declare the JDBC Objects.

							Statement stmt = null;

							try {
								// Establish the connection.
								Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
								con = DriverManager.getConnection(connectionUrl);

								// Create and execute an SQL statement that returns some data
								// Change/////////////
								String SQLstd = "INSERT INTO [dbo].[TheKissingBooth] ([Seats]) VALUES ('" + SeatA3
										+ "')";

								stmt = con.createStatement();
								stmt.execute(SQLstd);

								JOptionPane.showMessageDialog(null, "Successfully Booked A Seat!");

							}

							catch (Exception e1) {

								e1.printStackTrace();
							}
						}

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}
				}
				if (cmbMovie.getSelectedIndex() == 3) {

					Boolean isBookedA3 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA3 = "A3";

//Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

//Declare the JDBC Objects.
					Connection con = null;

					try {
//Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

//Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[BadBoys] WHERE Seats = '" + SeatA3 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA3.setIcon(iconBackground);
							isBookedA3 = true;
							JOptionPane.showMessageDialog(null, "Seat already Booked!");

						}
						if (isBookedA3 == false) {
//Change
							lblSeat.setText("A3");
							lblMovie.setText("Bad Boys");

// Declare the JDBC Objects.

							Statement stmt = null;

							try {
								// Establish the connection.
								Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
								con = DriverManager.getConnection(connectionUrl);

								// Create and execute an SQL statement that returns some data
								// Change/////////////
								String SQLstd = "INSERT INTO [dbo].[BadBoys] ([Seats]) VALUES ('" + SeatA3 + "')";

								stmt = con.createStatement();
								stmt.execute(SQLstd);

								JOptionPane.showMessageDialog(null, "Successfully Booked A Seat!");
							}

							catch (Exception e1) {

								e1.printStackTrace();
							}
						}

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}

			}
		});
		btnA3.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\chair.png"));
		btnA3.setBounds(269, 150, 32, 32);
		frame.getContentPane().add(btnA3);
		btnA3.setOpaque(false);
		btnA3.setContentAreaFilled(false);
		btnA3.setBorderPainted(false);

		JButton btnA2 = new JButton("");
		btnA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (cmbMovie.getSelectedIndex() == 1) {
					Boolean isBookedA2 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA2 = "A2";

// Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

// Declare the JDBC Objects.
					Connection con = null;

					try {
// Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

// Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[Frozen] WHERE Seats = '" + SeatA2 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA2.setIcon(iconBackground);
							isBookedA2 = true;
							JOptionPane.showMessageDialog(null, "Seat already Booked!");

						}
						if (isBookedA2 == false) {
							// Change
							lblSeat.setText("A2");
							lblMovie.setText("Frozen");

							// Declare the JDBC Objects.

							Statement stmt = null;

							try {
								// Establish the connection.
								Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
								con = DriverManager.getConnection(connectionUrl);

								// Create and execute an SQL statement that returns some data
								// Change/////////////
								String SQLstd = "INSERT INTO [dbo].[Frozen] ([Seats]) VALUES ('" + SeatA2 + "')";

								stmt = con.createStatement();
								stmt.execute(SQLstd);

								JOptionPane.showMessageDialog(null, "Successfully Booked A Seat!");

							}

							catch (Exception e1) {

								e1.printStackTrace();
							}
						}

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}
				if (cmbMovie.getSelectedIndex() == 2) {

					Boolean isBookedA2 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA2 = "A2";

//Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

//Declare the JDBC Objects.
					Connection con = null;

					try {
//Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

//Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[TheKissingBooth] WHERE Seats = '" + SeatA2 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA2.setIcon(iconBackground);
							isBookedA2 = true;
							JOptionPane.showMessageDialog(null, "Seat already Booked!");

						}
						if (isBookedA2 == false) {
//Change
							lblSeat.setText("A2");
							lblMovie.setText("The Kissing Booth");

// Declare the JDBC Objects.

							Statement stmt = null;

							try {
								// Establish the connection.
								Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
								con = DriverManager.getConnection(connectionUrl);

								// Create and execute an SQL statement that returns some data
								// Change/////////////
								String SQLstd = "INSERT INTO [dbo].[TheKissingBooth] ([Seats]) VALUES ('" + SeatA2
										+ "')";

								stmt = con.createStatement();
								stmt.execute(SQLstd);

								JOptionPane.showMessageDialog(null, "Successfully Booked A Seat!");

							}

							catch (Exception e1) {

								e1.printStackTrace();
							}
						}

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}
				}
				if (cmbMovie.getSelectedIndex() == 3) {

					Boolean isBookedA2 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA2 = "A2";

//Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

//Declare the JDBC Objects.
					Connection con = null;

					try {
//Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

//Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[BadBoys] WHERE Seats = '" + SeatA2 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA2.setIcon(iconBackground);
							isBookedA2 = true;
							JOptionPane.showMessageDialog(null, "Seat already Booked!");

						}
						if (isBookedA2 == false) {
//Change
							lblSeat.setText("A2");
							lblMovie.setText("Bad Boys");

// Declare the JDBC Objects.

							Statement stmt = null;

							try {
								// Establish the connection.
								Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
								con = DriverManager.getConnection(connectionUrl);

								// Create and execute an SQL statement that returns some data
								// Change/////////////
								String SQLstd = "INSERT INTO [dbo].[BadBoys] ([Seats]) VALUES ('" + SeatA2 + "')";

								stmt = con.createStatement();
								stmt.execute(SQLstd);

								JOptionPane.showMessageDialog(null, "Successfully Booked A Seat!");

							}

							catch (Exception e1) {

								e1.printStackTrace();
							}
						}

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}

			}
		});
		btnA2.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\chair.png"));
		btnA2.setBounds(227, 150, 32, 32);
		frame.getContentPane().add(btnA2);
		btnA2.setOpaque(false);
		btnA2.setContentAreaFilled(false);
		btnA2.setBorderPainted(false);

		JButton btnA4 = new JButton("");
		btnA4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (cmbMovie.getSelectedIndex() == 1) {
					Boolean isBookedA4 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA4 = "A4";

// Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

// Declare the JDBC Objects.
					Connection con = null;

					try {
// Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

// Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[Frozen] WHERE Seats = '" + SeatA4 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA4.setIcon(iconBackground);
							isBookedA4 = true;
							JOptionPane.showMessageDialog(null, "Seat already Booked!");

						}
						if (isBookedA4 == false) {
							// Change
							lblSeat.setText("A4");
							lblMovie.setText("Frozen");

							// Declare the JDBC Objects.

							Statement stmt = null;

							try {
								// Establish the connection.
								Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
								con = DriverManager.getConnection(connectionUrl);

								// Create and execute an SQL statement that returns some data
								// Change/////////////
								String SQLstd = "INSERT INTO [dbo].[Frozen] ([Seats]) VALUES ('" + SeatA4 + "')";

								stmt = con.createStatement();
								stmt.execute(SQLstd);

								JOptionPane.showMessageDialog(null, "Successfully Booked A Seat!");
							}

							catch (Exception e1) {

								e1.printStackTrace();
							}
						}

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}
				if (cmbMovie.getSelectedIndex() == 2) {

					Boolean isBookedA4 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA4 = "A4";

//Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

//Declare the JDBC Objects.
					Connection con = null;

					try {
//Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

//Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[TheKissingBooth] WHERE Seats = '" + SeatA4 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA4.setIcon(iconBackground);
							isBookedA4 = true;
							JOptionPane.showMessageDialog(null, "Seat already Booked!");

						}
						if (isBookedA4 == false) {
//Change
							lblSeat.setText("A4");
							lblMovie.setText("The Kissing Booth");

// Declare the JDBC Objects.

							Statement stmt = null;

							try {
								// Establish the connection.
								Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
								con = DriverManager.getConnection(connectionUrl);

								// Create and execute an SQL statement that returns some data
								// Change/////////////
								String SQLstd = "INSERT INTO [dbo].[TheKissingBooth] ([Seats]) VALUES ('" + SeatA4
										+ "')";

								stmt = con.createStatement();
								stmt.execute(SQLstd);

								JOptionPane.showMessageDialog(null, "Successfully Booked A Seat!");

							}

							catch (Exception e1) {

								e1.printStackTrace();
							}
						}

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}
				}
				if (cmbMovie.getSelectedIndex() == 3) {

					Boolean isBookedA4 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA4 = "A4";

//Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

//Declare the JDBC Objects.
					Connection con = null;

					try {
//Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

//Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[BadBoys] WHERE Seats = '" + SeatA4 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA4.setIcon(iconBackground);
							isBookedA4 = true;
							JOptionPane.showMessageDialog(null, "Seat already Booked!");

						}
						if (isBookedA4 == false) {
//Change
							lblSeat.setText("A4");
							lblMovie.setText("Bad Boys");

// Declare the JDBC Objects.

							Statement stmt = null;

							try {
								// Establish the connection.
								Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
								con = DriverManager.getConnection(connectionUrl);

								// Create and execute an SQL statement that returns some data
								// Change/////////////
								String SQLstd = "INSERT INTO [dbo].[BadBoys] ([Seats]) VALUES ('" + SeatA4 + "')";

								stmt = con.createStatement();
								stmt.execute(SQLstd);

								JOptionPane.showMessageDialog(null, "Successfully Booked A Seat!");
							}

							catch (Exception e1) {

								e1.printStackTrace();
							}
						}

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}

			}
		});
		btnA4.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\chair.png"));
		btnA4.setBounds(311, 150, 32, 32);
		frame.getContentPane().add(btnA4);
		btnA4.setOpaque(false);
		btnA4.setContentAreaFilled(false);
		btnA4.setBorderPainted(false);

		JButton btnA5 = new JButton("");
		btnA5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (cmbMovie.getSelectedIndex() == 1) {
					Boolean isBookedA5 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA5 = "A5";

// Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

// Declare the JDBC Objects.
					Connection con = null;

					try {
// Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

// Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[Frozen] WHERE Seats = '" + SeatA5 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA5.setIcon(iconBackground);
							isBookedA5 = true;
							JOptionPane.showMessageDialog(null, "Seat already Booked!");

						}
						if (isBookedA5 == false) {
							// Change
							lblSeat.setText("A5");
							lblMovie.setText("Frozen");

							// Declare the JDBC Objects.

							Statement stmt = null;

							try {
								// Establish the connection.
								Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
								con = DriverManager.getConnection(connectionUrl);

								// Create and execute an SQL statement that returns some data
								// Change/////////////
								String SQLstd = "INSERT INTO [dbo].[Frozen] ([Seats]) VALUES ('" + SeatA5 + "')";

								stmt = con.createStatement();
								stmt.execute(SQLstd);

								JOptionPane.showMessageDialog(null, "Successfully Booked A Seat!");

							}

							catch (Exception e1) {

								e1.printStackTrace();
							}
						}

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}
				if (cmbMovie.getSelectedIndex() == 2) {

					Boolean isBookedA5 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA5 = "A5";

//Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

//Declare the JDBC Objects.
					Connection con = null;

					try {
//Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

//Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[TheKissingBooth] WHERE Seats = '" + SeatA5 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA5.setIcon(iconBackground);
							isBookedA5 = true;
							JOptionPane.showMessageDialog(null, "Seat already Booked!");

						}
						if (isBookedA5 == false) {
//Change
							lblSeat.setText("A5");
							lblMovie.setText("The Kissing Booth");

// Declare the JDBC Objects.

							Statement stmt = null;

							try {
								// Establish the connection.
								Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
								con = DriverManager.getConnection(connectionUrl);

								// Create and execute an SQL statement that returns some data
								// Change/////////////
								String SQLstd = "INSERT INTO [dbo].[TheKissingBooth] ([Seats]) VALUES ('" + SeatA5
										+ "')";

								stmt = con.createStatement();
								stmt.execute(SQLstd);

								JOptionPane.showMessageDialog(null, "Successfully Booked A Seat!");
							}

							catch (Exception e1) {

								e1.printStackTrace();
							}
						}

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}
				}
				if (cmbMovie.getSelectedIndex() == 3) {

					Boolean isBookedA5 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA5 = "A5";

//Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

//Declare the JDBC Objects.
					Connection con = null;

					try {
//Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

//Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[BadBoys] WHERE Seats = '" + SeatA5 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA5.setIcon(iconBackground);
							isBookedA5 = true;
							JOptionPane.showMessageDialog(null, "Seat already Booked!");

						}
						if (isBookedA5 == false) {
//Change
							lblSeat.setText("A5");
							lblMovie.setText("Bad Boys");

// Declare the JDBC Objects.

							Statement stmt = null;

							try {
								// Establish the connection.
								Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
								con = DriverManager.getConnection(connectionUrl);

								// Create and execute an SQL statement that returns some data
								// Change/////////////
								String SQLstd = "INSERT INTO [dbo].[BadBoys] ([Seats]) VALUES ('" + SeatA5 + "')";

								stmt = con.createStatement();
								stmt.execute(SQLstd);

								JOptionPane.showMessageDialog(null, "Successfully Booked A Seat!");

							}

							catch (Exception e1) {

								e1.printStackTrace();
							}
						}

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}

			}
		});
		btnA5.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\chair.png"));
		btnA5.setBounds(353, 150, 32, 32);
		frame.getContentPane().add(btnA5);
		btnA5.setOpaque(false);
		btnA5.setContentAreaFilled(false);
		btnA5.setBorderPainted(false);

		JButton btnA1 = new JButton("");
		btnA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (cmbMovie.getSelectedIndex() == 1) {
					Boolean isBookedA1 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA1 = "A1";

// Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

// Declare the JDBC Objects.
					Connection con = null;

					try {
// Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

// Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[Frozen] WHERE Seats = '" + SeatA1 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA1.setIcon(iconBackground);
							isBookedA1 = true;
							JOptionPane.showMessageDialog(null, "Seat already Booked!");

						}
						if (isBookedA1 == false) {
							// Change
							lblSeat.setText("A1");
							lblMovie.setText("Frozen");

							// Declare the JDBC Objects.

							Statement stmt = null;

							try {
								// Establish the connection.
								Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
								con = DriverManager.getConnection(connectionUrl);

								// Create and execute an SQL statement that returns some data
								// Change/////////////
								String SQLstd = "INSERT INTO [dbo].[Frozen] ([Seats]) VALUES ('" + SeatA1 + "')";

								stmt = con.createStatement();
								stmt.execute(SQLstd);

								JOptionPane.showMessageDialog(null, "Successfully Booked A Seat!");

							}

							catch (Exception e1) {

								e1.printStackTrace();
							}
						}

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}
				if (cmbMovie.getSelectedIndex() == 2) {

					Boolean isBookedA1 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA1 = "A1";

//Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

//Declare the JDBC Objects.
					Connection con = null;

					try {
//Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

//Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[TheKissingBooth] WHERE Seats = '" + SeatA1 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA1.setIcon(iconBackground);
							isBookedA1 = true;
							JOptionPane.showMessageDialog(null, "Seat already Booked!");

						}
						if (isBookedA1 == false) {
//Change
							lblSeat.setText("A1");
							lblMovie.setText("The Kissing Booth");

// Declare the JDBC Objects.

							Statement stmt = null;

							try {
								// Establish the connection.
								Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
								con = DriverManager.getConnection(connectionUrl);

								// Create and execute an SQL statement that returns some data
								// Change/////////////
								String SQLstd = "INSERT INTO [dbo].[TheKissingBooth] ([Seats]) VALUES ('" + SeatA1
										+ "')";

								stmt = con.createStatement();
								stmt.execute(SQLstd);

								JOptionPane.showMessageDialog(null, "Successfully Booked A Seat!");

							}

							catch (Exception e1) {

								e1.printStackTrace();
							}
						}

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}
				}
				if (cmbMovie.getSelectedIndex() == 3) {

					Boolean isBookedA1 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA1 = "A1";

//Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

//Declare the JDBC Objects.
					Connection con = null;

					try {
//Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

//Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[BadBoys] WHERE Seats = '" + SeatA1 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA1.setIcon(iconBackground);
							isBookedA1 = true;
							JOptionPane.showMessageDialog(null, "Seat already Booked!");

						}
						if (isBookedA1 == false) {
//Change
							lblSeat.setText("A1");
							lblMovie.setText("Bad Boys");

// Declare the JDBC Objects.

							Statement stmt = null;

							try {
								// Establish the connection.
								Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
								con = DriverManager.getConnection(connectionUrl);

								// Create and execute an SQL statement that returns some data
								// Change/////////////
								String SQLstd = "INSERT INTO [dbo].[BadBoys] ([Seats]) VALUES ('" + SeatA1 + "')";

								stmt = con.createStatement();
								stmt.execute(SQLstd);

								JOptionPane.showMessageDialog(null, "Successfully Booked A Seat!");

							}

							catch (Exception e1) {

								e1.printStackTrace();
							}
						}

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}

			}
		});
		btnA1.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\chair.png"));
		btnA1.setBounds(185, 150, 32, 32);
		frame.getContentPane().add(btnA1);
		btnA1.setOpaque(false);
		btnA1.setContentAreaFilled(false);
		btnA1.setBorderPainted(false);

		JButton btnB3 = new JButton("");
		btnB3.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\chair.png"));
		btnB3.setBounds(269, 108, 32, 32);
		frame.getContentPane().add(btnB3);
		btnB3.setOpaque(false);
		btnB3.setContentAreaFilled(false);
		btnB3.setBorderPainted(false);

		JButton btnB4 = new JButton("");
		btnB4.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\chair.png"));
		btnB4.setBounds(311, 107, 32, 32);
		frame.getContentPane().add(btnB4);
		btnB4.setOpaque(false);
		btnB4.setContentAreaFilled(false);
		btnB4.setBorderPainted(false);

		JButton btnB5 = new JButton("");
		btnB5.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\chair.png"));
		btnB5.setBounds(353, 108, 32, 32);
		frame.getContentPane().add(btnB5);
		btnB5.setOpaque(false);
		btnB5.setContentAreaFilled(false);
		btnB5.setBorderPainted(false);

		JButton btnB2 = new JButton("");
		btnB2.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\chair.png"));
		btnB2.setBounds(227, 107, 32, 32);
		frame.getContentPane().add(btnB2);
		btnB2.setOpaque(false);
		btnB2.setContentAreaFilled(false);
		btnB2.setBorderPainted(false);

		JButton btnB1 = new JButton("");
		btnB1.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\chair.png"));
		btnB1.setBounds(185, 107, 32, 32);
		frame.getContentPane().add(btnB1);
		btnB1.setOpaque(false);
		btnB1.setContentAreaFilled(false);
		btnB1.setBorderPainted(false);

		JButton btnC1 = new JButton("");
		btnC1.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\chair.png"));
		btnC1.setBounds(185, 64, 32, 32);
		frame.getContentPane().add(btnC1);
		btnC1.setOpaque(false);
		btnC1.setContentAreaFilled(false);
		btnC1.setBorderPainted(false);

		JButton btnC2 = new JButton("");
		btnC2.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\chair.png"));
		btnC2.setBounds(227, 64, 32, 32);
		frame.getContentPane().add(btnC2);
		btnC2.setOpaque(false);
		btnC2.setContentAreaFilled(false);
		btnC2.setBorderPainted(false);

		JButton btnC3 = new JButton("");
		btnC3.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\chair.png"));
		btnC3.setBounds(269, 64, 32, 32);
		frame.getContentPane().add(btnC3);
		btnC3.setOpaque(false);
		btnC3.setContentAreaFilled(false);
		btnC3.setBorderPainted(false);

		JButton btnC4 = new JButton("");
		btnC4.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\chair.png"));
		btnC4.setBounds(311, 64, 32, 32);
		frame.getContentPane().add(btnC4);
		btnC4.setOpaque(false);
		btnC4.setContentAreaFilled(false);
		btnC4.setBorderPainted(false);

		JButton btnC5 = new JButton("");
		btnC5.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\chair.png"));
		btnC5.setBounds(353, 64, 32, 32);
		frame.getContentPane().add(btnC5);
		btnC5.setOpaque(false);
		btnC5.setContentAreaFilled(false);
		btnC5.setBorderPainted(false);

		Panel panel = new Panel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(158, 42, 21, 140);
		frame.getContentPane().add(panel);

		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(10, 42, 150, 21);
		frame.getContentPane().add(panel_1);

		Panel panel_2 = new Panel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(391, 42, 21, 140);
		frame.getContentPane().add(panel_2);

		Panel panel_1_1 = new Panel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(410, 42, 150, 21);
		frame.getContentPane().add(panel_1_1);

		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Welcome Change = new Welcome();
				Change.main(null);
				
				frame.setVisible(false);
				
			}
		});
		btnBack.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\undo.png"));
		btnBack.setBounds(66, 86, 64, 64);
		frame.getContentPane().add(btnBack);
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);

		JButton btnRefresh = new JButton("");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				btnA1.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\chair.png"));
				btnA2.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\chair.png"));
				btnA3.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\chair.png"));
				btnA4.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\chair.png"));
				btnA5.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\chair.png"));
				
				
				if (cmbMovie.getSelectedIndex() == 1) {
					Boolean isBookedA1 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA1 = "A1";

// Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

// Declare the JDBC Objects.
					Connection con = null;

					try {
// Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

// Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[Frozen] WHERE Seats = '" + SeatA1 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA1.setIcon(iconBackground);
							isBookedA1 = true;
							

						}
						

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}
				if (cmbMovie.getSelectedIndex() == 2) {

					Boolean isBookedA1 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA1 = "A1";

//Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

//Declare the JDBC Objects.
					Connection con = null;

					try {
//Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

//Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[TheKissingBooth] WHERE Seats = '" + SeatA1 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA1.setIcon(iconBackground);
							isBookedA1 = true;
							

						}
						

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}
				}
				if (cmbMovie.getSelectedIndex() == 3) {

					Boolean isBookedA1 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA1 = "A1";

//Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

//Declare the JDBC Objects.
					Connection con = null;

					try {
//Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

//Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[BadBoys] WHERE Seats = '" + SeatA1 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA1.setIcon(iconBackground);
							isBookedA1 = true;
							

						}
						

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}
////////////////////////////////////////////////////////////////////////

				if (cmbMovie.getSelectedIndex() == 1) {
					Boolean isBookedA2 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA2 = "A2";

// Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

// Declare the JDBC Objects.
					Connection con = null;

					try {
// Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

// Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[Frozen] WHERE Seats = '" + SeatA2 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA2.setIcon(iconBackground);
							isBookedA2 = true;
							

						}
						

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}
				if (cmbMovie.getSelectedIndex() == 2) {

					Boolean isBookedA2 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA2 = "A2";

//Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

//Declare the JDBC Objects.
					Connection con = null;

					try {
//Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

//Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[TheKissingBooth] WHERE Seats = '" + SeatA2 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA2.setIcon(iconBackground);
							isBookedA2 = true;
							

						}
						

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}
				}
				if (cmbMovie.getSelectedIndex() == 3) {

					Boolean isBookedA2 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA2 = "A2";

//Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

//Declare the JDBC Objects.
					Connection con = null;

					try {
//Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

//Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[BadBoys] WHERE Seats = '" + SeatA2 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA2.setIcon(iconBackground);
							isBookedA2 = true;
							

						}
						

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}
				////////////////////////////////////////////////////////////////////////////////

				if (cmbMovie.getSelectedIndex() == 1) {
					Boolean isBookedA3 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA3 = "A3";

// Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

// Declare the JDBC Objects.
					Connection con = null;

					try {
// Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

// Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[Frozen] WHERE Seats = '" + SeatA3 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA3.setIcon(iconBackground);
							isBookedA3 = true;
							

						}
						

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}
				if (cmbMovie.getSelectedIndex() == 2) {

					Boolean isBookedA3 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA3 = "A3";

//Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

//Declare the JDBC Objects.
					Connection con = null;

					try {
//Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

//Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[TheKissingBooth] WHERE Seats = '" + SeatA3 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA3.setIcon(iconBackground);
							isBookedA3 = true;
							

						}
						
					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}
				}
				if (cmbMovie.getSelectedIndex() == 3) {

					Boolean isBookedA3 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA3 = "A3";

//Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

//Declare the JDBC Objects.
					Connection con = null;

					try {
//Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

//Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[BadBoys] WHERE Seats = '" + SeatA3 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA3.setIcon(iconBackground);
							isBookedA3 = true;
							

						}
						

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}
				////////////////////////////////////////////////////////////////////////

				if (cmbMovie.getSelectedIndex() == 1) {
					Boolean isBookedA4 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA4 = "A4";

// Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

// Declare the JDBC Objects.
					Connection con = null;

					try {
// Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

// Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[Frozen] WHERE Seats = '" + SeatA4 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA4.setIcon(iconBackground);
							isBookedA4 = true;
						

						}
						
					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}
				if (cmbMovie.getSelectedIndex() == 2) {

					Boolean isBookedA4 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA4 = "A4";

//Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

//Declare the JDBC Objects.
					Connection con = null;

					try {
//Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

//Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[TheKissingBooth] WHERE Seats = '" + SeatA4 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA4.setIcon(iconBackground);
							isBookedA4 = true;
							

						}
						

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}
				}
				if (cmbMovie.getSelectedIndex() == 3) {

					Boolean isBookedA4 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA4 = "A4";

//Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

//Declare the JDBC Objects.
					Connection con = null;

					try {
//Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

//Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[BadBoys] WHERE Seats = '" + SeatA4 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA4.setIcon(iconBackground);
							isBookedA4 = true;
						

						}


					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}

				///////////////////////////////////////////////////////////////////////////////

				if (cmbMovie.getSelectedIndex() == 1) {
					Boolean isBookedA5 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA5 = "A5";

// Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

// Declare the JDBC Objects.
					Connection con = null;

					try {
// Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

// Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[Frozen] WHERE Seats = '" + SeatA5 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA5.setIcon(iconBackground);
							isBookedA5 = true;
						

						}
						

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}
				if (cmbMovie.getSelectedIndex() == 2) {

					Boolean isBookedA5 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA5 = "A5";

//Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

//Declare the JDBC Objects.
					Connection con = null;

					try {
//Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

//Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[TheKissingBooth] WHERE Seats = '" + SeatA5 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA5.setIcon(iconBackground);
							isBookedA5 = true;
							

						}
						

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}
				}
				if (cmbMovie.getSelectedIndex() == 3) {

					Boolean isBookedA5 = false;
////////////////////////////////////////////////////////////////////////
//Change////////////////////////////
					String SeatA5 = "A5";

//Create a variable for the connection string.
					String connectionUrl = "jdbc:sqlserver://localhost:1433;"
							+ "databaseName= Week10Sprint;integratedSecurity=true;";

//Declare the JDBC Objects.
					Connection con = null;

					try {
//Establish the connection.
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con = DriverManager.getConnection(connectionUrl);

//Create and execute an SQL statement that returns some data
//Change////////////////////////////
						String SQLSearch = "SELECT * FROM [dbo].[BadBoys] WHERE Seats = '" + SeatA5 + "'";

						ResultSet rs = con.createStatement().executeQuery(SQLSearch);
						while (rs.next()) {

							ImageIcon iconBackground = new ImageIcon("Images/cross.png");
//Change////////////////////////////
							btnA5.setIcon(iconBackground);
							isBookedA5 = true;
							

						}
						

					}

					catch (Exception e1) {

						JOptionPane.showMessageDialog(null, "Record Was Not Found :{");
					}

				}

			}
		});
		btnRefresh.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\reload.png"));
		btnRefresh.setBounds(440, 86, 64, 64);
		frame.getContentPane().add(btnRefresh);
		btnRefresh.setOpaque(false);
		btnRefresh.setContentAreaFilled(false);
		btnRefresh.setBorderPainted(false);

		JLabel lblNewLabel_3 = new JLabel("Seat Booked:");
		lblNewLabel_3.setForeground(new Color(204, 102, 0));
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(104, 252, 116, 21);
		frame.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Movie:");
		lblNewLabel_4.setForeground(new Color(204, 102, 0));
		lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(375, 255, 56, 14);
		frame.getContentPane().add(lblNewLabel_4);

		lblSeat.setForeground(new Color(204, 102, 0));
		lblSeat.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeat.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblSeat.setBounds(104, 269, 113, 36);
		frame.getContentPane().add(lblSeat);

		lblMovie.setForeground(new Color(204, 102, 0));
		lblMovie.setHorizontalAlignment(SwingConstants.CENTER);
		lblMovie.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblMovie.setBounds(317, 269, 169, 36);
		frame.getContentPane().add(lblMovie);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(
				"C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\ea3fd3102ccf575e3c33954f73eab78d.jpg"));
		lblNewLabel_6.setBounds(-127, 241, 697, 90);
		frame.getContentPane().add(lblNewLabel_6);

		cmbMovie.setForeground(new Color(255, 255, 255));
		cmbMovie.setBackground(new Color(204, 102, 0));
		cmbMovie.setModel(
				new DefaultComboBoxModel(new String[] { "Select A Movie", "Frozen", "The Kissing Booth", "Bad Boys" }));
		cmbMovie.setBounds(230, 11, 111, 22);
		frame.getContentPane().add(cmbMovie);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(
				"C:\\Users\\shaqu\\eclipse-workspace\\Week 10 Sprint\\Images\\ea3fd3102ccf575e3c33954f73eab78d.jpg"));
		lblNewLabel_1.setBounds(-127, 0, 697, 227);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
