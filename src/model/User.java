package model;
//用户实体
public class User {
	private int id;
	private String name;
	private String password;
	private int limit; //权限
	
	public User() {
		// TODO Auto-generated constructor stub
		id = 0;
		name = "";
		password = "";
		limit = 1;
	}
	
	public User(int id, String name, String password, int limit) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.limit = limit;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
}
