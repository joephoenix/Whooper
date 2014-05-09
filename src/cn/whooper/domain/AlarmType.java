package cn.whooper.domain;

import java.io.Serializable;

public class AlarmType implements Serializable {

	private int id;
	private String type;

	public AlarmType() {
	}

	public AlarmType(int id, String type) {
		this.id = id;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
