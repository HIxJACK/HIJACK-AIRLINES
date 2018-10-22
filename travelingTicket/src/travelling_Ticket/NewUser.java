package travelling_Ticket;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class NewUser extends JFrame {
  JButton create;
  JPanel newUserPanel;
  JTextField txuserer;
  JTextField passer;
  private JLabel lblNewUsername;
  private JLabel lblNewPassword;


  public NewUser(){
    super("Registration");

    create = new JButton("Create");
    newUserPanel = new JPanel();
    txuserer = new JTextField(15);
    passer = new JPasswordField(15);


    setSize(300,200);
    setLocation(500,280);
    newUserPanel.setLayout (null); 


    txuserer.setBounds(122,25,150,20);
    passer.setBounds(122,62,150,20);
    create.setBounds(99,138,80,20);

    newUserPanel.add(create);
    newUserPanel.add(txuserer);
    newUserPanel.add(passer);
    getContentPane().add(newUserPanel);
    
    lblNewUsername = new JLabel("New UserName");
    lblNewUsername.setBounds(6, 27, 107, 16);
    newUserPanel.add(lblNewUsername);
    
    lblNewPassword = new JLabel("New Password");
    lblNewPassword.setBounds(6, 64, 104, 16);
    newUserPanel.add(lblNewPassword);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

    Writer writer = null;
    File check = new File("userPass.txt");
    if(check.exists()){

      //Checks if the file exists. will not add anything if the file does exist.
    }else{
      try{
        File texting = new File("userPass.txt");
        writer = new BufferedWriter(new FileWriter(texting));
        writer.write("message");
      }catch(IOException e){
        e.printStackTrace();
      }
    }




    create.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
    File file = new File("userPass.txt");
    Scanner scan = new Scanner(file);;

      FileWriter filewrite = new FileWriter(file, true);

      String usertxter = " ";
      String passtxter = " ";
      String punamer = txuserer.getText();
      String ppaswder = passer.getText();
      while (scan.hasNext()) {
        usertxter = scan.nextLine();
        passtxter = scan.nextLine();
      }

        if(punamer.equals(usertxter) && ppaswder.equals(passtxter)) {
           JOptionPane.showMessageDialog(null,"Username is already in use");
          txuserer.setText("");
          passer.setText("");
          txuserer.requestFocus();

        } 
        else if(punamer.equals("") && ppaswder.equals("")){
        JOptionPane.showMessageDialog(null,"Please insert Username and Password");
        }
        else {
        filewrite.write(punamer+"\r\n" +ppaswder+ "\r\n");
        filewrite.close();
        JOptionPane.showMessageDialog(null,"Account has been created.");
        dispose();
        login log = new login();



        }
        } catch (IOException d) {
      d.printStackTrace();
    }

      }
    });
  } 

}

//new user login
