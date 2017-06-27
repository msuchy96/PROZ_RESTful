package ptj;


import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
/**
 * Class which is marshalled into XML.
 * 
 * @author Maciej Suchocki
 *
 */
public class Student {
	private String firstName;
	private String lastName;
	private Integer indexNo;
	private String mime;
	
	/**
	 * Getter for mime.
	 * @return mime attribute
	 */
	public String getMime() {
		return mime;
	}
	
	/**
	 * Setter for mime.
	 * 
	 * @param mime mime to set
	 */
	public void setMime(String mime)
	{
		this.mime = mime;
	}
	
	/**
	 * Getter for firstName.
	 * @return firstName attribute
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Setter for firstName.
	 * 
	 * @param firstName firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Getter for lastName.
	 * @return lastName attribute
	 */
	public String getLastName()
	{
		return lastName;
	}
	
	/**
	 * Setter for lastName.
	 * 
	 * @param lastName lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Getter for indexNo.
	 * @return indexNo attribute
	 */
	public Integer getIndexNo() {
		return indexNo;
	}

	/**
	 * Setter for indexNo.
	 * 
	 * @param indexNo indexNo to set
	 */
	public void setIndexNo(Integer indexNo) {
		this.indexNo = indexNo;
	}
	
	
}