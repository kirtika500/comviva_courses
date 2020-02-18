package com.via.springbootweb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="findAllCourses", query="from Course e")

public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	String expiry;
	
	String title;	
	String summary;
	public Course(){}
	public Course(String title, String summary,String expiry) {

		this.title = title;
		this.summary = summary;
		this.expiry = expiry;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	public String getExpiry() {
		return expiry;
	}
	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", expiry=" + expiry + ", title=" + title + ", summary=" + summary + "]";
	}
	
	
	

}
