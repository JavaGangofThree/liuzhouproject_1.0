package model;

public class Log {
	private int id;
	private String operation; // 操作内容（插入、删除。。）
	private int sign; // 1 为 事项 2 为工作计划
	private int personnel_id; // 操作人ID
	private String time; // 时间戳

	public Log() {
		// TODO Auto-generated constructor stub
		id = 0;
		operation = "";
		sign = 1;
		personnel_id = 0;
		time = "2000-01-01";
	}

	public Log(int id, String operation, int sign, int personnel_id, String time) {
		super();
		this.id = id;
		this.operation = operation;
		this.sign = sign;
		this.personnel_id = personnel_id;
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public int getSign() {
		return sign;
	}

	public void setSign(int sign) {
		this.sign = sign;
	}

	public int getPersonnel_id() {
		return personnel_id;
	}

	public void setPersonnel_id(int personnel_id) {
		this.personnel_id = personnel_id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
