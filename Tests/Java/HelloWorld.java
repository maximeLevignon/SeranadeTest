import javax.swing.JFrame;
import javax.swing.JLabel;
public class HelloWorld {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Hi!");
        frame.add(new JLabel("Hello, world!"));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
/*
insert import javax.swing.JFrame semicolon
insert import javax.swing.JLabel semicolon
insert public class HelloWorld braces
insert public static void main parens capital string brackets args braces
insert JFrame frame equals new JFrame parens semicolon
insert frame dot setTitle parens quotes capital Hi exclamation point semicolon
insert frame dot add parens new JLabel parens quotes
    insert capital Hello comma world exclamation point semicolon
insert frame dot pack parens semicolon
insert frame dot setLocationRelativeTo parens null semicolon
insert frame dot setVisible parens true semicolon

Commentaires :
  - up ne fonctionne pas
  - lignes frame. plus rapide à l'oral qu'à l'écrit
*/
