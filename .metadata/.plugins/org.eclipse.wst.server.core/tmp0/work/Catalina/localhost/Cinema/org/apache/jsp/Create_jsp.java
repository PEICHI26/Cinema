/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.54
 * Generated at: 2021-12-17 10:11:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Create_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/copyright.jspf", Long.valueOf(1639724258966L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Create Movie</title>\r\n");
      out.write("<style>\r\n");
      out.write("* {\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=text], select, textarea {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	padding: 12px;\r\n");
      out.write("	border: 1px solid #ccc;\r\n");
      out.write("	border-radius: 4px;\r\n");
      out.write("	resize: vertical;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("label {\r\n");
      out.write("	padding: 12px 12px 12px 0;\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=submit] {\r\n");
      out.write("	background-color: #4CAF50;\r\n");
      out.write("	color: white;\r\n");
      out.write("	padding: 12px 20px;\r\n");
      out.write("	border: none;\r\n");
      out.write("	border-radius: 4px;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("	float: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=submit]:hover {\r\n");
      out.write("	background-color: #45a049;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container {\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("	background-color: #f2f2f2;\r\n");
      out.write("	padding: 20px;\r\n");
      out.write("	width: 900px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".col-25 {\r\n");
      out.write("	float: left;\r\n");
      out.write("	width: 25%;\r\n");
      out.write("	margin-top: 6px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".col-75 {\r\n");
      out.write("	float: left;\r\n");
      out.write("	width: 75%;\r\n");
      out.write("	margin-top: 6px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Clear floats after the columns */\r\n");
      out.write(".row:after {\r\n");
      out.write("	content: \"\";\r\n");
      out.write("	display: table;\r\n");
      out.write("	clear: both;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */\r\n");
      out.write("@media screen and (max-width: 600px) {\r\n");
      out.write("	.col-25, .col-75, input[type=submit] {\r\n");
      out.write("		width: 100%;\r\n");
      out.write("		margin-top: 0;\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<h2>新增電影</h2>\r\n");
      out.write("		<form action=\"MovieServlet\" method=\"post\">\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-25\">\r\n");
      out.write("					<label for=\"moviename\">Movie Name</label>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-75\">\r\n");
      out.write("					<input type=\"text\" id=\"moviename\" name=\"moviename\" placeholder=\"\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-25\">\r\n");
      out.write("					<label for=\"moviename\">Release Date</label>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-75\">\r\n");
      out.write("					<input type=\"date\" id=\"rdate\" name=\"rdate\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-25\">\r\n");
      out.write("					<label for=\"movielength\">Length</label>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-75\">\r\n");
      out.write("					<input type=\"text\" id=\"movielength\" name=\"movielength\"\r\n");
      out.write("						placeholder=\"\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-25\">\r\n");
      out.write("					<label for=\"type\">Type</label>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-75\">\r\n");
      out.write("					<input type=\"text\" id=\"type\" name=\"type\" placeholder=\"\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-25\">\r\n");
      out.write("					<label for=\"grading\">Grading</label>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-75\">\r\n");
      out.write("					<input type=\"text\" id=\"grading\" name=\"grading\" placeholder=\"\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-25\">\r\n");
      out.write("					<label for=\"release\">Release</label>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-75\">\r\n");
      out.write("					<input type=\"text\" id=\"release\" name=\"release\" placeholder=\"\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-25\">\r\n");
      out.write("					<label for=\"director\">Director</label>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-75\">\r\n");
      out.write("					<input type=\"text\" id=\"director\" name=\"director\" placeholder=\"\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-25\">\r\n");
      out.write("					<label for=\"actors\">Actors</label>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-75\">\r\n");
      out.write("					<input type=\"text\" id=\"actors\" name=\"actors\" placeholder=\"\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-25\">\r\n");
      out.write("					<label for=\"intro\">Introduction</label>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-75\">\r\n");
      out.write("					<textarea id=\"intro\" name=\"intro\" placeholder=\"\"\r\n");
      out.write("						style=\"height: 200px\"></textarea>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<br>\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<input type=\"submit\" name=\"INSERT\" value=\"新增電影\">\r\n");
      out.write("			</div>\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("	");
      out.write("<h2> Copyright   2021 </h2>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
