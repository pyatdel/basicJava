package kr.or.ddit.xml;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlParser2 {
	public static void main(String[] args) {
		XmlParser2 xp = new XmlParser2(); 
		xp.process();
	}
	
	public void process() {
		
		String xmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
				+ "			<root>"
//				+ "            <people name=\"강유정\" age=\"20\"> </people>"
				+ "            <people> "
				+ "               		<name>양소현</name>"
				+ "						<age>20</age>"
				+ "			   </people>"
				+ "         </root>";
		
		InputStream is = new ByteArrayInputStream(xmlString.getBytes());
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder build = factory.newDocumentBuilder();
			Document doc = build.parse(is);
			Element  el = doc.getDocumentElement();
			NodeList people = doc.getElementsByTagName("people");
			for(int i=0; i<people.getLength(); i++) {
				Node node = people.item(i);
//				NamedNodeMap nodemap = node.getAttributes();
//				System.out.println(people.item(i));
//				System.out.println(nodemap.getNamedItem("age"));
//				System.out.println(nodemap.getNamedItem("name"));
				
				NodeList childs = node.getChildNodes();
				Node name = childs.item(1);
				Node age  = childs.item(3);
				System.out.println(name.getTextContent());
				System.out.println(age.getTextContent());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
