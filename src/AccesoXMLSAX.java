
import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class AccesoXMLSAX {

    SAXParser parser;

    public int parsearXMLconLibrosSAXhandler(File f) {
        try {

            SAXParserFactory factory = SAXParserFactory.newInstance();
            // creamos un saxparser factory, y creamos una instancia nueva 
            parser = factory.newSAXParser();
            LibrosSAXhandler sh = new LibrosSAXhandler();
            // creamos un controlador SAx , para sacar la informarción del libro 
            parser.parse(f, sh);
            // lectura del arcgivo xml 
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int parsearXMLconTituloSAXhandler(File f) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            //creamos un saxparser factory, y hacemos una instancia nueva 
            parser = factory.newSAXParser();
            TitulosSAXhandler sh = new TitulosSAXhandler();
            //creamos un controlador sax papra sacar la información del tituo

            //leemos el xml con nuestro parseador de titulo
            parser.parse(f, sh);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }


}
