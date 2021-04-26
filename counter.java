import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter implements ActionListener {
  JLabel leftlabel;
  JLabel rightlabel;
  int leftCount = 0;
  int rightCount = 0;

  Counter() {
    JFrame frame = new JFrame("Let's Count");
    frame.setLayout(new FlowLayout());
    frame.setSize(200,110);

    JButton left = new JButton("left");
    JButton right = new JButton("right");


    left.addActionListener(this);
    right.addActionListener(this);    

    frame.add(left);
    frame.add(right);

    leftlabel = new JLabel("Count");

    rightlabel = new JLabel("Count");

    frame.add(leftlabel);
    frame.add(rightlabel);   

    JButton reset = new JButton("Reset");

    reset.addActionListener(this);

    frame.add(reset);
    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {
    if(ae.getActionCommand().equals("left")) {
	    ++count;
    }
    else(ae.getActionCommand().equals("right")) {    
	    --count;
    }
    else (ae.getActionCommand().equals("reset")) {

    }
  }