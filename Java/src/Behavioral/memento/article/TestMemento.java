package Behavioral.memento.article;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TestMemento extends JFrame {
    public static void main(String[] args) {
        new TestMemento();
    }

    private final JButton saveButton;
	private final JButton undoButton;
	private final JButton redoButton;
    private final JTextArea theArticle = new JTextArea(40, 60);

    CareTaker caretaker = new CareTaker();
    Originator originator = new Originator();
    int saveFiles = 0, currentArticle = -1;

    public TestMemento() {
        this.setSize(750, 780);
        this.setTitle("Memento Design Pattern");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel();

        panel1.add(new JLabel("Article"));
        panel1.add(theArticle);

        ButtonListener saveListener = new ButtonListener();
        ButtonListener undoListener = new ButtonListener();
        ButtonListener redoListener = new ButtonListener();

        saveButton = new JButton("Save");
        saveButton.addActionListener(saveListener);

        undoButton = new JButton("Undo");
        undoButton.addActionListener(undoListener);

        redoButton = new JButton("Redo");
        redoButton.addActionListener(redoListener);

        panel1.add(saveButton);
        panel1.add(undoButton);
        panel1.add(redoButton);

        this.add(panel1);
        this.setVisible(true);
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == saveButton) {
                String textInTextArea = theArticle.getText();
                originator.setArticle(textInTextArea);
                caretaker.addIntoList(originator.storeInMemento());
                saveFiles++;
                currentArticle++;
                System.out.println("Save Files " + saveFiles);
                undoButton.setEnabled(true);
            } else if (e.getSource() == undoButton) {
                if (currentArticle >= 1) {
                    currentArticle--;
                    String textBoxString = originator.restoreFromMemento(caretaker.getFromList(currentArticle));
                    theArticle.setText(textBoxString);
                    redoButton.setEnabled(true);
                } else {
                    undoButton.setEnabled(false);
                }
            } else if (e.getSource() == redoButton) {
                if ((saveFiles - 1) > currentArticle) {
                    currentArticle++;
                    String textBoxString = originator.restoreFromMemento(caretaker.getFromList(currentArticle));
                    theArticle.setText(textBoxString);
                    undoButton.setEnabled(true);
                } else {
                    redoButton.setEnabled(false);
                }
            }
        }
    }
}