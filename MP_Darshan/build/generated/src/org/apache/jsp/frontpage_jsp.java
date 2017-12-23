package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class frontpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/gsap/1.18.0/TweenMax.min.js\"></script>\n");
      out.write("         <script src=\"//s3-us-west-2.amazonaws.com/s.cdpn.io/16327/DrawSVGPlugin.js?r=12\"></script>\n");
      out.write("         <script src=\"//cdnjs.cloudflare.com/ajax/libs/snap.svg/0.3.0/snap.svg-min.js\"></script>\n");
      out.write("         <script src=\"//cdnjs.cloudflare.com/ajax/libs/d3/3.5.5/d3.min.js\"></script>\n");
      out.write("         \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("  margin: 0;\n");
      out.write("  background: #384b5f;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".link {\n");
      out.write("  position: fixed;\n");
      out.write("  bottom: 0;\n");
      out.write("  left: 0;\n");
      out.write("  margin: 10px;\n");
      out.write("  font-family: sans-serif;\n");
      out.write("  font-weight: 100;\n");
      out.write("}\n");
      out.write(".link a {\n");
      out.write("  color: black;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write(".link a:hover {\n");
      out.write("  text-decoration: underline;\n");
      out.write("}\n");
      out.write("\n");
      out.write("svg {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 0;\n");
      out.write("  left: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("svg {\n");
      out.write("  width: 100%;\n");
      out.write("  height: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".name {\n");
      out.write("  transform-origin: 50% 50%;\n");
      out.write("  transform: scale(0.75);\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Generator: Adobe Illustrator 19.2.1, SVG Export Plug-In  -->\n");
      out.write("<svg id=\"surface\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" xmlns:a=\"http://ns.adobe.com/AdobeSVGViewerExtensions/3.0/\" x=\"0px\" y=\"0px\" width=\"387.4px\" height=\"46.2px\" viewBox=\"0 0 387.4 46.2\" enable-background=\"new 0 0 387.4 46.2\"\n");
      out.write("  xml:space=\"preserve\">\n");
      out.write("<defs>\n");
      out.write("</defs>\n");
      out.write("<g class=\"name\">\n");
      out.write("\t<g class=\"letter\">\n");
      out.write("\t\t<path fill=\"none\" stroke=\"#384B5F\" stroke-width=\"8.1631\" stroke-miterlimit=\"10\" d=\"M32.1,8c0,0-3.4-2.9-11.6-2.9\n");
      out.write("\t\t\tS4.1,10.4,4.1,21.6c0,14.6,11.7,18.9,17.9,18.9s9.9-2.4,9.9-2.4\"/>\n");
      out.write("\t</g>\n");
      out.write("\t<g class=\"letter\">\n");
      out.write("\t\t<path fill=\"none\" stroke=\"#384B5F\" stroke-width=\"8\" stroke-miterlimit=\"10\" d=\"M38.1,36.7c0,0,2.1,4.6,8.3,4.4s8-3.9,8-9.7\n");
      out.write("\t\t\ts0-30.9,0-30.9\"/>\n");
      out.write("\t</g>\n");
      out.write("\t<g class=\"letter\">\n");
      out.write("\t\t<path fill=\"none\" stroke=\"#384B5F\" stroke-width=\"8\" stroke-miterlimit=\"10\" d=\"M119.2,13.6c0,0-3.3-9.1-15.5-9.2\n");
      out.write("\t\t\tc-9.6-0.1-17,9-17,18.8s7.7,18,18.2,18c16,0,16.5-16.5,16.5-16.5l-16.5,0.2\"/>\n");
      out.write("\t</g>\n");
      out.write("\t<g class=\"letter\">\n");
      out.write("\t\t<polyline fill=\"none\" stroke=\"#384B5F\" stroke-width=\"8\" stroke-linejoin=\"bevel\" stroke-miterlimit=\"10\" points=\"133.2,44.2 \n");
      out.write("\t\t\t149.6,2.4 166.1,44.1 \t\t\"/>\n");
      out.write("\t\t<line fill=\"none\" stroke=\"#384B5F\" stroke-width=\"8\" stroke-miterlimit=\"10\" x1=\"138.2\" y1=\"32.4\" x2=\"160.9\" y2=\"32.4\"/>\n");
      out.write("\t</g>\n");
      out.write("\t<g class=\"letter\">\n");
      out.write("\t\t<polyline fill=\"none\" stroke=\"#384B5F\" stroke-width=\"8\" stroke-linejoin=\"bevel\" stroke-miterlimit=\"10\" points=\"179.2,45.2 \n");
      out.write("\t\t\t185.9,1.7 200.7,44.2 215.4,1.7 222.2,45.6 \t\t\"/>\n");
      out.write("\t</g>\n");
      out.write("\t<g class=\"letter\">\n");
      out.write("\t\t<polyline fill=\"none\" stroke=\"#384B5F\" stroke-width=\"8\" stroke-linejoin=\"bevel\" stroke-miterlimit=\"10\" points=\"237.2,45.2 \n");
      out.write("\t\t\t243.9,1.7 258.7,44.2 273.4,1.7 280.2,45.6 \t\t\"/>\n");
      out.write("\t</g>\n");
      out.write("\t<g class=\"letter\">\n");
      out.write("\t\t\t<ellipse fill=\"none\" stroke=\"#384B5F\" stroke-width=\"8\" stroke-linejoin=\"bevel\" stroke-miterlimit=\"10\" cx=\"314.1\" cy=\"22.7\" rx=\"18.3\" ry=\"18.7\"/>\n");
      out.write("\t</g>\n");
      out.write("\t<g class=\"letter\">\n");
      out.write("\t\t<polyline fill=\"none\" stroke=\"#384B5F\" stroke-width=\"8\" stroke-linejoin=\"bevel\" stroke-miterlimit=\"10\" points=\"349.4,45.6 \n");
      out.write("\t\t\t349.4,2.6 383.4,43.2 383.4,0.6 \t\t\"/>\n");
      out.write("\t</g>\n");
      out.write("</g>\n");
      out.write("</svg>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"link\">\n");
      out.write("  <a href=\"https://twitter.com/cjgammon\">@cjgammon</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    'use strict';\n");
      out.write("\n");
      out.write("var s = new Snap('#surface');\n");
      out.write("var letterSpeed = 10; //higher = faster\n");
      out.write("var colorSpeed = 2; //higher = faster\n");
      out.write("var colors = ['#e9edef', '#efad42', '#e9435a', '#4aadad', '#83cead'];\n");
      out.write("var letters = s.selectAll('.letter');\n");
      out.write("var tl = new TimelineMax({\n");
      out.write("  repeat: -1,\n");
      out.write("  yoyo: true\n");
      out.write("});\n");
      out.write("\n");
      out.write("for (var i = 0; i < letters.length; i += 1) {if (window.CP.shouldStopExecution(3)){break;}\n");
      out.write("  var letter = letters[i];\n");
      out.write("\n");
      out.write("  tl.set(letter.node, {\n");
      out.write("    rotation: 180 - Math.random() * 360,\n");
      out.write("    x: 20,\n");
      out.write("    y: -200\n");
      out.write("  }, 0);\n");
      out.write("\n");
      out.write("  var tw = TweenMax.to(letter.node, 0.6, {\n");
      out.write("    rotation: 0,\n");
      out.write("    x: 0,\n");
      out.write("    y: 0,\n");
      out.write("    ease: Back.easeOut\n");
      out.write("  });\n");
      out.write("\n");
      out.write("  tl.add(tw, 0.5 + i / letterSpeed);\n");
      out.write("\n");
      out.write("  var paths = letter.selectAll('*');\n");
      out.write("  for (var k = 0; k < paths.length; k += 1) {if (window.CP.shouldStopExecution(2)){break;}\n");
      out.write("    for (var j = 0; j < colors.length; j += 1) {if (window.CP.shouldStopExecution(1)){break;}\n");
      out.write("\n");
      out.write("      var l = paths[k].clone();\n");
      out.write("      l.attr({\n");
      out.write("        stroke: colors[j]\n");
      out.write("      });\n");
      out.write("\n");
      out.write("      var delay = 0.1 + i / letterSpeed + (colors.length - j / colorSpeed) / 10;\n");
      out.write("      var tw = TweenMax.fromTo(l.node, 1, {\n");
      out.write("        drawSVG: '0%'\n");
      out.write("      }, {\n");
      out.write("        drawSVG: '100%',\n");
      out.write("        ease: Power2.easeInOut\n");
      out.write("      });\n");
      out.write("      tl.add(tw, delay);\n");
      out.write("    }\n");
      out.write("window.CP.exitedLoop(1);\n");
      out.write("\n");
      out.write("\n");
      out.write("    //paths[k].remove();\n");
      out.write("    letter.prepend(paths[k]);\n");
      out.write("    TweenMax.set(paths[k].node, {\n");
      out.write("      x: -3,\n");
      out.write("      y: -3\n");
      out.write("    });\n");
      out.write("    var tw = TweenMax.fromTo(paths[k].node, 1, {\n");
      out.write("      drawSVG: '0%'\n");
      out.write("    }, {\n");
      out.write("      drawSVG: '100%',\n");
      out.write("      ease: Power2.easeInOut\n");
      out.write("    });\n");
      out.write("    tl.add(tw, delay);\n");
      out.write("  }\n");
      out.write("window.CP.exitedLoop(2);\n");
      out.write("\n");
      out.write("}\n");
      out.write("window.CP.exitedLoop(3);\n");
      out.write("\n");
      out.write("</script>\n");
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
