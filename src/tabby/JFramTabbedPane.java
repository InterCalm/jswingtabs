//Name:Jesse Chhun
//Class:cs536 programming for gis
//assignment:build a small gui interface to switch between 3 different tabs in jswing


package tabby;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.EventListener;
import java.util.Random;
import java.awt.Color;
public class JFramTabbedPane extends JFrame {
  public JFramTabbedPane() {
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        dispose();
        System.exit(0);
      }
    });
//first tab
final JPanel panelDice = new JPanel();
final JPanel imagedice=new JPanel();
panelDice.setLayout(new BorderLayout());
JButton Roll = new JButton("Random Color");
panelDice.add(BorderLayout.SOUTH,Roll);
panelDice.add(BorderLayout.CENTER,imagedice);
Roll.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
		Random Dice = new Random();
			int answer = Dice.nextInt(6) + 1;
			System.out.println(answer);
				if(answer==1)
					imagedice.setBackground(Color.BLACK);
				if(answer==2)
					imagedice.setBackground(Color.BLUE);
				if(answer==3)
					imagedice.setBackground(Color.RED);
				if(answer==4)
					imagedice.setBackground(Color.PINK);
				if(answer==5)
					imagedice.setBackground(Color.CYAN);
				if(answer==6)
					imagedice.setBackground(Color.GREEN);
			}
});
//second tab
JPanel panelMouse = new JPanel();
final JPanel imagemouse = new JPanel();
panelMouse.setLayout(new BorderLayout());
JButton red = new JButton("red");
JButton blue = new JButton("blue");
JButton green = new JButton("green");
JButton yellow = new JButton("yellow");
panelMouse.add(BorderLayout.CENTER,imagemouse);
panelMouse.add(BorderLayout.NORTH,red);
panelMouse.add(BorderLayout.EAST,blue);
panelMouse.add(BorderLayout.WEST,green);
panelMouse.add(BorderLayout.SOUTH,yellow);
red.addMouseListener(new MouseListener(){
	public void mouseMoved(MouseEvent e){
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		imagemouse.setBackground(Color.RED);
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		imagemouse.setBackground(Color.WHITE);
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
});
blue.addMouseListener(new MouseListener(){
	public void mouseMoved(MouseEvent e){
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		imagemouse.setBackground(Color.BLUE);
	}
	@Override
	public void mouseExited(MouseEvent e) {
		imagemouse.setBackground(Color.WHITE);
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}
});
green.addMouseListener(new MouseListener(){
	public void mouseMoved(MouseEvent e){
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		imagemouse.setBackground(Color.GREEN);
	}
	@Override
	public void mouseExited(MouseEvent e) {
		imagemouse.setBackground(Color.WHITE);
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}
});
yellow.addMouseListener(new MouseListener(){
	public void mouseMoved(MouseEvent e){
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		imagemouse.setBackground(Color.YELLOW);
	}
	@Override
	public void mouseExited(MouseEvent e) {
		imagemouse.setBackground(Color.WHITE);
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}
});
// third tab
final JPanel Display = new JPanel();
final JPanel panelTest = new JPanel();
final JPanel listcolors = new JPanel();
panelTest.setLayout(new BorderLayout());
listcolors.setLayout(new GridLayout(3,1));
panelTest.add(BorderLayout.WEST,listcolors);
panelTest.add(BorderLayout.CENTER,Display);
final JRadioButton Red = new JRadioButton("Red",false);
final JRadioButton Blue = new JRadioButton("Blue",false);
final JRadioButton Yellow = new JRadioButton("Yellow",false);
listcolors.add(Red);
listcolors.add(Blue);
listcolors.add(Yellow);
ButtonGroup group = new ButtonGroup();
group.add(Red);
group.add(Blue);
group.add(Yellow);
Red.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
		if (Red.isSelected())
			Display.setBackground(Color.RED);
		else
			Display.setBackground(Color.WHITE);
	}
});
Blue.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e) {
		if (Blue.isSelected())
			Display.setBackground(Color.BLUE);
		else
			Display.setBackground(Color.WHITE);
     }
});
Yellow.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e){
	if (Yellow.isSelected())
		Display.setBackground(Color.YELLOW);
	else
		Display.setBackground(Color.WHITE);
   }
});

JTabbedPane jtp = new JTabbedPane();
    jtp.add("Random Color",panelDice);
    jtp.add("Mouse changing",panelMouse);
    jtp.add("JRadioButtons",panelTest);
    Container contentPane = getContentPane();
    contentPane.add(jtp,"Center");
            }
public static void main(String args[]) {
    JFramTabbedPane f = new JFramTabbedPane();
    f.setTitle("Hi My Name is Tabby!");
    f.setBounds(50,50,400,400);
    f.setVisible(true);
  }
}
