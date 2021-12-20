package tw.hibernatedemo.service;

import tw.hibernatedemo.model.MemberDao;
import tw.hibernatedemo.model.Members;

public class MemberService {
    private MemberDao dao;
	
	public MemberService() {
		this.dao =new MemberDao();
	}
	public Members checkLogin(String loginNameString ,String loginPassword) {
		Members member1 = dao.findByNameAndPassword(loginNameString, loginPassword);
		if (member1 !=null) {
			return member1;
		}
		return null;
		
	}

}
