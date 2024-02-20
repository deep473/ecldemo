package learn.hibernate.ipl.com.hiber.practice;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Te {
	@Id
	int tid;
	String tname;
	@ManyToMany
	List<Su> subjects;
	public Te() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Te(int tid, String tname, List<Su> subjects) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.subjects = subjects;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public List<Su> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Su> subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return "Te [tid=" + tid + ", tname=" + tname + ", subjects=" + subjects + "]";
	}
	
}
