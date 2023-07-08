import javax.swing.*; 
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Principals_Message_Page extends JFrame{
	JPanel Title_Bar_3_Panel,title_Panel,inputPanel;
	JLabel Title_Bar_1_Label,Title_Bar_2_Label,inputLabel,Title_Bar_3_Label;
	JTextArea Title_Bar_3_Txt;
	JButton back_Btn1,back_Btn,next_Btn,min_Btn,close_Btn,reg_Btn,login_Btn,home_Btn,about_Btn,admission_Btn,faculty_Btn,library_Btn;
	
	Principals_Message_Page(){
		setSize(500,400);
		setUndecorated(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setLayout(null);
		 
		//Image set in the title bar
        //Image icon = Toolkit.getDefaultToolkit().getImage("D:\\download.jpg");    
        //setIconImage(icon);
		
		//***************************Border****************************//
        Border emptyBorder = BorderFactory.createEmptyBorder();
       
        //***************************FONTS****************************//
        Font font0 = new Font("Arial",Font.BOLD,25);
        Font font1 = new Font("Arial",Font.BOLD,20); 
        Font font2 = new Font("Arial",Font.BOLD,15);
        Font font3 = new Font("Arial",Font.BOLD,15);
        Font font4 = new Font("Arial",Font.BOLD,15);
        Font font9 = new Font("Arial",Font.BOLD,12);
        Font font10 = new Font("Arial",Font.BOLD+Font.ITALIC,12);

        
        //********************************Panel1**********************************//
        
        title_Panel = new JPanel();
        title_Panel.setBounds(0, 0, 500, 100);
        title_Panel.setBackground(new Color(70,130,180));//51,153,255//0,255,255
        title_Panel.setLayout(null);
        add(title_Panel);
     
//..............................BACK BUTTON................................//
        
        back_Btn = new JButton("<");
        back_Btn.setBounds(0, 0, 25,25);
        back_Btn.setBackground(new Color(70,130,180));
        back_Btn.setFont(font2);
        back_Btn.setBorder(emptyBorder);
        back_Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
          	  dispose();
 			  new AboutUs_Page();
           }
        });
        title_Panel.add(back_Btn);
        
        //..............................BACK BUTTON................................//
        
        back_Btn1 = new JButton(">");
        back_Btn1.setBounds(25, 0,25,25);
        back_Btn1.setBackground(new Color(70,130,180));
        back_Btn1.setFont(font2);
//        back_Btn1.setHorizontalAlignment(SwingConstants.LEFT);
        back_Btn1.setBorder(emptyBorder);
        back_Btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
          	  dispose();
 			  new V_Principals_Message_Page();
           }
        });
        title_Panel.add(back_Btn1);
        
        //..........................Minimize Button...........................//
        min_Btn = new JButton("-");
        min_Btn.setBounds(450, 0, 25, 25);
        min_Btn.setBackground(new Color(70,130,180));
        min_Btn.setFont(font1);
        min_Btn.setBorder(emptyBorder);
        min_Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	setExtendedState(JFrame.ICONIFIED);
            }
        });
        title_Panel.add(min_Btn);
        
        //..........................Close Button...........................//
        close_Btn = new JButton("X");
        close_Btn.setBounds(475, 0, 25, 25);
        close_Btn.setBackground(new Color(70,130,180));
        close_Btn.setFont(font2);
        close_Btn.setBorder(emptyBorder);
        close_Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	System.exit(0);
            }
        });
        title_Panel.add(close_Btn);
        
        //.........................Title Bar Label................................//
        Title_Bar_1_Label = new JLabel("ABC SCHOOL",JLabel.CENTER);
        Title_Bar_1_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\00.png"));
        Title_Bar_1_Label.setBounds(0,10,500,80);//140,10,500,80
        //Title_Bar_1_Label.setBackground(new Color(70,130,180));
        Title_Bar_1_Label.setFont(font0);
        Title_Bar_1_Label.setLayout(null);
        title_Panel.add(Title_Bar_1_Label);
        
      //.........................Title Bar Label................................//
        
        Title_Bar_3_Panel = new JPanel();
        Title_Bar_3_Panel.setBounds(0, 100, 500, 300);
        Title_Bar_3_Panel.setBackground(new Color(135,206,250));//51,153,255//0,255,255
        Title_Bar_3_Panel.setLayout(null);
        add(Title_Bar_3_Panel);
        
        Title_Bar_3_Label = new JLabel("Principal's Message",JLabel.CENTER);//"Welcome to ABC School",JLabel.CENTER
        Title_Bar_3_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\001.png"));
        Title_Bar_3_Label.setBounds(0, 5, 500, 40);
        Title_Bar_3_Label.setForeground(new Color(255,255,255));
        //Title_Bar_3_Label.setBackground(Color.RED);//new Color(70,130,180)
        Title_Bar_3_Label.setFont(font0);
        Title_Bar_3_Label.setLayout(null);
        Title_Bar_3_Panel.add(Title_Bar_3_Label);
       
        Title_Bar_3_Txt = new JTextArea("ABC School has good reasons to claim that it is the pioneer in English\n"
        		                      + "medium education. Our past results in the public exams very truly support\n"
        		                      + "our claim.However, in ABC School, continue to put our honest endeavor to\n"
        		                      + "to achieve even higher recognitions both at home and abroad.Our\n"
        		                      + "commitment providing the best possible academic guidance ever ceases to\n"
        		                      + "bear fruit.We feel greatly elated when we see our students joining foreign\n"
        		                      + "universities for higher education.Surveillance team is active around the\n"
        		                      + "clock to keep the congenial atmosphere ever fresh.Security is another\n"
        		                      + "thing we are concerned always.Our faculty members fare trained by the\n"
        		                      + "British Council experts.The academic council is always grateful to the\n"
        		                      + "school management members for their necessary support and cooperation,\n"
        		                      + "without which success would not have been possible.ABC School assures\n"
        		                      + "the best possible academic service to all.\n"
        		                      + "                                                                                             -Principal,ABC School");
        Title_Bar_3_Txt.setBounds(30, 50, 440, 200);//"Welcome to ABC School",JLabel.CENTER//30, 50, 440, 290
        Title_Bar_3_Txt.setBackground(new Color(135,206,250));//new Color(70,130,180)
        Title_Bar_3_Txt.setFont(font9);
        Title_Bar_3_Txt.setLayout(null);
        Title_Bar_3_Panel.add(Title_Bar_3_Txt);
        
        
        next_Btn = new JButton("NEXT>"); 
        next_Btn.setBounds(425,255,50,25);//335, 163, 110, 40//190, 163, 110, 40
        next_Btn.setFont(font10);
        next_Btn.setBorder(emptyBorder);
        next_Btn.setBackground(new Color(135,206,250)); 
        Title_Bar_3_Panel.add(next_Btn);
        next_Btn.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                dispose();
  				new V_Principals_Message_Page();
            }
        });
        
		setVisible(true);
	}
}
