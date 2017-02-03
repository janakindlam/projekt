import javax.swing.*;
import java.awt.*;

public class Kalkulaator {
    //määrab kalkulaatori osad

    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonPoint = new JButton(".");
    JButton buttonEqual = new JButton("=");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonDivide = new JButton("/");
    JButton buttonMultiply = new JButton("*");
    JPanel windowContent = new JPanel ();
    JTextField displayField = new JTextField();


    Kalkulaator(){ //konstrueerib kalkulaatori
        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);
        windowContent.add("North", displayField); //lisa akna ylaserva display osa
        displayField.setBackground(Color.WHITE); //display color
        displayField.setPreferredSize(new Dimension(0,40)); //display suurus


        JPanel pl = new JPanel(); //layout 12 nupuga
        GridLayout gl = new GridLayout(4,4);
        pl.setLayout(gl);
        pl.setPreferredSize(new Dimension(400,300));
        pl.setBackground(Color.lightGray);
        gl.setHgap(8); // veergude vahe
        gl.setVgap(8); // ridade vahe

        pl.add(button1);
        button1.setBackground(Color.CYAN);
        pl.add(button2);
        button2.setBackground(Color.CYAN);
        pl.add(button3);
        button3.setBackground(Color.CYAN);
        pl.add(buttonPlus);
        buttonPlus.setBackground(Color.WHITE);
        pl.add(button4);
        button4.setBackground(Color.CYAN);
        pl.add(button5);
        button5.setBackground(Color.CYAN);
        pl.add(button6);
        button6.setBackground(Color.CYAN);
        pl.add(buttonMinus);
        buttonMinus.setBackground(Color.WHITE);
        pl.add(button7);
        button7.setBackground(Color.CYAN);
        pl.add(button8);
        button8.setBackground(Color.CYAN);
        pl.add(button9);
        button9.setBackground(Color.CYAN);
        pl.add(buttonMultiply);
        buttonMultiply.setBackground(Color.WHITE);
        pl.add(button0);
        button0.setBackground(Color.CYAN);
        pl.add(buttonPoint);
        buttonPoint.setBackground(Color.WHITE);
        pl.add(buttonEqual);
        buttonEqual.setBackground(Color.WHITE);
        pl.add(buttonDivide);
        buttonDivide.setBackground(Color.WHITE);


        windowContent.add("Center", pl);


        JFrame frame = new JFrame("Kalkulaator");
        frame.setContentPane(windowContent);

        frame.pack();

        frame.setVisible(true);
        CalculatorEngine calcEngine = new CalculatorEngine(this);

        button0.addActionListener(calcEngine);
        button1.addActionListener(calcEngine);
        button2.addActionListener(calcEngine);
        button3.addActionListener(calcEngine);
        button4.addActionListener(calcEngine);
        button5.addActionListener(calcEngine);
        button6.addActionListener(calcEngine);
        button7.addActionListener(calcEngine);
        button8.addActionListener(calcEngine);
        button9.addActionListener(calcEngine);

        buttonPoint.addActionListener(calcEngine);
        buttonPlus.addActionListener(calcEngine);
        buttonMinus.addActionListener(calcEngine);
        buttonDivide.addActionListener(calcEngine);
        buttonMultiply.addActionListener(calcEngine);
        buttonEqual.addActionListener(calcEngine);
    }

    public static void main(String[] args) {
        Kalkulaator kalk = new Kalkulaator();
    }

}

