package org.apache.jsp.Indore_005fdivision;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.UserModel;

public final class indorehome_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>HOME</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  \n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css\">\n");
      out.write("         <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js\"></script>\n");
      out.write("         <script src=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\"></a>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("      <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("      <li><a href=\"#\">gallary</a></li>\n");
      out.write("      <li><a href=\"#\">about</a></li>\n");
      out.write("     \n");
      out.write("      <li><a href=\"#\">contact</a></li>\n");
      out.write("      <li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("    </ul>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");

       UserModel um=(UserModel)session.getAttribute("currentuser");
          
     
    
      out.write("\n");
      out.write("    <div style=\"position: absolute;left: 0px;top: 50px; width: 250px; height: 600px; background-color: black; color: white\">\n");
      out.write("        \n");
      out.write("        <img src=\"");
      out.print("../ImageLoader?id="+ um.getId()  );
      out.write("\"  style=\"position: relative; left: 30px; top: 30px; width: 180px; height: 180px;  border-radius: 200px;\" >\n");
      out.write("        <br/><br/><br/><br/>\n");
      out.write("        <a href=\"../profileimg.jsp\"><button class=\"ui  inverted white button\" style=\" position: relative; left: 50px;\">Change Picture</button></a>\n");
      out.write("        <br/><br/><br/>\n");
      out.write("        \n");
      out.write("        <b style=\"font-size: 20px; position: relative; left: 30px;\"> ");
      out.print(um.getName().toUpperCase() );
      out.write("</b>\n");
      out.write("   <br/><br/><br/>\n");
      out.write("            <a href=\"../MyProfileContoller\"><button class=\"ui  inverted white button\" style=\" position: relative; left: 70px;\">profile</button></a>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("   <br/><br/><br/><br/>\n");
      out.write("   <div class=\"ui large images\" style=\"position: absolute; left: 350px;\">\n");
      out.write("       <a href=\"indore.jsp\" class=\"ui medium image\">\n");
      out.write("       <img src=\"images/Ihome1.jpg\" style=\"width :450px; height: 250px;\">\n");
      out.write("       \n");
      out.write("</a>\n");
      out.write("      \n");
      out.write("       <a href=\"dhar.jsp\" class=\"ui medium image\">\n");
      out.write("        <img src=\"images/Ihome2.jpg\" style=\"width :450px; height: 250px;\">\n");
      out.write("</a>\n");
      out.write("   <br/><br/>\n");
      out.write("   <a href=\"khandwa.jsp\" class=\"ui medium image\">\n");
      out.write("        <img src=\"images/Ihome3.jpg\"style=\"width :450px; height: 250px; \">\n");
      out.write("</a>\n");
      out.write("      \n");
      out.write("   <a href=\"bhuranpur.jsp\" class=\"ui medium image\">\n");
      out.write("        <img src=\"images/Ihome4.png\"style=\"width :450px; height: 250px; \">\n");
      out.write("</a>\n");
      out.write("   <br/><br/>\n");
      out.write("   \n");
      out.write("   </div>\n");
      out.write("   \n");
      out.write("  \n");
      out.write("</a>\n");
      out.write("</body>\n");
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
