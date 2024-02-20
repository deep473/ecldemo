package learn.hibernate.ipl.com.hiber.practice;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Team {
		@Id
		int ranking;
		String teamName;
		@OneToMany
		List<Player> players;
		
		public Team() {
			super();
			// TODO Auto-generated constructor stub
		}

		

		public Team(int ranking, String teamName, List<Player> players) {
			super();
			this.ranking = ranking;
			this.teamName = teamName;
			this.players = players;
		}



		public int getRanking() {
			return ranking;
		}

		public void setRanking(int ranking) {
			this.ranking = ranking;
		}

		public String getTeamName() {
			return teamName;
		}

		public void setTeamName(String teamName) {
			this.teamName = teamName;
		}



		public List<Player> getPlayers() {
			return players;
		}



		public void setPlayers(List<Player> players) {
			this.players = players;
		}



		@Override
		public String toString() {
			return "Team [ranking=" + ranking + ", teamName=" + teamName + ", players=" + players + "]";
		}

		

		
		
}
