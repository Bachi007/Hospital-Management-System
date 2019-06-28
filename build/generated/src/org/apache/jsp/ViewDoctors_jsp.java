package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class ViewDoctors_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("  <script src=\"js/jquery.min.js\"></script>\n");
      out.write("  <script src=\"js/bootstrap.min.js\"></script>  \n");
      out.write("<style>\n");
      out.write("a\n");
      out.write("{\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tcolor:red;\n");
      out.write("}\n");
      out.write("th\n");
      out.write("{\n");
      out.write("    background-color:red;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write(" <body style=\"background-image: url(images/bg1.jpg);\">\n");
      out.write("       ");

     try
     {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HospitalManagement","root","");
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("select Dname,Did,Gender,Reg_Date,Email,Gender,Department,Age,Degree,Fees,Address from Table_Doctor ");
    
      out.write("\n");
      out.write("<div class=\"container-fluid\" style=\"padding:0px;\">\n");
      out.write("<div class=\"table-responsive\"> \n");
      out.write("<table border=\"3\" class=\"table table-striped\">\n");
      out.write("    <tr>\n");
      out.write("    <th>Doctor Name</th><th>Doctor ID</th><th>Doctor Email</th><th>Doctor Gender</th><th>Age</th><th>Fees</th><th>Department</th><th>Degree</th><th>Address</th><th>Registration Date</th>\n");
      out.write("  </tr>\n");
      out.write("    ");

    while(rs.next())
    {
        String s1=rs.getString("Dname");
        String s2=rs.getString("Did");
        String s3=rs.getString("Email");
        String s4=rs.getString("Gender");
        String s5=rs.getString("Age");
        String s6=rs.getString("Fees");
        String s7=rs.getString("Department");
        String s8=rs.getString("Degree");
        String s9=rs.getString("Address");
        String s10=rs.getString("Reg_Date");
    
      out.write("\n");
      out.write("    \n");
      out.write("    <tr><td>");
      out.print(s1);
      out.write("</td><td>");
      out.print(s2);
      out.write("</td><td>");
      out.print(s3);
      out.write("</td><td>");
      out.print(s4);
      out.write("</td><td>");
      out.print(s5);
      out.write("</td><td>");
      out.print(s6);
      out.write("</td><td>");
      out.print(s7);
      out.write("</td><td>");
      out.print(s8);
      out.write("</td><td>");
      out.print(s9);
      out.write("</td><td>");
      out.print(s10);
      out.write("</td>\n");
      out.write("    </tr>  \n");
      out.write("    ");

    }  
      }
          catch(Exception e)
       {
           out.println(e);
   }

      out.write("\n");
      out.write("</table></div></div>\n");
      out.write("<center><a href=\"index.html\">Home</a></center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
