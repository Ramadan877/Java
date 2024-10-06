package RMI2;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {
    private int value = 0;
    // CalculatorImpl implementiert das Calculator Interface und verwaltet einen internen Zustand (value).

    public CalculatorImpl() throws RemoteException {
        super();
    }

    @Override
    public void add(int value) throws RemoteException {
        // Die add(int value) Methode erhöht den internen Wert um den gegebenen Wert und gibt den aktuellen Wert auf der Konsole aus.
        this.value += value;
        System.out.println("Aktueller Wert: " + this.value);
    }

    @Override
    public int getValue() throws RemoteException {// getValue() gibt den aktuellen Wert zurück.

        return this.value;
    }
}

