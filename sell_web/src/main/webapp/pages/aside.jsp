<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<aside class="main-sidebar">
	<!-- sidebar: style can be found in sidebar.less -->
	<section class="sidebar">
		<!-- Sidebar user panel -->
		<div class="user-panel">
			<div class="pull-left image">
				<img src="${pageContext.request.contextPath}/img/user2-160x160.jpg"
					class="img-circle" alt="User Image">
			</div>
			<div class="pull-left info">
				<p>
					<security:authentication property="principal.username"></security:authentication>
				</p>
				<a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
			</div>
		</div>

		<!-- sidebar menu: : style can be found in sidebar.less -->
		<ul class="sidebar-menu">
			<li class="header">菜单</li>
			<li id="admin-index"><a
				href="${pageContext.request.contextPath}/pages/main.jsp"><i
					class="fa fa-dashboard"></i> <span>首页</span></a></li>

			<li class="treeview"><a href="#"> <i class="fa fa-cogs"></i>
					<span>用户管理</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>


			</a>


				<ul class="treeview-menu">
					<li id="system-setting">

						<a
						href="${pageContext.request.contextPath}/user/findAll.do"> <i
							class="fa fa-circle-o"></i> 用户信息
					</a>

					</li>
					<li id="system-setting"><a
						href="${pageContext.request.contextPath}/role/findAll.do"> <i
							class="fa fa-circle-o"></i> 角色管理
					</a></li>
					<li id="system-setting"><a
						href="${pageContext.request.contextPath}/permission/findAll.do">
							<i class="fa fa-circle-o"></i> 资源权限管理
					</a></li>
				</ul>

			</li>
			<li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
				<span>药厂管理</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">

					<li id="system-setting">

							<a
									href="${pageContext.request.contextPath}/medInfs/findAll.do"> <i
									class="fa fa-circle-o"></i> 药品基本信息
							</a>

					</li>
					<li id="system-setting">

							<a
									href="${pageContext.request.contextPath}/sales/findAll.do"> <i
									class="fa fa-circle-o"></i> 销售员
							</a>

					</li>
					<li id="system-setting">

						<a
								href="${pageContext.request.contextPath}/manufacturer/findAll.do"> <i
								class="fa fa-circle-o"></i> 报表
						</a>

					</li>

				</ul></li>


			<li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
					<span>医院管理</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">
					<li id="system-setting"><a
							href="${pageContext.request.contextPath}/hospital/findAll.do">
						<i class="fa fa-circle-o"></i> 医院信息
					</a></li>
					<%--<li id="system-setting"><a--%>
							<%--href="${pageContext.request.contextPath}/stock/findAll.do">--%>
						<%--<i class="fa fa-circle-o"></i> 药品信息--%>
					<%--</a></li>--%>
					<li id="system-setting"><a
						href="${pageContext.request.contextPath}/patient/findAll.do"> <i
							class="fa fa-circle-o"></i> 患者信息
					</a></li>

					<li id="system-setting"><a
							href="${pageContext.request.contextPath}/order/findAll.do"> <i
							class="fa fa-circle-o"></i> 订单查询
					</a></li>

				</ul></li>


			<li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
				<span>患者管理</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">

					<li id="system-setting"><a
					href="${pageContext.request.contextPath}/patient/findAll.do">
					<i class="fa fa-circle-o"></i> 患者信息
					</a></li>

				</ul></li>

		</ul>
	</section>
	<!-- /.sidebar -->
</aside>