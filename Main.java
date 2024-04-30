//I GOT HELP FROM BRO CODE YOUTUBE CHANNEL!!!

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static char operator;
    static double x=0 , y=0 , result=0;
    public static void main(String[] args) {

        //making a font for calculator
        Font myFont = new Font("Ink Free",Font.BOLD,30);

        //making a frame
        JFrame frame = new JFrame();
        frame.setSize(400,627);
        frame.setTitle("CALCULATOR");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocation(550,100);

        //making a textField on first panel
        JPanel firstPanel = new JPanel();
        firstPanel.setLayout(null);
        firstPanel.setBounds(0,0,400,120);
        firstPanel.setBackground(Color.GRAY);

        JTextField display = new JTextField();
        display.setBounds(100 , 30 , 200 , 60);
        display.setFont(myFont);
        frame.add(firstPanel);

        //making numbers buttons and operator buttons +/-/%/*/=/./(-) on second panel
        JPanel secondPanel = new JPanel();
        secondPanel.setLayout(new GridLayout(4 ,4 ));
        secondPanel.setBackground(Color.GRAY);
        secondPanel.setBounds(0 , 120 , 400 , 380);

        JButton addButton = new JButton("+");
        addButton.setFont(myFont);
        JButton subButton = new JButton("-");
        subButton.setFont(myFont);
        JButton mulButton = new JButton("*");
        mulButton.setFont(myFont);
        JButton divButton = new JButton("/");
        divButton.setFont(myFont);
        JButton clrButton = new JButton("clear");
        clrButton.setFont(myFont);
        JButton delButton = new JButton("delete");
        delButton.setFont(myFont);
        JButton equButton = new JButton("=");
        equButton.setFont(myFont);
        JButton negButton = new JButton("(-)");
        negButton.setFont(myFont);
        JButton decButton = new JButton(".");
        decButton.setFont(myFont);

        JButton[] number = new JButton[10];
        for (int i = 0; i <  10 ; i++) {
            number[i] = new JButton(String.valueOf(i));
            number[i].setFont(myFont);
        }

        secondPanel.add(number[1]);
        secondPanel.add(number[2]);
        secondPanel.add(number[3]);
        secondPanel.add(addButton);
        secondPanel.add(number[4]);
        secondPanel.add(number[5]);
        secondPanel.add(number[6]);
        secondPanel.add(subButton);
        secondPanel.add(number[7]);
        secondPanel.add(number[8]);
        secondPanel.add(number[9]);
        secondPanel.add(mulButton);
        secondPanel.add(decButton);
        secondPanel.add(number[0]);
        secondPanel.add(negButton);
        secondPanel.add(divButton);
        frame.add(secondPanel);

        //making third panel and delete and clear button on it
        JPanel thirdPanel = new JPanel();
        thirdPanel.setLayout(new GridLayout(1 , 3));
        thirdPanel.setBounds(0 , 500 , 400, 100);
        thirdPanel.setBackground(Color.GRAY);
        thirdPanel.add(delButton);
        thirdPanel.add(clrButton);
        thirdPanel.add(equButton);
        frame.add(thirdPanel);

        //action listener of numbers and negative and decimal
        number[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText().concat(String.valueOf(0)));
            }
        });
        number[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText().concat(String.valueOf(1)));
            }
        });
        number[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText().concat(String.valueOf(2)));
            }
        });
        number[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText().concat(String.valueOf(3)));
            }
        });
        number[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText().concat(String.valueOf(4)));
            }
        });
        number[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText().concat(String.valueOf(5)));
            }
        });
        number[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText().concat(String.valueOf(6)));
            }
        });
        number[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText().concat(String.valueOf(7)));
            }
        });
        number[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText().concat(String.valueOf(8)));
            }
        });
        number[9].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText().concat(String.valueOf(9)));
            }
        });
        decButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText().concat(String.valueOf(".")));
            }
        });
        negButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String negative = "-";
                display.setText(negative.concat(display.getText()));
            }
        });

        //action lister of operators

        clrButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
            }
        });

        delButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String string1 = display.getText();
                String string2 = "";
                for ( int i = 0 ; i < string1.length() - 1; i++){
                    string2=string2.concat(String.valueOf(string1.charAt(i)));
                }
                display.setText("");
                display.setText(string2);
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = '+';
                x =  Double.valueOf(display.getText());
                display.setText("");
            }
        });

        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = '-';
                x =  Double.valueOf(display.getText());
                display.setText("");
            }
        });

        mulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = '*';
                x =  Double.valueOf(display.getText());
                display.setText("");
            }
        });

        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = '/';
                x =  Double.valueOf(display.getText());
                display.setText("");
            }
        });

        equButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch(operator){
                    case('+'):
                        y = Double.valueOf(display.getText());
                        result = x + y;
                        display.setText("");
                        display.setText(String.valueOf(result));
                        break;

                    case('-'):
                        y = Double.valueOf(display.getText());
                        result = x - y;
                        display.setText("");
                        display.setText(String.valueOf(result));
                        break;

                    case('*'):
                        y = Double.valueOf(display.getText());
                        result = x * y;
                        display.setText("");
                        display.setText(String.valueOf(result));
                        break;

                    case('/'):
                        y = Double.valueOf(display.getText());
                        result = x / y;
                        display.setText("");
                        display.setText(String.valueOf(result));
                        break;
                }
            }
        });

        //make frame visible
        firstPanel.add(display);
        frame.setVisible(true);

    }
}