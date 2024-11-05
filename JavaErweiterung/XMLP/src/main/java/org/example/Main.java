package org.example;

//
////Sax-Parser :
//
//import org.xml.sax.Attributes;
//import org.xml.sax.SAXException;
//import org.xml.sax.helpers.DefaultHandler;
//
//import javax.xml.parsers.ParserConfigurationException;
//import javax.xml.parsers.SAXParser;
//import javax.xml.parsers.SAXParserFactory;
//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) throws ParserConfigurationException, SAXException {
//
//        try {
//            SAXParserFactory factory = SAXParserFactory.newInstance();
//
//            SAXParser saxParser = factory.newSAXParser();
//
//            DefaultHandler handler = new DefaultHandler() {
//                public void startElement(String uri, String localName, String qName, Attributes attributes) {
//                    System.out.println("Start Element: " + qName);
//                }
//
//                public void endElement(String uri, String localName, String qName, Attributes attributes) {
//                    System.out.println("End Element: " + qName);
//                }
//
//                public void characters(char[] ch, int start, int length){
//                    System.out.println("Content: "+ new String(ch, start, length));
//                }
//            };
//            saxParser.parse("src/example.xml", handler);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}











// Dom-Parser:


//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//import org.w3c.dom.Node;
//import org.w3c.dom.NodeList;
//import org.xml.sax.SAXException;
//
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.ParserConfigurationException;
//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) {
//        try {
//            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//
//            DocumentBuilder builder = factory.newDocumentBuilder();
//
//            Document document = builder.parse("src/example.xml");
//
//            NodeList nodeList = document.getElementsByTagName("student");
//
//            for(int i = 0; i < nodeList.getLength(); i++){
//                Node node = nodeList.item(i);
//
//                if (node.getNodeType() == Node.ELEMENT_NODE){
//                    Element element = (Element) node;
//                    System.out.println("Student ID: " + element.getAttribute("id"));
//                    System.out.println("Name: " + element.getElementsByTagName("name").item(0).getTextContent());
//                    System.out.println("Age: " + element.getElementsByTagName("age").item(0).getTextContent());
//                }
//            }
//        } catch (ParserConfigurationException | SAXException | IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
























//
//// Pull Parser:
//
//
//import javax.xml.stream.XMLInputFactory;
//import javax.xml.stream.XMLStreamConstants;
//import javax.xml.stream.XMLStreamException;
//import javax.xml.stream.XMLStreamReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//
//public class Main {
//    public static void main(String[] args) {
//        try {
//            XMLInputFactory factory = XMLInputFactory.newInstance();
//
//            XMLStreamReader reader = factory.createXMLStreamReader(new FileReader("src/example.xml"));
//
//            while(reader.hasNext()){
//                int event = reader.next();
//
//                switch (event){
//                    case XMLStreamConstants.START_ELEMENT -> {
//                        System.out.println("Start element:" +reader.getLocalName());
//                        break;
//
//                    }
//                    case XMLStreamConstants.END_ELEMENT -> {
//                        System.out.println("End Element: " + reader.getLocalName());
//                        break;
//                    }
//                    case XMLStreamConstants.CHARACTERS -> {
//                        if(reader.hasText()){
//                            System.out.println("Text: " + reader.getText().trim());
//                            break;
//                        }
//                    }
//
//                }
//            }
//        } catch (XMLStreamException | FileNotFoundException e) {
//            throw new RuntimeException(e);
//    }
//}}
//












//
//
//
//import javax.xml.bind.*;
//import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlRootElement;
//import java.io.File;
//
//
////JAXB Parser:
//
//public class Main {
//    public static void main(String[] args) throws JAXBException {
//        try {
//            JAXBContext context = JAXBContext.newInstance(Student.class);
//
//
//            //Unmarshall
//            Unmarshaller unmarshaller = context.createUnmarshaller();
//            Student student = (Student) unmarshaller.unmarshal(new File("src/student.xml"));
//
//            System.out.println("Student Name: " + student.getName());
//            System.out.println("Student Age: " + student.getAge());
//
//            // Marshall
//            student.setAge(25);
//
//            Marshaller marshaller = context.createMarshaller();
//
//            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//            marshaller.marshal(student, System.out);
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
//
//@XmlRootElement
//class Student{
//    private String name;
//    private int age;
//
//    @XmlElement
//
//    public String getName(){ return name; }
//    public void setName(String name){ this.name = name;}
//
//    @XmlElement
//    public int getAge(){ return age; }
//    public void setAge(int age){ this.age = age;}
//}
//
//
//
//
//
//






