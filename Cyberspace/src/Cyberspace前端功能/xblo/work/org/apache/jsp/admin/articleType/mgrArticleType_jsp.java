package org.apache.jsp.admin.articleType;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import org.xblo.bean.*;
import org.xblo.dao.*;
import java.util.Iterator;

public final class mgrArticleType_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<title>管理界面</title>\r\n");
      out.write("<link href=\"");
      out.print(basePath);
      out.write("/admin/style.css\" rel=\"stylesheet\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");

	ArticleTypeDao articleTypeDao = new ArticleTypeDao();
	List<ArticleTypeBean> articleTypeList = articleTypeDao.queryAll();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<body id=\"page\">\r\n");
      out.write("<h2>类别列表</h2>\r\n");
      out.write("<form action=\"");
      out.print(basePath);
      out.write("/ActionServlet?action=addArticleType\"\r\n");
      out.write("\tmethod=\"post\">\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>类别：</th>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"articleTypeName\" size=\"20\"></input></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>描述：</th>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"articleTypeDesc\" size=\"50\"></input></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th></th>\r\n");
      out.write("\t\t<td><input type=\"submit\" class=\"bt\" value=\"新增类别\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t");

		for (Iterator<ArticleTypeBean> iter = articleTypeList.iterator(); iter
				.hasNext();) {
			ArticleTypeBean articleTypeBean = (ArticleTypeBean) iter.next();
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>类别：</th>\r\n");
      out.write("\t\t<td>");
      out.print(articleTypeBean.getArticleTypeName());
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>描述：</th>\r\n");
      out.write("\t\t<td>");
      out.print(articleTypeBean.getArticleTypeDesc());
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>操作：</th>\r\n");
      out.write("\t\t<td><a\r\n");
      out.write("\t\t\thref=\"");
      out.print(basePath);
      out.write("/ActionServlet?action=updArticleType&articleTypeId=");
      out.print(articleTypeBean.getArticleTypeId());
      out.write("\">修改</a>\r\n");
      out.write("\t\t| <a\r\n");
      out.write("\t\t\thref=\"");
      out.print(basePath);
      out.write("/ActionServlet?action=delArticleType&articleTypeId=");
      out.print(articleTypeBean.getArticleTypeId());
      out.write("\">删除</a></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");

		}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
