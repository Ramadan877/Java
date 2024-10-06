package RMIListeners;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

// Implementierung der Calculator-Schnittstelle
public class CalculatorImpl extends UnicastRemoteObject implements Calculator {
    private int value = 0;
    private List<CalculatorListener> listeners = new ArrayList<>();
    // value: Der aktuelle Wert des Rechners.
    //listeners: Eine Liste von registrierten Clients, die benachrichtigt werden sollen.

    public CalculatorImpl() throws RemoteException {
        super();
    }

    @Override
    public void add(int value) throws RemoteException {
        this.value += value;
        System.out.println("Aktueller Wert: " + this.value);
        notifyListeners();
    }// Fügt einen Wert hinzu und benachrichtigt alle Listener.

    @Override
    public int getValue() throws RemoteException {
        return this.value;
    }// Gibt den aktuellen Wert zurück.

    @Override
    public void addCalculatorListener(CalculatorListener listener) throws RemoteException {
        listeners.add(listener);
    }// Fügt einen Listener zur Liste hinzu.

    @Override
    public void removeCalculatorListener(CalculatorListener listener) throws RemoteException {
        listeners.remove(listener);
    }// Entfernt einen Listener aus der Liste.


    private void notifyListeners() throws RemoteException {
        for (CalculatorListener listener : listeners) {
            listener.update(this.value);
        }// Benachrichtigt alle registrierten Listener, wenn sich der Wert ändert
    }
}
