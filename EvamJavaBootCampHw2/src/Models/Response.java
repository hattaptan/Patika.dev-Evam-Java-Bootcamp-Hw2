package Models;

public class Response {

	// needed variable
	private String Code;
	private java.util.Date Date;

	
	// constructor method for Response not taking  parameters
	public Response() {}
	
	// set and get methods
	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public java.util.Date getDate() {
		return Date;
	}

	public void setDate(java.util.Date date) {
		Date = date;
	}

	

}
