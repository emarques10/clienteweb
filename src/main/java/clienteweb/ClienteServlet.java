package clienteweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/cliente", "/clienteServlet","/clienteController"})
public class ClienteServlet extends HttpServlet {
	
	public ClienteServlet(){
		System.out.println("Construindo Servlet");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Inicializando Servlet");
		super.init();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Chamando o Service");
		super.service(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Chamou pelo metodo GET");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		//System.out.println("Chamou pelo metodo POST");
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().println("Chamou pelo método POST enviando o email: "+email);
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Chamou pelo metodo DELETE");
	}
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Chamou pelo metodo PUT");
	}
	
	@Override
	public void destroy() {
		System.out.println("Servlet esta sendo destruido");
		super.destroy();
	}
	

}
