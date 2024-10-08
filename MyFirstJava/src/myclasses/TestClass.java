package myclasses;

import java.io.Serializable;

public class TestClass implements Serializable {
    private static final long serialVersionUID = 1L;
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayHello() {
        System.out.println(message);
    }
}

