import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Metro {

	private JFrame frame;
	private JTextField c1;
	protected JComboBox c2;
	protected JComboBox c3;
	protected int tickets;

	/**
	package Metro;

	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;

	import java.awt.Font;
	import java.awt.Color;
	import javax.swing.JTextField;
	import javax.swing.JComboBox;
	import javax.swing.JButton;
	import javax.swing.DefaultComboBoxModel;
	import java.awt.event.ActionListener;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.awt.event.ActionEvent;

	public class Metro {

		private JFrame frame;
		private JTextField t1;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Metro window = new Metro();
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
		public Metro() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.getContentPane().setBackground(new Color(46, 139, 87));
			frame.setBounds(100, 100, 656, 433);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Metro Train TB");
			lblNewLabel.setFont(new Font("Segoe Script", Font.BOLD, 31));
			lblNewLabel.setBounds(161, 11, 283, 50);
			frame.getContentPane().add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("Name");
			lblNewLabel_1.setFont(new Font("Segoe Script", Font.BOLD, 21));
			lblNewLabel_1.setForeground(new Color(0, 0, 128));
			lblNewLabel_1.setBounds(40, 86, 87, 14);
			frame.getContentPane().add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("From St");
			lblNewLabel_2.setFont(new Font("Segoe Script", Font.BOLD, 21));
			lblNewLabel_2.setForeground(new Color(0, 0, 128));
			lblNewLabel_2.setBounds(40, 160, 99, 22);
			frame.getContentPane().add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("To St");
			lblNewLabel_3.setFont(new Font("Segoe Script", Font.BOLD, 21));
			lblNewLabel_3.setForeground(new Color(0, 0, 128));
			lblNewLabel_3.setBounds(40, 225, 73, 34);
			frame.getContentPane().add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("No. of Tickets");
			lblNewLabel_4.setFont(new Font("Segoe Script", Font.BOLD, 21));
			lblNewLabel_4.setForeground(new Color(0, 0, 128));
			lblNewLabel_4.setBounds(40, 298, 158, 28);
			frame.getContentPane().add(lblNewLabel_4);
			
			t1 = new JTextField();
			t1.setBounds(326, 85, 145, 20);
			frame.getContentPane().add(t1);
			t1.setColumns(10);
			
			JComboBox c2 = new JComboBox();
			c2.setModel(new DefaultComboBoxModel(new String[] {"Select", "Miyapur", "JNTU", "KPHB", "Kukatpally"}));
			c2.setBounds(326, 233, 145, 22);
			frame.getContentPane().add(c2);
			
			JComboBox c1 = new JComboBox();
			c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Miyapur", "JNTU", "KPHB", "Kukatpally"}));
			c1.setBounds(326, 162, 145, 22);
			frame.getContentPane().add(c1);
			
			JComboBox c3 = new JComboBox();
			c3.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
			c3.setBounds(326, 303, 145, 22);
			frame.getContentPane().add(c3);
			
			JButton btnNewButton = new JButton("Book");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String name=t1.getText();
					String from=(String) c1.getSelectedItem();
					String to=(String) c2.getSelectedItem();
					String t=(String) c3.getSelectedItem();
					int tickets=Integer.parseInt(t);
					int bill=0;
					if(from.equals("Miyapur")&& to.equals("JNTU"))
					{
						bill=tickets*40;
					}
					else if(from.equals("Miyapur")&& to.equals("KPHB"))
					{
						bill=tickets*50;
					}
					else if(from.equals("Miyapur")&& to.equals("Kukatpally"))
					{
						bill=tickets*60;
					}
					else if(from.equals("JNTU")&& to.equals("Miyapur"))
					{
						bill=tickets*40;
					}
					else if(from.equals("JNTU")&& to.equals("KPHB"))
					{
						bill=tickets*50;
					}
					else if(from.equals("JNTU")&& to.equals("Kukatpally"))
					{
						bill=tickets*60;
					}
					else if(from.equals("KPHB")&& to.equals("Miyapur"))
					{
						bill=tickets*40;
					}
					else if(from.equals("KPHB")&& to.equals("JNTU"))
					{
						bill=tickets*50;
					}
					else if(from.equals("KPHB")&& to.equals("Kukatpally"))
					{
						bill=tickets*60;
					}
					else if(from.equals("Kukatpally")&& to.equals("KPHB"))
					{
						bill=tickets*60;
					}
					else if(from.equals("Kukatpally")&& to.equals("JNTU"))
					{
						bill=tickets*50;
					}
					else if(from.equals("Kukatpally")&& to.equals("Miyapur"))
					{
						bill=tickets*60;
					}
					else
					{
						JOptionPane.showMessageDialog(btnNewButton, "Enter correct station names!!");
					}
					try {
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/csed_db","root","mrec");
						String q="insert into metro values('"+name+"','"+from+"','"+to+"','"+tickets+"','"+bill+"')";
						Statement sta=con.createStatement();
						sta.execute(q);
						con.close();
						JOptionPane.showMessageDialog(btnNewButton, "Hello "+name+" \nFrom:"+from+" \nTo:"+to+"\nTickets: "+tickets+"\nTotal Bill:"+bill);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			});
			btnNewButton.setBackground(new Color(0, 0, 128));
			btnNewButton.setForeground(new Color(46, 139, 87));
			btnNewButton.setBounds(229, 360, 89, 23);
			frame.getContentPane().add(btnNewButton);
		}
	}