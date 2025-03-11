import java.awt.event.*;
import java.awt.*;
class sumapp extends Frame implements ActionListener
{
 TextField tf1,tf2,tf3;
 Label l1,l2,l3;
 Button b;
 sumapp()
{
 setSize(500,500);
 setTitle("sum");
 setVisible(true);
 setLayout(null);
 l1=new Label("first number");
 l1.setBounds(10,50,100,30);
 tf1=new TextField();
 tf1.setBounds(150,50,240,30);
 l2=new Label("second number:");
 l2.setBounds(10,100,100,30);
 tf2=new TextField();
 tf2.setBounds(150,100,250,30);
 tf3=new TextField();
 tf3.setBounds(10,250,250,30);
 b=new Button("submit to find sum ");
 b.setBounds(150,150,200,30);
 l3=new Label();
 l3.setBounds(10,200,300,30);
 add(l1);
 add(l2);
 add(l3);
 add(tf1);
 add(tf2);
 add(tf3);
 add(b);
 b.addActionListener(this);
 this.addWindowListener(new WindowAdapter()
{public void windowClosing(WindowEvent we){System.exit(0);}});
}

public void actionPerformed(ActionEvent ae)
{
 int n1=Integer.parseInt(tf1.getText());
 int n2=Integer.parseInt(tf2.getText());
 int r=n1+n2;
 String s1=Integer.toString(r);
 l3.setText("Sum is"+s1);
 tf3.setText(s1);
}

public static void main(String[] arg)
{
 sumapp s1=new sumapp();
 }
}


