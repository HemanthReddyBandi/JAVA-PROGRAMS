import java.awt.*;
import java.awt.event.*;

class AwtFunctions extends Frame implements ActionListener {

    TextField tf1;
    Label l1, l2, l3, l4, l5, l6, l7, l8;
    Button b;
    Choice ch;
    List ls;
    Checkbox c1, c2, c3;

    AwtFunctions() {
        setSize(600, 600);
        setTitle("MY AWT PROGRAMS");
        setVisible(true);
        setLayout(null);

        l1 = new Label("MY NAME IS:-");
        l1.setBounds(100, 100, 140, 30);

        tf1 = new TextField("HEMANTH REDDY");
        tf1.setBounds(250, 100, 150, 60);

        l2 = new Label("SELECT THE PROGRAMMING LANGUAGE:-");
        l2.setBounds(100, 200, 300, 40);

        c1 = new Checkbox("java");
        c1.setBounds(200, 230, 100, 30);

        c2 = new Checkbox("c++");
        c2.setBounds(200, 260, 100, 30);

        c3 = new Checkbox("python");
        c3.setBounds(200, 290, 100, 30);

        l3 = new Label("SELECT STATE:-");
        l3.setBounds(100, 320, 140, 40);

        ls = new List();
        ls.setBounds(200, 370, 200, 40);
        ls.add("AP");
        ls.add("CHENNAI");
        ls.add("BENGALURU");
        ls.add("TELANGANA");

        l4 = new Label("SELECT COUNTRY");
        l4.setBounds(100, 400, 150, 40);

        ch = new Choice();
        ch.setBounds(200, 450, 140, 40);
        ch.add("INDIA");
        ch.add("AUSTRALIA");
        ch.add("AMERICA");

        b = new Button("SUBMIT");
        b.setBounds(400, 500, 150, 50);

        l5 = new Label();
        l5.setBounds(100, 480, 300, 30);

        l6 = new Label();
        l6.setBounds(100, 500, 300, 30);

        l7 = new Label();
        l7.setBounds(100, 520, 300, 30);

        l8 = new Label();
        l8.setBounds(100, 550, 300, 30);

        add(l1);
        add(tf1);
        add(l2);
        add(c1);
        add(c2);
        add(c3);
        add(l3);
        add(ls);
        add(l4);
        add(ch);
        add(b);
        add(l5);
        add(l6);
        add(l7);
        add(l8);

        b.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        l5.setText("YOUR NAME IS: " + tf1.getText());

        String s = "";

        if (c1.getState() == true)
            s+= c1.getLabel() + " ";

        if (c2.getState() == true)
            s+= c2.getLabel() + " ";

        if (c3.getState() == true)
            s+= c3.getLabel() + " ";

        l6.setText("SELECTED LANGUAGES ARE: " + s);

        l7.setText("SELECTED STATES ARE: " + ls.getSelectedItem() + " " + ls.getItemCount());

        l8.setText("SELECTED COUNTRIES ARE: " + ch.getSelectedItem() + " " + ch.getItemCount());
    }

    public static void main(String[] args) {
        AwtFunctions obj = new AwtFunctions();
    }
}

