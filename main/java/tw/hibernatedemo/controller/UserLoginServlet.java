package tw.hibernatedemo.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.hibernatedemo.model.Members;
import tw.hibernatedemo.service.MemberService;


@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UserLoginServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		
		MemberService memberService = new MemberService();
		String name = request.getParameter("uname");
		String password = request.getParameter("psw");
		Members member = memberService.checkLogin(name,password);
		
		Map<String, String> errorMsgMap =new HashMap<String, String>();
		request.setAttribute("ErrorMsgMap", errorMsgMap);
		
		if (member !=null) {
			session.setAttribute("login", member.getMemberName());
		}else {
			errorMsgMap.put("LoginError", "帳密不存在,請重新輸入");
		}
		if (errorMsgMap.isEmpty()) {
			request.getRequestDispatcher("LoginOk.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
