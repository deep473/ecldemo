package learn.hibernate.ipl.com.hiber.practice;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Su {
	@Id
	int sid;
	String sname;
	@ManyToMany
	List<Te> teachers;
	public Su() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Su(int sid, String sname, List<Te> teachers) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.teachers = teachers;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<Te> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Te> teachers) {
		this.teachers = teachers;
	}
	@Override
	public String toString() {
		return "Su [sid=" + sid + ", sname=" + sname + ", teachers=" + teachers + "]";
	}
	
}
