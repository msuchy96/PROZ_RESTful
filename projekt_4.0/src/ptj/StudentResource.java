package ptj;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Class which create object of Student class and marshalling it into XML.
 * 
 * @author Maciej Suchocki
 *
 */
@Path("/student")
public class StudentResource {
	
	/**
	 * Method marshalling instance of Student class into application/xml mime type.
	 *
	 * @return marshalled Student object
	 */
	@GET
	@Produces({ MediaType.APPLICATION_XML })
	public Student getXML() {
		Student student = instanteStudent();
		student.setMime(MediaType.APPLICATION_XML.toString());
		return student;
	}

	/**
	 * Method marshalling instance of Student class into text/xml mime type.
	 *
	 * @return marshalled Student object
	 */
	@GET
	@Produces({ MediaType.TEXT_XML})
	public Student getHTML() {
		Student student = instanteStudent();
		student.setMime(MediaType.TEXT_XML.toString());
		return student;
	}
	
	/**
	 * Method which create Student object and setting it up.
	 * 
	 * @return Student object which was created
	 */
	private Student instanteStudent() {
		Student student = new Student();
		student.setFirstName("Jan");
		student.setLastName("Suroc");
		student.setIndexNo(277377);
		return student;
	}
}
