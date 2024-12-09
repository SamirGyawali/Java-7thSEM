import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI {

    // best practice is not to use static in the GUI components in the java, to do so we can do something like this
    // create a seperate class for entire thing and in main method create an instance of that object and use simple..

    private static JFrame frame;
    private static JPanel panel;
    static JTextField userText;
    static JPasswordField passwordText;


    public static void main(String[] args) {
        frame = new JFrame(); // nice little window
        panel = new JPanel(); // invisibel pannel inside the window where elements are contained

        frame.setSize(300, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel); // adding panel to the frame

        panel.setLayout(null);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JButton button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new LoginButtonListener());
        panel.add(button);


        frame.setVisible(true);
    }
}
class LoginButtonListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        String user = LoginGUI.userText.getText();
        String password = LoginGUI.passwordText.getText();
//        System.out.println(user + " "+ password);

        if(user.equals("Alex") && password.equals("alex")){
            System.out.println("Hello Welcome Alex");
        }else{
            System.out.println("No no no, it didn't matched the username and password!");
        }
    }
}
