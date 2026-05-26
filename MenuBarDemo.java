import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuBarDemo extends JFrame implements ActionListener {
   
   
   public MenuBarDemo(){
       
        
        // Create the window
         
        setTitle("Simple Menu"); 
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // --- HOW TO INSTANTIATE ---
        // Create the empty bar at the top
        JMenuBar menuBar = new JMenuBar();
        

        // Create the dropdown menu (like "File")
        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu = new JMenu("Help");
        
        
 
        // Create the clickable items inside the menu
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        JMenuItem helpItem = new JMenuItem("Orange");
        helpItem.addActionListener(this);
       

        
        // Put items inside the menu
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        helpMenu.add(helpItem);
        
         

        // Put menu inside the bar
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
       

        // Attach the bar to the window
        setJMenuBar(menuBar);

        // Show the window
        setVisible(true);
   }
   
    public static void main(String[] args) {
        MenuBarDemo win = new MenuBarDemo();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.getContentPane().setBackground(Color.orange);
    }
}

