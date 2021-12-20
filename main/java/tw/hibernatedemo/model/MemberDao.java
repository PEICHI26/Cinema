package tw.hibernatedemo.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import tw.hibernatedemo.util.HibernateUtil;

public class MemberDao {
    
	private SessionFactory factory;
	
    public MemberDao() {
		this.factory = HibernateUtil.getSessionFactory();
	}
    public Members findByNameAndPassword(String loginName ,String LogingPwd) {
    	try {
    		Session session = factory.getCurrentSession();
        	String hql= "from Members m where m.memberName = :name and m.memberPwd = :pwd";
        	Members result  = session.createQuery(hql,Members.class)
        			 .setParameter("name", loginName)
        			 .setParameter("pwd", LogingPwd)
        			 .getSingleResult();
        	
    			return result;
    		
        	
		} catch (Exception e) {
			return null;
		}
    	
    	
    	
    }
}
