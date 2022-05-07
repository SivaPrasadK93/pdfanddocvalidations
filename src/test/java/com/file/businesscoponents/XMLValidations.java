package com.file.businesscoponents;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XMLValidations {

	Document doc;

	public Document buildDocforXMLParsing() throws ParserConfigurationException {

		String xmlSource = "Extracted XML Content";
		DocumentBuilderFactory docbuildFac = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuild = docbuildFac.newDocumentBuilder();

		try {
			doc = docBuild.parse(new InputSource(new StringReader(xmlSource)));
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return doc;
	}

	public void validateDatafromXML() throws ParserConfigurationException {

		doc = buildDocforXMLParsing();

		NodeList nList = doc.getElementsByTagName("Tag Name");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElemnt = (Element) nNode;

				for (int i = 0; i < eElemnt.getElementsByTagName("Multiple tags with Same Name").getLength(); i++) {

					String tagValue1 = eElemnt.getElementsByTagName("Tagname").item(i).getAttributes()
							.getNamedItem("Attribute Name").getNodeValue();
					String tagValue2 = eElemnt.getElementsByTagName("Tagname").item(i).getAttributes()
							.getNamedItem("Attribute Name").getNodeValue();
				}

			}
		}

	}

}
