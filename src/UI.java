import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by eddie on 6/13/2014.
 */
public class UI extends JFrame {
    static JFrame frame1;
    static Container pane;
    static JButton enter, quit;
    static JLabel welcome1, welcome2, choose, invalid;
    static JTextField animal;
    static Insets insets;
    private static int width, height;
    private static QuitButtonHandler qHandler;
    private static EnterButtonHandler eHandler;

    public static void ui(){
        width = 500;
        height = 500;

        welcome1 = new JLabel("Welcome to Charles Darwin's Mertle Cumbut!");
        welcome2 = new JLabel("Where you pit poor, undeserving animals against each other for your amusement");
        choose = new JLabel("Type the animal you want :");
        invalid = new JLabel("That was an invalid choice!");

        enter = new JButton("Enter");
        eHandler = new EnterButtonHandler();
        enter.addActionListener(eHandler);
        quit = new JButton("Quit");
        qHandler = new QuitButtonHandler();
        quit.addActionListener(qHandler);

        animal = new JTextField(10);

        frame1 = new JFrame();
        frame1.setTitle("Merp");
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame1.setSize(width,height);

        pane = frame1.getContentPane();


        pane.add(welcome1);
        pane.add(welcome2);
        pane.add(choose);
        pane.add(animal);
        pane.add(enter);
        pane.add(quit);


    }

    public static class EnterButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public static class QuitButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e){
            System.exit(0);

        }
    }

}
