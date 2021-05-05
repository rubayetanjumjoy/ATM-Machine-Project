package atm;
import java.io.File;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;


public class mainAtm extends JFrame

{	
	public static void main(String[] args) 
	{	Scanner s=new Scanner(System.in);

//	Member m=new Member("Rubayet Anjum", 1611, 0,1234);
//	Member m2=new Member("Ishtiaq Salehin", 1612, 0,5678);

		MemberArray A=new MemberArray();
		WriteFile fw=new WriteFile();
//	A.addMember(m);
//	A.addMember(m2);
		

		
	 Scanner x=new Scanner(System.in);
			try
			{	File z=new File("atm.txt");
			 x=new Scanner(z);
				
			}catch(Exception e)
			{
				System.out.println(e);
			}
	
			while (x.hasNext())
			{	
				
				String a=x.nextLine();
				
				String b=x.next();
				int tb=Integer.parseInt(b);
				
				String c=x.next();
				int tc=Integer.parseInt(c);
			
				String d=x.next();
				int td=Integer.parseInt(d);
			
				String e=x.nextLine();
			

				Member tm=new Member(a,tb,tc,td);
   			    A.addMember(tm);
	  			

				
			}
		
		
		
			 JFrame frame;
			
			 JLabel nameL;
		 JLabel idL;
			
			
			JTextField id;
			 JTextField password;
			
			
			
			 JButton login;
			 JButton exitl;
			
		
			frame = new JFrame();
			frame.setTitle("Login Window");
			
			nameL = new JLabel("ID");
			idL = new JLabel("Password");
			
			id = new JTextField();
			password = new JTextField();
			
			
			login = new JButton("Login");
			
			exitl = new JButton("Exit");
			
			
			
			GridLayout g = new GridLayout(3, 2);
			frame.setLayout(g);
			
		
			frame.add(nameL);
			frame.add(id);
			frame.add(idL);
			frame.add(password);
		
			frame.add(login);
			frame.add(exitl);
			
			
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			frame.setLocation(500, 200);
			frame.setSize(400, 250);
			login.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(e.getSource()==login)
					{
						 String i=id.getText();
						 String p=password.getText();
						 int temppass=Integer.parseInt(p);
						 int tempid=Integer.parseInt(i);
					
						Member found=A.findID(tempid);
						
						if( tempid==found.getId() && temppass==found.getPassword() )
						{
						
							
							int TI=A.findArrayNumber(tempid);
							 JFrame frame2;
								
							 
							 
							 JButton checking;
							 JButton withdraw;
							 JButton deposit;
							 JButton logout;
							
							
							 
							 frame2 = new JFrame();
								frame2.setTitle("Welcome " +found.getName());
								
								checking=new JButton("Check Balance");
								withdraw=new JButton("Withdraw");
								deposit=new JButton("Deposit");
								logout=new JButton("Logout");
								
								
								GridLayout g = new GridLayout(4, 2);
								frame2.setLayout(g);
								
								
								frame2.add(checking);
								frame2.add(deposit);
								frame2.add(withdraw);
								frame2.add(logout);
								
								
								frame2.setVisible(true);
								
								frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
								
								frame2.setLocation(500, 200);
								frame2.setSize(400, 300);
								
							
							//checking_Balance
							
							
							checking.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent e) {
									//found.getBalance();
									int fn=found.getBalance();
									
									JOptionPane.showMessageDialog(null, "Balance is "+fn);												
									
								}
							});
							
							//withdraw
							withdraw.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent e) {
									// TODO Auto-generated method stub
									
									
									JFrame frame3;
									JLabel withdrawAmount;
									JTextField wat;
									JButton withdraw;
									JButton back;
									
									
									frame3=new JFrame();
									
									withdrawAmount =new JLabel("Withdraw");
									wat=new JTextField();
									withdraw=new JButton("Withdraw");
									back=new JButton("Back");
									
									
									GridLayout g = new GridLayout(4, 2);
									frame3.setLayout(g);
									frame3.add(withdrawAmount);
									frame3.add(wat);
									frame3.add(withdraw);
									frame3.add(back);
									
									
									
									
									
									frame3.setVisible(true);
									frame3.setLocation(500, 200);
									
									frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
									frame3.setSize(400, 300);
									back.addActionListener(new ActionListener() {
										
										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub
											frame3.setVisible(false);
										}
									});
									
									withdraw.addActionListener(new ActionListener() {
										
										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub
											int a=Integer.parseInt(wat.getText());
											int Bt=found.getBalance();
											if(Bt>=a){
											found.withdraw(a);
											JOptionPane.showMessageDialog(null, "Done");
											frame3.setVisible(false);}
											else
											{
												JOptionPane.showMessageDialog(null, "You Don't Have enough Money");
												
											}
										}
									});
									
									//deposit
									
								
									
								}
								
							});
							deposit.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent e) {
									// TODO Auto-generated method stub
									
									
									JFrame frame4;
									JLabel depositAmount;
									JTextField dat;
									JButton depositB;
									JButton back1;
									
									
									frame4=new JFrame();
									
									depositAmount =new JLabel("Deposit");
									dat=new JTextField();
									depositB=new JButton("Deposit");
									back1=new JButton("Back");
									
									GridLayout g = new GridLayout(4, 2);
									frame4.setLayout(g);
									frame4.add(depositAmount);
									frame4.add(dat);
									frame4.add(depositB);
									frame4.add(back1);
									
									
									
									
									frame4.setVisible(true);
									frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
									frame4.setLocation(500, 200);
									frame4.setSize(400, 300);
									
									back1.addActionListener(new ActionListener() {
										
										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub
											frame4.setVisible(false);
										}
									});
									
									depositB.addActionListener(new ActionListener() {
										
										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub
											int d=Integer.parseInt(dat.getText());
											found.addBalance(d);
											JOptionPane.showMessageDialog(null, "Done");
											frame4.setVisible(false);
										}
									});}});
							
							logout.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent e) {
									// TODO Auto-generated method stub
									A.marray[TI]=found;
									fw.openFile();
									for(int j=0;j<A.marray.length;j++)
									{
									if(A.marray[j] !=null)
									{
										fw.addRecords(A.marray[j].getName(), A.marray[j].getId(), A.marray[j].getBalance(), A.marray[j].getPassword());
									}
									
									
									}
									fw.closefile();
									
									frame2.setVisible(false);
									id.setText("");
									password.setText("");
									
								}
							});
							
						
							
						}
						else
						{	
							JOptionPane.showMessageDialog(null, "Wrong Id and Password\nPlease try again");
							id.setText("");
							password.setText("");
							
							
						}
				
				      }
				
				}
			});
							
							
							
							
							
							
							
			
			exitl.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==exitl)
					System.exit(0);
		
				}
			});
			
			
		
		
			
		
	
		
		

				
	
		
		
	
		
		
		
		
	
		
	
		

	
		
		}

	
	


	

}
