import myclasses.TestClass;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationExample {
    public static void main(String[] args) {
        try {
            // Deserialisiere das Objekt aus der Datei
            FileInputStream fileIn = new FileInputStream("serialized_object.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // Lese das Objekt und caste es in die TestClass
            TestClass obj = (TestClass) in.readObject();
            in.close();
            fileIn.close();

            // Rufe eine Methode des deserialisierten Objekts auf
            obj.sayHello();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
