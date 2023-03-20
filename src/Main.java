import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JLabel HOMELabel;
    private JButton buttonAdopt, buttonCats, buttonDogs;

    public Main() {
        // Set the title of the window
        super("HOME");

        // Set the layout of the content pane
        setLayout(new BorderLayout());

        // Create the title label and center it
        HOMELabel = new JLabel("Chloe's Adoption Agency!", SwingConstants.CENTER);
        HOMELabel.setSize(100, 200);
        add(HOMELabel, BorderLayout.NORTH);

        // Create the buttons and add them to the content pane
        buttonAdopt = new JButton("Adopt!");
        buttonAdopt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame adoptPage = new JFrame("Adopt!");
                adoptPage.setSize(300, 400);
                adoptPage.setVisible(true);
            }
        });
        buttonCats = new JButton("Cats!");
        buttonCats.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame catPage = new JFrame("Cats!");
                catPage.setSize(300, 400);
                catPage.setVisible(true);
            }
        });
        buttonDogs = new JButton("Dogs!");
        buttonDogs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame dogPage = new JFrame("Dogs!");
                dogPage.setSize(300, 400);
                dogPage.setVisible(true);
            }
        });
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(buttonAdopt);
        buttonPanel.add(buttonCats);
        buttonPanel.add(buttonDogs);
        add(buttonPanel, BorderLayout.CENTER);

        // Set the size of the window and make it visible
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        Main gui = new Main();
    }
}