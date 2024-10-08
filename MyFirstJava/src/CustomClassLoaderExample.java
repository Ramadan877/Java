import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.lang.reflect.Method;

public class CustomClassLoaderExample {

    public static void main(String[] args) {
        try {
            // Pfad zur Klasse TestClass, die im Verzeichnis myclasses liegt.
            URL classUrl = new URL("file://" + System.getProperty("user.dir") + "/src/myclasses/");
            URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{classUrl});

            // Lade die Klasse TestClass aus dem Verzeichnis myclasses.
            Class<?> loadedClass = urlClassLoader.loadClass("myclasses.TestClass");

            // Anstatt eine neue Instanz zu erstellen, deserialisieren wir das Objekt aus der Datei
            FileInputStream fileIn = new FileInputStream("serialized_object.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Object instance = in.readObject();
            in.close();
            fileIn.close();

            // Finde die Methode und rufe sie auf.
            Method method = loadedClass.getMethod("sayHello");
            method.invoke(instance);

            // ClassLoader schließen (nur notwendig ab Java 7).
            urlClassLoader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

