package learn.hibernate.ipl.com.hiber.practice;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Player {
		@Id
		int jerseyNum;
		String playerName;
		String role;
		@ManyToOne
		Team team;
		public Player() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Player(int jerseyNum, String playerName, String role, Team team) {
			super();
			this.jerseyNum = jerseyNum;
			this.playerName = playerName;
			this.role = role;
			this.team = team;
		}
		public int getJerseyNum() {
			return jerseyNum;
		}
		public void setJerseyNum(int jerseyNum) {
			this.jerseyNum = jerseyNum;
		}
		public String getPlayerName() {
			return playerName;
		}
		public void setPlayerName(String playerName) {
			this.playerName = playerName;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public Team getTeam() {
			return team;
		}
		public void setTeam(Team team) {
			this.team = team;
		}
		@Override
		public String toString() {
			return "Player [jerseyNum=" + jerseyNum + ", playerName=" + playerName + ", role=" + role + ", team=" + team
					+ "]";
		}
		
		
		
}
