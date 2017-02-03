import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;



    public class CalculatorEngine implements ActionListener {

        Kalkulaator parent; //viitab Kalkulaatorile
        char selectedAction = ' '; // +, -, / või *
        double currentResult = 0; // viide meelde

        CalculatorEngine(Kalkulaator parent) {
            this.parent = parent;

        }
        public void actionPerformed(ActionEvent e) {

            JButton clickedButton = (JButton) e.getSource();
            String dispFieldText = parent.displayField.getText();

            double displayValue = 0; // otsi selle välja number kui pole tühi

            if (!"".equals(dispFieldText)) {
                displayValue = Double.parseDouble(dispFieldText);
            }
            Object src = e.getSource();

            if (src == parent.buttonPlus) {
                selectedAction = '+';
                currentResult = displayValue;
                parent.displayField.setText("");
            } else if (src == parent.buttonMinus) {
                selectedAction = '-';
                currentResult = displayValue;
                parent.displayField.setText("");
            } else if (src == parent.buttonDivide) {
                selectedAction = '/';
                currentResult = displayValue;
                parent.displayField.setText("");
            } else if (src == parent.buttonMultiply) {
                selectedAction = '*';
                currentResult =displayValue;
                parent.displayField.setText("");
            } else if (src == parent.buttonEqual) {
                if (selectedAction == '+') {
                    currentResult +=displayValue; //x=x+y
                    parent.displayField.setText(""+currentResult);
                } else if (selectedAction=='-'){
                    currentResult -=displayValue; //x=x-y
                    parent.displayField.setText(""+currentResult);
                } else if (selectedAction=='/'){
                    currentResult /=displayValue; //x=x/y
                    parent.displayField.setText(""+currentResult);
                } else if (selectedAction=='*'){
                    currentResult *=displayValue; //x=x*y
                    parent.displayField.setText(""+currentResult);
                }
            } else {

                String clickedButtonLabel = clickedButton.getText();
                parent.displayField.setText(dispFieldText + clickedButtonLabel);

            }
        }
    }



