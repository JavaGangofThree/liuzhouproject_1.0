package model;

//事项实体
public class Item {
	private int id;
	private String name; // 标题
	private int level_id; // 等级ID
	private String sponsor; // 主办单位
	private int syspara_id; // 系统参数ID
	private String time;
	private int type_id; // 事项类型

	public Item() {
		// TODO Auto-generated constructor stub
		id = 0;
		name = "";
		level_id = 1;
		sponsor = "";
		syspara_id = 1;
		time = "2000-01-01";
		type_id = 1;
	}

	public Item(int id, String name, int level_id, String sponsor, int syspara_id, String time, int type_id) {
		super();
		this.id = id;
		this.name = name;
		this.level_id = level_id;
		this.sponsor = sponsor;
		this.syspara_id = syspara_id;
		this.time = time;
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

	public int getLevel_id() {
		return level_id;
	}

	public void setLevel_id(int level_id) {
		this.level_id = level_id;
	}

	public String getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}

	public int getSyspara_id() {
		return syspara_id;
	}

	public void setSyspara_id(int syspara_id) {
		this.syspara_id = syspara_id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
}
