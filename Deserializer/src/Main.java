// Schritte um einen byte stream zu Deserializen:
// 1- unsere objekt deklarieren, "nicht instanzieren"
// 2- unsere klasse muss Serializable interface implementieren.
// 3- importieren wir auch java serializable;
// 4- FileInputStream fileIn = new FileInputStream(file path);
// 5- ObjectInputStream in = new ObjectInputStream(fileIn);
// 6- objectNam = (Class) in.readObject();
// 7- in.close(); fileIn.close();



import java.io.Serializable;
import java.io.*; // lass uns einfach alles importieren.

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Schritt 1:
        User user = null;
        // Schritt 4:
        FileInputStream fileIn = new FileInputStream("//Users//a.ramadan//Desktop//Java//Serializer//UserInfo.ser");
        // Schritt 5:
        ObjectInputStream in = new ObjectInputStream(fileIn);
        // Schritt 6:
        user = (User) in.readObject();
        // Schritt 7:
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();



    }
}
class User implements Serializable {
    String name;
    String password;
    // erinnern wir uns daran, dass wir diese objekte gar nicht zugewiesen haben

    public void sayHello(){
        System.out.println("Hello" + name);
    }
}
// jzt jedes mal wenn wir unsere UserInfo.ser Datei umschreiben mit unserem Serializer projekt Datei, und dann deserialize mit unserem Deserialize projekt bekommen wir die neue Werte .



// wichtige notizen in serialization:

// children klassen von einem parent der serializable implementiert werden das gleiche implementieren.

// static fields werden nicht serialized, da diese zu diese Klasse gehören und nicht zu einem einzelnen objekt, und wenn wir die Werte dieser Klasse serializen, kriegen wir nur diese Werte um sie persistent zu machen und nicht die ganze klasse. genauso wie in diese Zeile:
//user = (User) in.readObject(); wir sollten hier den user casten da wir sonst bekommen einen type dismatch fehler.




// die definition der klasse "class file" selber ist nicht gespeichert, sondern

// die fields die als "transient" serialized wurden, werden ignoriert: zb. in unserer serializable klasse wenn wir folgendes machen :
//class User implements Serializable {
//    String name;
//    transient String password; // kriegen wir einen null wenn wir das deserializen.
//
//
//    public void sayHello(){
//        System.out.println("Hello" + name);
//    }
//}
