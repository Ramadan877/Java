//  import java.awt.*;
//  import java.awt.event.*;
//  import java.util.ArrayList;// das wird alle unsere pipes des Spiels speichern.
//  import java.util.Random; // das wird verwendet um unsere pipes in unterschiedliche positionen zu generieren.
//  import javax.swing.*;

//  public class FlappyBird extends JPanel{
//      int boardWidth = 360;
//      int boardHeight = 640;


//  // (3)
//      Image backgroundImg;
//      Image birdImg;
//      Image topPipeImg;
//      Image bottomPipeImg;


//      // (4)
//      // Bird:
//      int birdX = boardWidth/8; // stellen wir unsere X position 1/8 der width größe des Bildschirms
//      int birdY = boardHeight/2; // um genau horizontal in der mitte zu stellen.
//      int birdWidth = 34;
//      int birdHeight = 24;

//      class Bird{
//          int x = birdX;
//          int y = birdY;
//          int width = birdWidth;
//          int height = birdHeight;
//          Image img;

//          Bird(Image img){// hier definieren wir unsere Konstruktur, und geben unsere img rein.
//              this.img = img;
//          }// danach erstellen wir den game logic
//      }

//      // (5)
//      // game logic:
//      Bird bird;
//      // dann erstellen wir einen bird image innerhalb unserer konstruktur






//      // (2)
//      FlappyBird(){
//          setPreferredSize(new Dimension(boardWidth, boardHeight));
//          // setBackground(Color.blue);
//          // lass uns jzt unsere Jpanel in Main.java erstellen.

//          // (3)
//          backgroundImg = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();
//          // getClass() referenziert die FlappyBird Klasse, und getResource() referenziert dem Bild, aber hier erstellen wir einen ImgIcon und nicht einen Img, deswegen müssen wir getImage() methode verwenden.







//          birdImg = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();

//          topPipeImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();

//          bottomPipeImg = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();
//          // jzt können wir die setBackground methode rauskommentieren.


//  ////////////////////////////////////////////////////
//          // (5)
//          bird = new Bird(birdImg);
//          // und jzt muss ich den bird draw innerhalb meiines draw funktions.
//  ///////////////////////////////////////////////////
//  // MACH WEITER:
//      } // lass uns jzt eine funktion erstellen :

//      public void paintComponent(Graphics g){
//          super.paintComponent(g);// das wird die funktion einfach vom JPanel invoken, da wir JPanel schon vererbt haben.
//          draw(g);

//      }

//      public void draw(Graphics g){
//          // background
//          g.drawImage(backgroundImg, 0, 0, boardWidth,boardHeight,null);
//      // x und y sind die Anfangspositionen, width und height sind de dimensionen des Bildschirms.
//      // }// jzt können wir sehen wir haben unsere Background schon erstellt.

//      // Lass uns einpaar Variablen für unsere bird erstellen.

//      // (5)
//      // bird
//          g.drawImage(bird.img, bird.x, bird.y, bird.width, bird.height, null);
//      }
//  }






//  // und jzt da wir unsere bird schon sehen können, müssen wir dieses bird jzt eine Bewegung geben, und zwar wir müssen einen game loop erstellen, das unsere draw funktion immer und immer wieder abruft.

//  import java.awt.*;
//  import java.awt.event.*;
//  import java.util.ArrayList;
//  import java.util.Random;
//  import javax.swing.*;

//  public class FlappyBird extends JPanel implements ActionListener{//(2)
//      int boardWidth = 360;
//      int boardHeight = 640;


//      Image backgroundImg;
//      Image birdImg;
//      Image topPipeImg;
//      Image bottomPipeImg;


//      // Bird:
//      int birdX = boardWidth/8;
//      int birdY = boardHeight/2;
//      int birdWidth = 34;
//      int birdHeight = 24;

//      class Bird{
//          int x = birdX;
//          int y = birdY;
//          int width = birdWidth;
//          int height = birdHeight;
//          Image img;

//          Bird(Image img){
//              this.img = img;
//          }
//      }

//      // game logic:
//      Bird bird;

//      Timer gameLoop;// erstellen wir hier einen Timer




//      FlappyBird(){
//          setPreferredSize(new Dimension(boardWidth, boardHeight));


//          backgroundImg = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();


//          birdImg = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();

//          topPipeImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();

//          bottomPipeImg = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();

//          // bird
//          bird = new Bird(birdImg);

//          // game timer:
//          gameLoop = new Timer(1000/60, this);// hier geben wir zu wir oft wollen wir unsere action wiederholt,1000 ist jeder Sekunde , und 60 Frames pro Sekunde zeichnen, und this referenziert der flappy bird klasse, deswegen müssen wir einen AktionListener implementieren. indem wir ActionListener im funktion implementieren, und danach action performed methode erstellen. (2)

//          // (3)
//          gameLoop.start();// wir können aber nicht sagen das unsere bird bewegt sich, deswegen können wir einen Debugging statement in unsere draw funktion hinzufügen (4)

//      }

//      public void paintComponent(Graphics g){
//          super.paintComponent(g);
//          draw(g);
//      }

//      public void draw(Graphics g){
//          // (4)
//          System.out.println("draw");// wir können sehen das 60 frames pro sekunde erstellt wurde.
//          // background
//          g.drawImage(backgroundImg, 0, 0, boardWidth,boardHeight,null);

//      // bird
//          g.drawImage(bird.img, bird.x, bird.y, bird.width, bird.height, null);
//      }

//      // (2)
//      @Override
//      public void actionPerformed(ActionEvent e) {

//          repaint();// das wird paintkomponent aufrufen.

//          // dann müssen wir unsere gameloop starten (3)
//      }
//  }





//  // wir haben unser bird, um unser bird jetzt zu bewegen, wir müssen einen Velocity hinzufügen:

//  import java.awt.*;
//  import java.awt.event.*;
//  import java.util.ArrayList;
//  import java.util.Random;
//  import javax.swing.*;

//  public class FlappyBird extends JPanel implements ActionListener{
//      int boardWidth = 360;
//      int boardHeight = 640;


//      Image backgroundImg;
//      Image birdImg;
//      Image topPipeImg;
//      Image bottomPipeImg;


//      // Bird:
//      int birdX = boardWidth/8;
//      int birdY = boardHeight/2;
//      int birdWidth = 34;
//      int birdHeight = 24;

//      class Bird{
//          int x = birdX;
//          int y = birdY;
//          int width = birdWidth;
//          int height = birdHeight;
//          Image img;

//          Bird(Image img){
//              this.img = img;
//          }
//      }

//      // game logic:
//      Bird bird;
//      int velocityY = -9;
//      // jzt wenn ich mein bird nach oben das ist in Richtung 0, und zwar -y, nach unten ist aber y, und gleichfalls wenn ich nach vorne bewege dann das ist +x, aber wir gehen nicht nach hinten, sondern die pipes gehen nach hinten -x.
//      // dann definieren wir einen move funktion (2)

//      // (3)
//      int gravity = 1;// das bedeutet jeder frame ist der bird 1 px langsamer, und mit gravity, der bird wird nach oben springen, und dann die gravity wird ihm nach unten ziehen.

//      Timer gameLoop;


//      FlappyBird(){
//          setPreferredSize(new Dimension(boardWidth, boardHeight));


//          backgroundImg = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();


//          birdImg = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();

//          topPipeImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();

//          bottomPipeImg = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();

//          // bird
//          bird = new Bird(birdImg);

//          // game timer:
//          gameLoop = new Timer(1000/60, this);

//          gameLoop.start();

//      }

//      public void paintComponent(Graphics g){
//          super.paintComponent(g);
//          draw(g);
//      }

//      public void draw(Graphics g){
//          System.out.println("draw");
//          g.drawImage(backgroundImg, 0, 0, boardWidth,boardHeight,null);

//      // bird
//          g.drawImage(bird.img, bird.x, bird.y, bird.width, bird.height, null);
//      }

//      // (2)
//      public void move(){
//          // bird
//          velocityY += gravity; //(3)
//          bird.y += velocityY;
//          bird.y = Math.max(bird.y, 0);// damit das bird nicht nach oben aus unserem screen darf
//      }

//      @Override
//      public void actionPerformed(ActionEvent e) {
//          // (2) und hier aktualisieren wir das Bildschirm vorm repaint funktion:
//          move();

//          repaint();
//      }
//  }









//  // lass uns einpaar keylisteners hinzufügen:


//  import java.awt.*;
//  import java.awt.event.*;
//  import java.util.ArrayList;
//  import java.util.Random;
//  import javax.swing.*;

//  public class FlappyBird extends JPanel implements ActionListener, KeyListener{ // hier fügen wir einen keylistener hinzu, und implementieren die unimplemented methods quick fix.

//      int boardWidth = 360;
//      int boardHeight = 640;


//      Image backgroundImg;
//      Image birdImg;
//      Image topPipeImg;
//      Image bottomPipeImg;


//      // Bird:
//      int birdX = boardWidth/8;
//      int birdY = boardHeight/2;
//      int birdWidth = 34;
//      int birdHeight = 24;

//      class Bird{
//          int x = birdX;
//          int y = birdY;
//          int width = birdWidth;
//          int height = birdHeight;
//          Image img;

//          Bird(Image img){
//              this.img = img;
//          }
//      }

//      // game logic:
//      Bird bird;
//      // int velocityY = -9; (2)
//      int velocityY = 0;// sodass das spiel wird anfangen mit dem bird nach unten geht, dann in meinem Konstruktur füge ich noch eine neue Einstellung (3)
//      int gravity = 1;

//      Timer gameLoop;


//      FlappyBird(){
//          setPreferredSize(new Dimension(boardWidth, boardHeight));

//          // (3)
//          setFocusable(true);// das stelltsicher das FlappyBird übernimmt die Keyevents.
//          addKeyListener(this);// das stelltsicher das die drei Keylistner funktion betrachtet werden "keypressed, Keytyped, Keyreleased".

//          // dann innerhalb meiner Main.java werde ich auch noch was hinzufügen. (4)



//          backgroundImg = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();


//          birdImg = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();

//          topPipeImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();

//          bottomPipeImg = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();

//          // bird
//          bird = new Bird(birdImg);

//          // game timer:
//          gameLoop = new Timer(1000/60, this);
//          gameLoop.start();

//      }

//      public void paintComponent(Graphics g){
//          super.paintComponent(g);
//          draw(g);
//      }

//      public void draw(Graphics g){
//          // System.out.println("draw"); jzt brauchen wir das nicht mehr.
//          g.drawImage(backgroundImg, 0, 0, boardWidth,boardHeight,null);

//      // bird
//          g.drawImage(bird.img, bird.x, bird.y, bird.width, bird.height, null);
//      }

//      public void move(){
//          // bird
//          velocityY += gravity;
//          bird.y += velocityY;
//          bird.y = Math.max(bird.y, 0);
//      }

//      @Override
//      public void actionPerformed(ActionEvent e) {

//          move();

//          repaint();
//      }

//      @Override
//      public void keyPressed(KeyEvent e) {
//          // ähnlich wie keytyped aber für alle tastatur optionen wie f5 oder leertaste usw.
//          if(e.getKeyCode() == KeyEvent.VK_SPACE){
//              velocityY = -9;
//              // ich werde die Definition der Velocity jzt auf 0 einsetzen. (2)
//          }
//      }

//      @Override
//      public void keyTyped(KeyEvent e) {
//          // Das implementiert ein Tastatur eingabe wie 'A' oder 'C' usw.

//      }

//      @Override
//      public void keyReleased(KeyEvent e) {
//          // das ist wenn wir zb auf A taste drucken und wollen eine methode ausführen die ausgeführt wird sobald wir die A taste loslassen.
//      }


//  }






//  // jzt lass uns unser pipes erstellen:



//  import java.awt.*;
//  import java.awt.event.*;
//  import java.util.ArrayList;
//  import java.util.Random;
//  import javax.swing.*;

//  public class FlappyBird extends JPanel implements ActionListener, KeyListener{

//      int boardWidth = 360;
//      int boardHeight = 640;


//      Image backgroundImg;
//      Image birdImg;
//      Image topPipeImg;
//      Image bottomPipeImg;


//      // Bird:
//      int birdX = boardWidth/8;
//      int birdY = boardHeight/2;
//      int birdWidth = 34;
//      int birdHeight = 24;

//      class Bird{
//          int x = birdX;
//          int y = birdY;
//          int width = birdWidth;
//          int height = birdHeight;
//          Image img;

//          Bird(Image img){
//              this.img = img;
//          }
//      }


//      // pipes:
//      int pipeX = boardWidth;// das wird auf der richte Seite des Bildschirms anfangen
//      int pipeY = 0;// das wird das Anfangspunkt an die spitze des Bildschirms auch anfangen.
//      int pipeWidth= 64;
//      int pipeHeight = 512;

//      class Pipe{
//          int x = pipeX;
//          int y = pipeY;
//          int width = pipeWidth;
//          int height = pipeHeight;
//          Image img;
//          boolean passed = false; // das prüft ob unser bird den pipe schon verpasst hat oder noch nicht um den score entsprechend zu aktualisieren.

//          Pipe(Image img){// hier definieren wir die Konstruktur und geben die img rein.
//              this.img = img;
//          }
//      }// dann müssen wir einpaar werte in unsere game logic auch hinzufügen:


//      // game logic:
//      Bird bird;
//      int velocityX = -4;// das bewegt die pipes nach links, simuliert die Bewegung des birds nach richts.

//      int velocityY = 0;
//      int gravity = 1;

//      ArrayList<Pipe> pipes;// da wir viele pipes in unserem Spiel haben, müssen wir diese in einem List speichern, und lass uns eine funktion erstellen die die pipes erstellt und ins ArrayList hinzufügt.

//      Timer gameLoop;
//      // (3)
//      Timer placePipesTimer;// und fügen wir diese variable auch in unserem konstruktur hinzu.


//      FlappyBird(){
//          setPreferredSize(new Dimension(boardWidth, boardHeight));

//          setFocusable(true);
//          addKeyListener(this);


//          backgroundImg = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();


//          birdImg = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();

//          topPipeImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();

//          bottomPipeImg = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();

//          // bird
//          bird = new Bird(birdImg);

//              // (4)
//          pipes = new ArrayList<Pipe>();// und jzt haben wir einen Arraylist von pipes, und jeder 1.5 Sekunden erstellen wir einen pipe.

//              // (3)
//          placePipesTimer = new Timer(1500, new ActionListener() {
//              @Override
//              public void actionPerformed(ActionEvent e){
//                  placePipes();
//              }
//          });// also hier zeigen wir einen pipe jede 1.5 Sekunden, danach müssen wir diese pipes ins array list hinzufügen. (4)


//          // game timer:
//          gameLoop = new Timer(1000/60, this);
//          gameLoop.start();

//      }

//      public void placePipes(){
//          Pipe topPipe = new Pipe(topPipeImg);
//          pipes.add(topPipe);// jzt müssen wir diese funktion aufrufen, und zwar in eine Schleife oder loop, und dafür brauchen wir einen Timer variable. (2)
//      }

//      public void paintComponent(Graphics g){
//          super.paintComponent(g);
//          draw(g);
//      }

//      public void draw(Graphics g){
//          g.drawImage(backgroundImg, 0, 0, boardWidth,boardHeight,null);

//      // bird
//          g.drawImage(bird.img, bird.x, bird.y, bird.width, bird.height, null);
//      }

//      public void move(){
//          // bird
//          velocityY += gravity;
//          bird.y += velocityY;
//          bird.y = Math.max(bird.y, 0);
//      }

//      @Override
//      public void actionPerformed(ActionEvent e) {

//          move();

//          repaint();
//      }

//      @Override
//      public void keyPressed(KeyEvent e) {
//          if(e.getKeyCode() == KeyEvent.VK_SPACE){
//              velocityY = -9;
//          }
//      }

//      @Override
//      public void keyTyped(KeyEvent e) {
//      }

//      @Override
//      public void keyReleased(KeyEvent e) {
//      }


//  }










//  // draw the pipes:


//  import java.awt.*;
//  import java.awt.event.*;
//  import java.util.ArrayList;
//  import java.util.Random;
//  import javax.swing.*;

//  public class FlappyBird extends JPanel implements ActionListener, KeyListener{

//      int boardWidth = 360;
//      int boardHeight = 640;


//      Image backgroundImg;
//      Image birdImg;
//      Image topPipeImg;
//      Image bottomPipeImg;


//      // Bird:
//      int birdX = boardWidth/8;
//      int birdY = boardHeight/2;
//      int birdWidth = 34;
//      int birdHeight = 24;

//      class Bird{
//          int x = birdX;
//          int y = birdY;
//          int width = birdWidth;
//          int height = birdHeight;
//          Image img;

//          Bird(Image img){
//              this.img = img;
//          }
//      }


//      // pipes:
//      int pipeX = boardWidth;
//      int pipeY = 0;
//      int pipeWidth= 64;
//      int pipeHeight = 512;

//      class Pipe{
//          int x = pipeX;
//          int y = pipeY;
//          int width = pipeWidth;
//          int height = pipeHeight;
//          Image img;
//          boolean passed = false;

//          Pipe(Image img){
//              this.img = img;
//          }
//      }


//      // game logic:
//      Bird bird;
//      int velocityX = -4;

//      int velocityY = 0;
//      int gravity = 1;

//      ArrayList<Pipe> pipes;

//      Timer gameLoop;
//      Timer placePipesTimer;


//      FlappyBird(){
//          setPreferredSize(new Dimension(boardWidth, boardHeight));

//          setFocusable(true);
//          addKeyListener(this);


//          backgroundImg = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();


//          birdImg = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();

//          topPipeImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();

//          bottomPipeImg = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();

//          // bird
//          bird = new Bird(birdImg);

//          pipes = new ArrayList<Pipe>();

//          placePipesTimer = new Timer(1500, new ActionListener() {
//              @Override
//              public void actionPerformed(ActionEvent e){
//                  placePipes();
//              }
//          });// ein timer der unser pipes jede 1.5 sekunden zeigt.

//          // (2)
//          placePipesTimer.start();


//          // game timer:
//          gameLoop = new Timer(1000/60, this);
//          gameLoop.start();

//      }

//      public void placePipes(){// neue pipes stellen.
//          Pipe topPipe = new Pipe(topPipeImg);
//          pipes.add(topPipe);
//      }

//      public void paintComponent(Graphics g){
//          super.paintComponent(g);
//          draw(g);
//      }

//      public void draw(Graphics g){
//          g.drawImage(backgroundImg, 0, 0, boardWidth,boardHeight,null);

//      // bird
//          g.drawImage(bird.img, bird.x, bird.y, bird.width, bird.height, null);


//      // pipes: zeichnung der pipes
//      for (int i = 0; i < pipes.size(); i++){
//          Pipe pipe = pipes.get(i);
//          g.drawImage(pipe.img, pipe.x, pipe.y, pipe.width, pipe.height, null); // und machen wir das gleiche in unsere move funktion.
//      }}

//      public void move(){
//          // bird
//          velocityY += gravity;
//          bird.y += velocityY;
//          bird.y = Math.max(bird.y, 0);

//          // pipes: bewegung der pipes
//          for (int i = 0; i < pipes.size(); i++){
//              Pipe pipe = pipes.get(i);
//              pipe.x += velocityX;// velocityX ist -4 und zwar bewegen wir unser pipes mit -4 nach links.
//              // jzt da wir alles haben, lass und der placePipesTimer starten (2)
//      }}

//      @Override
//      public void actionPerformed(ActionEvent e) {

//          move();

//          repaint();
//      }

//      @Override
//      public void keyPressed(KeyEvent e) {
//          if(e.getKeyCode() == KeyEvent.VK_SPACE){
//              velocityY = -9;
//          }
//      }

//      @Override
//      public void keyTyped(KeyEvent e) {
//      }

//      @Override
//      public void keyReleased(KeyEvent e) {
//      }


//  }












//  // jzt müssen wir die position unseres pipes zufällig erstellen:





//  // draw the pipes:


//  import java.awt.*;
//  import java.awt.event.*;
//  import java.util.ArrayList;
//  import java.util.Random;
//  import javax.swing.*;

//  public class FlappyBird extends JPanel implements ActionListener, KeyListener{

//      int boardWidth = 360;
//      int boardHeight = 640;


//      Image backgroundImg;
//      Image birdImg;
//      Image topPipeImg;
//      Image bottomPipeImg;


//      // Bird:
//      int birdX = boardWidth/8;
//      int birdY = boardHeight/2;
//      int birdWidth = 34;
//      int birdHeight = 24;

//      class Bird{
//          int x = birdX;
//          int y = birdY;
//          int width = birdWidth;
//          int height = birdHeight;
//          Image img;

//          Bird(Image img){
//              this.img = img;
//          }
//      }


//      // pipes:
//      int pipeX = boardWidth;
//      int pipeY = 0;
//      int pipeWidth= 64;
//      int pipeHeight = 512;

//      class Pipe{
//          int x = pipeX;
//          int y = pipeY;
//          int width = pipeWidth;
//          int height = pipeHeight;
//          Image img;
//          boolean passed = false;

//          Pipe(Image img){
//              this.img = img;
//          }
//      }


//      // game logic:
//      Bird bird;
//      int velocityX = -4;

//      int velocityY = 0;
//      int gravity = 1;

//      ArrayList<Pipe> pipes;

//      Timer gameLoop;
//      Timer placePipesTimer;


//      FlappyBird(){
//          setPreferredSize(new Dimension(boardWidth, boardHeight));

//          setFocusable(true);
//          addKeyListener(this);


//          backgroundImg = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();


//          birdImg = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();

//          topPipeImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();

//          bottomPipeImg = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();

//          // bird
//          bird = new Bird(birdImg);

//          pipes = new ArrayList<Pipe>();


//          Random random = new Random();// dann gehen wir auf placepipes funktion(2)



//          placePipesTimer = new Timer(1500, new ActionListener() {
//              @Override
//              public void actionPerformed(ActionEvent e){
//                  placePipes();
//              }
//          });
//          placePipesTimer.start();


//          // game timer:
//          gameLoop = new Timer(1000/60, this);
//          gameLoop.start();

//      }

//      public void placePipes(){// neue pipes stellen.

//          // (2)
//          int randomPipeY = (int)(pipeY - pipeHeight/4 - Math.random()*(pipeHeight/2));
//          // pipeHeight / 4: Dieser Ausdruck berechnet ein Viertel der Höhe des Rohrs.
//          // Es wird von der Standardposition (pipeY) abgezogen, um die y-Position nach unten zu verschieben, d.h., das Rohr wird etwas weiter nach unten von der Standardposition gesetzt.
//          // Math.random() * (pipeHeight / 2):
//          // Math.random() erzeugt eine zufällige Zahl zwischen 0 und 1.
//          // Wenn wir diese Zahl mit (pipeHeight / 2) multiplizieren, erhalten wir eine zufällige Verschiebung, die bis zur Hälfte der Rohrhöhe reicht.
//          // Dadurch kann das Rohr zufällig weiter nach oben oder unten verschoben werden. da das jzt einen double zurückgibt, müssen wir das auf einen Integer casten.
//          // Gesamtausdruck:
//          // pipeY - (pipeHeight / 4) - (Math.random() * (pipeHeight / 2)):
//          // Zuerst wird die Standardposition pipeY um ein Viertel der Rohrhöhe (pipeHeight / 4) nach unten verschoben.
//          // Dann wird diese neue Position mit einer zufälligen Zahl subtrahiert (Math.random() * (pipeHeight / 2)), sodass das Rohr zufällig höher oder tiefer gesetzt wird.
//          // Dadurch wird die vertikale Position des Rohrs zufällig innerhalb eines bestimmten Bereichs variiert zwischen viertel des pipeheights und dreiviertel des pipeheights, sodass die Rohre nicht alle in einer Linie sind.

//          Pipe topPipe = new Pipe(topPipeImg);

//          //(2)
//          topPipe.y = randomPipeY;

//          pipes.add(topPipe);
//      }

//      public void paintComponent(Graphics g){
//          super.paintComponent(g);
//          draw(g);
//      }

//      public void draw(Graphics g){
//          g.drawImage(backgroundImg, 0, 0, boardWidth,boardHeight,null);

//      // bird
//          g.drawImage(bird.img, bird.x, bird.y, bird.width, bird.height, null);


//      // pipes: zeichnung der pipes
//      for (int i = 0; i < pipes.size(); i++){
//          Pipe pipe = pipes.get(i);
//          g.drawImage(pipe.img, pipe.x, pipe.y, pipe.width, pipe.height, null);
//      }}

//      public void move(){
//          // bird
//          velocityY += gravity;
//          bird.y += velocityY;
//          bird.y = Math.max(bird.y, 0);

//          // pipes: bewegung der pipes
//          for (int i = 0; i < pipes.size(); i++){
//              Pipe pipe = pipes.get(i);
//              pipe.x += velocityX;
//      }}

//      @Override
//      public void actionPerformed(ActionEvent e) {

//          move();

//          repaint();
//      }

//      @Override
//      public void keyPressed(KeyEvent e) {
//          if(e.getKeyCode() == KeyEvent.VK_SPACE){
//              velocityY = -9;
//          }
//      }

//      @Override
//      public void keyTyped(KeyEvent e) {
//      }

//      @Override
//      public void keyReleased(KeyEvent e) {
//      }


//  }










//  // lass uns jzt bottom pipes hinzufügen:


//  import java.awt.*;
//  import java.awt.event.*;
//  import java.util.ArrayList;
//  import java.util.Random;
//  import javax.swing.*;

//  public class FlappyBird extends JPanel implements ActionListener, KeyListener{

//      int boardWidth = 360;
//      int boardHeight = 640;


//      Image backgroundImg;
//      Image birdImg;
//      Image topPipeImg;
//      Image bottomPipeImg;


//      // Bird:
//      int birdX = boardWidth/8;
//      int birdY = boardHeight/2;
//      int birdWidth = 34;
//      int birdHeight = 24;

//      class Bird{
//          int x = birdX;
//          int y = birdY;
//          int width = birdWidth;
//          int height = birdHeight;
//          Image img;

//          Bird(Image img){
//              this.img = img;
//          }
//      }


//      // pipes:
//      int pipeX = boardWidth;
//      int pipeY = 0;
//      int pipeWidth= 64;
//      int pipeHeight = 512;

//      class Pipe{
//          int x = pipeX;
//          int y = pipeY;
//          int width = pipeWidth;
//          int height = pipeHeight;
//          Image img;
//          boolean passed = false;

//          Pipe(Image img){
//              this.img = img;
//          }
//      }


//      // game logic:
//      Bird bird;
//      int velocityX = -4;

//      int velocityY = 0;
//      int gravity = 1;

//      ArrayList<Pipe> pipes;

//      Timer gameLoop;
//      Timer placePipesTimer;


//      FlappyBird(){
//          setPreferredSize(new Dimension(boardWidth, boardHeight));

//          setFocusable(true);
//          addKeyListener(this);


//          backgroundImg = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();


//          birdImg = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();

//          topPipeImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();

//          bottomPipeImg = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();

//          // bird
//          bird = new Bird(birdImg);

//          pipes = new ArrayList<Pipe>();


//          Random random = new Random();


//          placePipesTimer = new Timer(1500, new ActionListener() {
//              @Override
//              public void actionPerformed(ActionEvent e){
//                  placePipes();
//              }
//          });
//          placePipesTimer.start();


//          // game timer:
//          gameLoop = new Timer(1000/60, this);
//          gameLoop.start();

//      }

//      public void placePipes(){// neue pipes stellen.

//          int randomPipeY = (int)(pipeY - pipeHeight/4 - Math.random()*(pipeHeight/2));

//          // um die bottompipes zu erstellen wir müssen einen offenen bereich erstellen, in dem der bird durch gehen kann.
//          int openingSpace = boardHeight/4;

//          Pipe topPipe = new Pipe(topPipeImg);
//          topPipe.y = randomPipeY;
//          pipes.add(topPipe);

//          Pipe bottomPipe = new Pipe(bottomPipeImg);
//          // bottompipe wird anfangen wo die toppipe endet + openingspace.
//          bottomPipe.y = topPipe.y + pipeHeight + openingSpace;
//          // dann fügen wir unsere bottompipe zum Arraylist:
//          pipes.add(bottomPipe);
//      }

//      public void paintComponent(Graphics g){
//          super.paintComponent(g);
//          draw(g);
//      }

//      public void draw(Graphics g){
//          g.drawImage(backgroundImg, 0, 0, boardWidth,boardHeight,null);

//      // bird
//          g.drawImage(bird.img, bird.x, bird.y, bird.width, bird.height, null);


//      // pipes: zeichnung der pipes
//      for (int i = 0; i < pipes.size(); i++){
//          Pipe pipe = pipes.get(i);
//          g.drawImage(pipe.img, pipe.x, pipe.y, pipe.width, pipe.height, null);
//      }}

//      public void move(){
//          // bird
//          velocityY += gravity;
//          bird.y += velocityY;
//          bird.y = Math.max(bird.y, 0);

//          // pipes: bewegung der pipes
//          for (int i = 0; i < pipes.size(); i++){
//              Pipe pipe = pipes.get(i);
//              pipe.x += velocityX;
//      }}

//      @Override
//      public void actionPerformed(ActionEvent e) {

//          move();

//          repaint();
//      }

//      @Override
//      public void keyPressed(KeyEvent e) {
//          if(e.getKeyCode() == KeyEvent.VK_SPACE){
//              velocityY = -9;
//          }
//      }

//      @Override
//      public void keyTyped(KeyEvent e) {
//      }

//      @Override
//      public void keyReleased(KeyEvent e) {
//      }


//  }









//  // jzt müssen wir unsere gameover situationen behandlen.


//  import java.awt.*;
//  import java.awt.event.*;
//  import java.util.ArrayList;
//  import java.util.Random;
//  import javax.swing.*;

//  public class FlappyBird extends JPanel implements ActionListener, KeyListener{

//      int boardWidth = 360;
//      int boardHeight = 640;


//      Image backgroundImg;
//      Image birdImg;
//      Image topPipeImg;
//      Image bottomPipeImg;


//      // Bird:
//      int birdX = boardWidth/8;
//      int birdY = boardHeight/2;
//      int birdWidth = 34;
//      int birdHeight = 24;

//      class Bird{
//          int x = birdX;
//          int y = birdY;
//          int width = birdWidth;
//          int height = birdHeight;
//          Image img;

//          Bird(Image img){
//              this.img = img;
//          }
//      }


//      // pipes:
//      int pipeX = boardWidth;
//      int pipeY = 0;
//      int pipeWidth= 64;
//      int pipeHeight = 512;

//      class Pipe{
//          int x = pipeX;
//          int y = pipeY;
//          int width = pipeWidth;
//          int height = pipeHeight;
//          Image img;
//          boolean passed = false;

//          Pipe(Image img){
//              this.img = img;
//          }
//      }


//      // game logic:
//      Bird bird;
//      int velocityX = -4;

//      int velocityY = 0;
//      int gravity = 1;

//      ArrayList<Pipe> pipes;

//      Timer gameLoop;
//      Timer placePipesTimer;

//      // hier füge ich eine neue Variable hinzu:
//      boolean gameOver = false;// wir haben zwei szenarios wo wir unsere gameover true ist, eine ist wenn der bird aus dem Bildschirm runtergeht, die zweite ist wenn der bird mit einem pipe collidiert, lass uns in unsere move funktion eine schleife hinzufügen


//      FlappyBird(){
//          setPreferredSize(new Dimension(boardWidth, boardHeight));

//          setFocusable(true);
//          addKeyListener(this);


//          backgroundImg = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();


//          birdImg = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();

//          topPipeImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();

//          bottomPipeImg = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();

//          // bird
//          bird = new Bird(birdImg);

//          pipes = new ArrayList<Pipe>();


//          Random random = new Random();


//          placePipesTimer = new Timer(1500, new ActionListener() {
//              @Override
//              public void actionPerformed(ActionEvent e){
//                  placePipes();
//              }
//          });
//          placePipesTimer.start();


//          // game timer:
//          gameLoop = new Timer(1000/60, this);
//          gameLoop.start();

//      }

//      public void placePipes(){// neue pipes stellen.

//          int randomPipeY = (int)(pipeY - pipeHeight/4 - Math.random()*(pipeHeight/2));

//          int openingSpace = boardHeight/4;

//          Pipe topPipe = new Pipe(topPipeImg);
//          topPipe.y = randomPipeY;
//          pipes.add(topPipe);

//          Pipe bottomPipe = new Pipe(bottomPipeImg);
//          bottomPipe.y = topPipe.y + pipeHeight + openingSpace;
//          pipes.add(bottomPipe);
//      }

//      public void paintComponent(Graphics g){
//          super.paintComponent(g);
//          draw(g);
//      }

//      public void draw(Graphics g){
//          g.drawImage(backgroundImg, 0, 0, boardWidth,boardHeight,null);

//      // bird
//          g.drawImage(bird.img, bird.x, bird.y, bird.width, bird.height, null);


//      // pipes: zeichnung der pipes
//      for (int i = 0; i < pipes.size(); i++){
//          Pipe pipe = pipes.get(i);
//          g.drawImage(pipe.img, pipe.x, pipe.y, pipe.width, pipe.height, null);
//      }}

//      public void move(){
//          // bird
//          velocityY += gravity;
//          bird.y += velocityY;
//          bird.y = Math.max(bird.y, 0);

//          // pipes: bewegung der pipes
//          for (int i = 0; i < pipes.size(); i++){
//              Pipe pipe = pipes.get(i);
//              pipe.x += velocityX;
//      }

//          if(bird.y > boardHeight){
//              gameOver = true;
//          }// dann in unsere actionperformed funktion auch :
//  }

//      @Override
//      public void actionPerformed(ActionEvent e) {

//          move();
//          repaint();

//          if(gameOver){
//              placePipesTimer.stop();// das wird die erstellung neue pipes stoppen.
//              gameLoop.stop();// das stoppt die repainting und aktualisierung unseres Fensters.
//          }
//      }

//      @Override
//      public void keyPressed(KeyEvent e) {
//          if(e.getKeyCode() == KeyEvent.VK_SPACE){
//              velocityY = -9;
//          }
//      }

//      @Override
//      public void keyTyped(KeyEvent e) {
//      }

//      @Override
//      public void keyReleased(KeyEvent e) {
//      }
//  }








//  zweite szenario:


//  import java.awt.*;
//  import java.awt.event.*;
//  import java.util.ArrayList;
//  import java.util.Random;
//  import javax.swing.*;

//  public class FlappyBird extends JPanel implements ActionListener, KeyListener{

//      int boardWidth = 360;
//      int boardHeight = 640;


//      Image backgroundImg;
//      Image birdImg;
//      Image topPipeImg;
//      Image bottomPipeImg;


//      // Bird:
//      int birdX = boardWidth/8;
//      int birdY = boardHeight/2;
//      int birdWidth = 34;
//      int birdHeight = 24;

//      class Bird{
//          int x = birdX;
//          int y = birdY;
//          int width = birdWidth;
//          int height = birdHeight;
//          Image img;

//          Bird(Image img){
//              this.img = img;
//          }
//      }


//      // pipes:
//      int pipeX = boardWidth;
//      int pipeY = 0;
//      int pipeWidth= 64;
//      int pipeHeight = 512;

//      class Pipe{
//          int x = pipeX;
//          int y = pipeY;
//          int width = pipeWidth;
//          int height = pipeHeight;
//          Image img;
//          boolean passed = false;

//          Pipe(Image img){
//              this.img = img;
//          }
//      }


//      // game logic:
//      Bird bird;
//      int velocityX = -4;

//      int velocityY = 0;
//      int gravity = 1;

//      ArrayList<Pipe> pipes;

//      Timer gameLoop;
//      Timer placePipesTimer;
//      boolean gameOver = false;

//      FlappyBird(){
//          setPreferredSize(new Dimension(boardWidth, boardHeight));

//          setFocusable(true);
//          addKeyListener(this);


//          backgroundImg = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();


//          birdImg = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();

//          topPipeImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();

//          bottomPipeImg = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();

//          // bird
//          bird = new Bird(birdImg);

//          pipes = new ArrayList<Pipe>();


//          Random random = new Random();


//          placePipesTimer = new Timer(1500, new ActionListener() {
//              @Override
//              public void actionPerformed(ActionEvent e){
//                  placePipes();
//              }
//          });
//          placePipesTimer.start();


//          // game timer:
//          gameLoop = new Timer(1000/60, this);
//          gameLoop.start();

//      }

//      public void placePipes(){// neue pipes stellen.

//          int randomPipeY = (int)(pipeY - pipeHeight/4 - Math.random()*(pipeHeight/2));

//          int openingSpace = boardHeight/4;

//          Pipe topPipe = new Pipe(topPipeImg);
//          topPipe.y = randomPipeY;
//          pipes.add(topPipe);

//          Pipe bottomPipe = new Pipe(bottomPipeImg);
//          bottomPipe.y = topPipe.y + pipeHeight + openingSpace;
//          pipes.add(bottomPipe);
//      }

//      public void paintComponent(Graphics g){
//          super.paintComponent(g);
//          draw(g);
//      }

//      public void draw(Graphics g){
//          g.drawImage(backgroundImg, 0, 0, boardWidth,boardHeight,null);

//      // bird
//          g.drawImage(bird.img, bird.x, bird.y, bird.width, bird.height, null);


//      // pipes: zeichnung der pipes
//      for (int i = 0; i < pipes.size(); i++){
//          Pipe pipe = pipes.get(i);
//          g.drawImage(pipe.img, pipe.x, pipe.y, pipe.width, pipe.height, null);
//      }}

//      public void move(){
//          // bird
//          velocityY += gravity;
//          bird.y += velocityY;
//          bird.y = Math.max(bird.y, 0);

//          // pipes: bewegung der pipes
//          for (int i = 0; i < pipes.size(); i++){
//              Pipe pipe = pipes.get(i);
//              pipe.x += velocityX;

//              // (2)
//              if (collision(bird, pipe)){
//                  gameOver = true;
//              }
//      }


//          if(bird.y > boardHeight){
//              gameOver = true;
//          }
//  }

//      @Override
//      public void actionPerformed(ActionEvent e) {

//          move();
//          repaint();

//          if(gameOver){
//              placePipesTimer.stop();
//              gameLoop.stop();
//          }
//      }

//      // eine methode um die kollision zu überprüfen
//      public boolean collision(Bird a, Pipe b){
//          return a.x < b.x + b.width &&
//                 a.x + a.width > b.x &&
//                 a.y < b.y + b.height &&
//                 a.y + a.height > b.y;

//                 /*Der Algorithmus basiert auf der axis-aligned bounding box (AABB) Kollisionserkennung. Die Logik vergleicht die Kanten der Rechtecke des Vogels und des Rohrs:

//  Kondition 1: a.x < b.x + b.width
//  Prüft, ob die linke Kante des Vogels links von der rechten Kante des Rohrs ist.
//  Wenn a.x (linke Kante des Vogels) kleiner ist als b.x + b.width (rechte Kante des Rohrs), befinden sich die Objekte möglicherweise nebeneinander.
//  Kondition 2: a.x + a.width > b.x
//  Prüft, ob die rechte Kante des Vogels rechts von der linken Kante des Rohrs ist.
//  Wenn a.x + a.width (rechte Kante des Vogels) größer ist als b.x (linke Kante des Rohrs), überlappen sich die Objekte möglicherweise horizontal.
//  Kondition 3: a.y < b.y + b.height
//  Prüft, ob die obere Kante des Vogels über der unteren Kante des Rohrs ist.
//  Wenn a.y (obere Kante des Vogels) kleiner ist als b.y + b.height (untere Kante des Rohrs), befinden sich die Objekte möglicherweise vertikal nebeneinander.
//  Kondition 4: a.y + a.height > b.y
//  Prüft, ob die untere Kante des Vogels unter der oberen Kante des Rohrs ist.
//  Wenn a.y + a.height (untere Kante des Vogels) größer ist als b.y (obere Kante des Rohrs), überlappen sich die Objekte möglicherweise vertikal.
//  Fazit
//  Die Methode collision gibt true zurück, wenn alle vier Bedingungen erfüllt sind, d.h., wenn sich die beiden Rechtecke (der Vogel und das Rohr) tatsächlich überlappen. Andernfalls gibt sie false zurück. */
//  // dann in unsere move methode erstellen wir auch eine überprüfungs schleife. (2)
//      }

//      @Override
//      public void keyPressed(KeyEvent e) {
//          if(e.getKeyCode() == KeyEvent.VK_SPACE){
//              velocityY = -9;
//          }
//      }

//      @Override
//      public void keyTyped(KeyEvent e) {
//      }

//      @Override
//      public void keyReleased(KeyEvent e) {
//      }
//  }












import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class FlappyBird extends JPanel implements ActionListener, KeyListener{

    int boardWidth = 360;
    int boardHeight = 640;


    Image backgroundImg;
    Image birdImg;
    Image topPipeImg;
    Image bottomPipeImg;


    // Bird:
    int birdX = boardWidth/8;
    int birdY = boardHeight/2;
    int birdWidth = 34;
    int birdHeight = 24;

    class Bird{
        int x = birdX;
        int y = birdY;
        int width = birdWidth;
        int height = birdHeight;
        Image img;

        Bird(Image img){
            this.img = img;
        }
    }


    // pipes:
    int pipeX = boardWidth;
    int pipeY = 0;
    int pipeWidth= 64;
    int pipeHeight = 512;

    class Pipe{
        int x = pipeX;
        int y = pipeY;
        int width = pipeWidth;
        int height = pipeHeight;
        Image img;
        boolean passed = false;

        Pipe(Image img){
            this.img = img;
        }
    }


    // game logic:
    Bird bird;
    int velocityX = -3;

    int velocityY = 0;
    int gravity = 1;

    ArrayList<Pipe> pipes;

    Timer gameLoop;
    Timer placePipesTimer;
    boolean gameOver = false;

    // hier erstellen wir auch einen double score um die score zu aktualisieren:
    double score = 0; // dann gehen wir auf unsere move funktion:

    FlappyBird(){
        setPreferredSize(new Dimension(boardWidth, boardHeight));

        setFocusable(true);
        addKeyListener(this);


        backgroundImg = new ImageIcon(getClass().getResource("/flappybirdbg.png")).getImage();


        birdImg = new ImageIcon(getClass().getResource("/flappybird.png")).getImage();

        topPipeImg = new ImageIcon(getClass().getResource("/toppipe.png")).getImage();

        bottomPipeImg = new ImageIcon(getClass().getResource("/bottompipe.png")).getImage();

        // bird
        bird = new Bird(birdImg);

        pipes = new ArrayList<Pipe>();


        Random random = new Random();


        placePipesTimer = new Timer(1500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                placePipes();
            }
        });
        placePipesTimer.start();


        // game timer:
        gameLoop = new Timer(1000/60, this);
        gameLoop.start();

    }

    public void placePipes(){

        int randomPipeY = (int)(pipeY - pipeHeight/4 - Math.random()*(pipeHeight/2));

        int openingSpace = boardHeight/4;

        Pipe topPipe = new Pipe(topPipeImg);
        topPipe.y = randomPipeY;
        pipes.add(topPipe);

        Pipe bottomPipe = new Pipe(bottomPipeImg);
        bottomPipe.y = topPipe.y + pipeHeight + openingSpace;
        pipes.add(bottomPipe);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g){
        g.drawImage(backgroundImg, 0, 0, boardWidth,boardHeight,null);

        // bird
        g.drawImage(bird.img, bird.x, bird.y, bird.width, bird.height, null);


        // pipes: zeichnung der pipes
        for (int i = 0; i < pipes.size(); i++){
            Pipe pipe = pipes.get(i);
            g.drawImage(pipe.img, pipe.x, pipe.y, pipe.width, pipe.height, null);
        }
        // (3)
        // score:
        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.PLAIN, 32));
        if(gameOver){
            g.drawString("Game Over: "+ String.valueOf((int) score), 10, 35);
        }else{
            g.drawString(String.valueOf((int) score), 10, 35);
        }// das letzte was wir machen können ist nur das spiel zurücksetzen wenn wir auf der leertaste drücken. das machen wir einfach in die keypressed funktion


    }

    public void move(){
        // bird
        velocityY += gravity;
        bird.y += velocityY;
        bird.y = Math.max(bird.y, 0);

        // pipes: bewegung der pipes
        for (int i = 0; i < pipes.size(); i++){
            Pipe pipe = pipes.get(i);
            pipe.x += velocityX;

            // (2)
            if(!pipe.passed && bird.x > pipe.x + pipe.width){// also wenn der bird.x größer als der pipe.x und pipe.width zusammen, das bedeutet bird hat es schon vorbeigegangen.
                pipe.passed = true;
                score += 0.5;// da wir zwei pipes haben also je zwei pipes top und bottom bekommen wir einen punkt.
                // lass uns jzt unser score in draw funktion zeigen. (3)
            }

            if (collision(bird, pipe)){
                gameOver = true;
            }
        }


        if(bird.y > boardHeight){
            gameOver = true;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        move();
        repaint();

        if(gameOver){
            placePipesTimer.stop();
            gameLoop.stop();
        }
    }
    public boolean collision(Bird a, Pipe b){
        return a.x < b.x + b.width &&
                a.x + a.width > b.x &&
                a.y < b.y + b.height &&
                a.y + a.height > b.y;

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            velocityY = -9;

            if(gameOver){
                // wir überprüfen ob wir gameover haben, dann setzen wir unsere Einstellungen zurück auf dem klick der leertaste.
                bird.y = birdY;
                velocityY = 0;
                pipes.clear();
                score = 0;
                gameOver = false;
                gameLoop.start();
                placePipesTimer.start();
            }
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}

