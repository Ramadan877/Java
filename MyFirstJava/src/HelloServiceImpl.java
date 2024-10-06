public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
// HelloServiceImpl ist die konkrete Implementierung des HelloService-Interfaces.
// Die sayHello-Methode gibt eine Begrüßung zurück, z.B. "Hello, John!".
}
}
