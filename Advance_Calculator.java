package ADVCALCULATOR;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.math.*;
import java.awt.Toolkit;

public class Advance_Calculator {

	private JFrame calculatorframe;
	long FIRST, RESULT;
	double firstnumber, secondnumber, result;
	String answer, operation;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Advance_Calculator window = new Advance_Calculator();
					window.calculatorframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Advance_Calculator() {
		initialize();
	}
	private void initialize() {
		calculatorframe = new JFrame();
		calculatorframe.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\SAINATH\\\\eclipse-workspace\\Advance Calculator Project\\src\\calculator.png"));
		calculatorframe.getContentPane().setBackground(new Color(105, 105, 105));
		calculatorframe.setTitle("Advance Calculator(SAINATH)");
		calculatorframe.setResizable(false);
		calculatorframe.setBounds(100, 100, 475, 485);
		calculatorframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculatorframe.getContentPane().setLayout(null);
		
		JTextArea TextArea = new JTextArea();
		TextArea.setForeground(new Color(0, 0, 255));
		TextArea.setEditable(false);
		TextArea.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		TextArea.setBounds(12, 13, 445, 57);
		calculatorframe.getContentPane().add(TextArea);
		
		JButton Button1 = new JButton("1");
		Button1.setForeground(new Color(0, 0, 128));
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String no1 = TextArea.getText()+ Button1.getText();
				TextArea.setText(no1);
			}
		});
		Button1.setBackground(Color.WHITE);
		Button1.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		Button1.setBounds(89, 348, 65, 40);
		calculatorframe.getContentPane().add(Button1);
		
		JButton Button2 = new JButton("2");
		Button2.setForeground(new Color(0, 0, 128));
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String no2 = TextArea.getText() + Button2.getText();
				TextArea.setText(no2);
			}
		});
		Button2.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		Button2.setBackground(Color.WHITE);
		Button2.setBounds(166, 348, 65, 40);
		calculatorframe.getContentPane().add(Button2);
		
		JButton Button3 = new JButton("3");
		Button3.setForeground(new Color(0, 0, 128));
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String no3 = TextArea.getText() + Button3.getText();
				TextArea.setText(no3);
			}
		});
		Button3.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		Button3.setBackground(Color.WHITE);
		Button3.setBounds(243, 348, 65, 40);
		calculatorframe.getContentPane().add(Button3);
		
		JButton Button4 = new JButton("4");
		Button4.setForeground(new Color(0, 0, 128));
		Button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String no4 = TextArea.getText() + Button4.getText();
				TextArea.setText(no4);
			}
		});
		Button4.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		Button4.setBackground(Color.WHITE);
		Button4.setBounds(320, 348, 65, 40);
		calculatorframe.getContentPane().add(Button4);
		
		JButton Button5 = new JButton("5");
		Button5.setForeground(new Color(0, 0, 128));
		Button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String no5 = TextArea.getText() + Button5.getText();
				TextArea.setText(no5);
			}
		});
		Button5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		Button5.setBackground(Color.WHITE);
		Button5.setBounds(12, 295, 65, 40);
		calculatorframe.getContentPane().add(Button5);
		
		JButton Button6 = new JButton("6");
		Button6.setForeground(new Color(0, 0, 128));
		Button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String no6 = TextArea.getText() + Button6.getText();
				TextArea.setText(no6);
			}
		});
		Button6.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		Button6.setBackground(Color.WHITE);
		Button6.setBounds(89, 295, 65, 40);
		calculatorframe.getContentPane().add(Button6);
		
		JButton Button7 = new JButton("7");
		Button7.setForeground(new Color(0, 0, 128));
		Button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String no7 = TextArea.getText() + Button7.getText();
				TextArea.setText(no7);
			}
		});
		Button7.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		Button7.setBackground(Color.WHITE);
		Button7.setBounds(320, 295, 65, 40);
		calculatorframe.getContentPane().add(Button7);
		
		JButton Button8 = new JButton("8");
		Button8.setForeground(new Color(0, 0, 128));
		Button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String no8 = TextArea.getText() + Button8.getText();
				TextArea.setText(no8);
			}
		});
		Button8.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		Button8.setBackground(Color.WHITE);
		Button8.setBounds(243, 295, 65, 40);
		calculatorframe.getContentPane().add(Button8);
		
		JButton Button9 = new JButton("9");
		Button9.setForeground(new Color(0, 0, 128));
		Button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String no9 = TextArea.getText() + Button9.getText();
				TextArea.setText(no9);
			}
		});
		Button9.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		Button9.setBackground(Color.WHITE);
		Button9.setBounds(166, 295, 65, 40);
		calculatorframe.getContentPane().add(Button9);
		
		JButton Button00 = new JButton("00");
		Button00.setForeground(new Color(0, 0, 128));
		Button00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String no00 = TextArea.getText() + Button00.getText();
				TextArea.setText(no00);
			}
		});
		Button00.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		Button00.setBackground(Color.WHITE);
		Button00.setBounds(243, 401, 65, 40);
		calculatorframe.getContentPane().add(Button00);
		
		JButton Button0 = new JButton("0");
		Button0.setForeground(new Color(0, 0, 128));
		Button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String no0 = TextArea.getText() + Button0.getText();
				TextArea.setText(no0);
			}
		});
		Button0.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		Button0.setBackground(Color.WHITE);
		Button0.setBounds(12, 348, 65, 40);
		calculatorframe.getContentPane().add(Button0);
		
		JButton Buttondot = new JButton(".");
		Buttondot.setForeground(new Color(0, 128, 128));
		Buttondot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nodot = TextArea.getText() + Buttondot.getText();
				TextArea.setText(nodot);
			}
		});
		Buttondot.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		Buttondot.setBackground(Color.WHITE);
		Buttondot.setBounds(320, 401, 65, 40);
		calculatorframe.getContentPane().add(Buttondot);
		
		JButton Buttonclr = new JButton("AC");
		Buttonclr.setForeground(new Color(165, 42, 42));
		Buttonclr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TextArea.setText(null);
			}
		});
		Buttonclr.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		Buttonclr.setBackground(Color.WHITE);
		Buttonclr.setBounds(12, 401, 142, 40);
		calculatorframe.getContentPane().add(Buttonclr);
		
		JButton Buttonx = new JButton("C");
		Buttonx.setForeground(new Color(165, 42, 42));
		Buttonx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String X = null ;
				if(TextArea.getText().length() > 0)
				{
					StringBuilder STR = new StringBuilder(TextArea.getText());
					STR.deleteCharAt(TextArea.getText().length()-1);
					X = STR.toString();
					TextArea.setText(X);
				}
			}
		});
		Buttonx.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		Buttonx.setBackground(Color.WHITE);
		Buttonx.setBounds(166, 401, 65, 40);
		calculatorframe.getContentPane().add(Buttonx);
		
		JButton Buttonadd = new JButton("+");
		Buttonadd.setForeground(new Color(0, 128, 128));
		Buttonadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					firstnumber = Double.parseDouble(TextArea.getText());
					TextArea.setText("");
					operation = "+";
			}
		});
		Buttonadd.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		Buttonadd.setBackground(Color.WHITE);
		Buttonadd.setBounds(320, 242, 65, 40);
		calculatorframe.getContentPane().add(Buttonadd);
		
		JButton Buttonsub = new JButton("-");
		Buttonsub.setForeground(new Color(0, 128, 128));
		Buttonsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					firstnumber = Double.parseDouble(TextArea.getText());
					TextArea.setText("");
					operation = "-";
			}
		});
		Buttonsub.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		Buttonsub.setBackground(Color.WHITE);
		Buttonsub.setBounds(243, 239, 65, 40);
		calculatorframe.getContentPane().add(Buttonsub);
		
		JButton Buttonmul = new JButton("*");
		Buttonmul.setForeground(new Color(0, 128, 128));
		Buttonmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					firstnumber = Double.parseDouble(TextArea.getText());
					TextArea.setText("");
					operation = "*";
			}
		});
		Buttonmul.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		Buttonmul.setBackground(Color.WHITE);
		Buttonmul.setBounds(166, 242, 65, 40);
		calculatorframe.getContentPane().add(Buttonmul);
		
		JButton Buttondiv = new JButton("/");
		Buttondiv.setForeground(new Color(0, 128, 128));
		Buttondiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					firstnumber = Double.parseDouble(TextArea.getText());
					TextArea.setText("");
					operation = "/";
			}
		});
		Buttondiv.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		Buttondiv.setBackground(Color.WHITE);
		Buttondiv.setBounds(89, 242, 65, 40);
		calculatorframe.getContentPane().add(Buttondiv);
		
		JButton Buttonmod = new JButton("mod");
		Buttonmod.setForeground(new Color(165, 42, 42));
		Buttonmod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					firstnumber = Double.parseDouble(TextArea.getText());
					TextArea.setText("");
					operation = "mod";
			}
		});
		Buttonmod.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		Buttonmod.setBackground(Color.WHITE);
		Buttonmod.setBounds(12, 242, 65, 40);
		calculatorframe.getContentPane().add(Buttonmod);
		
		JButton Buttonpow = new JButton("^");
		Buttonpow.setForeground(new Color(0, 128, 128));
		Buttonpow.setToolTipText("num^n");
		Buttonpow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnumber = Double.parseDouble(TextArea.getText());
				TextArea.setText("");
				operation = "^";
			}
		});
		Buttonpow.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		Buttonpow.setBackground(Color.WHITE);
		Buttonpow.setBounds(166, 189, 65, 40);
		calculatorframe.getContentPane().add(Buttonpow);
		
		JButton Buttonroot = new JButton("\u221A");
		Buttonroot.setForeground(new Color(0, 128, 128));
		Buttonroot.setToolTipText("n\u221Anum");
		Buttonroot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnumber = Double.parseDouble(TextArea.getText());
				TextArea.setText("");
				operation = "\u221A";
			}
		});
		Buttonroot.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		Buttonroot.setBackground(Color.WHITE);
		Buttonroot.setBounds(320, 189, 65, 40);
		calculatorframe.getContentPane().add(Buttonroot);
	
		JButton Buttonper = new JButton("%");
		Buttonper.setForeground(new Color(0, 128, 128));
		Buttonper.setToolTipText("num%");
		Buttonper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnumber = Double.parseDouble(TextArea.getText());
				TextArea.setText("");
				operation = "%";
			}
		});
		Buttonper.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		Buttonper.setBackground(Color.WHITE);
		Buttonper.setBounds(397, 189, 60, 40);
		calculatorframe.getContentPane().add(Buttonper);
		
		JButton Buttonfact = new JButton("!");
		Buttonfact.setForeground(new Color(0, 128, 128));
		Buttonfact.setToolTipText("num!");
		Buttonfact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//FirstNumber = Integer.parseInt(TextArea.getText());
				FIRST = Long.parseLong(TextArea.getText());
				TextArea.setText("");
				operation = "!";
			}
		});
		Buttonfact.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		Buttonfact.setBackground(Color.WHITE);
		Buttonfact.setBounds(243, 189, 65, 37);
		calculatorframe.getContentPane().add(Buttonfact);
		
		JButton Buttonncr = new JButton("nCr");
		Buttonncr.setToolTipText("nCr");
		Buttonncr.setForeground(new Color(220, 20, 60));
		Buttonncr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnumber = Double.parseDouble(TextArea.getText());
				TextArea.setText("");
				operation = "nCr";
			}
		});
		Buttonncr.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		Buttonncr.setBackground(Color.WHITE);
		Buttonncr.setBounds(243, 87, 65, 40);
		calculatorframe.getContentPane().add(Buttonncr);
		
		JButton Buttonnpr = new JButton("nPr");
		Buttonnpr.setToolTipText("nPr");
		Buttonnpr.setForeground(new Color(220, 20, 60));
		Buttonnpr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnumber = Double.parseDouble(TextArea.getText());
				TextArea.setText("");
				operation = "nPr";
			}
		});
		Buttonnpr.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		Buttonnpr.setBackground(Color.WHITE);
		Buttonnpr.setBounds(320, 87, 65, 40);
		calculatorframe.getContentPane().add(Buttonnpr);
		
		JButton Buttonlog = new JButton("log()");
		Buttonlog.setForeground(new Color(220, 20, 60));
		Buttonlog.setToolTipText("logbase(num)");
		Buttonlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(TextArea.getText());
				TextArea.setText("");
				operation = "log()";
			}
		});
		Buttonlog.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		Buttonlog.setBackground(Color.WHITE);
		Buttonlog.setBounds(397, 87, 60, 40);
		calculatorframe.getContentPane().add(Buttonlog);
		
		JButton Buttonln = new JButton("ln()");
		Buttonln.setForeground(new Color(50, 205, 50));
		Buttonln.setToolTipText("ln(num)");
		Buttonln.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextArea.setText("");
				operation = "ln()";
			}
		});
		Buttonln.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		Buttonln.setBackground(Color.WHITE);
		Buttonln.setBounds(397, 242, 60, 40);
		calculatorframe.getContentPane().add(Buttonln);
		
		JButton Buttonsin = new JButton("sin");
		Buttonsin.setForeground(new Color(255, 69, 0));
		Buttonsin.setToolTipText("sin(num)");
		Buttonsin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextArea.setText("");
				operation = "sin()";
			}
		});
		Buttonsin.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		Buttonsin.setBackground(Color.WHITE);
		Buttonsin.setBounds(12, 136, 65, 40);
		calculatorframe.getContentPane().add(Buttonsin);
		
		JButton Buttoncos = new JButton("cos");
		Buttoncos.setForeground(new Color(255, 69, 0));
		Buttoncos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextArea.setText("");
				operation = "cos()";
			}
		});
		Buttoncos.setToolTipText("cos(num)");
		Buttoncos.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		Buttoncos.setBackground(Color.WHITE);
		Buttoncos.setBounds(89, 136, 65, 40);
		calculatorframe.getContentPane().add(Buttoncos);
		
		JButton Buttontan = new JButton("tan");
		Buttontan.setForeground(new Color(255, 69, 0));
		Buttontan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextArea.setText("");
				operation = "tan()";
			}
		});
		Buttontan.setToolTipText("tan(num)");
		Buttontan.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		Buttontan.setBackground(Color.WHITE);
		Buttontan.setBounds(320, 138, 65, 40);
		calculatorframe.getContentPane().add(Buttontan);
		
		JButton Buttoncot = new JButton("cot");
		Buttoncot.setForeground(new Color(255, 69, 0));
		Buttoncot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextArea.setText("");
				operation = "cot()";
			}
		});
		Buttoncot.setToolTipText("cot(num)");
		Buttoncot.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		Buttoncot.setBackground(Color.WHITE);
		Buttoncot.setBounds(166, 136, 65, 40);
		calculatorframe.getContentPane().add(Buttoncot);
		
		JButton Buttonsec = new JButton("sec");
		Buttonsec.setForeground(new Color(255, 69, 0));
		Buttonsec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextArea.setText("");
				operation = "sec()";
			}
		});
		Buttonsec.setToolTipText("sec(num)");
		Buttonsec.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		Buttonsec.setBackground(Color.WHITE);
		Buttonsec.setBounds(243, 136, 65, 40);
		calculatorframe.getContentPane().add(Buttonsec);
		
		JButton Buttoncosec = new JButton("csc");
		Buttoncosec.setForeground(new Color(255, 69, 0));
		Buttoncosec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextArea.setText("");
				operation = "csc()";
			}
		});
		Buttoncosec.setToolTipText("cosec(num)");
		Buttoncosec.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		Buttoncosec.setBackground(Color.WHITE);
		Buttoncosec.setBounds(397, 136, 60, 40);
		calculatorframe.getContentPane().add(Buttoncosec);
		
		JButton Buttonmulinv = new JButton("1/x");
		Buttonmulinv.setForeground(new Color(165, 42, 42));
		Buttonmulinv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextArea.setText("");
				operation = "1/x";
			}
		});
		Buttonmulinv.setToolTipText("1/num");
		Buttonmulinv.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		Buttonmulinv.setBackground(Color.WHITE);
		Buttonmulinv.setBounds(12, 189, 65, 40);
		calculatorframe.getContentPane().add(Buttonmulinv);
		
		JButton Buttonexp = new JButton("exp");
		Buttonexp.setForeground(new Color(165, 42, 42));
		Buttonexp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(TextArea.getText());
				TextArea.setText("");
				operation = "exp";
			}
		});
		Buttonexp.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		Buttonexp.setBackground(Color.WHITE);
		Buttonexp.setBounds(89, 189, 65, 40);
		calculatorframe.getContentPane().add(Buttonexp);
		
		JButton Buttonbin = new JButton("bin");
		Buttonbin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FIRST = Long.parseLong(TextArea.getText());
				TextArea.setText("");
				operation = "bin";
			}
		});
		Buttonbin.setToolTipText("Binary");
		Buttonbin.setForeground(new Color(153, 50, 204));
		Buttonbin.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		Buttonbin.setBackground(Color.WHITE);
		Buttonbin.setBounds(166, 87, 65, 40);
		calculatorframe.getContentPane().add(Buttonbin);
		
		JButton Buttonoct = new JButton("oct");
		Buttonoct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FIRST = Long.parseLong(TextArea.getText());
				TextArea.setText("");
				operation = "oct";
			}
		});
		Buttonoct.setToolTipText("Octal");
		Buttonoct.setForeground(new Color(153, 50, 204));
		Buttonoct.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		Buttonoct.setBackground(Color.WHITE);
		Buttonoct.setBounds(89, 87, 65, 40);
		calculatorframe.getContentPane().add(Buttonoct);
		
		JButton Buttonhex = new JButton("hex");
		Buttonhex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FIRST = Long.parseLong(TextArea.getText());
				TextArea.setText("");
				operation = "hex";
			}
		});
		Buttonhex.setToolTipText("HexaDecimal");
		Buttonhex.setForeground(new Color(153, 50, 204));
		Buttonhex.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		Buttonhex.setBackground(Color.WHITE);
		Buttonhex.setBounds(12, 87, 65, 40);
		calculatorframe.getContentPane().add(Buttonhex);
		
		JButton Buttonequal = new JButton("=");
		Buttonequal.setForeground(new Color(0, 128, 128));
		Buttonequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(operation == "%")
				{
					result = firstnumber/100;
					answer = String.format("%.4f",result);
					TextArea.setText(answer);
				}
				if(operation == "!")
				{
					long count = 1;

					for(long i = 1; i <= FIRST; i++)
					{
						count = count * i;
					}
					RESULT = count;
					answer = String.format("%d",RESULT);
					TextArea.setText(answer);
				}
				if(operation == "ln()")
				{
					firstnumber = Double.parseDouble(TextArea.getText());
					result = Math.log(firstnumber);
					answer = String.format("%.4f",result);
					TextArea.setText(answer);
				}
				if(operation == "sin()")
				{
					firstnumber = Double.parseDouble(TextArea.getText());
					double radian = Math.toRadians(firstnumber);
					result = Math.sin(radian);
					answer = String.format("%.8f",result);
					TextArea.setText(answer);
				}
				if(operation == "cos()")
				{
					firstnumber = Double.parseDouble(TextArea.getText());
					double radian = Math.toRadians(firstnumber);
					result = Math.cos(radian);
					answer = String.format("%.8f",result);
					TextArea.setText(answer);
				}
				if(operation == "tan()")
				{
					firstnumber = Double.parseDouble(TextArea.getText());
					double radian = Math.toRadians(firstnumber);
					result = Math.tan(radian);
					answer = String.format("%.8f", result);
					TextArea.setText(answer);
				}
				if(operation == "cot()")
				{
					firstnumber = Double.parseDouble(TextArea.getText());
					double radian = Math.toRadians(firstnumber);
					result = 1 / Math.tan(radian);
					answer = String.format("%.8f",result);
					TextArea.setText(answer);
				}
				if(operation == "sec()")
				{
					firstnumber = Double.parseDouble(TextArea.getText());
					double radian = Math.toRadians(firstnumber);
					result = 1 / Math.cos(radian);
					answer = String.format("%.8f",result);
					TextArea.setText(answer);
				}
				if(operation == "csc()")
				{
					firstnumber = Double.parseDouble(TextArea.getText());
					double radian = Math.toRadians(firstnumber);
					result = 1 / Math.sin(radian);
					answer = String.format("%.8f",result);
					TextArea.setText(answer);
				}
				if(operation == "1/x")
				{
					firstnumber = Double.parseDouble(TextArea.getText());
					result = 1 / firstnumber;
					answer = String.format("%.8f",result);
					TextArea.setText(answer);
				}
				if(operation == "bin")
				{
					answer = Long.toBinaryString(FIRST);
					TextArea.setText(answer);					
				}
				if(operation == "oct")
				{
					answer = Long.toOctalString(FIRST);
					TextArea.setText(answer);
				}
				if(operation == "hex")
				{
					answer = Long.toHexString(FIRST);
					TextArea.setText(answer);
				}
				secondnumber = Double.parseDouble(TextArea.getText());
				if(operation == "+")
				{	result = firstnumber + secondnumber ;
					answer = String.format("%.4f", result);
					TextArea.setText(answer);
				}
				if(operation == "-")
				{
					result = firstnumber - secondnumber ;
					answer = String.format("%.4f", result);
					TextArea.setText(answer);
				}
				if(operation == "*") {
					result = firstnumber * secondnumber ;
					answer = String.format("%.4f", result);
					TextArea.setText(answer);
				}
				if(operation == "/")
				{
					result = firstnumber / secondnumber ;
					answer = String.format("%.4f", result);
					TextArea.setText(answer);
				}
				if(operation == "mod")
				{
					result = firstnumber % secondnumber ;
					answer = String.format("%.4f", result);
					TextArea.setText(answer);
				}
				if(operation == "^")
				{
					result = Math.pow(firstnumber, secondnumber);
					answer = String.format("%.4f",result);
					TextArea.setText(answer);
				}
				if(operation == "\u221A")
				{
					secondnumber = 1 / secondnumber;
					result = Math.pow(firstnumber, secondnumber);
					answer = String.format("%.4f",result);
					TextArea.setText(answer);
				}
				if(operation == "nCr")
				{
					double count1 = 1, count2 = 1, count3 = 1;
					double subv = firstnumber - secondnumber;
					
					for(double i = 1; i <= firstnumber; i++)
					{
						count1 = count1 * i;
					}
					for(double  i = 1; i <= secondnumber; i++)
					{
						count2 = count2 * i;
					}
					for(double i = 1; i <= subv; i++)
					{
						count3 = count3 * i;
					}
					double slv1 = count2 * count3;
					double slv2 = count1 / slv1;
					result = slv2;
					answer = String.format("%.4f",result);
					TextArea.setText(answer);
				}
				if(operation == "nPr")
				{
					double count1 = 1, count2 = 1, subv = firstnumber - secondnumber;
					for(double i = 1; i <= firstnumber; i++)
					{
						count1 = count1 * i;
					}
					for(double i = 1; i <= subv; i++)
					{
						count2 = count2 * i;
					}
					result = count1 / count2;
					answer = String.format("%.4f",result);
					TextArea.setText(answer);
				}
				if(operation == "log()")
				{
					result = (int)(Math.log(firstnumber)/Math.log(secondnumber));
					answer = String.format("%.4f",result);
					TextArea.setText(answer);
				}
				if(operation == "exp")
				{
					result = firstnumber * Math.pow(10, secondnumber);
					answer = String.format("%.4f",result);
					TextArea.setText(answer);
				}
			}
		});
		Buttonequal.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		Buttonequal.setBackground(Color.WHITE);
		Buttonequal.setBounds(397, 295, 60, 146);
		calculatorframe.getContentPane().add(Buttonequal);
	}
}