package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AnswerServlet
 */
@WebServlet("/AnswerServlet")
public class AnswerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnswerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(
			HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
		  String a = request.getParameter("i");
	        String[] b=a.split(",");
	        int[] c = new int[b.length];
	        for(int k=0;k<b.length;k++){
	            c[k] = Integer.parseInt(b[k]);
	        }
	        
	        response.setContentType(
	                "text/html;charset=utf-8");
	        PrintWriter out = response.getWriter();
	        for(int i = 0;i< c.length;i++){
	            int num = 1;
	            for(int j= 0; j<c.length;j++){
	                if(i!=j){
	                   num = num * c[j];
	                }
	            }
	            out.println(num);
	         }
	        out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
