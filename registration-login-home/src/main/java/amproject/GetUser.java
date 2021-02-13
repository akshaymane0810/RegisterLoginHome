package amproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class GetUser {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer user_id;
	private String username;
	private String name;
	private String email;
	private String password;
	private String city;
	
	
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

	@Override
	public String toString() {
		return "GetUser [username=" + username + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", city=" + city + "]";
	}

	public GetUser() {
		super();
	}

	public GetUser(Integer user_id, String username, String name, String email, String password, String city) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.name = name;
		this.email = email;
		this.password = password;
		this.city = city;
	}

	public GetUser(String username, String name, String email, String password, String city) {
		super();
		this.username = username;
		this.name = name;
		this.email = email;
		this.password = password;
		this.city = city;
	}
	
}
