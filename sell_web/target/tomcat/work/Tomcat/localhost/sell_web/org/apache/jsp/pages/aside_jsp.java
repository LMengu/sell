/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-11-08 07:08:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aside_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("\r\n");
      out.write("<aside class=\"main-sidebar\">\r\n");
      out.write("\t<!-- sidebar: style can be found in sidebar.less -->\r\n");
      out.write("\t<section class=\"sidebar\">\r\n");
      out.write("\t\t<!-- Sidebar user panel -->\r\n");
      out.write("\t\t<div class=\"user-panel\">\r\n");
      out.write("\t\t\t<div class=\"pull-left image\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/user2-160x160.jpg\"\r\n");
      out.write("\t\t\t\t\tclass=\"img-circle\" alt=\"User Image\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"pull-left info\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_security_005fauthentication_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<a href=\"#\"><i class=\"fa fa-circle text-success\"></i> 在线</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- sidebar menu: : style can be found in sidebar.less -->\r\n");
      out.write("\t\t<ul class=\"sidebar-menu\">\r\n");
      out.write("\t\t\t<li class=\"header\">菜单</li>\r\n");
      out.write("\t\t\t<li id=\"admin-index\"><a\r\n");
      out.write("\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/pages/main.jsp\"><i\r\n");
      out.write("\t\t\t\t\tclass=\"fa fa-dashboard\"></i> <span>首页</span></a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<li class=\"treeview\"><a href=\"#\"> <i class=\"fa fa-cogs\"></i>\r\n");
      out.write("\t\t\t\t\t<span>用户管理</span> <span class=\"pull-right-container\"> <i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<ul class=\"treeview-menu\">\r\n");
      out.write("\t\t\t\t\t<li id=\"system-setting\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/findAll.do\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-circle-o\"></i> 用户信息\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li id=\"system-setting\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/role/findAll.do\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-circle-o\"></i> 角色管理\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li id=\"system-setting\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/permission/findAll.do\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-circle-o\"></i> 资源权限管理\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"treeview\"><a href=\"#\"> <i class=\"fa fa-cube\"></i>\r\n");
      out.write("\t\t\t\t<span>药厂管理</span> <span class=\"pull-right-container\"> <i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t\t<ul class=\"treeview-menu\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li id=\"system-setting\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/medInfs/findAll.do\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"fa fa-circle-o\"></i> 药品基本信息\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li id=\"system-setting\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/sales/findAll.do\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"fa fa-circle-o\"></i> 销售员\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li id=\"system-setting\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/manufacturer/findAll.do\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fa fa-circle-o\"></i> 报表\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<li class=\"treeview\"><a href=\"#\"> <i class=\"fa fa-cube\"></i>\r\n");
      out.write("\t\t\t\t\t<span>医院管理</span> <span class=\"pull-right-container\"> <i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t\t<ul class=\"treeview-menu\">\r\n");
      out.write("\t\t\t\t\t<li id=\"system-setting\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/hospital/findAll.do\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-circle-o\"></i> 医院信息\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li id=\"system-setting\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/stock/findAll.do\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-circle-o\"></i> 药品信息\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li id=\"system-setting\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/patient/findAll.do\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-circle-o\"></i> 患者信息\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li id=\"system-setting\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/order/findAll.do\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-circle-o\"></i> 订单查询\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<li class=\"treeview\"><a href=\"#\"> <i class=\"fa fa-cube\"></i>\r\n");
      out.write("\t\t\t\t<span>患者管理</span> <span class=\"pull-right-container\"> <i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t\t<ul class=\"treeview-menu\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li id=\"system-setting\"><a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/patient/findAll.do\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-circle-o\"></i> 患者信息\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t<!-- /.sidebar -->\r\n");
      out.write("</aside>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_security_005fauthentication_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  security:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_security_005fauthentication_005f0 = (org.springframework.security.taglibs.authz.AuthenticationTag) _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    _jspx_th_security_005fauthentication_005f0.setPageContext(_jspx_page_context);
    _jspx_th_security_005fauthentication_005f0.setParent(null);
    // /pages/aside.jsp(15,5) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthentication_005f0.setProperty("principal.username");
    int _jspx_eval_security_005fauthentication_005f0 = _jspx_th_security_005fauthentication_005f0.doStartTag();
    if (_jspx_th_security_005fauthentication_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_security_005fauthentication_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_security_005fauthentication_005f0);
    return false;
  }
}
