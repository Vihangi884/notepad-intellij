import javax.swing.*;
import java.io.*;

public class FileOperations {
    private JFrame parentFrame;
    private JTextArea textArea;
    private JFileChooser fileChooser;

    public FileOperations(JFrame parentFrame, JTextArea textArea) {
        this.parentFrame = parentFrame;
        this.textArea = textArea;
        this.fileChooser = new JFileChooser();
    }

    // Open file
    public void openFile() {
        int option = fileChooser.showOpenDialog(parentFrame);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                textArea.read(br, null);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(parentFrame,
                        "Error opening file!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Save file
    public void saveFile() {
        int option = fileChooser.showSaveDialog(parentFrame);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                textArea.write(bw);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(parentFrame,
                        "Error saving file!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

