package RMI;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class MathServiceImpl extends UnicastRemoteObject implements MathService {
    // Standardkonstruktor
    public MathServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        System.out.println("Addition: " + a + " + " + b);
        return a + b;
    }

    @Override
    public int subtract(int a, int b) throws RemoteException {
        System.out.println("Subtraktion: " + a + " - " + b);
        return a - b;
    }
}
// Erklärung:
//
//Dies ist die Implementierung des MathService-Interfaces.
//Sie muss das MathService-Interface implementieren und die Methoden add und subtract definieren.
//Die Implementierung muss von UnicastRemoteObject erben, um als Remote-Objekt verwendet zu werden. Dadurch wird das Objekt so konfiguriert, dass es über das Netzwerk kommunizieren kann.
//Ein Standardkonstruktor (public MathServiceImpl()) wird benötigt, um UnicastRemoteObject korrekt zu initialisieren.
//Die Methoden add und subtract führen einfache mathematische Operationen aus und geben das Ergebnis zurück.