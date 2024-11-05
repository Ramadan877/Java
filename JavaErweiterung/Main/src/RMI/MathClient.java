package RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MathClient {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        MathService mathService = (MathService) Naming.lookup("rmi://localhost:1099/MathService");

        System.out.println("Addition:" + mathService.add(5, 3));
        System.out.println("Subtraction: " + mathService.subtract(5, 3));
    }
}
