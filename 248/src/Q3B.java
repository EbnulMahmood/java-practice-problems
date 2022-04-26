

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q3B {
    JFrame jf;
    JPanel jp;
    JButton btn1, btn2,btn3, btn4, btn5, btn6, btn7, btn9, btn8;

    Q3B(){
        jf= new JFrame("TicTocToe");
        jf.setSize(300,300);
        jf.setLocation(300,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //jf.setLayout(null);

        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        btn4 = new JButton();
        btn5 = new JButton();
        btn6 = new JButton();
        btn7 = new JButton();
        btn8 = new JButton();
        btn9 = new JButton();

        jp= new JPanel(new GridLayout(3,3));

        jp.add(btn1);
        jp.add(btn2);
        jp.add(btn3);
        jp.add(btn4);
        jp.add(btn5);
        jp.add(btn6);
        jp.add(btn7);
        jp.add(btn8);
        jp.add(btn9);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn1.setText("X");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn2.setText("X");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn3.setText("X");
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn4.setText("X");
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn5.setText("X");
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn6.setText("X");
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn7.setText("X");
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn8.setText("X");
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn9.setText("X");
            }
        });

        jf.add(jp);
        jf.setVisible(true);

    }


    public static void main(String[] args) {
        new Q3B();
    }
}
