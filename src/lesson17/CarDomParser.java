package lesson17;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class CarDomParser {
    public static void main(String[] args) throws Exception{
        File inputFile = new File("/home/hillel/IdeaProjects/JavaElementary/src/lesson17/car.xml");

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document doc = documentBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();
        NodeList nodeList = doc.getElementsByTagName("cars");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.hasAttributes()){
                System.out.println(node.getAttributes().getLength());
                Node clas = node.getAttributes().getNamedItem("manufacturer");
                System.out.println(clas);
            }
            NodeList children = node.getChildNodes();
            for (int j = 0; j < children.getLength(); j++) {
                Node child = children.item(j);
                if (child.getNodeType() == Node.ELEMENT_NODE) {
                    System.out.println(child.getNodeName() + ": " + child.getTextContent());
                }
            }
        }
    }
}
