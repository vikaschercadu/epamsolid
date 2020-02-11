package solid;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator implements ActionListener
{
    int c1,n;
    String s1,s2,s3,s4,s5;
    Frame x;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    Panel z;
    TextField t;
    GridLayout g;
    Calculator()
    {
        x = new Frame("My calculator");
	x.setBackground(Color.BLACK);
        z = new Panel();
        x.setLayout(new FlowLayout());
        b1 = new Button("0");
        b1.addActionListener(this);
        b2 = new Button("1");
        b2.addActionListener(this);
        b3 = new Button("2");
        b3.addActionListener(this);
        b4 = new Button("3");
        b4.addActionListener(this);
        b5 = new Button("4");
        b5.addActionListener(this);
        b6 = new Button("5");
        b6.addActionListener(this);
        b7 = new Button("6");
        b7.addActionListener(this);
        b8 = new Button("7");
        b8.addActionListener(this);
        b9 = new Button("8");
        b9.addActionListener(this);
        b10 = new Button("9");
        b10.addActionListener(this);
        b11 = new Button("+");
        b11.addActionListener(this);
        b12 = new Button("-");
        b12.addActionListener(this);
        b13 = new Button("*");
        b13.addActionListener(this);
        b14 = new Button("%");
        b14.addActionListener(this);
        b15 = new Button("=");
        b15.addActionListener(this);
        b16 = new Button("Clear");
        b16.addActionListener(this);
        t = new TextField(20);
        x.add(t);
        g = new GridLayout(4,4,1,1);
        z.setLayout(g);
        z.add(b1);
	z.add(b2);
	z.add(b3);
	z.add(b4);
	z.add(b5);
	z.add(b6);
	z.add(b7);
	z.add(b8);
	z.add(b9);
        z.add(b10);
	z.add(b11);
	z.add(b12);
	z.add(b13);
	z.add(b14);
	z.add(b15);
	z.add(b16);
        x.add(z);
        x.setSize(200,200);
        x.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            s3 = t.getText();
            s4 = "0";
            s5 = s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==b2)
        {
            s3 = t.getText();
            s4 = "1";
            s5 = s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==b3)
        {
            s3 = t.getText();
            s4 = "2";
            s5 = s3+s4;
            t.setText(s5);
        }if(e.getSource()==b4)
        {
            s3 = t.getText();
            s4 = "3";
            s5 = s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==b5)
        {
            s3 = t.getText();
            s4 = "4";
            s5 = s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==b6)
        {
            s3 = t.getText();
            s4 = "5";
            s5 = s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==b7)
        {
            s3 = t.getText();
            s4 = "6";
            s5 = s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==b8)
        {
            s3 = t.getText();
            s4 = "7";
            s5 = s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==b9)
        {
            s3 = t.getText();
            s4 = "8";
            s5 = s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==b10)
        {
            s3 = t.getText();
            s4 = "9";
            s5 = s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==b11)
        {
            s1 = t.getText();
            t.setText("");
            c1=1;

        }
        if(e.getSource()==b12)
        {
            s1 = t.getText();
            t.setText("");
            c1=2;

        }
        if(e.getSource()==b13)
        {
            s1 = t.getText();
            t.setText("");
            c1=3;

        }
        if(e.getSource()==b14)
        {
            s1 = t.getText();
            t.setText("");
            c1=4;

        }
        if(e.getSource()==b15)
        {
            s2 = t.getText();
            if(c1==1)
            {
                n = Integer.parseInt(s1)+Integer.parseInt(s2);
                t.setText(String.valueOf(n));
            }
            else
            if(c1==2)
            {
                n = Integer.parseInt(s1)-Integer.parseInt(s2);
                t.setText(String.valueOf(n));
            }
            else
            if(c1==3)
            {
                n = Integer.parseInt(s1)*Integer.parseInt(s2);
                t.setText(String.valueOf(n));
            }
            if(c1==4)
            {
                n = Integer.parseInt(s1)%Integer.parseInt(s2);
                t.setText(String.valueOf(n));
            }
        }
        if(e.getSource()==b16)
        {
            t.setText("");
        }
    }

    public static void main(String[] args)
    {
        Calculator cal = new Calculator();
    }
}
