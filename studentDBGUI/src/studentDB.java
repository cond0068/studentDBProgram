import studentdatabase.StudentDatabase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class studentDB extends JFrame {
    private JPanel mainPanel;
    private JLabel headerLabel;
    private JPanel studentDetailsPanel;
    private JPanel topicDetailsPanel;
    private JPanel spacePanel;
    private JTextField givenNaField;
    private JComboBox gradeBox;
    private JButton addTopicResultButton;
    private JButton findTopicResultButton;
    private JComboBox degreeBox;
    private JButton addStudentButton;
    private JButton findStudentButton;
    private JButton printAllRecordsButton;
    private JButton clearAllRecordsButton;
    private JPanel degreeOptionsPane;
    private JPanel awardPrizesPane;
    private JTextArea medPrizeField;
    private JLabel studentLabel;
    private JLabel familyLabel;
    private JLabel givenLabel;
    private JLabel degreeLabel;
    private JLabel artsMaLabel;
    private JLabel artsMiLabel;
    private JLabel medLabel;
    private JLabel topicLabel;
    private JLabel gradeLabel;
    private JLabel markLabel;
    private JLabel prizeLabel;
    private JLabel templateLabel;
    private JLabel numberOfLabel;
    private JButton awardPrizeButton;
    private JTextField prizeField;
    private JTextField templateField;
    private JTextField noTopicsField;
    private JTextField artsMinorField;
    private JTextField artsMajorField;
    private JTextField studentNoField;
    private JTextField familyNaField;
    private JTextField topicCodeField;
    private JTextField markField;

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

        gradeBox.setFont(new Font("", Font.PLAIN, 12));
        gradeBox.addItem("P");
        gradeBox.addItem("CR");
        gradeBox.addItem("DN");
        gradeBox.addItem("HD");

        degreeBox.setFont(new Font("", Font.PLAIN, 12));
        degreeBox.addItem("Arts");
        degreeBox.addItem("Medicine");
        degreeBox.addItem("Science");

        headerLabel.setFont(new Font("", Font.BOLD, 20));
        studentLabel.setFont(new Font("", Font.PLAIN, 12));
        familyLabel.setFont(new Font("", Font.PLAIN, 12));
        givenLabel.setFont(new Font("", Font.PLAIN, 12));
        degreeLabel.setFont(new Font("", Font.PLAIN, 12));
        artsMaLabel.setFont(new Font("", Font.PLAIN, 12));
        artsMiLabel.setFont(new Font("", Font.PLAIN, 12));
        medLabel.setFont(new Font("", Font.PLAIN, 12));
        topicLabel.setFont(new Font("", Font.PLAIN, 12));
        gradeLabel.setFont(new Font("", Font.PLAIN, 12));
        markLabel.setFont(new Font("", Font.PLAIN, 12));
        prizeLabel.setFont(new Font("", Font.PLAIN, 12));
        templateLabel.setFont(new Font("", Font.PLAIN, 12));
        numberOfLabel.setFont(new Font("", Font.PLAIN, 12));
        addStudentButton.setFont(new Font("", Font.PLAIN, 12));
        findStudentButton.setFont(new Font("", Font.PLAIN, 12));
        printAllRecordsButton.setFont(new Font("", Font.PLAIN, 12));
        clearAllRecordsButton.setFont(new Font("", Font.PLAIN, 12));
        addTopicResultButton.setFont(new Font("", Font.PLAIN, 12));
        findTopicResultButton.setFont(new Font("", Font.PLAIN, 12));
        awardPrizeButton.setFont(new Font("", Font.PLAIN, 12));

        addStudentButton.setFocusPainted(false);
        findStudentButton.setFocusPainted(false);
        printAllRecordsButton.setFocusPainted(false);
        clearAllRecordsButton.setFocusPainted(false);
        awardPrizeButton.setFocusPainted(false);
        addTopicResultButton.setFocusPainted(false);
        findTopicResultButton.setFocusPainted(false);

        medPrizeField.setLineWrap(true);
        mainPanel.setPreferredSize(new Dimension(700,450));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        printAllRecordsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentDatabase studentDB = new StudentDatabase();
                studentDB.printRecords();

            }
        });
        clearAllRecordsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentDatabase studentDB = new StudentDatabase();
                studentDB.clearRecords();
            }
        });
        awardPrizeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentDatabase studentDB = new StudentDatabase();
                studentDB.awardPrize(prizeField.getText(),templateField.getText(),noTopicsField.getText());
            }
        });
    }

    public static void main (String[] args) {

        JFrame frame = new studentDB("Student Database Program");
        frame.setResizable(false);
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
