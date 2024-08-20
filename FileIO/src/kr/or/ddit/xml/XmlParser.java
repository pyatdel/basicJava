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

public class XmlParser {
	public static void main(String[] args) {
		XmlParser xp = new XmlParser(); 
		xp.process();
	}
	
	public void process() {
		
		String xmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
				+ "			<root>"
				+ "            <people name=\"강유정\" age=\"20\"> </people>"
				+ "         </root>";
		
		InputStream is = new ByteArrayInputStream(xmlString.getBytes());
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder build = factory.newDocumentBuilder();
			Document doc = build.parse(is);
			Element  el = doc.getDocumentElement();
			System.out.println(el);
			NodeList nodelist = el.getChildNodes();
//			for(int i=0; i<nodelist.getLength(); i++) {
//				System.out.println(nodelist.item(i));
//			}
			Node people = nodelist.item(1);
			NamedNodeMap nodeMap = people.getAttributes();
			System.out.println(people);
			System.out.println(nodeMap.item(0)+", "+nodeMap.item(1));
			System.out.println(nodeMap.getNamedItem("name"));
			System.out.println(nodeMap.getNamedItem("age"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
