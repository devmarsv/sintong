/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2019-03-14 04:21:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.mypage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import point.model.vo.Point;
import java.util.*;
import member.model.vo.Member;

public final class mypagePoint_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/mypage/mypageHead.jsp", Long.valueOf(1552535067784L));
    _jspx_dependants.put("/views/common/footer.jsp", Long.valueOf(1552535067757L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("point.model.vo.Point");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	ArrayList<Point> list = (ArrayList<Point>)request.getAttribute("pointList");
	int totalp = (Integer)request.getAttribute("totalPoint");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t");
      out.write('\r');
      out.write('\n');

	Member loginMember = (Member)session.getAttribute("loginMember");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<title>신통시장</title>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t<link href=\"/semi/resources/images/favicon.png\" rel=\"icon\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/semi/vendor/bootstrap/css/bootstrap.min.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.2/css/all.css\" integrity=\"sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr\" crossorigin=\"anonymous\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/semi/resources/css/common.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/semi/resources/css/mypage.css\" />\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"/semi/resources/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"/semi/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<!-- Navigation -->\r\n");
      out.write("\t\t<header class=\"myHeader\">\r\n");
      out.write("\t\t\t<div class=\"t_nav\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<!-- 로그인 전 -->\r\n");
      out.write("\t\t\t\t\t");
 if(loginMember == null) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/semi/views/member/login.jsp\">로그인</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/semi/views/member/register.jsp\">회원가입</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#;\">장바구니</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/semi/views/member/login.jsp\">마이페이지</a></li>\r\n");
      out.write("\t\t\t\t\t<!-- 로그인 전 -->\r\n");
      out.write("\t\t\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- 로그인 후 -->\r\n");
      out.write("\t\t\t\t\t<li><span class=\"user\">");
      out.print( loginMember.getMemName() );
      out.write("</span>님 안녕하세요!</li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/semi\">홈</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/semi/logout\">로그아웃</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#;\">장바구니</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/semi/myinfo?mem_userid=");
      out.print( loginMember.getMemUserid() );
      out.write("\">마이페이지</a></li>\r\n");
      out.write("\t\t\t\t\t<!-- 로그인 후 -->\r\n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"mypageTop\">\r\n");
      out.write("\t\t\t\t<div class=\"topCon\">\r\n");
      out.write("\t\t\t\t\t<h2>마이페이지</h2>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t<div class=\"myContent\">\r\n");
      out.write("\t\t\t<div class=\"navTit\">QUICK MENU</div>\r\n");
      out.write("\t\t\t<nav class=\"navbar navbar-expand-lg navbar-light bg-light\" id=\"mypage_nav\">\r\n");
      out.write("\t\t\t\t<div class=\"navCon\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item active\"><a class=\"nav-link\" href=\"/semi/myinfo?mem_userid=");
      out.print( loginMember.getMemUserid() );
      out.write("\" id=\"nav_list\">내정보</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/semi/views/mypage/mypageMyInfoConfirm.jsp\" id=\"nav_list\">개인정보수정</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/semi/pointlist?mem_userid=");
      out.print( loginMember.getMemUserid() );
      out.write("\" id=\"nav_list\">적립금</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/semi/couponlist?mem_userid=");
      out.print( loginMember.getMemUserid() );
      out.write("\" id=\"nav_list\">쿠폰</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/semi/orderlist?mem_userid=");
      out.print( loginMember.getMemUserid() );
      out.write("\" id=\"nav_list\">주문 조회</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/semi/myqna?mem_userid=");
      out.print( loginMember.getMemUserid() );
      out.write("&page=1\" id=\"nav_list\">내가 쓴 QnA</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/semi/mypreview?mem_userid=");
      out.print( loginMember.getMemUserid() );
      out.write("&page=1\" id=\"nav_list\">내가 쓴 후기</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t<div class=\"container myContainer\">\r\n");
      out.write("\t\t<h2 class=\"conTit\">적립금</h2>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"alert alert-info\" style=\"text-align:center;\">\r\n");
      out.write("\t\t\t");
      out.print( loginMember.getMemName() );
      out.write(" 님의 총 적립금은 <b style=\"font-weight:bold;font-size:18px;\"><i class=\"fas fa-coins\"></i> ");
      out.print( totalp );
      out.write(" P</b> 입니다\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<table class=\"table table-hover\">\r\n");
      out.write("\t\t\t\t<thead class=\"thead-light\">\r\n");
      out.write("\t\t\t\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<th width=\"15%\">날짜</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"65%\">적립금설명</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"20%\">적립금</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t");
 if(list.size() == 0) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=3 align=\"center\" style=\"padding:80px 0 100px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"far fa-question-circle\" style=\"margin-bottom:10px;display:block;font-size:30px;\"></p>\r\n");
      out.write("\t\t\t\t\t\t\t적립금 내역이 없습니다.\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 for(Point p : list) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr class=\"boardlist\">\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"center\" style=\"vertical-align:middle;\">");
      out.print( p.getPointPublish() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"left\" style=\"vertical-align:middle;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 if(p.getPointValue() >= 0) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"pmark mPoint\">적립</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"pmark mUse\">사용</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print( p.getPointContent() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"center\" style=\"vertical-align:middle;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 if(p.getPointValue() >= 0) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t+");
      out.print( p.getPointValue() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print( p.getPointValue() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<footer class=\"py-5 bg-dark\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t  <p class=\"m-0 text-center text-white\">Copyright &copy; Your Website 2019</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t  </footer>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t</body>\r\n");
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
