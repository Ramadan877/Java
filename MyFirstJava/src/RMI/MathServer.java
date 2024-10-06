package RMI;
//RMI "Remote Method Invocation" ;

//
//1. Grundlagen von RMI
//        RMI (Remote Method Invocation) ermöglicht es, Methoden von Objekten, die sich auf unterschiedlichen Java-VMs befinden, über das Netzwerk aufzurufen, als ob es sich um lokale Methodenaufrufe handeln würde. Es abstrahiert die Kommunikation über das Netzwerk, sodass Entwickler sich auf die Logik konzentrieren können.
//
//        2. Struktur eines RMI-Programms
//        Ein einfaches RMI-Programm besteht aus den folgenden Komponenten:
//
//        Remote Interface: Definiert die Methoden, die remote aufgerufen werden können.
//        Remote Object Implementierung: Implementiert das Remote Interface und enthält die Geschäftslogik.
//        Server: Registriert das Remote Object in der RMI-Registry und macht es den Clients verfügbar.
//        Client: Ruft die Methoden des Remote Object über die RMI-Registry auf.



//Schritt 1: Remote Interface erstellen:
// Das Interface definiert die Methoden, die remote aufgerufen werden können. Es muss extends Remote sein und alle Methoden müssen throws RemoteException deklarieren.

//import java.rmi.Remote;
//import java.rmi.RemoteException;
//
//public interface MathService extends Remote {
//    int add(int a, int b) throws RemoteException;
//    int subtract(int a, int b) throws RemoteException;
//}





//Schritt 2: Remote Object Implementierung erstellen
// Die Implementierungsklasse muss das Interface implementieren und UnicastRemoteObject erweitern, um remote aufgerufen werden zu können.

// import java.rmi.server.UnicastRemoteObject;
//import java.rmi.RemoteException;
//
//public class MathServiceImpl extends UnicastRemoteObject implements MathService {
//    // Standardkonstruktor
//    public MathServiceImpl() throws RemoteException {
//        super();
//    }
//
//    @Override
//    public int add(int a, int b) throws RemoteException {
//        System.out.println("Addition: " + a + " + " + b);
//        return a + b;
//    }
//
//    @Override
//    public int subtract(int a, int b) throws RemoteException {
//        System.out.println("Subtraktion: " + a + " - " + b);
//        return a - b;
//    }
//}



//Schritt 3: Server erstellen
//Der Server erstellt eine Instanz der Implementierungsklasse, registriert sie in der RMI-Registry und macht sie für Clients zugänglich.


import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MathServer {
    public static void main(String[] args) {
        try {
            // Instanz des Remote-Objekts erstellen
            MathService mathService = new MathServiceImpl();

            // RMI-Registry erstellen und Objekt binden
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("MathService", mathService);

            System.out.println("MathService ist registriert und bereit.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Erklärung:
//
//Der Server ist dafür verantwortlich, das Remote-Objekt zu erstellen und es der RMI-Registry bekannt zu machen.
//Der Server verwendet LocateRegistry.createRegistry(1099), um eine RMI-Registry auf dem Standardport 1099 zu erstellen.
//Anschließend wird das MathService-Objekt mit dem Namen "MathService" in der Registry registriert.
//Dies bedeutet, dass Clients jetzt nach dem Namen "MathService" suchen können, um das Remote-Objekt zu finden.
//Die Konsole zeigt die Nachricht "MathService ist registriert und bereit.", um anzuzeigen, dass der Server erfolgreich gestartet wurde.







////Schritt 4: Client erstellen
////
////Der Client sucht nach dem Remote-Objekt in der Registry und ruft die Methoden auf.
//
// class RMI.MathClient {
//    public static void main(String[] args) {
//        try {
//            // Verbindung zum entfernten Dienst herstellen
//            MathService mathService = (MathService) Naming.lookup("rmi://localhost:1099/MathService");
//
//            // Remote-Methoden aufrufen
//            System.out.println("Addition (5 + 3): " + mathService.add(5, 3));
//            System.out.println("Subtraktion (5 - 3): " + mathService.subtract(5, 3));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}






// Schritt 5: Anwendung ausführen
//Server starten: Führe die MathServer-Klasse aus "java MathServer".
// Dadurch wird der RMI-Server gestartet und das MathService-Objekt wird in der Registry registriert.

//Client starten: Starte den Client, indem du die MathClient-Klasse ausführst "java MathClient". Der Client verbindet sich mit dem Server und ruft die Methoden add und subtract auf.



// Zusammenfassung:
//RMI erlaubt es, Methoden eines entfernten Objekts so aufzurufen, als wären sie lokal.
//Remote Interface: Definiert die Methoden, die remote aufgerufen werden können.
//Remote Implementierung: Implementiert die Methoden und erbt UnicastRemoteObject.
//Server: Registriert das Remote-Objekt in der RMI-Registry.
//Client: Ruft das Remote-Objekt ab und verwendet dessen Methoden.





// Jzt lass uns eine neue package erstellen um den konzept von Factories zu verstehen:(Erstellung von statusbehafteten Objekten)
//RMI2 Package