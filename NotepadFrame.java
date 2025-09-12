import javax.swing.*;
import java.awt.*;

public class NotepadFrame extends JFrame {

    private JTextArea textArea;
    private FileOperations fileOps;

    public NotepadFrame() {
        // Frame setup
        setTitle("Simple Notepad");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Text area + scroll
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        // File operations helper
        fileOps = new FileOperations(this, textArea);

        // Menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        // Menu items
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add items to menu
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        // Actions
        openItem.addActionListener(e -> fileOps.openFile());
        saveItem.addActionListener(e -> fileOps.saveFile());
        exitItem.addActionListener(e -> System.exit(0));
    }
}

