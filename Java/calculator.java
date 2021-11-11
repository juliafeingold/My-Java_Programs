package as18;

public class Main {

	public static void main(String[] args) {
		JFrameExt f = new JFrameExt();
		f.setSize(600, 200 );
		f.setVisible(true);
	}

}

package as18;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrameExt extends JFrame 
						implements ActionListener {
	private JPanel jpMain = new JPanel();
	private JPanel jp1 = new JPanel();
	private JPanel jp2 = new JPanel();
	private JPanel jp3 = new JPanel();
	private JPanel jp4 = new JPanel();
	private JLabel jlbNum1 = new JLabel("Number 1");
	private JLabel jlbNum2 = new JLabel("Number 2");
	private JLabel jlbRes = new JLabel("Result  ");
	private JTextField jtfNum1 = new JTextField(10);
	private JTextField jtfNum2 = new JTextField(10);
	private JTextField jtfRes = new JTextField(10);
	private JButton jbtAdd = new JButton("Add");
	private JButton jbtSub = new JButton("Sub");
	private JButton jbtMult = new JButton("Mult");
	private JButton jbtDiv = new JButton("Div");
	private JButton jbtClear = new JButton("Clear");
	private JMenuBar jmb = new JMenuBar();
	private JMenu jmuOp = new JMenu("Operations");
	private JMenu jmuMisc = new JMenu("Miscellaneous");
	private JMenuItem jmiAdd = new JMenuItem("Add");
	private JMenuItem jmiSub = new JMenuItem("Sub");
	private JMenuItem jmiMult = new JMenuItem("Mult");
	private JMenuItem jmiDiv = new JMenuItem("Div");
	private JMenuItem jmiClear = new JMenuItem("Clear");
	
	public JFrameExt() {
		//jpMain.setBackground(Color.green);
		this.setContentPane(jpMain);
		
		//create a grid layout method
		GridLayout gl = new GridLayout(4,1);
		
		//set jpMain's layout manager
		jpMain.setLayout(gl);
		jpMain.add(jp1);
		jpMain.add(jp2);
		jpMain.add(jp3);
		jpMain.add(jp4);
		jp1.setBackground(Color.green);
		jp2.setBackground(Color.red);
		jp3.setBackground(Color.cyan);
		jp4.setBackground(Color.magenta);
		jp1.add(jlbNum1);
		jp1.add(jtfNum1);
		jp2.add(jlbNum2);
		jp2.add(jtfNum2);
		jp3.add(jlbRes);
		jp3.add(jtfRes);
		jp4.add(jbtAdd);
		jp4.add(jbtSub);
		jp4.add(jbtMult);
		jp4.add(jbtDiv);
		jp4.add(jbtClear);
		jtfRes.setEditable(false);
		jmb.add(jmuOp);
		jmb.add(jmuMisc);
		jmuOp.add(jmiAdd);
		jmuOp.add(jmiSub);
		jmuOp.add(jmiDiv);
		jmuOp.add(jmiMult);
		jmuMisc.add(jmiClear);
		this.setJMenuBar(jmb);
		
		//register with buttons
		jbtAdd.addActionListener(this);
		jbtSub.addActionListener(this);
		jbtMult.addActionListener(this);
		jbtDiv.addActionListener(this);
		jbtClear.addActionListener(this);
		
		//register with meny items
		jmiAdd.addActionListener(this);
		jmiSub.addActionListener(this);
		jmiMult.addActionListener(this);
		jmiDiv.addActionListener(this);
		jmiClear.addActionListener(this);	
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		
		
		if (ev.getSource() == jbtClear ||
			ev.getSource() == jmiClear) {
			
			jtfNum1.setText("");
			jtfNum2.setText("");
			jtfRes.setText("");
			
			return;
		}
		
		String sNum1 = jtfNum1.getText().trim();
		String sNum2 = jtfNum1.getText().trim();
		double num1 = Double.parseDouble(sNum1);
		double num2 = Double.parseDouble(sNum2);
		double res = 0;
		
		if (ev.getSource() == jbtAdd || 
			ev.getSource() == jmiAdd) {
			
			res = num1 + num2;
		}
		else if (ev.getSource() == jbtSub || 
				 ev.getSource() == jmiSub) {	
			
			res = num1 - num2;
		}
		else if (ev.getSource() == jbtMult || 
				 ev.getSource() == jmiMult) {		
			
			res = num1 * num2;
		}
		else if (ev.getSource() == jbtDiv || 
			     ev.getSource() == jmiDiv) {	
			
			res = num1 / num2;	
		}
		jtfRes.setText("" + res);
	}
}