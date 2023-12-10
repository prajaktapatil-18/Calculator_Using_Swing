import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorSwing extends JFrame {

    public CalculatorSwing() {


        JLabel label = new JLabel("First Number :");
        label.setBounds(50, 50, 100, 30);
        add(label);

        JLabel label2 = new JLabel("Second number :");
        label2.setBounds(50, 100, 100, 30);
        add(label2);


        JTextField textField1 = new JTextField();
        textField1.setBounds(150, 50, 100, 30);
        add(textField1);

        JTextField textField2 = new JTextField();
        textField2.setBounds(150, 100, 100, 30);
        add(textField2);


        JButton buttonAdd = new JButton("ADD");
        buttonAdd.setBounds(40, 200, 80, 30);
        buttonAdd.setBackground(Color.WHITE);
        add(buttonAdd);


        JButton buttonSub = new JButton("SUB");
        buttonSub.setBounds(110, 200, 80, 30);
        buttonSub.setBackground(Color.WHITE);
        add(buttonSub);


        JButton buttonMul = new JButton("MUL");
        buttonMul.setBounds(190, 200, 80, 30);
        buttonMul.setBackground(Color.WHITE);
        add(buttonMul);


        JButton buttonDiv = new JButton("DIV");
        buttonDiv.setBounds(270, 200, 80, 30);
        buttonDiv.setBackground(Color.WHITE);
        add(buttonDiv);

        JLabel label3 = new JLabel("");
        label3.setBounds(110, 250, 300, 30);
        add(label3);


        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int n1 = Integer.parseInt(textField1.getText());
                int n2 = Integer.parseInt(textField2.getText());
                int add = n1 + n2;
                label3.setText("additon of" + n1 + "and " + n2 + "is" + add);

            }
        });


        buttonSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int n1 = Integer.parseInt(textField1.getText());
                int n2 = Integer.parseInt(textField2.getText());
                int sub = n1 - n2;
                label3.setText("substraction of " + n1 + "and " + n2 + "is " + sub);

            }
        });

        buttonMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int n1 = Integer.parseInt(textField1.getText());
                int n2 = Integer.parseInt(textField2.getText());
                int mul = n1 * n2;
                label3.setText("multiplication of " + n1 + " and " + n2 + " is " + mul);

            }
        });


        buttonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int n1 = Integer.parseInt(textField1.getText());
                int n2 = Integer.parseInt(textField2.getText());
                int div = n1 / n2;
                label3.setText("division of " + n1 + "and " + n2 + "is " + div);

            }
        });


        setLayout(null);
        setTitle("Calculator");
        getContentPane().setBackground(Color.CYAN);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorSwing();
    }


}