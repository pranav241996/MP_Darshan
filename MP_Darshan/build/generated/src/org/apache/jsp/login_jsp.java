package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <title>MP DARSHAN</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/normalize1.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/index1.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/logintxt.css\" />\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                margin:0px auto;\n");
      out.write("                background-image:url(images/1.jpg);\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: 100%;\n");
      out.write("            }\n");
      out.write("            .container{\n");
      out.write("                width: 500px;\n");
      out.write("                height: 400px;\n");
      out.write("                background-color: silver;\n");
      out.write("                margin: 0px auto;\n");
      out.write("                text-align: center;\n");
      out.write("                margin-top: 150px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                opacity: .8;\n");
      out.write("            }\n");
      out.write("            .container img{\n");
      out.write("                width: 110px;\n");
      out.write("                height: 110px;\n");
      out.write("                border-radius: 600px;\n");
      out.write("                background: #fff;\n");
      out.write("                padding: 5px;\n");
      out.write("                margin-top:-60px;\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .login{border:none;\n");
      out.write("                  padding:15px 30px;\n");
      out.write("                  background: azure;\n");
      out.write("                  border-radius: 5px;\n");
      out.write("                  coursor:pointer;\n");
      out.write("                  border-bottom: 5px solid #ccccff;\n");
      out.write("                  position: relative;\n");
      out.write("                  bottom: 120px;\n");
      out.write("                  left: 120px;\n");
      out.write("                    \n");
      out.write("            }\n");
      out.write("            .signup{border:none;\n");
      out.write("                    margin-bottom: 30px;\n");
      out.write("            }\n");
      out.write("            a{color:#fff;}\n");
      out.write("        </style>  \n");
      out.write("        <script>\n");
      out.write("window.location.hash=\"no-back-button\";\n");
      out.write("window.location.hash=\"Again-No-back-button\";//again because google chrome don't insert first hash into history\n");
      out.write("window.onhashchange=function(){window.location.hash=\"no-back-button\";}\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("            <img src=\"images/icon1.jpg\" alt=\"founder\">\n");
      out.write("            \n");
      out.write("            <form action=\"LoginController\" method=\"post\" >\n");
      out.write("                     \n");
      out.write("                <span class=\"input input--nao\" >\n");
      out.write("                    <input class=\"input__field input__field--nao\" type=\"email\" name=\"email\" required style=\"color: black\" />\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--nao\" for=\"input-1\">\n");
      out.write("                                            <span class=\"input__label-content input__label-content--nao\">E-mail</span><br>\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t<svg class=\"graphic graphic--nao\" width=\"300%\" height=\"100%\" viewBox=\"0 0 1200 60\" preserveAspectRatio=\"none\">\n");
      out.write("\t\t\t\t\t\t<path d=\"M0,56.5c0,0,298.666,0,399.333,0C448.336,56.5,513.994,46,597,46c77.327,0,135,10.5,200.999,10.5c95.996,0,402.001,0,402.001,0\"/>\n");
      out.write("\t\t\t\t\t</svg>\n");
      out.write("\t\t\t\t</span><br>\n");
      out.write("                \n");
      out.write("                                <span class=\"input input--nao\">\n");
      out.write("                                    <input class=\"input__field input__field--nao\" type=\"password\" name=\"password\" required style=\"color: black\"/>\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--nao\" for=\"password\">\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--nao\">password</span>\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t<svg class=\"graphic graphic--nao\" width=\"300%\" height=\"100%\" viewBox=\"0 0 1200 60\" preserveAspectRatio=\"none\">\n");
      out.write("\t\t\t\t\t\t<path d=\"M0,56.5c0,0,298.666,0,399.333,0C448.336,56.5,513.994,46,597,46c77.327,0,135,10.5,200.999,10.5c95.996,0,402.001,0,402.001,0\"/>\n");
      out.write("\t\t\t\t\t</svg>\n");
      out.write("\t\t\t\t</span><br>\n");
      out.write("                <div style=\"position: relative; right: 110px \">\n");
      out.write("                    <input type=\"checkbox\" name=\"ck\" value=\"remember\" >Remember me\n");
      out.write("                </div><br/><br><br>\n");
      out.write("                <div style=\"position: relative; bottom:40px; right: 100px;\">\n");
      out.write("                <a href=\"#\">Froget Password ?</a><br><br>\n");
      out.write("                </div>\n");
      out.write("                <input type=\"submit\" value=\"LOGIN\" name=\"submit\"  class=\"login\"><br><br>\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("            <div style=\"position: relative; bottom: 150px; left: 120px;\">\n");
      out.write("                <a href=\"registration.jsp\"><button  style=\"padding: 15px 30px; background: azure; border-radius: 5px; coursor:pointer;\n");
      out.write("                  border-bottom: 5px solid #ccccff;\">sign up </button></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
