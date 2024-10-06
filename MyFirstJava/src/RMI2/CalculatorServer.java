package RMI2;


// Der Einsatz von Factories ist besonders nützlich, wenn jede Client-Session mit einem eigenen Zustand arbeiten soll.
// Hier werden wir eine Calculator-Anwendung als Beispiel verwenden, die eine Factory verwendet, um individuelle Calculator-Instanzen für jeden Client zu erstellen.
// dafür erstellen wir ein paar klassen und interfaces.
// fangen wir an mit der erstellung vom interface "CalculatorFactory.java"
// 2. klasse "CalculatorFactoryImpl.java"
// 3. Interface "Calculator.java "
// 4. Klasse "CalculatorImpl.java"
// 5. server Klasse "Server.java"
// 6. Klasse "CalculatorClient.java"


import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorServer {
    public static void main(String[] args) {
        try {
            CalculatorFactory factory = new CalculatorFactoryImpl();
            Registry registry = LocateRegistry.getRegistry(1099);// Der Server registriert die CalculatorFactoryImpl in der RMI-Registry.

            registry.rebind("CalculatorFactory", factory);
            System.out.println("CalculatorFactory ist registriert und bereit.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
// jzt ist Die Factory unter dem Namen "CalculatorFactory" verfügbar und kann von Clients genutzt werden, um eigene Calculator-Instanzen zu erstellen.



// am ende können wir wie üblich die Calculator Server starten aber zu erst führen wir die kompilierungsbefehl aus in unserem pfad:
//"javac -d . *.java"


// 2. Neu kompilieren
//Stelle sicher, dass du dich im äußeren RMI2-Verzeichnis befindest und kompiliere alle Dateien erneut:

//javac -d . *.java
//Dies erstellt die kompilierten .class-Dateien im richtigen RMI2-Unterverzeichnis innerhalb des RMI2-Verzeichnisses.
//
//3. RMI-Registry starten
//Stelle sicher, dass du dich im Verzeichnis RMI2 befindest, und starte rmiregistry von diesem Verzeichnis aus:

//rmiregistry 1099


//4. Server starten
//Wenn die rmiregistry gestartet ist, führe den Server wie folgt aus:

//java -cp . RMI2.CalculatorServer


//5. Client starten
//Wenn der Server erfolgreich gestartet wurde, öffne ein neues Terminal, gehe wieder in das RMI2-Verzeichnis und führe den Client aus:

//java -cp . RMI2.CalculatorClient