/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.1
 * Generated at: 2017-10-19 09:26:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.classes.htmls;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/classes/htmls/articlelist.jsp", Long.valueOf(1508396919000L));
    _jspx_dependants.put("/WEB-INF/classes/htmls/footer.jsp", Long.valueOf(1508396937000L));
    _jspx_dependants.put("/WEB-INF/classes/htmls/header.jsp", Long.valueOf(1508397642000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width;initial-scale=1\">\n");
      out.write("    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->\n");
      out.write("\t\t<!-- Bootstrap core JavaScript================================================== -->\n");
      out.write("\t\t\t<script src=\"https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("\t\t\t<script>window.jQuery || document.write('<script src=\"../../assets/js/vendor/jquery.min.js\"><\\/script>')</script>\n");
      out.write("\t\t\t<script src=\"https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\t\t<!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("    <title>阳光流淌的个人博客</title>\n");
      out.write("    <link href=\"../css/copy.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/starbuzz.css\">\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"../css/blog.css\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"../css/copy.js\"></script>\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-default navbar-static-top\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"../index.html\" target=\"_blank\" >阳光流淌的个人博客</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("          <ul class=\"nav navbar-nav\">\n");
      out.write("            <li><a href=\"Web前端.html\" target=\"_blank\">Java</a></li>\n");
      out.write("            <li><a href=\"Python.html\" target=\"_blank\">Python</a></li>\n");
      out.write("            <li><a href=\"数据库&服务器.html\">数据库SQL</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/navbar/\">其他技术</a></li>\n");
      out.write("          </ul>\n");
      out.write("\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">走过路过<span class=\"caret\"></span></a>\n");
      out.write("\t              <ul class=\"dropdown-menu\">\n");
      out.write("\t                <li><a href=\"../生活杂谈之有趣的图片.html\" target=\"_blank\">看看世界</a></li>\n");
      out.write("\t                <li><a href=\"#\">转载分享</a></li>\n");
      out.write("\t                <li class=\"dropdown-header\">个人专区</li>\n");
      out.write("\t                <!--此处可以用此样式，添加一条分隔横线<li role=\"separator\" class=\"divider\"></li>-->\n");
      out.write("\t                <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("\t                <li><a href=\"#\">嘚吧嘚</a></li>\n");
      out.write("\t                <li><a href=\"#\">行为艺术</a></li>\n");
      out.write("\t              </ul>\n");
      out.write("\t            </li>\n");
      out.write("           <li><a href=\"../注册登录.html\">注册登录</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div><!--/.nav-collapse -->\n");
      out.write("      </div><!--container-->\n");
      out.write("    </nav>\n");
      out.write("\t<body>\n");
      out.write("\n");
      out.write("\t\t<center>\n");
      out.write("      <h2>欢迎进入-www.flowingsun.com</h2>\n");
      out.write("\t\t</center>\n");
      out.write("    ");

      request.setCharacterEncoding("UTF-8");
      List<String> info = (List<String>) request.getAttribute("info");    //取得属性
			Enumeration enu = request.getHeaderNames();        //取得Header头信息
			String method = request.getMethod();               //取得提交方式
			String Ip = request.getRemoteAddr();               //取得客户端IP
			String ServletPath = request.getServletPath();            //取得相对访问路径
			String contextPath = request.getContextPath();     //取得上下文资源名称

			String realPath=request.getRealPath("/");
			String remoteAddress=request.getRemoteAddr();
			String remoteUser=request.getRemoteUser();
			String requestURI=request.getRequestURI();
    
      out.write("\n");
      out.write("\t\t<h4>【method：");
      out.print(method);
      out.write("】</h4>\n");
      out.write("\t\t<h4>【IP地址：");
      out.print(Ip);
      out.write("】</h4>\n");
      out.write("\t\t<h4>【ServletPath：");
      out.print(ServletPath);
      out.write("】</h4>\n");
      out.write("\t\t<h4>【contextPath：");
      out.print(contextPath);
      out.write("】</h4>\n");
      out.write("\t\t<h4>【realPath：");
      out.print(realPath);
      out.write("】</h4>\n");
      out.write("\t\t<h4>【remoteAddress：");
      out.print(remoteAddress);
      out.write("】</h4>\n");
      out.write("\t\t<h4>【remoteUser：");
      out.print(remoteUser);
      out.write("】</h4>\n");
      out.write("\t\t<h4>【requestURI：");
      out.print(requestURI);
      out.write("】</h4>\n");
      out.write("\n");
      out.write("\t\t<h3>");
      out.print(session.getAttribute("name"));
      out.write("</h3>\n");
      out.write("\t\t");

			if (info != null){
          Iterator<String> iter = info.iterator();       //实例化Iterator
          while(iter.hasNext()){
    
      out.write("\n");
      out.write("               <h3>");
      out.print(iter.next());
      out.write("</h3>\n");
      out.write("    ");

          }
      }
		while(enu.hasMoreElements()){
			   String headerName = (String)enu.nextElement();
			   String headValue = request.getHeader(headerName);//取出头信息内容
	  
      out.write("\n");
      out.write("\t\t   <p>【");
      out.print(headerName);
      out.write('：');
      out.print(headValue);
      out.write("】</p>\n");
      out.write("\t\t");

	    }
		
      out.write("\n");
      out.write("  <center>\n");
      out.write("  </center>\n");
      out.write("\t");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-sm-8 blog-main\">\n");
      out.write("        <!--文章主体全部在blog-post中 ，要添加新文章，直接copy此div模块即可-->\n");
      out.write("\n");
      out.write("          <div class=\"blog-post\">\n");
      out.write("           <a href=\"Mysql的安装.html\"target=\"_blank\"><h2 class=\"blog-post-title\"><strong>macOS系统下Mysql的安装</strong>\n");
      out.write("           </h2>\n");
      out.write("         </a>\n");
      out.write("           <p class=\"blog-post-meta\">2017-06-03 by <a href=\"#\">阳光流淌</a></p>\n");
      out.write("           <h4><strong>Mysql是世界流行的关系型数据库软件，具体介绍请点击<a href=\"https://baike.baidu.com/item/mySQL/471251\"target=\"_blank\">MySQL_百度百科</a>\n");
      out.write("           官网提供了各个操作系统和各个版本的下载，下载请点击<a href=\"https://dev.mysql.com/downloads/mysql/\"target=\"_blank\">https://dev.mysql.com/downloads/mysql/</a>\n");
      out.write("           </strong></h4>\n");
      out.write("          </div><!-- /.blog-post -->\n");
      out.write("\n");
      out.write("          <div class=\"blog-post\">\n");
      out.write("           <a href=\"Mysql的配置.html\"target=\"_blank\"><h2 class=\"blog-post-title\"><strong>macOS系统下Mysql的配置</strong>\n");
      out.write("           </h2>\n");
      out.write("           </a>\n");
      out.write("           <p class=\"blog-post-meta\">2017-06-09 by <a href=\"#\">阳光流淌</a></p>\n");
      out.write("           <h4><strong>为什么要配置Mysql？</strong></h4>\n");
      out.write("           <ol>\n");
      out.write("              <li>配置好环境变量（MySQL的调用路径），方便我们以后从terminal命令行对MySQL进行调用、编辑等操作。</li>\n");
      out.write("              <li>MySQL自动分配了很杂乱的密码，我们自己平常使用的话需要重置一个密码。</li>\n");
      out.write("            </ol>\n");
      out.write("          </div><!-- /.blog-post -->\n");
      out.write("\n");
      out.write("          <div class=\"blog-post\">\n");
      out.write("           <a href=\"Apache.html\"target=\"_blank\"><h2 class=\"blog-post-title\"><strong>macOS系统下Apache的配置</strong>\n");
      out.write("           </h2>\n");
      out.write("           </a>\n");
      out.write("           <p class=\"blog-post-meta\">2017-06-12 by <a href=\"#\">阳光流淌</a></p>\n");
      out.write("           <h4><strong> mac OS系统自带了Apache服务器，但是在最新的MAC OS系统中没有显示为可见的应用程序，需要用terminal终端命令调用。</strong></h4>\n");
      out.write("          </div><!-- /.blog-post -->\n");
      out.write("\n");
      out.write("          <div class=\"blog-post\">\n");
      out.write("           <a href=\"MongoDB.html\"target=\"_blank\"><h2 class=\"blog-post-title\"><strong>macOS系统下MongoDB配置</strong>\n");
      out.write("           </h2>\n");
      out.write("           </a>\n");
      out.write("           <p class=\"blog-post-meta\">2017-06-18 by <a href=\"#\">阳光流淌</a></p>\n");
      out.write("           <h4><strong>MongoDB是世界流行的分布式非关系型数据库软件（nosql），存储网页上json格式的网页文档，数据库操作存储都十分方便！具体介绍可以移步：</strong></h4>\n");
      out.write("           <ul>\n");
      out.write("              <li><a href=\"https://baike.baidu.com/item/mongodb\"target=\"_blank\">mongodb_百度百科</a></li>\n");
      out.write("              <li><a href=\"https://www.mongodb.com/download-center?jmp=nav#community\"target=\"_blank\">mongodb_官网下载</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div><!-- /.blog-post -->\n");
      out.write("\n");
      out.write("          <div class=\"blog-post\">\n");
      out.write("           <a href=\"Mysql的操作.html\"target=\"_blank\"><h2 class=\"blog-post-title\"><strong>macOS系统下MySQL常用操作</strong>\n");
      out.write("           </h2>\n");
      out.write("           </a>\n");
      out.write("           <p class=\"blog-post-meta\">2017-06-21 by <a href=\"#\">阳光流淌</a></p>\n");
      out.write("           <h4><strong>除了基础的登录和连接MySQL服务外，MySQL的常用操作主要包括四个部分：增、删、查、改。\n");
      out.write("                       具体又分为对数据库、对数据库中的表、对表中字段的增、删、查、改！\n");
      out.write("              </strong></h4>\n");
      out.write("          </div><!-- /.blog-post -->\n");
      out.write("\n");
      out.write("          <div class=\"blog-post\">\n");
      out.write("           <a href=\"MongoDB基础操作语句.html\"target=\"_blank\"><h2 class=\"blog-post-title\"><strong>MongoDB基础操作语句</strong>\n");
      out.write("           </h2>\n");
      out.write("           </a>\n");
      out.write("           <p class=\"blog-post-meta\">2017-08-31 by <a href=\"#\">阳光流淌</a></p>\n");
      out.write("           <h4><strong>主要记录MongoDB中常用的操作如增加新数据库、增加新表、查询语句、删除语句等基础操作语句。\n");
      out.write("              </strong></h4>\n");
      out.write("          </div><!-- /.blog-post -->\n");
      out.write("\n");
      out.write("            <nav>\n");
      out.write("                <ul class=\"pager\">\n");
      out.write("                    <li><a href=\"#\">上一页</a></li>\n");
      out.write("                    <li><a href=\"#\">下一页</a></li>\n");
      out.write("                    <li><a href=\"../index.html\"target=\"_blank\">返回</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("         </div><!-- /.blog-main -->\n");
      out.write("         <div class=\"col-sm-3 col-sm-offset-1 blog-sidebar\">\n");
      out.write("          <div class=\"sidebar-module sidebar-module-inset\">\n");
      out.write("            <h4>About</h4>\n");
      out.write("            <p>Etiam porta <em>sem malesuada magna</em> mollis euismod. Cras mattis consectetur purus sit amet fermentum. Aenean lacinia bibendum nulla sed consectetur.</p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"sidebar-module\">\n");
      out.write("                <h4>Archives</h4>\n");
      out.write("                <ol class=\"list-unstyled\">\n");
      out.write("                  <li><a href=\"#\">March 2014</a></li>\n");
      out.write("                  <li><a href=\"#\">February 2014</a></li>\n");
      out.write("                  <li><a href=\"#\">January 2014</a></li>\n");
      out.write("                  <li><a href=\"#\">December 2013</a></li>\n");
      out.write("                  <li><a href=\"#\">November 2013</a></li>\n");
      out.write("                  <li><a href=\"#\">October 2013</a></li>\n");
      out.write("                  <li><a href=\"#\">September 2013</a></li>\n");
      out.write("                  <li><a href=\"#\">August 2013</a></li>\n");
      out.write("                  <li><a href=\"#\">July 2013</a></li>\n");
      out.write("                  <li><a href=\"#\">June 2013</a></li>\n");
      out.write("                  <li><a href=\"#\">May 2013</a></li>\n");
      out.write("                  <li><a href=\"#\">April 2013</a></li>\n");
      out.write("                </ol>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"sidebar-module\">\n");
      out.write("                <h4>Elsewhere</h4>\n");
      out.write("                <ol class=\"list-unstyled\">\n");
      out.write("                  <li><a href=\"#\">GitHub</a></li>\n");
      out.write("                  <li><a href=\"#\">Twitter</a></li>\n");
      out.write("                  <li><a href=\"#\">Facebook</a></li>\n");
      out.write("                </ol>\n");
      out.write("              </div>\n");
      out.write("              </div><!-- /.blog-sidebar -->\n");
      out.write("          </div><!-- /.row -->\n");
      out.write("        </div><!-- /.container -->\n");
      out.write('\n');
      out.write('	');
      out.write("\n");
      out.write("<div id=footer>\n");
      out.write("\t\t\t\t© CopyRight 2017-2018 www.flowingsun.com Inc All Rights Reserved 皖ICP备17013223号<br>\n");
      out.write("\t\t\t\tEmail: SunningDew@163.com\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write('\n');
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
