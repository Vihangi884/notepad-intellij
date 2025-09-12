public class NotepadMain {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            NotepadFrame frame = new NotepadFrame();
            frame.setVisible(true);
        });
    }
}
