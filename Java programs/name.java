import java.awt.event.*;
import java.awt.*;
public class name extends Frame implements ActionListener
{
 TextField tf1;
 Label l1;
 Button b;
 name()
{
 setSize(1000,1000);
 setTitle("My AWT Programs");
 setVisible(true);
 setLayout(null);
 l1=new Label("My Name Is :-");
 l1.setBounds(220,150,100,30);
 tf1=new TextField();
 tf1.setBounds(360,150,250,30);
 b=new Button("Click Me ");
 b.setBounds(290,250,200,30);
 add(l1);
 add(tf1);
 add(b);
 b.addActionListener(this);
 this.addWindowListener(new WindowAdapter()
{public void windowClosing(WindowEvent we){System.exit(0);}});
}

public void actionPerformed (ActionEvent ae)
{
  tf1.setText("Hemanth Reddy");
}
public static void main(String[]args)
{
name n=new name();
}
} 