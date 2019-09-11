package com.hsc.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsc.dao.BookDao;
import com.hsc.entity.Book;


@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BookDao bookDao;
       
  
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		
		System.out.println("hello init");
		//ServletContext context= getServletContext();
		
		String jdbcURL = "jdbc:mysql://127.0.0.1:3306/bookstore";
        String jdbcUsername = "root";
        String jdbcPassword = "harak4892";
 
        bookDao = new BookDao(jdbcURL, jdbcUsername, jdbcPassword);
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action= request.getServletPath();
		System.out.println("url is " +action);
		try {
            switch (action) {
            case "/new":
            	System.out.println("new tab");
                showNewForm(request, response);
                break;
            case "/insert":
                insertBook(request, response);
                break;
            case "/delete":
                deleteBook(request, response);
                break;
            case "/edit":
                showEditForm(request, response);
                break;
            case "/update":
                updateBook(request, response);
                break;
            default:
                listBook(request, response);
                break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
	}
    
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	
	 private void listBook(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
	        List<Book> listBook = bookDao.listAllBooks();
	        request.setAttribute("listBook", listBook);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("bookList.jsp");
	        dispatcher.forward(request, response);
	    }
	 
	    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	    	System.out.println("show new form");
	        RequestDispatcher dispatcher = request.getRequestDispatcher("addBook.jsp");
	        dispatcher.forward(request, response);
	    }
	 
	    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, ServletException, IOException {
	        int id = Integer.parseInt(request.getParameter("id"));
	        Book existingBook = bookDao.getBook(id);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("BookForm.jsp");
	        request.setAttribute("book", existingBook);
	        dispatcher.forward(request, response);
	 
	    }
	 
	    private void insertBook(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException {
	        String title = request.getParameter("title");
	        String author = request.getParameter("author");
	        float price = Float.parseFloat(request.getParameter("price"));
	 
	        Book newBook = new Book(title, author, price);
	        bookDao.insertBook(newBook);
	        response.sendRedirect("list");
	    }
	 
	    private void updateBook(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException {
	        int id = Integer.parseInt(request.getParameter("id"));
	        String title = request.getParameter("title");
	        String author = request.getParameter("author");
	        float price = Float.parseFloat(request.getParameter("price"));
	 
	        Book book = new Book(id, title, author, price);
	        bookDao.updateBook(book);
	        response.sendRedirect("list");
	    }
	 
	    private void deleteBook(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException {
	        int id = Integer.parseInt(request.getParameter("id"));
	 
	        Book book = new Book(id);
	        bookDao.deleteBook(book);
	        response.sendRedirect("list");
	 
	    }
	
	



}
