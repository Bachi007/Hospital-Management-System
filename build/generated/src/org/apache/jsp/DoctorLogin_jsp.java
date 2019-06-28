package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DoctorLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Hospital Management System</title>\n");
      out.write("\t\n");
      out.write("    <!-- css -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("  <script src=\"js/jquery.min.js\"></script>\n");
      out.write("  <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<!-- template skin -->\n");
      out.write("\t<link id=\"t-colors\" href=\"css/default.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"page-top\" data-spy=\"scroll\" data-target=\".navbar-custom\" style=\"background:url('images/bg1.jpg') repeat left top;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("\t\n");
      out.write("    <nav class=\"navbar navbar-custom navbar-fixed-top\" role=\"navigation\">\n");
      out.write("\n");
      out.write("        <div class=\"container navigation\">\n");
      out.write("\t\t\n");
      out.write("            <div class=\"navbar-header page-scroll\">\n");
      out.write("               \n");
      out.write("                <a class=\"navbar-brand\" href=\"index.html\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.html\">\n");
      out.write("                        <img src=\"images/logo.png\" alt=\"logo\" style=\"border: 2px solid black; border-width: 6px; background: #dddddd; padding: 10px 40px;border-radius: 25px;\" width=\"450\" height=\"120\" />\n");
      out.write("                </a>\n");
      out.write("                \n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("            <div class=\"collapse navbar-collapse navbar-right navbar-main-collapse\">\n");
      out.write("\t\t\t <ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"index.html\">Home</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"Services.jsp\">Services</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"ViewDoctors.jsp\">Doctors</a></li>\n");
      out.write("                                <li><a href=\"About.jsp\">About Us</a></li>\n");
      out.write("                                <li><a href=\"Contact.jsp\">Contact Us</a></li>\n");
      out.write("\t\t\t  </ul>\n");
      out.write("                                    </div></li>\n");
      out.write("\t\t\t  </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-collapse -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container -->\n");
      out.write("    </nav>\n");
      out.write("\t\n");
      out.write("\t<!-- Section: intro -->\n");
      out.write("    <section id=\"intro\" class=\"intro\">\n");
      out.write("\t\t<div class=\"intro-content\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"wow fadeInUp\" data-wow-duration=\"2s\" data-wow-delay=\"0.2s\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/img-1.png\" class=\"img-responsive\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-6\">\n");
      out.write("                                             \n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("                                            <center><h3>Doctor Login</h3></center><hr>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"wow fadeInUp\" data-wow-duration=\"2s\" data-wow-delay=\"0.2s\">\n");
      out.write("                                                    <img src=\"images/doctoricon.jpg\" style=\"width: 190px;height: 210px;margin-bottom: 9px;\" class=\"img-responsive\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\t\t\n");
      out.write("\t\t\t\t\t<form action=\"DoctorDao.jsp\" method=\"post\" role=\"form\" class=\"contactForm lead\">\n");
      out.write("    \t\t\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("    \t\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-6 col-sm-6 col-md-6\">\n");
      out.write("    \t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("    \t\t\t\t\t\t\t\t\t\t\t\t\t<label>Doctor Name</label>\n");
      out.write("                                                                                                        <input type=\"text\" required=\"\" name=\"Doctor_name\" id=\"first_name\" class=\"form-control input-md\" data-rule=\"minlen:3\" data-msg=\"Please enter at least 3 chars\">\n");
      out.write("                                                        <div class=\"validation\"></div>\n");
      out.write("    \t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("    \t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                                    <div class=\"col-xs-6 col-sm-6 col-md-6\">\n");
      out.write("    \t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("    \t\t\t\t\t\t\t\t\t\t\t\t\t<label>Doctor ID</label>\n");
      out.write("                                                                                                        <input type=\"text\" name=\"did\" required=\"\" id=\"first_name\" class=\"form-control input-md\" data-rule=\"minlen:3\" data-msg=\"Please enter at least 3 chars\">\n");
      out.write("                                                        <div class=\"validation\"></div>\n");
      out.write("    \t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("    \t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("    \t\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-6 col-sm-6 col-md-6\">\n");
      out.write("    \t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("    \t\t\t\t\t\t\t\t\t\t\t\t\t<label>Password</label>\n");
      out.write("                                                                                                        <input type=\"password\"  required=\" \"name=\"Password\" id=\"last_name\" class=\"form-control input-md\" data-rule=\"minlen:3\" data-msg=\"Please enter at least 3 chars\">\n");
      out.write("                                                        <div class=\"validation\"></div>\n");
      out.write("    \t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("    \t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("    \t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("    \t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Submit\" class=\"btn btn-skin btn-block btn-lg\">\n");
      out.write("    \t\t\t\t\t\t\t\t\t</form>\n");
      out.write("                                            <center><a href=\"ForgotPassword.jsp\">Forgot Password?</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                <a href=\"DoctorForm.jsp\">Sign Up Here</a></center>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t</div>\t\t\n");
      out.write("\t\t\t\t</div>\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\t\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("\n");
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
