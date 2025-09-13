#  Simple Notepad (Java Swing)

This project is a **mini Notepad application** built using **Java Swing**.  
It demonstrates the use of GUI components (`JFrame`, `JTextArea`, `JMenuBar`, `JFileChooser`) and basic file handling (open/save).

---

##  Features
- Editable text area with scrollbars
- File Menu:
  - **Open** → Load a text file into the editor
  - **Save** → Save the current text into a file
  - **Exit** → Close the application

---

##  Technical Requirements
- **Java Version**: Java SE 8 or later
- Works on **Windows / Linux / macOS**
- No database is required for this project (file handling is used instead)

---

##  Setup Instructions

### 1. Download / Clone the Repository
```bash
git clone https://github.com/Vihangi884/notepad-intellij.git
cd SimpleNotepad/src

2. Compile the Source Code

javac *.java


3. Run the Application

java NotepadMain


Project Structure

SimpleNotepad/
 ├── src/
 │    ├── NotepadMain.java      # Entry point
 │    ├── NotepadFrame.java     # Main JFrame window
 │    ├── FileOperations.java   # Handles Open & Save logic
 ├── README.md


Assumptions / Notes

The program is designed for text files (.txt).

When saving, if you don’t add “.txt” manually, the file will be saved without an extension.

No external libraries are required; it runs with the standard Java library.



