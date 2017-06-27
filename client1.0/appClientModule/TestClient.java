
import java.io.StringReader;
import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.filter.LoggingFilter;

import ptj.Student;

/**
 * Client class which create client and to test functioning of the RESTful service.
 * 
 * @author Maciej Suchocki
 *
 */
public class TestClient {

	public static void main(String[] args) {
		try{
            
			System.out.println("Pobieranie");
			Client client = ClientBuilder.newClient();    
            URI uri = URI.create("http://localhost:8080/projekt_4.0");
            
            client.target(uri);
            WebTarget webTarget = client.target(uri);
            webTarget = webTarget.path("rest").path("student");  
            
 
            String xmlAnswer = webTarget.request()
                    .accept(MediaType.TEXT_XML).get(String.class);
 
            JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Student student = (Student) jaxbUnmarshaller.unmarshal(new StringReader(xmlAnswer));
            displayInfos(student);
            System.out.println(xmlAnswer);
            
            System.out.println("Obiekt otrzymano.");
          
 
        }catch(Exception ex){
            
        }

	}
	
	/**
	 * Method which displays unmarshalled student's attribures.
	 * 
	 * @param student student object to display
	 */
	private static void displayInfos(Student student)
	{
		
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		System.out.println(student.getIndexNo());
	}
	
	

}
