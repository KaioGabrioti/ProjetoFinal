package controller;

import java.io.IOException;
/*import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
*/import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

/*import model.Modalidade;
import model.Olimpiada;
import model.Pais;
import service.ModalidadeService;
import service.OlimpiadaService;
import service.PaisService;
*/
/**
 * Servlet implementation class ManterClienteController
 */
@WebServlet("/ManterOlimpiada.do")
public class ManterOlimpiadaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//	String pAcao = request.getParameter("acao");
	//	System.out.println(pAcao);
		
/*		PaisService ps = new PaisService();
		ModalidadeService ms = new ModalidadeService();
		OlimpiadaService os = new OlimpiadaService();
		
		HttpSession session = request.getSession();
*/		
//		request.setCharacterEncoding("UTF-8");
		
		/*if(pAcao.equals("criarPais")) {
			String pNome = request.getParameter("pais");
			int pPopulacao = Integer.parseInt(request.getParameter("populacao"));
			double pArea= Double.parseDouble(request.getParameter("area"));
			
			//instanciar o javabean
			Pais pais = new Pais();
			pais.setNome(pNome);
			pais.setPopulacao(pPopulacao);
			pais.setArea(pArea);
			System.out.println(pNome);
			System.out.println(pArea);
			System.out.println(pPopulacao);
			//instanciar o service
			
			ps.criar(pais);
			
			pais = ps.carregar(pais);
			
			
			request.setAttribute("pais", pais);
	        
	        RequestDispatcher view = 
	        request.getRequestDispatcher("Pais.jsp");
	        view.forward(request, response);
		}*/
		
		/*if(pAcao.equals("criarModalidade")) {
			String pNome = request.getParameter("modalidade");
			String pTipo = request.getParameter("tipo");
			
			//instanciar o javabean
			Modalidade modalidade = new Modalidade();
			Olimpiada olimpiada = new Olimpiada();
			modalidade.setNome(pNome);
			olimpiada.setTipo(pTipo);
			
			System.out.println(pNome);
			System.out.println(pTipo);

			//instanciar o service
			
			modalidade = ms.criar(modalidade, olimpiada);
			
			
			
			System.out.println(modalidade.getId());
			System.out.println(modalidade.getNome());
			
			request.setAttribute("modalidade", modalidade);
	        
	        RequestDispatcher view = 
	        request.getRequestDispatcher("Modalidade.jsp");
	        view.forward(request, response);
		}
*/		
/*		if(pAcao.equals("pesquisarOlimpiada")) {
			List<Pais> pais = ps.listar();
			List<Modalidade> modalidade = ms.listar();
			List<Olimpiada> olimpiada = os.listar();
			
			request.setAttribute("pais", pais);
			request.setAttribute("modalidade", modalidade);
			request.setAttribute("olimpiada", olimpiada);
			request.getRequestDispatcher("OlimpiadasPesquisar.jsp").forward(request, response);
		}*/
		
/*		if(pAcao.equals("carregarMedalhas")) {
			int idPais = Integer.parseInt(request.getParameter("pais"));
			int idModalidade = Integer.parseInt(request.getParameter("modalidade"));
			int ano	=	Integer.parseInt(request.getParameter("ano"));
			
			System.out.println(idPais);
			System.out.println(idModalidade);
			System.out.println(ano);
			
			Modalidade modalidade = new Modalidade();
			Olimpiada olimpiada = new Olimpiada();
			Pais pais = new Pais();
			pais.setId(idPais);
			pais = ps.carregar(pais);	
			modalidade.setId(idModalidade);
			modalidade = ms.carregar(modalidade);
			olimpiada.setAno(ano);

			System.out.println(modalidade.getId());
			
			
			modalidade = os.carregar(pais, olimpiada, modalidade);
			request.setAttribute("pais", pais);
			request.setAttribute("modalidade", modalidade);
			request.setAttribute("olimpiada", olimpiada);
			request.getRequestDispatcher("OlimpiadasMedalhas.jsp").forward(request, response);
		}*/
		
/*		if(pAcao.equals("criarMedalhas")) {
			int idPais = Integer.parseInt(request.getParameter("pais"));
			int idModalidade = Integer.parseInt(request.getParameter("modalidade"));
			int ano	=	Integer.parseInt(request.getParameter("ano"));
			
			System.out.println(idPais);
			System.out.println(idModalidade);
			System.out.println(ano);
			
			
			Modalidade modalidade = new Modalidade();
			Olimpiada olimpiada = new Olimpiada();
			Pais pais = new Pais();
			pais.setId(idPais);
			pais = ps.carregar(pais);
			modalidade.setId(idModalidade);
			modalidade = ms.carregar(modalidade);
			olimpiada.setAno(ano);
		
			
			request.setAttribute("pais", pais);
			request.setAttribute("modalidade", modalidade);
			request.setAttribute("olimpiada", olimpiada);
			request.getRequestDispatcher("OlimpiadaCadastro.jsp").forward(request, response);
		}*/
		
/*		if(pAcao.equals("criarOlimpiada")) {
			int idPais = Integer.parseInt(request.getParameter("pais"));
			int idModalidade = Integer.parseInt(request.getParameter("modalidade"));
			int ano = Integer.parseInt(request.getParameter("ano"));
			int ouro = Integer.parseInt(request.getParameter("ouro"));
			int prata = Integer.parseInt(request.getParameter("prata"));
			int bronze = Integer.parseInt(request.getParameter("bronze"));
			
			Modalidade modalidade = new Modalidade();
			Olimpiada olimpiada = new Olimpiada();
			Pais pais = new Pais();
			pais.setId(idPais);
			pais = ps.carregar(pais);
			modalidade.setId(idModalidade);
			modalidade.setOuro(ouro);
			modalidade.setPrata(prata);
			modalidade.setBronze(bronze);
			modalidade = ms.carregar(modalidade);
			olimpiada.setAno(ano);
			
			os.criar(pais, olimpiada, modalidade);
			
			request.setAttribute("pais", pais);
			request.setAttribute("modalidade", modalidade);
			request.setAttribute("olimpiada", olimpiada);
			request.getRequestDispatcher("OlimpiadasMedalhas.jsp").forward(request, response);
		}*/
		
		/*if(pAcao.equals("editarMedalhas")) {
			int idPais = Integer.parseInt(request.getParameter("pais"));
			int idModalidade = Integer.parseInt(request.getParameter("modalidade"));
			int ano	=	Integer.parseInt(request.getParameter("ano"));
			int ouro = Integer.parseInt(request.getParameter("ouro"));
			int prata = Integer.parseInt(request.getParameter("prata"));
			int bronze = Integer.parseInt(request.getParameter("bronze"));
			
			System.out.println(idPais);
			System.out.println(idModalidade);
			System.out.println(ano);
			
			
			Modalidade modalidade = new Modalidade();
			Olimpiada olimpiada = new Olimpiada();
			Pais pais = new Pais();
			
			pais.setId(idPais);
			pais = ps.carregar(pais);
			
			modalidade.setId(idModalidade);
			modalidade.setOuro(ouro);
			modalidade.setPrata(prata);
			modalidade.setBronze(bronze);
			modalidade = ms.carregar(modalidade);
			
			olimpiada.setAno(ano);
		
			
			request.setAttribute("pais", pais);
			request.setAttribute("modalidade", modalidade);
			request.setAttribute("olimpiada", olimpiada);
			request.getRequestDispatcher("OlimpiadaEditar.jsp").forward(request, response);
		}*/
		
/*		if(pAcao.equals("editarOlimpiada")) {
			int idPais = Integer.parseInt(request.getParameter("pais"));
			int idModalidade = Integer.parseInt(request.getParameter("modalidade"));
			int ano = Integer.parseInt(request.getParameter("ano"));
			int ouro = Integer.parseInt(request.getParameter("ouro"));
			int prata = Integer.parseInt(request.getParameter("prata"));
			int bronze = Integer.parseInt(request.getParameter("bronze"));
			
			Modalidade modalidade = new Modalidade();
			Olimpiada olimpiada = new Olimpiada();
			Pais pais = new Pais();
			pais.setId(idPais);
			pais = ps.carregar(pais);
			modalidade.setId(idModalidade);
			modalidade.setOuro(ouro);
			modalidade.setPrata(prata);
			modalidade.setBronze(bronze);
			modalidade = ms.carregar(modalidade);
			olimpiada.setAno(ano);
			
			os.atualizar(pais, modalidade, olimpiada);
			
			request.setAttribute("pais", pais);
			request.setAttribute("modalidade", modalidade);
			request.setAttribute("olimpiada", olimpiada);
			request.getRequestDispatcher("OlimpiadasMedalhas.jsp").forward(request, response);
		}*/
		
/*		if(pAcao.equals("excluirOlimpiada")) {
			int idPais = Integer.parseInt(request.getParameter("pais"));
			int idModalidade = Integer.parseInt(request.getParameter("modalidade"));
			int ano	=	Integer.parseInt(request.getParameter("ano"));
			
			
			Modalidade modalidade = new Modalidade();
			Olimpiada olimpiada = new Olimpiada();
			Pais pais = new Pais();
			
			pais.setId(idPais);
			pais = ps.carregar(pais);
			
			modalidade.setId(idModalidade);
			modalidade = ms.carregar(modalidade);
			
			olimpiada.setAno(ano);
			
			os.excluir(pais, modalidade, olimpiada);
				
			request.setAttribute("pais", pais);
			request.setAttribute("modalidade", modalidade);
			request.setAttribute("olimpiada", olimpiada);
			request.getRequestDispatcher("excluirOlimpiada.jsp").forward(request, response);
		}*/
		
		
		
		/*if (pAcao.equals("buscar")) {
			String chave = request.getParameter("data[search]");
			ArrayList<Pais> lista = null;
			
			if (chave != null && chave.length() > 0) {
				lista = ps.listarPais(chave);
			} else {
				lista = ps.listar();
			}
			session.setAttribute("lista", lista);
			
			request.getRequestDispatcher("ListarTeste.jsp").forward(request, response);
			
			
		} else if (pAcao.equals("reiniciar")) {
			session.setAttribute("lista", null);
			request.getRequestDispatcher("ListarTeste.jsp").forward(request, response);
		}*/

	}

		
	}

