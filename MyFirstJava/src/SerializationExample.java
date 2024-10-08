import myclasses.TestClass;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void main(String[] args) {
        try {
            // TestClass muss serialisierbar sein (implementiert Serializable).
            TestClass obj = new TestClass();
            obj.setMessage("Hello, I am a serialized object!");

            // Speichere das Objekt in einer Datei
            FileOutputStream fileOut = new FileOutputStream("serialized_object.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            out.close();
            fileOut.close();
            System.out.println("Objekt wurde serialisiert und in 'serialized_object.ser' gespeichert.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
