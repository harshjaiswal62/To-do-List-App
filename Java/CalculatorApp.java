import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp extends Frame implements ActionListener {
    private TextField numField1, numField2, resultField;
    private Button addButton, subButton, mulButton, divButton;

    public CalculatorApp() {
        // Set layout manager
        setLayout(new FlowLayout());

        // Create text fields
        numField1 = new TextField(10);
        numField2 = new TextField(10);
        resultField = new TextField(15);
        resultField.setEditable(false); // Make result field read-only

        // Create buttons
        addButton = new Button("Add");
        subButton = new Button("Subtract");
        mulButton = new Button("Multiply");
        divButton = new Button("Divide");

        // Add components to the frame
        add(new Label("Number 1: "));
        add(numField1);
        add(new Label("Number 2: "));
        add(numField2);
        add(new Label("Result: "));
        add(resultField);
        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);

        // Register event listeners
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);

        // Set frame properties
        setTitle("Simple Calculator");
        setSize(300, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(numField1.getText());
            int num2 = Integer.parseInt(numField2.getText());
            int result = 0;

            if (e.getSource() == addButton) {
                result = num1 + num2;
            } else if (e.getSource() == subButton) {
                result = num1 - num2;
            } else if (e.getSource() == mulButton) {
                result = num1 * num2;
            } else if (e.getSource() == divButton) {
                result = num1 / num2;
            }

            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException | ArithmeticException ex) {
            resultField.setText("Error");
        }
    }

    public static void main(String[] args) {
        new CalculatorApp();
    }
}
