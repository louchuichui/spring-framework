package org.springframework.stp.bean;

/**
 * 简述
 * <p>
 * 详细描述
 *
 * @author louchuichui
 * @date 2022-01-03 10:49
 * @since x.x.x
 */
public class User {
	private String name;
	private int age;
	private String sex;

	public User(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
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

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", age=" + age +
				", sex='" + sex + '\'' +
				'}';
	}
}
