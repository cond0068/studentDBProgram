import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class studentDB extends JFrame {
    private JPanel mainPanel;
    private JLabel headerLabel;
    private JPanel studentDetailsPanel;
    private JPanel topicDetailsPanel;
    private JPanel spacePanel;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JButton addTopicResultButton;
    private JButton findTopicResultButton;
    private JComboBox comboBox2;
    private JButton addStudentButton;
    private JButton findStudentButton;
    private JButton printAllRecordsButton;
    private JButton clearAllRecordsButton;
    private JPanel degreeOptionsPane;
    private JPanel awardPrizesPane;
    private JTextArea textArea1;

    public studentDB (String title) {
        super(title);

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {

        }

        textArea1.setLineWrap(true);
        mainPanel.setPreferredSize(new Dimension(800,450));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();




    }

    public static void main (String[] args) {

        JFrame frame = new studentDB("Student Database Program");
        frame.setVisible(true);

        // Menu Bar
        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu file = new JMenu("File");
        menuBar.add(file);

        JMenuItem exit = new JMenuItem("Exit");
        file.add(exit);

        class exitaction implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }
        exit.addActionListener(new exitaction());

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}


