package pojos;

import java.io.Serializable;

public class MessagePojo implements Serializable {
	private int id;
	private String name;
	private String email;

	public MessagePojo(int id, String name, String email, String subject, String message) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.subject = subject;
		this.message = message;
	}

	public MessagePojo() {
	}

	private String subject;




	private String message;

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setSubject(String subject){
		this.subject = subject;
	}

	public String getSubject(){
		return subject;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	@Override
 	public String toString(){
		return 
			"MessagesPojo{" + 
			"id = '" + id + '\'' + 
			",name = '" + name + '\'' + 
			",email = '" + email + '\'' + 
			",subject = '" + subject + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}