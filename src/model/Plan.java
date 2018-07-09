package model;

//计划实体
public class Plan {
	private int id;
	private String name;
	private String content;
	private String time;
	private String sign; // 年度\r\n月度
	private int syspara_id; // 系统参数
	private int personnel_id; // 人员Id
	private int type_id; // 等级ID

	public Plan() {
		// TODO Auto-generated constructor stub
		id = 0;
		name = "";
		content = "";
		time = "2000-01-01";
		sign = "";
		syspara_id = 0;
		personnel_id = 0;
		type_id = 0;
	}

	public Plan(int id, String name, String content, String time, String sign, int syspara_id, int personnel_id,
			int type_id) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
		this.time = time;
		this.sign = sign;
		this.syspara_id = syspara_id;
		this.personnel_id = personnel_id;
		this.type_id = type_id;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public int getSyspara_id() {
		return syspara_id;
	}

	public void setSyspara_id(int syspara_id) {
		this.syspara_id = syspara_id;
	}

	public int getPersonnel_id() {
		return personnel_id;
	}

	public void setPersonnel_id(int personnel_id) {
		this.personnel_id = personnel_id;
	}

	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " id: " + this.id + " name: " + this.name;
	}

}
