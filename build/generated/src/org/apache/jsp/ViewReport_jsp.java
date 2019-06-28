package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public final class ViewReport_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            Connection con;
            Statement st, st1, st2, st3, st4,st5,st6,st7,st8,st9,st10,st11;
            ResultSet rs;
            String dname, pid, bill, pname, name,s, disease,email,room, gender, adate,age,id;
        
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("  <script src=\"js/jquery.min.js\"></script>\n");
      out.write("  <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  \n");
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
      out.write("</head>\n");
      out.write("<body id=\"page-top\" data-spy=\"scroll\" data-target=\".navbar-custom\" style=\"background:url('images/bg1.jpg') repeat left top;\">\n");
      out.write("        ");
      out.write('\n');

                                                        id = (String) session.getAttribute("pid");
                                                        name = (String) session.getAttribute("pname");
                                                        try {
                                                            Class.forName("com.mysql.jdbc.Driver");
                                                            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HospitalManagement", "root", "");
                                                            st = con.createStatement();
                                                            rs = st.executeQuery("select Pid from Patient_Bill where Pname='"+name+"'");
                                                            if (!rs.next()) {
                                                                out.println("<center><h1>You have Not Fixed any Appointment with any  Doctor Therefore no report is generated.</h1></center>");
                                                            } else {
out.println("<div class='container-fluid' style='padding:0px;'><div class='table-responsive'><table border='3' class='table table-striped'>");
out.println("<tr><th>PID</th><th>Name</th><th>Email</th><th>Gender</th><th>Age</th><th>Consultant Doctor</th><th>Disease Name</th><th>Room Type</th><th>Admit Date</th><th>Discharge Date</th><th>Bill Amount</th></tr>");
                                                                rs = st.executeQuery("select Pid from Patient_Bill where Pname='"+name+"'");
                                                                while (rs.next()) {
                                                                    pid = rs.getString("Pid");
                                                                }
                                                              
                                                                st1 = con.createStatement();
                                                                rs = st1.executeQuery("select Pname from Patient_Bill where Pid='"+id+"'");
                                                                while (rs.next()) {
                                                                    pname = rs.getString("Pname");
                                                                }
                                                               
                                                                st2 = con.createStatement();
                                                                rs = st2.executeQuery("select Email from Table_Patient where Pid='"+id+"'");
                                                                while (rs.next()) {
                                                                    email = rs.getString("Email");
                                                                    
                                                                }
                                                              
                                                                st3 = con.createStatement();
                                                                rs = st3.executeQuery("select Gender from Table_Patient where Pid='"+id+"'");
                                                                while (rs.next()) {
                                                                    gender = rs.getString("Gender");

                                                                }
                                                                
                                                                st4 = con.createStatement();
                                                                rs = st4.executeQuery("select Age from Table_Patient where Pid='"+id+"'");
                                                                while (rs.next()) {
                                                                    age = rs.getString("Age");

                                                                }
                                                                
                                                                st5 = con.createStatement();
                                                                rs = st5.executeQuery("select Dname from Patient_Bill where Pid='"+id+"'");
                                                                while (rs.next()) {
                                                                    dname = rs.getString("Dname");
                                                                }
                                                                
                                                               
                                                                st6 = con.createStatement();
                                                                rs = st6.executeQuery("select Disease from Patient_Bill where Pid='"+id+"'");
                                                                while (rs.next()) {
                                                                    disease = rs.getString("Disease");
                                                                }
                                                              
                                                                st7 = con.createStatement();
                                                                rs = st7.executeQuery("select RoomType from Table_Patient where Pid='"+id+"'");
                                                                while (rs.next()) {
                                                                    room = rs.getString("RoomType");
                                                                }
                                                               
                                                                st8 = con.createStatement();
                                                                rs = st8.executeQuery("select Reg_Date  from Table_Patient where Pid='"+id+"'");
                                                                while (rs.next()) {
                                                                   adate = rs.getString("Reg_Date");
                                                                }
                                                                Date date = new Date();
                                                                SimpleDateFormat sdf = new SimpleDateFormat();
                                                                s = sdf.format(date);
                                                              
                                                                st9 = con.createStatement();
                                                                rs = st9.executeQuery("select BillAmount from Patient_Bill where Disease='"+disease+"'");
                                                                while (rs.next()) {
                                                                    bill = rs.getString("BillAmount");
                                                                    
                                                                }
                                                                
out.println("<tr><td>"+pid+"</td><td>"+pname+"</td><td>"+email+"</td><td>"+gender+"</td><td>"+age+"</td><td>"+dname+"</td><td>"+disease+"</td><td>"+room+"</td><td>"+adate+"</td><td>"+s+"</td><td>"+bill+"</td></td></tr>");
Class.forName("com.mysql.jdbc.Driver");
                                                                
                                                                // int i=st10.executeUpdate("insert into Report (Pid,Pname,Email,Gender,Age,Dname,Disease,RoomType,Admit_Date,Discharge_Date,Total_Bill) values('"+pid+"','"+pname+"','"+email+"','"+gender+"','"+age+"','"+dname+"','"+disease+"','"+room+"','"+adate+"','"+s+"','"+bill+"')");
                                                            }
                                                        }
                                                         catch (Exception e) 
                                                         {
                                                             ///e.getMessage();
                                                            /// e.printStackTrace();
                                                          //out.println(e);
                                                        }
                                                    
      out.write("\n");
      out.write("</table></div></div>\n");
      out.write("<center>\n");
      out.write("    <a href=\"index.html\">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"PatientHome.jsp\">Patient Home</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"Logout.jsp\">Logout</a>\n");
      out.write("</center>\n");
      out.write("<a href=\"InsertReports.jsp?id=");
      out.print(pid);
      out.write("&name=");
      out.print(pname);
      out.write("&email=");
      out.print(email);
      out.write("&gender=");
      out.print(gender);
      out.write("&age=");
      out.print(age);
      out.write("&dname=");
      out.print(dname);
      out.write("&disease=");
      out.print(disease);
      out.write("&room=");
      out.print(room);
      out.write("&admit_date=");
      out.print(adate);
      out.write("&discharge_date=");
      out.print(s);
      out.write("&bill=");
      out.print(bill);
      out.write("\"></a>\n");
      out.write("</body>\n");
      out.write("</html>");
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
