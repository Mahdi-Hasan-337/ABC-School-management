import javax.swing.*; 
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class V_Principals_Message_Page extends JFrame{
	JPanel Title_Bar_3_Panel,title_Panel,inputPanel;
	JLabel Title_Bar_1_Label,Title_Bar_2_Label,inputLabel,Title_Bar_3_Label;
	JTextArea Title_Bar_3_Txt;
	JButton back_Btn1,back_Btn,next_Btn,min_Btn,close_Btn,reg_Btn,login_Btn,home_Btn,about_Btn,admission_Btn,faculty_Btn,library_Btn;
	
	V_Principals_Message_Page(){
		setSize(500,400);
		setUndecorated(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setLayout(null);
		
		//***************************Border****************************//
        Border emptyBorder = BorderFactory.createEmptyBorder();
       
        //***************************FONTS****************************//
        Font font0 = new Font("Arial",Font.BOLD,25);
        Font font1 = new Font("Arial",Font.BOLD,20);
        Font font2 = new Font("Arial",Font.BOLD,15); 
        Font font3 = new Font("Arial",Font.BOLD,15);
        Font font9 = new Font("Arial",Font.BOLD,12);

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
 			  new Principals_Message_Page();
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
//          	  dispose();
// 			  new Admission2_Page();
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
        
        Title_Bar_3_Label = new JLabel("Vice Principal's Message",JLabel.CENTER);//"Welcome to ABC School",JLabel.CENTER
        Title_Bar_3_Label.setIcon(new ImageIcon("D:\\ECLIPSE PROJECT FOLDER\\My_Project - Copy\\src\\Photos\\001.png"));
        Title_Bar_3_Label.setBounds(0, 5, 500, 40);
        Title_Bar_3_Label.setForeground(new Color(255,255,255));
        //Title_Bar_3_Label.setBackground(Color.RED);//new Color(70,130,180)
        Title_Bar_3_Label.setFont(font0);
        Title_Bar_3_Label.setLayout(null);
        Title_Bar_3_Panel.add(Title_Bar_3_Label);
       
        Title_Bar_3_Txt = new JTextArea("The first step into school is that giant step forward, where children embark\n"
        		                      + "on the great adventure of discovering the wide world outside and the depth\n"
        		                      + "of the world within.The first step into school is that giant step forward,\n"
        		                      + "where children embark on the great adventure of discovering the wide\n"
        		                      + "world outside and the depth of the world within.We, at ABC School believe\n"
        		                      + "that education is a process of awakening individual potential to creative\n"
        		                      + "knowledge, but more importantly enlightening students with the wisdom\n"
        		                      + "that 'individuals' are the atoms that hold tremendous power within to serve\n"
        		                      + "as agents of change and thus are confident that our students,enriched with \n"
        		                      + "a sense of high morality and social responsibility will be makers of a\n"
        		                      + "virtuous society.\n"
        		                      + "                                                                                     -Vice Principal,ABC School");
        Title_Bar_3_Txt.setBounds(30, 50, 440, 200);//"Welcome to ABC School",JLabel.CENTER//30, 50, 440, 290
        Title_Bar_3_Txt.setBackground(new Color(135,206,250));//new Color(70,130,180)
        Title_Bar_3_Txt.setFont(font9);
        Title_Bar_3_Txt.setLayout(null);
        Title_Bar_3_Panel.add(Title_Bar_3_Txt);
        
		setVisible(true);
	}
}