package directoriesPackage;

/**
 * @author jorge
 *
 * Leitura de um xml ( a partir uma string xml e nao em um file xml)
 * 
 * -List
 *   -ArrayList
 *      -Collection
 *
*/

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class Directories {
	
	public static Collection<String> getDirectoryNames(String xml, String startingLetter) throws Exception {
	
		Collection<String> lista = new ArrayList<String>();
		
		try {

		    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		    DocumentBuilder builder = factory.newDocumentBuilder();
		    InputSource is = new InputSource(new StringReader(xml));	
		    Document doc = builder.parse(is);

		    doc.getDocumentElement().normalize();

		    // nodeList soma todos os elementos em uma list
			NodeList nList = doc.getElementsByTagName("directory");

			for (int x = 0; x < nList.getLength(); x++) {

				Node nNode = nList.item(x);

				Element eElement = (Element) nNode;
				
				// valor do atributo jorge
				System.out.println("=>"+eElement.getAttribute("jorge").toString());
				
				if (startingLetter.equals(eElement.getAttribute("name").substring(0,1))){
					
					lista.add(eElement.getAttribute("name"));
					
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public static void main(String argv[]) throws Exception {

		String xml =
				"<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
						"<directory name=\"c\">" +
						"  <directory name=\"program files\">" +
						"    <directory name=\"uninstall information\" >" +
						"    </directory>" +
						"    <directory name=\"users\" jorge=\"jj\" >" +
						"    </directory>" +
						"  </directory>" +
						"</directory>";
		
		 Collection<String> names = getDirectoryNames(xml, "u");
		 
		 names.removeAll(names);		 
//		 boolean d = names.isEmpty();
//		 System.out.println(d);
		 
		 if (names.contains("users"))
			 System.out.println("existe um atributo \"users\"");
		 
		 
		 for(String name: names){
			 System.out.println(name);
		 }
	}

}
