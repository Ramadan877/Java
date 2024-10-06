//import java.lang.reflect.InvocationHandler;
//import java.lang.reflect.Method;
//import java.lang.reflect.Proxy;
//
//public class MultiHandlerProxy implements InvocationHandler {// MultiHandlerProxy implementiert ebenfalls das InvocationHandler-Interface.
//    private final Object target;// Das echte Zielobjekt (z.B. MathServiceImpl), das die Methodenaufrufe tatsächlich verarbeitet.
//
//    private final InvocationHandler[] handlers;// Eine Liste von InvocationHandler-Objekten, die nacheinander ausgeführt werden sollen.
//
//
//    public MultiHandlerProxy(Object target, InvocationHandler... handlers) {
////        this.target = target;
//        this.handlers = handlers;
//    }// Konstruktur.
//
//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        Object result = target; // Das initiale Zielobjekt, also beginnen wir mit dem target objekt.
//        for (InvocationHandler handler : handlers) {// Führe jeden Handler in der Reihenfolge aus .
//            // Nacheinander alle Handler ausführen
//            result = handler.invoke(proxy, method, args);
//            // Jeder Handler kann das Ergebnis (result) modifizieren, bevor es an den nächsten Handler weitergegeben wird.
//        }
//        return result; // Das finale Ergebnis zurückgeben
//    }
//
//    public static void main(String[] args) {
//        // Erstelle eine konkrete Instanz der MathService-Implementierung
//        MathService mathService = new MathServiceImpl();// Das echte Service-Objekt (MathServiceImpl).
//
//        // Definiere die Handler für Logging und Security
//        LoggingHandler loggingHandler = new LoggingHandler(mathService);
//        SecurityHandler securityHandler = new SecurityHandler(mathService);
//        // loggingHandler und securityHandler: Zwei Handler, die das Service-Objekt überwachen.
//
//        // Erstelle einen Proxy mit mehreren Handlers
//        MathService proxy = (MathService) Proxy.newProxyInstance(
//                MathService.class.getClassLoader(),  // ClassLoader
//                new Class[] { MathService.class },    // Interfaces
//                new MultiHandlerProxy(mathService, loggingHandler, securityHandler)
//        );
//        // Zuerst wird LoggingHandler ausgeführt (protokolliert den Aufruf).
//        //Dann wird SecurityHandler ausgeführt (überprüft die Berechtigungen).
//
//        // Teste die Methoden des Proxys
//        try {
//            System.out.println("Ergebnis der Addition: " + proxy.add(15, 5)); // Erfolgreich
//            System.out.println("Ergebnis der Subtraktion: " + proxy.subtract(15, 5)); // Fehler
//        } catch (Exception e) {
//            System.out.println("Fehler: " + e.getMessage());
//        }
//    }
//}// proxy.add(15, 5): Erfolgreich, weil SecurityHandler add-Methoden erlaubt.
////proxy.subtract(15, 5): Wirft eine SecurityException, weil subtract nicht autorisiert ist.
