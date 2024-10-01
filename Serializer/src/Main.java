//public class Main {
//    public static void main(String[] args) {
//
//        User user = new User();
//
//        user.name = "Bro";
//        user.password = "I<3Pizza";
//
//        user.sayHello();
//    }
//}
//class User implements Serializable {
//    String name;
//    String password;
//
//    public void sayHello(){
//        System.out.println("Hello" + name);
//    }
//}

// ich will jzt die status dieses objekts speichern
// Steps zum Serialization:
// 1- Dein objekt klasse muss serializable interface implementieren.
// 2- import java.io.Serializable;
// 3- FileOutputStream fileOut = new ObjectOutputStream(filePath);
// 4- ObjectOutput out = new ObjectOutputStream(fileOut);
// 5- out.writeObject(objectName);
// 6- out.close(); fileOut.close();


import java.io.Serializable;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

//        (2)
        User user = new User();

        user.name = "Bro";
        user.password = "I<3Pizza";

//        user.sayHello(); das brauchen wir nicht mehr.
        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);// dann können wir hier einfach add throws deklaration hinzufügen.

        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("object info saved !");
        // dann sehen wir in unserer projekt pfad dass wir ein neues Datei haben.

    }
}
class User implements Serializable {
    String name;
    String password;

    public void sayHello(){
        System.out.println("Hello" + name);
    }
}


// wie können wir diesen Datei jzt deserializen?
// lass uns jzt ein neuen projekt erstellen