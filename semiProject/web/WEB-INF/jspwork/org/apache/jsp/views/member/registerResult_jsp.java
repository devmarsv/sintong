/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2019-03-14 00:20:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Member;
import java.util.*;

public final class registerResult_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/admin/adminHeader.jsp", Long.valueOf(1552447343687L));
    _jspx_dependants.put("/views/common/header.jsp", Long.valueOf(1552447343721L));
    _jspx_dependants.put("/views/common/footer.jsp", Long.valueOf(1551750544000L));
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
 Member loginMember = (Member) session.getAttribute("loginMember");
      out.write('\r');
      out.write('\n');
 String findPwd = (String)session.getAttribute("findPwd"); 
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>registerResult</title>\r\n");
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
      out.write("\t\t<header>\r\n");
      out.write("\t\t\t<div class=\"t_nav\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<!-- 로그인 전 -->\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/semi/views/member/login.jsp\">로그인</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/semi/views/member/register.jsp\">회원가입</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#;\">장바구니</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#;\">마이페이지</a></li>\r\n");
      out.write("\t\t\t\t\t<!-- 로그인 전 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- 로그인 후 -->\r\n");
      out.write("\t\t\t\t\t<!-- <li><span class=\"user\">USER1</span>님 안녕하세요!</li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#;\">로그아웃</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#;\">장바구니</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#;\">마이페이지</a></li> -->\r\n");
      out.write("\t\t\t\t\t<!-- 로그인 후 -->\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<h1 class=\"logo\"><a href=\"/semi\"><img src=\"/semi/resources/images/logo.png\" alt=\"신통시장\" /></a></h1>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<nav class=\"navbar navbar-expand-xs navbar-dark bg-dark\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"collapse navbar-collapse show\" id=\"navbarResponsive\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownPortfolio\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t\t\t  전체 카테고리\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-menu dropdown-menu-left\" aria-labelledby=\"navbarDropdownPortfolio\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"gnb-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"/semi/views/product/productList.jsp\" class=\"menu\">채소</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"sub-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"/semi/views/product/productList.jsp\" class=\"sub dropdown-item\">기본채소</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"/semi/views/product/productList.jsp\" class=\"sub dropdown-item\">쌈·샐러드·간편채소</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"/semi/views/product/productList.jsp\" class=\"sub dropdown-item\">브로콜리·특수채소</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"/semi/views/product/productList.jsp\" class=\"sub dropdown-item\">콩나물·버섯류</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"/semi/views/product/productList.jsp\" class=\"sub dropdown-item\">양파·마늘·생강·파</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"/semi/views/product/productList.jsp\" class=\"sub dropdown-item\">시금치·부추·나물</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"/semi/views/product/productList.jsp\" class=\"sub dropdown-item\">파프리카·피망·고추</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"/semi/views/product/productList.jsp\" class=\"menu\">과일·견과·쌀</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"sub-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#;\" class=\"sub dropdown-item\">국산과일</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#;\" class=\"sub dropdown-item\">수입과일</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#;\" class=\"sub dropdown-item\">냉동·건과일</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#;\" class=\"sub dropdown-item\">견과류</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#;\" class=\"sub dropdown-item\">쌀·잡곡</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"/semi/views/product/productList.jsp\" class=\"menu\">수산·해산·건어물</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"sub-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#;\" class=\"sub dropdown-item\">생선류</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#;\" class=\"sub dropdown-item\">새우·게·랍스터</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#;\" class=\"sub dropdown-item\">오징어·낙지·문어</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#;\" class=\"sub dropdown-item\">해산물·조개류</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#;\" class=\"sub dropdown-item\">수산가공품</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#;\" class=\"sub dropdown-item\">김·미역·해조류</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"/semi/views/product/productList.jsp\" class=\"menu\">정육·계란</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"sub-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#;\" class=\"sub dropdown-item\">소고기</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#;\" class=\"sub dropdown-item\">돼지고기</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#;\" class=\"sub dropdown-item\">계란류</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#;\" class=\"sub dropdown-item\">닭·오리고기</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#;\" class=\"sub dropdown-item\">양념육·돈까스</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t  </li>\r\n");
      out.write("\t\t\t\t\t\t  <li class=\"nav-item\"><a class=\"nav-link\" href=\"/semi/views/product/timeProductList.jsp\">반짝떨이</a></li>\r\n");
      out.write("\t\t\t\t\t\t  <li class=\"nav-item\"><a class=\"nav-link\" href=\"/semi/views/product/bestProductList.jsp\">베스트</a></li>\r\n");
      out.write("\t\t\t\t\t\t  <li class=\"nav-item\"><a class=\"nav-link\" href=\"#;\">주차 현황</a></li>\r\n");
      out.write("\t\t\t\t\t\t  <li class=\"nav-item\"><a class=\"nav-link\" href=\"#;\">고객 센터</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/semi/resources/css/member.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
 if(loginMember != null && loginMember.getMem_userid().equals("admin")){ 
      out.write('\r');
      out.write('\n');
      out.write('	');
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
      out.write("\t\t<link rel=\"stylesheet\" href=\"/semi/resources/css/admin.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/semi/vendor/fontawesome-free/css/all.min.css\" type=\"text/css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\">\r\n");
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
      out.write("\t\t<header>\r\n");
      out.write("\t\t\t<div class=\"t_nav\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><span class=\"user\">USER1</span>님 안녕하세요!</li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#;\">로그아웃</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<h1 class=\"logo\"><a href=\"/semi\"><img src=\"/semi/resources/images/logo.png\" alt=\"신통시장\" /></a></h1>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<nav class=\"navbar navbar-expand-xs navbar-dark bg-dark\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"collapse navbar-collapse show\" id=\"navbarResponsive\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t  <li class=\"nav-item\"><a class=\"nav-link\" href=\"/semi/views/admin/adminIndex.jsp\">대쉬보드</a></li>\r\n");
      out.write("\t\t\t\t\t\t  <li class=\"nav-item\"><a class=\"nav-link\" href=\"#;\">회원</a></li>\r\n");
      out.write("\t\t\t\t\t\t  <li class=\"nav-item\"><a class=\"nav-link\" href=\"#;\">주문/배송</a></li>\r\n");
      out.write("\t\t\t\t\t\t  <li class=\"nav-item\"><a class=\"nav-link\" href=\"#;\">상품</a></li>\r\n");
      out.write("\t\t\t\t\t\t  <li class=\"nav-item\"><a class=\"nav-link\" href=\"#;\">게시판</a></li>\r\n");
      out.write("\t\t\t\t\t\t  <li class=\"nav-item\"><a class=\"nav-link\" href=\"#;\">매장</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
      out.write(" <!-- 절대경로 -->\r\n");
 } 
      out.write("\r\n");
      out.write("\t<section>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t");
 if (loginMember == null) { 
      out.write("\r\n");
      out.write("\t<div id=\"logreg-forms1\" >\r\n");
      out.write("\t\t<form class=\"form-findmem_userid\" action=\"/semi/register\"> <!--회원가입-->\r\n");
      out.write("            <h1 class=\"h3 mb-3 font-weight-bold \" style=\" text-align: center\"> 회원가입 완료</h1>\r\n");
      out.write("            <div>\r\n");
      out.write("            \t<h3>회원가입이 완료 되었습니다.</h3>\r\n");
      out.write("            \t<div>\r\n");
      out.write("            \t <h3>다시 로그인 해 주세요</h3>\r\n");
      out.write("            \t</div>\r\n");
      out.write("            </div>\t\r\n");
      out.write("            \t\t\r\n");
      out.write("            <a href=\"/semi/views/member/login.jsp\" id=\"cancel_userName\"><i class=\"fas fa-angle-left\"></i> 뒤로</a>\r\n");
      out.write("        </form>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\r\n");
      out.write("\t\t");

			} else {
		
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t<table width=\"200\" cellpadding=\"0\" cellspacing=\"5\" border=\"0\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(loginMember.getMem_name());
      out.write("님</td>\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t<td><a href=\"/semi/myinfo?mem_userid=");
      out.print(loginMember.getMem_userid());
      out.write("\">내\r\n");
      out.write("\t\t\t\t\t\t정보 보기</a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><a href=\"/semi/logout\">로그아웃</a></td>\r\n");
      out.write("\t\t\t\t<td><a href=\"#\">쪽지</a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t");

			}
		
      out.write("\r\n");
      out.write("\t</section>\r\n");
      out.write("\r\n");
      out.write("\t<hr style=\"clear: left;\">\r\n");
      out.write("\t<!-- Bootstrap core JavaScript -->\r\n");
      out.write("\t<script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
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
