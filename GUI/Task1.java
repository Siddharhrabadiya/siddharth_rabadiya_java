package window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Task1 extends WindowAdapter implements ActionListener

{
	JFrame frame,frame1,frame2;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	static JButton b1,b2,b3,b4;
	JTextField tf1,tf2,tf3;
	JPasswordField p1,p2,p3;
	int a;

	
	public Task1() 
	{
		frame = new JFrame();
		
		frame.addWindowListener(this);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		JLabel l1 = new JLabel("  Welcome");
		l1.setBounds(199, 96, 94, 26);
		
		JButton b1 = new JButton("Sign Up");
		b1.setBounds(186, 155, 117, 29);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			    frame1 = new JFrame();
				
				JLabel l2 = new JLabel("Email");
				l2.setBounds(25, 48, 100, 22);
				
				JTextField tf1 = new JTextField();
				tf1.setBounds(193, 46, 130, 26);
				
				JLabel l3 = new JLabel("Password");
				l3.setBounds(25, 92, 100, 22);
				
				JPasswordField p1 = new JPasswordField();
				p1.setBounds(193, 90, 130, 26);
				
				JLabel l4 = new JLabel("Confirm Password");
				l4.setBounds(25, 128, 117, 22);
				
				JPasswordField p2 = new JPasswordField();
				p2.setBounds(193, 128, 130, 26);
				
				JLabel l5 = new JLabel("Mobile No");
				l5.setBounds(25, 164, 100, 22);
				
				JTextField tf2 = new JTextField();
				tf2.setBounds(193,166, 130, 26);
				
				JButton b3 = new JButton("Register");
				b3.setBounds(90, 250, 117, 29);
				b3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						String a = String.valueOf(p1.getPassword()); 
						String b = String.valueOf(p2.getPassword());
						if(a.equals(b))
						{
							JOptionPane.showMessageDialog(b3, "Welcome\n"+tf1.getText());
						}
						else
						{
							System.err.println("Password is wrong");
						}
					}
				});
			
				
				frame1.setVisible(true);
				frame1.setLayout(null);
				frame1.setSize(600, 600);
				frame1.add(l2);
				frame1.add(tf1);
				frame1.add(l3);
				frame1.add(p1);
				frame1.add(l4);
				frame1.add(p2);
				frame1.add(l5);
				frame1.add(tf2);
				frame1.add(b3);
			}
		});
	
		JButton b2 = new JButton("Login");
		b2.setBounds(186, 204, 117, 29);
		

		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			  frame2 = new JFrame();
				
				
				
				
				JLabel l6 = new JLabel("Mobile No");
				l6.setBounds(25, 48, 100, 22);
				
				JTextField tf3 = new JTextField();
				tf3.setBounds(126, 46, 130, 26);
				
				JLabel l7 = new JLabel("Password");
				l7.setBounds(25, 92, 100, 22);
				
				JPasswordField p3 = new JPasswordField();
				p3.setBounds(126, 90, 130, 26);
				
				JButton b4 = new JButton("Login");
				b4.setBounds(58, 163, 117, 29);
				b4.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(e.getSource()==b4) 
						{
							JOptionPane.showMessageDialog(b4, "Welcome\n"+tf3.getText());
						}
					}  
				});
				
				frame2.setVisible(true);
				frame2.setLayout(null);
				frame2.setSize(400,400);
				frame2.add(l6);
				frame2.add(tf3);
				frame2.add(l7);
				frame2.add(p3);
				frame2.add(b4);
				
				
				
			}
		});
		
		
		
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setSize(500,500);
		frame.add(l1);
		frame.add(b1);
		frame.add(b2);
	}
	public static void main(String[] args)
	{
		new Task1();
	}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		// TODO Auto-generated method stub
		super.windowClosing(e);
		
		 a = JOptionPane.showConfirmDialog(frame, "ARE YOU SURE WANT TO EXIT?");
		 
		if(a == JOptionPane.YES_OPTION)
		{
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if(a==JOptionPane.NO_OPTION)
		{
			
		}
   }
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
	}
	
}

