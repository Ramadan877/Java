//  import javax.swing.*;

//  public class Main {
//      public static void main(String[] args) throws Exception {

//          int boardWidth = 360;
//          int boardHeight = 640;
//          // die sind die dimensionen unseres Fensters, ich habe diese Dimensionen so eingestellt da diese gleiche sind mit meinem Hintergrund Bild.

//          JFrame frame = new JFrame("Flappy Bird");
//          // frame.setVisible(true);
//          frame.setSize(boardWidth, boardHeight);
//          frame.setLocationRelativeTo(null);// das wird das Fenster genau in der Mitte unseres Bildschirms zentrieren.
//          frame.setResizable(false);// damit der user die größe unseres Fensters nicht ändern kann.
//          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//          // Da ich jzt mein SpielFenster habe, kann ich jzt einen neuen Datei mit der name FlappyBird.java erstellen.

//          // (2)
//          FlappyBird flappyBird = new FlappyBird();
//          frame.add(flappyBird);
//          frame.pack();// damit der Title des Fensters außerhalb unserer dimensionen sein kann.

//          // dann kommentiere ich das von oben und füge es hier hinzu, damit wir das nur sehen können wenn wir alles unsere Frame Einstellungen generieren.
//          frame.setVisible(true);

//          // (3)
//          // jzt machen wir weiter in unserem flappybird.java .

//      }
//  }





// (4)

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception {

        int boardWidth = 360;
        int boardHeight = 640;
        // die sind die dimensionen unseres Fensters, ich habe diese Dimensionen so eingestellt da diese gleiche sind mit meinem Hintergrund Bild.

        JFrame frame = new JFrame("Flappy Bird");
        // frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        // (4)
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}
