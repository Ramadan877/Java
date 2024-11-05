package org.example;

// JAXB-annotierte Klasse
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.*;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            // Erzeuge JAXB Kontext
            JAXBContext context = JAXBContext.newInstance(Student.class);

            // XML in Java-Objekt umwandeln (Unmarshal)
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Student student = (Student) unmarshaller.unmarshal(new File("student.xml"));
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student Age: " + student.getAge());

            // Java-Objekt wieder in XML umwandeln (Marshal)
            student.setAge(25); // Ändere das Alter
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(student, System.out); // Ausgabe in die Konsole
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



@XmlRootElement
class Student {
    private String name;
    private int age;

    @XmlElement
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @XmlElement
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}


