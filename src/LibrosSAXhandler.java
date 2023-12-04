
import java.util.jar.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class LibrosSAXhandler extends DefaultHandler  {
    
    int contador = 0;
    private String etiqueta;
    

    public LibrosSAXhandler() {
            etiqueta="";//también se puede hacer con int etiqueta 

        
    }
    
    
    
    @Override
    public void startDocument() {
        System.out.println("LISTADO DE LIBROS");
        System.out.println("==================");
    }

    @Override
    public void startElement(String uri, String localName, String qName, org.xml.sax.Attributes atts) throws SAXException {
        		if(qName.equals("Libro")){
			System.out.print("Publicado en: "+atts.getValue(atts.getQName(0)));//extrae el primer atributo
		
		}else if(qName.equals("Titulo")){
			System.out.println("\n "+"El título es: ");//aún no sabemos cúal es el título, eso lo sabremos en el evento characters			
			
		}else if(qName.equals("Autor")){
			System.out.println("\n "+"El author es: ");
						
		}
    }


    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("Libro")) {
            System.out.println("\n---------------------------");
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String car = new String(ch, start, length);
        car = car.replaceAll("\t", "");//quita todos los tabuladores
        car = car.replaceAll("\n", "");
        System.out.print(car);
    }
}