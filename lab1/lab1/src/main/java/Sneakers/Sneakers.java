package Sneakers;

public class Sneakers {
	private String title;
	private String desc;
	private int size;
	public Sneakers(String title, String desc, int size) {
		super();
		this.title = title;
		this.desc = desc;
		this.size = size;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "{\"title\": \""+title+"\", \"desc\": \""+desc+"\", \"size\": \""+size+"\"}";
	}
}
