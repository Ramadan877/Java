import java.io.*;

public class SerializeDemo {
    public static void main(String[] args) {
        try {
            ClassLoaderDeserialized myObject = new ClassLoaderDeserialized("Hello from MyClass!");

            FileOutputStream fileOut = new FileOutputStream("ClassLoaderDeserialized.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(myObject);
            out.close();
            fileOut.close();

            System.out.println("Serialized data is saved in ClassLoaderDeserialized.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
