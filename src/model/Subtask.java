package model;
//子任务实体
public class Subtask {
	private int id;
	private String name;
	private int item_id;
	
	public Subtask() {
		// TODO Auto-generated constructor stub
		id = 0;
		name = "";
		item_id = 0;
	}
	
	public Subtask(int id, String name, int item_id) {
		super();
		this.id = id;
		this.name = name;
		this.item_id = item_id;
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
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	
}
