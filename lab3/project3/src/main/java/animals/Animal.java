package animals;

import java.io.Serializable;

public class Animal implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String title;
	private int age;
	private String info;
	public Animal(String title, int age, String info) {
		super();
		this.title = title;
		this.age = age;
		this.info = info;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "{\"title\":\""+title+"\",\"age\":"+age+", \"info\":\""+info+"\"}";
	}
}