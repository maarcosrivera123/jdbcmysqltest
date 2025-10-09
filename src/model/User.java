package model;

public class User {

	public String name = "marcos";
	private int age;
	private String sex;
	private String password;
	private String email;
	private long id;
	private String plaza;

//los atributos de 
	public User(long id, String name) {

	}

	public User() {
		// TODO Auto-generated constructor stub
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPlaza() {
		return plaza;
	}

	public void setPlaza(String plaza) {
		this.plaza = plaza;
	}
	public User (String name , int age, String sex, String password, String email, long id, String plaza) {
	this.name = name;
	this.age = age;
	this.sex = sex;
	this.password = password;
	this.email = email;
	this.id = id;
	this.plaza = plaza;
	
	}
	private boolean isVIP;
	private String psw;
	private float balance;
	/**
	 * @param name2
	 * @param id2
	 * @param psw
	 * @param isVIP
	 * @param balance
	 */
	public User(String name, int id, String psw, boolean isVIP, float balance) {
		this.name = name;
		this.psw = psw;
		this.balance = balance;
		this.id = id;
		this.isVIP = isVIP;
		
	}
	
}
	
 