package DialogPack;

import javax.swing.*;
import java.awt.event.*;

public class as extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JPasswordField PasswordField;
    private JTextField NameTextField;
    private JPanel Enter;
    private JLabel WrongName;
    private JLabel WrongPassword;

    public as() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {

            if (this.NameTextField.getText().equals("moshe")){
                WrongName.setVisible(false);
                if (PasswordField.getText().equals("1234")){
                    sss sss = new sss();
                    sss.getClass();

                    dispose();
                }
                else {
                    WrongPassword.setVisible(true);
                    System.out.println("pass Not currect");
                }
            }
            else {
                System.out.println("Not moshe "+NameTextField.getText());
                WrongName.setVisible(true);
            }
        }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        as dialog = new as();
        dialog.pack();
        dialog.setVisible(true);

        dialog.onOK();

        System.exit(0);
    }
}
