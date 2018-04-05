package edu.hun86.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.hun86.dto.EduDto;
import edu.hun86.model.EduDao;

/**
 * Servlet implementation class EduController
 */
@WebServlet("/EduController.do")
public class EduController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EduController() {
        super();
    }
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("html/text; charset=UTF-8;"); 
		
		String command=request.getParameter("command");
		EduDao dao=new EduDao();
		HttpSession session=request.getSession();
		
		if (command.equals("openPage")) {
			String sNum=request.getParameter("sNum");
			String eNum=request.getParameter("eNum");
			
			if (sNum==null) {
				sNum=(String)session.getAttribute("sNum");
				eNum=(String)session.getAttribute("eNnum");
			}else {
				session.setAttribute("sNum", sNum);
				session.setAttribute("eNum", eNum);
			}
			
			EduDto dto=new EduDto();
			dto.setsNum(Integer.parseInt(sNum));
			dto.seteNum(Integer.parseInt(eNum));
			
			List<EduDto> lists=new ArrayList<>();
			int count=0;
			
			lists=dao.allList(dto);
			count=dao.pageCount();
			
			request.setAttribute("lists", lists);
			request.setAttribute("count", count);
			
			dispatch("board/boardList.jsp", request, response);
			
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	public void dispatch(String url,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher=request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
	
}
