package learn.hibernate.ipl.com.hiber.practice;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	//object creation
    	Team t1 = new Team();
    	Team t2 = new Team();
    	
    	Player p1 = new Player(7,"dhoni","bat-keep", t1);
    	Player p2 = new Player(99,"ashwin","bowl", t1);
    	Player p3 = new Player(45,"rohit","bat", t2);
    	Player p4 = new Player(10,"sachin","bat", t2);
    	
    	List<Player> plist1 = new ArrayList<Player>();
    	plist1.add(p1);
    	plist1.add(p2);
    	
    	List<Player> plist2 = new ArrayList<Player>();
    	plist2.add(p3);
    	plist2.add(p4);
    	
    	t1.setRanking(2);
    	t1.setTeamName("csk");
    	t1.setPlayers(plist1);
    	
    	t2.setRanking(1);
    	t2.setTeamName("mi");
    	t2.setPlayers(plist2);
    	
    	
    	
    	
    	//hibernate configuration
        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx= session.beginTransaction();
        
        //save objects
        session.save(p1);
        session.save(p2);
        session.save(p3);
        session.save(p4);
        session.save(t1);
        session.save(t2);
        
        tx.commit();
        
    }
}
