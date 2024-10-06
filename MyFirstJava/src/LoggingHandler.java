// HelloService:

//import java.lang.reflect.InvocationHandler;
//import java.lang.reflect.Method;
//
//public class LoggingHandler implements InvocationHandler {// LoggingHandler implementiert das InvocationHandler-Interface.
//
//    private final Object target;
//// target ist das eigentliche Objekt (HelloServiceImpl), auf das die Methodenaufrufe weitergeleitet werden.
//
//    public LoggingHandler(Object target) {
//        this.target = target; // Das Objekt, auf das der Proxy zugreifen soll
//    }
//
//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//
//        System.out.println("Vor dem Aufruf der Methode: " + method.getName());
//
//        // Rufe die Methode auf dem Zielobjekt auf
//        Object result = method.invoke(target, args);
////// das invoke wird jedes Mal aufgerufen, wenn eine Methode auf dem Proxy-Objekt ausgeführt wird.
//
//        System.out.println("Nach dem Aufruf der Methode: " + method.getName());
//        return result;
//    }
//}






// MathService:
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
// Diese Klassen gehören zum Reflection API, das in Java verwendet wird, um dynamisch zur Laufzeit auf Klassen und Methoden zuzugreifen.

public class LoggingHandler implements InvocationHandler {// LoggingHandler implementiert das Interface InvocationHandler:

    private final Object target;
//Die private Variable target speichert das Objekt, auf dem die tatsächlichen Methodenaufrufe ausgeführt werden sollen.


    public LoggingHandler(Object target) {
        this.target = target;
    }//Konstruktor: Initialisiert das target-Objekt. Dieses target ist das eigentliche Objekt, das vom Proxy vertreten wird.

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {// Diese Methode wird aufgerufen, wenn eine Methode auf dem Proxy-Objekt aufgerufen wird.
        // Parameter:
        //proxy: Das Proxy-Objekt selbst.
        //method: Die Methode, die aufgerufen wird.
        //args: Die Argumente, die an die Methode übergeben werden.

        System.out.println(">> Aufruf der Methode: " + method.getName() + " mit Argumenten: " + java.util.Arrays.toString(args));
        Object result = method.invoke(target, args); // Rufe die Methode auf dem realen Objekt auf
        System.out.println("<< Ergebnis der Methode: " + method.getName() + " ist: " + result);
        return result;
    }
}
