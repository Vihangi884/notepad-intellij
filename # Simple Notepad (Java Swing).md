\# Simple Notepad (Java Swing)



This is a **mini Notepad application** built using **Java Swing**.  

It provides basic text editing features like **Open, Save, and Exit** . 



---



\## Project Structure

SimpleNotepad/

├── NotepadMain.java # Entry point

├── NotepadFrame.java # Main window (JFrame with menu + text area)

├── FileOperations.java # Handles Open \& Save using JFileChooser.





---



\##  Features

\- Text editor with scrollable area  

\- **File Menu**:  

&nbsp; - `Open` → Load a text file  

&nbsp; - `Save` → Save the current text to a file  

&nbsp; - `Exit` → Close the application  

\- Uses `JFrame`, `JTextArea`, `JScrollPane`, `JMenuBar`, `JMenu`, `JMenuItem`, and `JFileChooser`  



---



\##  Requirements

\- Java Development Kit **(JDK) 8 or later** 

\- Any operating system with Java installed (Windows, Linux, macOS)  



---



\##  How to Compile and Run



1\. Open a terminal/command prompt.  

2\. Navigate to the folder containing the `.java` files:  

&nbsp;  ```bash

&nbsp;  cd SimpleNotepad



3\. Compile all classes:



javac \*.java



4\. Run the program:



java NotepadMain









