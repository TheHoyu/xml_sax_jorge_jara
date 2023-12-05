
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

// metodo que genera los titulos del proyecto

public class TitulosSAXhandler extends DefaultHandler {

    private String etiqueta;

    public TitulosSAXhandler() {
        etiqueta = "";//también se puede hacer con int etiqueta
    }

    @Override
    public void startDocument() {
        System.out.println("LISTADO DE TITULOS");
        System.out.println("==================");
    }
    // metodo que va recorriendo los nodos,
    // si son nodos, libro, los escribe titulo, si son titulo los escrbie como autor
    @Override
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        if (qName.equals("Libro")) {
            etiqueta = "Libro";
        } else if (qName.equals("Titulo")) {
            etiqueta = "Titulo";
        } else if (qName.equals("Autor")) {
            etiqueta = "Autor";
        }
    }
    // metodo que quita los ca´racteresvacios queno nos interesan, como los tabuladores, espaciosvacios 
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (etiqueta.equals("Titulo") || etiqueta.equals("Autor")) {
            String car = new String(ch, start, length);
            car = car.replaceAll("\t", "");//quita todos los tabuladores
            car = car.replaceAll("\n", "");
            if(etiqueta.equals("Titulo")){
                System.out.print(car + ", ");
            }else if(etiqueta.equals("Autor")){
                System.out.println(car + "\n");
            }
        }
    }
    
}
