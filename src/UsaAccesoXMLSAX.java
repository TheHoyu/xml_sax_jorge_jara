import java.io.File;

public class UsaAccesoXMLSAX {
		// main del proyecto 
	public static void main(String[] args) {
            
//                File f = new File("libros.xml");
                  File f = new File("books.xml");
                AccesoXMLSAX a =new AccesoXMLSAX();
		a.parsearXMLconLibrosSAXhandler(f);
//                a.parsearXMLconTituloSAXhandler(f);
        

	}

}
