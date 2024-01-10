import java.awt.*;

public class SignUpForm extends Frame {
    private TextField userIdField, passwordField, retypePasswordField, mobileField, emailField;

    public SignUpForm() {
        // Set frame properties
        setSize(400, 300);
        setTitle("Sign Up Form");

        // Create layout
        setLayout(new GridLayout(7, 2, 10, 10));

        // Create labels and text fields
        Label userIdLabel = new Label("User ID:");
        userIdField = new TextField();
        Label passwordLabel = new Label("Password:");
        passwordField = new TextField();
        passwordField.setEchoChar('*'); // Set echo character for password field
        Label retypePasswordLabel = new Label("Retype Password:");
        retypePasswordField = new TextField();
        retypePasswordField.setEchoChar('*'); // Set echo character for password field
        Label mobileLabel = new Label("Mobile Number:");
        mobileField = new TextField();
        Label emailLabel = new Label("Email ID:");
        emailField = new TextField();

        // Create Sign Up button
        Button signUpButton = new Button("Sign Up");

        // Add components to the frame
        add(userIdLabel);
        add(userIdField);
        add(passwordLabel);
        add(passwordField);
        add(retypePasswordLabel);
        add(retypePasswordField);
        add(mobileLabel);
        add(mobileField);
        add(emailLabel);
        add(emailField);
        add(new Label()); // Empty label for spacing
        add(signUpButton);

        // Set frame visibility
        setVisible(true);

        // Handle window close event
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new SignUpForm();
    }
}
