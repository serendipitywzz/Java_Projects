<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.spark.dao.GetAllUserInfoDao" %>
<%@ page import="com.spark.domain.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Cyberspace个人空间</title>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<meta name="keywords" content="个人博客">
	<link rel="shortcut icon" href=" img/favicon.ico" />
	<!--[if lt IE 9]>
<script type="text/javascript" src="/staticRes/js/html5shiv.js"></script>
<script type="text/javascript" src="/staticRes/js/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="plugin/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="plugin/Hui-iconfont/1.0.8/iconfont.min.css" />
<link rel="stylesheet" type="text/css" href="css/common.css" />
<link rel="stylesheet" type="text/css" href="plugin/pifu/pifu.css" />
<!--[if lt IE 9]>
<link href="/staticRes/lib/h-ui/css/H-ui.ie.css" rel="stylesheet" type="text/css" />
<![endif]-->
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } function showSide(){$('.navbar-nav').toggle();}</script>
</head>
<body>
<header class="navbar-wrapper">
    <div class="navbar navbar-fixed-top">
        <div class="container cl">
            <a class="navbar-logo hidden-xs" href="cyberspace_index.jsp">
				<img class="logo" src="img/w_logo.png" alt="Cyberspace个人空间" />
            </a>
            <a class="logo navbar-logo-m visible-xs" href="cyberspace_index.jsp">Cyberspace</a>
            <a aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs" href="javascript:void(0);" onclick="showSide();">&#xe667;</a>
            <nav class="nav navbar-nav nav-collapse w_menu" role="navigation">
               <ul class="cl">
                    <li class="active"> <a href="cyberspace_index.jsp" data-hover="首页">首页</a> </li>
                    <li> <a href="cyberspace_about.jsp" data-hover="关于我">关于我</a> </li>
                    <li><a href="cyberspace_article.jsp" data-hover="我的文章">我的文章</a></li>
                    <li> <a href="cyberspace_mood.jsp" data-hover="我的相册">我的相册</a> </li>
                    <%--<li> <a href="cyberspace_board.jsp" data-hover="留言板">留言板</a> </li>--%>
				   <li> <a href="${pageContext.request.contextPath}/lMessageServlet.do?uuid=${user.uuid}" data-hover="留言板">留言板</a> </li>
                </ul>
            </nav>
            <nav class="navbar-nav navbar-userbar hidden-xs hidden-sm " style="top: 0;">
                <ul class="cl">
					<li>
						<span><font color="#1e90ff">${user.uname}</font> </span>
						<!--判断有没有用户的头像-->
						<c:if test="${empty user.uimg}">
							<img src="" alt="无" width="28" height="20">
						</c:if>
						<!--有用户头像的存在-->
						<c:if test="${!empty user.uimg}">
						<img src="${user.uimg}" alt="用户头像" width="28" height="20"></a>
					</c:if>
						<a href="${pageContext.request.contextPath}/logoutServlet.do?umail=<%= request.getSession().getAttribute("umail")%>" onclick="" ><img class="" src="img/out.png" title=""><font color="blue">注销</font></a>
					</li>
                </ul>
            </nav>
        </div>
    </div>
</header>

<section class="container pt-20">
	<!--<div class="Huialert Huialert-info"><i class="Hui-iconfont">&#xe6a6;</i>成功状态提示</div>-->
  <!--left-->
  <div class="col-sm-9 col-md-9">
  	<!--滚动图-->
  	<div class="slider_main">
            <div class="slider">
                <div class="bd">
                    <ul>
                        <li><a href="#" target="_blank"><img src="img/w_baner02.jpg"></a></li>
                        <li><a href="#" target="_blank"><img src="img/w_baner01.jpg"></a></li>
                    </ul>
                </div>
                <ol class="hd cl dots">
                    <li>1</li>
                    <li>2</li>
                </ol>
                <a class="slider-arrow prev" href="javascript:void(0)"></a>
                <a class="slider-arrow next" href="javascript:void(0)"></a>
            </div>
        </div>
  		
		<div class="mt-20 bg-fff box-shadow radius mb-5">
			<div class="tab-category">
				<a href=""><strong class="current">最新发布</strong></a>
			</div>
		</div>
		<div class="art_content">
			<ul class="index_arc">
				<li class="index_arc_item">
					<a href="#" class="pic">
						<img class="lazyload" data-original="temp/art.jpg" alt="应该选" />
					</a>
					<h4 class="title"><a href="article_detail.html">个人博客应该选择什么样的域名和域名后缀</a></h4>
					<div class="date_hits">
						<span>老王</span>
						<span>2017-02-24</span>
						<span><a href="/article-lists/10.html">程序人生</a></span>
						<p class="hits"><i class="Hui-iconfont" title="点击量">&#xe6c1;</i> 276° </p>
						<p class="commonts"><i class="Hui-iconfont" title="点击量">&#xe622;</i> <span class="cy_cmt_count">20</span></p>
					</div>
					<div class="desc">不论搭建什么样的网站，选择一个好的域名都是很有必要的，选择一个好的域名对网站的意义也是不言而喻的。每一个网站都有之对应的域名，就像人的名字一样。每个人都想自己有个好听的名字，网站也是一样。一个网站可以有多个域名，但是一个域名只能对应一个网站。&nbsp;一、域名要好记，方便输入&nbsp; &nbsp; &nbsp; &nbsp;域名本身的意义就是为了人们方便记忆才使用的，不然都用IP地址就好了。所以，网站域名一定要选择好记忆的。因为域名是</div>
				</li>
				
				
				<li class="index_arc_item no_pic">
					<h4 class="title"><a href="/article/5.html">个人博客应该选择什么样的域名和域名后缀</a></h4>
					<div class="date_hits">
						<span>老王</span>
						<span>2个月前</span>
						<span><a href="/article-lists/10.html">建站</a></span>
						<p class="hits"><i class="Hui-iconfont" title="点击量">&#xe6c1;</i> 276 °</p>
						<p class="commonts"><i class="Hui-iconfont" title="点击量">&#xe622;</i> <span id="sourceId::105" class="cy_cmt_count">20</span></p>
					</div>
					<div class="desc"> 不论搭建什么样的网站，选择一个好的域名都是很有必要的，选择一个好的域名对网站的意义也是不言而喻的。每一个网站都有之对应的域名，就像人的名字一样。每个人都想自己有个好听的名字，网站也是一样。一个网站可以有多个域名，但是一个域名只能对应一个网站。&nbsp;一、域名要好记，方便输入&nbsp; &nbsp; &nbsp; &nbsp;域名本身的意义就是为了人们方便记忆才使用的，不然都用IP地址就好了。所以，网站域名一定要选择好记忆的。因为域名是</div>
				</li>
				
				<li class="index_arc_item">
	            <a href="/article/4" class="pic">
	                <img class="lazyload" data-original="temp/art.jpg" alt="centos 6.5 nginx安装及配置" >
	            </a>
	        <h4 class="title"><a href="/article/4">centos 6.5 nginx安装及配置</a></h4>
	        <div class="date_hits">
	            <span>老王</span>
	            <span>2017-3-15</span>
	            <span>
	                <a href="/article?t=1">程序人生</a>
	            </span>
	            <p class="hits"><i class="Hui-iconfont" title="点击量"></i> 13° </p>
	            <p class="commonts"><i class="Hui-iconfont" title="评论"></i> <span class="cy_cmt_count">0</span></p>
	        </div>
	        <div class="desc">linux环境中nginx安装及配置简要概述。。。</div>
	    </li>
         
         <li class="index_arc_item">
					<a href="#" class="pic">
						<img class="lazyload" data-original="temp/art.jpg" alt="应该选" />
					</a>
					<h4 class="title"><a href="article_detail.html">个人博客应该选择什么样的域名和域名后缀</a></h4>
					<div class="date_hits">
						<span>老王</span>
						<span>2017-02-24</span>
						<span><a href="/article-lists/10.html">程序人生</a></span>
						<p class="hits"><i class="Hui-iconfont" title="点击量">&#xe6c1;</i> 276° </p>
						<p class="commonts"><i class="Hui-iconfont" title="点击量">&#xe622;</i> <span class="cy_cmt_count">20</span></p>
					</div>
					<div class="desc">不论搭建什么样的网站，选择一个好的域名都是很有必要的，选择一个好的域名对网站的意义也是不言而喻的。每一个网站都有之对应的域名，就像人的名字一样。每个人都想自己有个好听的名字，网站也是一样。一个网站可以有多个域名，但是一个域名只能对应一个网站。&nbsp;一、域名要好记，方便输入&nbsp; &nbsp; &nbsp; &nbsp;域名本身的意义就是为了人们方便记忆才使用的，不然都用IP地址就好了。所以，网站域名一定要选择好记忆的。因为域名是</div>
				</li>
				
				
				<li class="index_arc_item no_pic">
					<h4 class="title"><a href="/article/5.html">个人博客应该选择什么样的域名和域名后缀</a></h4>
					<div class="date_hits">
						<span>老王</span>
						<span>2个月前</span>
						<span><a href="/article-lists/10.html">建站</a></span>
						<p class="hits"><i class="Hui-iconfont" title="点击量">&#xe6c1;</i> 276 °</p>
						<p class="commonts"><i class="Hui-iconfont" title="点击量">&#xe622;</i> <span id="sourceId::105" class="cy_cmt_count">20</span></p>
					</div>
					<div class="desc"> 不论搭建什么样的网站，选择一个好的域名都是很有必要的，选择一个好的域名对网站的意义也是不言而喻的。每一个网站都有之对应的域名，就像人的名字一样。每个人都想自己有个好听的名字，网站也是一样。一个网站可以有多个域名，但是一个域名只能对应一个网站。&nbsp;一、域名要好记，方便输入&nbsp; &nbsp; &nbsp; &nbsp;域名本身的意义就是为了人们方便记忆才使用的，不然都用IP地址就好了。所以，网站域名一定要选择好记忆的。因为域名是</div>
				</li>
				
				<li class="index_arc_item">
	            <a href="/article/4" class="pic">
	                <img class="lazyload" data-original="temp/art.jpg" alt="centos 6.5 nginx安装及配置" >
	            </a>
	        <h4 class="title"><a href="/article/4">centos 6.5 nginx安装及配置</a></h4>
	        <div class="date_hits">
	            <span>老王</span>
	            <span>2017-3-15</span>
	            <span>
	                <a href="/article?t=1">程序人生</a>
	            </span>
	            <p class="hits"><i class="Hui-iconfont" title="点击量"></i> 13° </p>
	            <p class="commonts"><i class="Hui-iconfont" title="评论"></i> <span class="cy_cmt_count">0</span></p>
	        </div>
	        <div class="desc">linux环境中nginx安装及配置简要概述。。。</div>
	    </li>
          
          <li class="index_arc_item">
					<a href="#" class="pic">
						<img class="lazyload" data-original="temp/art.jpg" alt="应该选" />
					</a>
					<h4 class="title"><a href="article_detail.html">个人博客应该选择什么样的域名和域名后缀</a></h4>
					<div class="date_hits">
						<span>老王</span>
						<span>2017-02-24</span>
						<span><a href="/article-lists/10.html">程序人生</a></span>
						<p class="hits"><i class="Hui-iconfont" title="点击量">&#xe6c1;</i> 276° </p>
						<p class="commonts"><i class="Hui-iconfont" title="点击量">&#xe622;</i> <span class="cy_cmt_count">20</span></p>
					</div>
					<div class="desc">不论搭建什么样的网站，选择一个好的域名都是很有必要的，选择一个好的域名对网站的意义也是不言而喻的。每一个网站都有之对应的域名，就像人的名字一样。每个人都想自己有个好听的名字，网站也是一样。一个网站可以有多个域名，但是一个域名只能对应一个网站。&nbsp;一、域名要好记，方便输入&nbsp; &nbsp; &nbsp; &nbsp;域名本身的意义就是为了人们方便记忆才使用的，不然都用IP地址就好了。所以，网站域名一定要选择好记忆的。因为域名是</div>
				</li>
				
				
				<li class="index_arc_item no_pic">
					<h4 class="title"><a href="/article/5.html">个人博客应该选择什么样的域名和域名后缀</a></h4>
					<div class="date_hits">
						<span>老王</span>
						<span>2个月前</span>
						<span><a href="/article-lists/10.html">建站</a></span>
						<p class="hits"><i class="Hui-iconfont" title="点击量">&#xe6c1;</i> 276 °</p>
						<p class="commonts"><i class="Hui-iconfont" title="点击量">&#xe622;</i> <span id="sourceId::105" class="cy_cmt_count">20</span></p>
					</div>
					<div class="desc"> 不论搭建什么样的网站，选择一个好的域名都是很有必要的，选择一个好的域名对网站的意义也是不言而喻的。每一个网站都有之对应的域名，就像人的名字一样。每个人都想自己有个好听的名字，网站也是一样。一个网站可以有多个域名，但是一个域名只能对应一个网站。&nbsp;一、域名要好记，方便输入&nbsp; &nbsp; &nbsp; &nbsp;域名本身的意义就是为了人们方便记忆才使用的，不然都用IP地址就好了。所以，网站域名一定要选择好记忆的。因为域名是</div>
				</li>
				
				<li class="index_arc_item">
	            <a href="/article/4" class="pic">
	                <img class="lazyload" data-original="temp/art.jpg" alt="centos 6.5 nginx安装及配置" >
	            </a>
	        <h4 class="title"><a href="/article/4">centos 6.5 nginx安装及配置</a></h4>
	        <div class="date_hits">
	            <span>老王</span>
	            <span>2017-3-15</span>
	            <span>
	                <a href="/article?t=1">程序人生</a>
	            </span>
	            <p class="hits"><i class="Hui-iconfont" title="点击量"></i> 13° </p>
	            <p class="commonts"><i class="Hui-iconfont" title="评论"></i> <span class="cy_cmt_count">0</span></p>
	        </div>
	        <div class="desc">linux环境中nginx安装及配置简要概述。。。</div>
	    </li>
          
          <li class="index_arc_item">
					<a href="#" class="pic">
						<img class="lazyload" data-original="temp/art.jpg" alt="应该选" />
					</a>
					<h4 class="title"><a href="article_detail.html">个人博客应该选择什么样的域名和域名后缀</a></h4>
					<div class="date_hits">
						<span>老王</span>
						<span>2017-02-24</span>
						<span><a href="/article-lists/10.html">程序人生</a></span>
						<p class="hits"><i class="Hui-iconfont" title="点击量">&#xe6c1;</i> 276° </p>
						<p class="commonts"><i class="Hui-iconfont" title="点击量">&#xe622;</i> <span class="cy_cmt_count">20</span></p>
					</div>
					<div class="desc">不论搭建什么样的网站，选择一个好的域名都是很有必要的，选择一个好的域名对网站的意义也是不言而喻的。每一个网站都有之对应的域名，就像人的名字一样。每个人都想自己有个好听的名字，网站也是一样。一个网站可以有多个域名，但是一个域名只能对应一个网站。&nbsp;一、域名要好记，方便输入&nbsp; &nbsp; &nbsp; &nbsp;域名本身的意义就是为了人们方便记忆才使用的，不然都用IP地址就好了。所以，网站域名一定要选择好记忆的。因为域名是</div>
				</li>
				
				
				<li class="index_arc_item no_pic">
					<h4 class="title"><a href="/article/5.html">个人博客应该选择什么样的域名和域名后缀</a></h4>
					<div class="date_hits">
						<span>老王</span>
						<span>2个月前</span>
						<span><a href="/article-lists/10.html">建站</a></span>
						<p class="hits"><i class="Hui-iconfont" title="点击量">&#xe6c1;</i> 276 °</p>
						<p class="commonts"><i class="Hui-iconfont" title="点击量">&#xe622;</i> <span id="sourceId::105" class="cy_cmt_count">20</span></p>
					</div>
					<div class="desc"> 不论搭建什么样的网站，选择一个好的域名都是很有必要的，选择一个好的域名对网站的意义也是不言而喻的。每一个网站都有之对应的域名，就像人的名字一样。每个人都想自己有个好听的名字，网站也是一样。一个网站可以有多个域名，但是一个域名只能对应一个网站。&nbsp;一、域名要好记，方便输入&nbsp; &nbsp; &nbsp; &nbsp;域名本身的意义就是为了人们方便记忆才使用的，不然都用IP地址就好了。所以，网站域名一定要选择好记忆的。因为域名是</div>
				</li>
				
				<li class="index_arc_item">
	            <a href="/article/4" class="pic">
	                <img class="lazyload" data-original="temp/art.jpg" alt="centos 6.5 nginx安装及配置" >
	            </a>
	        <h4 class="title"><a href="/article/4">centos 6.5 nginx安装及配置</a></h4>
	        <div class="date_hits">
	            <span>老王</span>
	            <span>2017-3-15</span>
	            <span>
	                <a href="/article?t=1">程序人生</a>
	            </span>
	            <p class="hits"><i class="Hui-iconfont" title="点击量"></i> 13° </p>
	            <p class="commonts"><i class="Hui-iconfont" title="评论"></i> <span class="cy_cmt_count">0</span></p>
	        </div>
	        <div class="desc">linux环境中nginx安装及配置简要概述。。。</div>
	    </li>
          
				</ul>
  		<div class="text-c mb-20" id="moreBlog">
	        <a class="btn  radius btn-block " href="javascript:;" onclick="moreBlog();">点击加载更多</a>
	        <a class="btn  radius btn-block hidden" href="javascript:;">加载中……</a>
	    </div>
		</div>
  </div>
  
  <!--right-->
  <div class="col-sm-3 col-md-3">
  	
  	<!--站点声明-->
        <div class="panel panel-default mb-20">
            <div class="panel-body">
                <i class="Hui-iconfont" style="float: left;">&#xe62f;&nbsp;</i>
                <div class="slideTxtBox">
                    <div class="bd">
                        <ul>
                            <li><a href="javascript:void(0);"><font color="red">Cyberspace个人空间系统，欢迎访问！</font></a></li>
							<li><a href="javascript:void(0);"><font color="#1e90ff"> We are the world!</font></a></li>
							<li><a href="javascript:void(0);"><font color="blue">IDEA、MAVEN、TOMCAT、MYSQL、NAVICAT</font></a></li>
                            <li><a href="javascript:void(0);"><font color="#b8860b">JSP、Servlet、HTML、JS、CSS、SQL、JSTL、EL</font> </a></li>

                        </ul>
                    </div>
                </div>
            </div>
        </div>
        
  	<!--博主信息-->
        <div class="bg-fff box-shadow radius mb-20">
            <div class="tab-category">
                <a href=""><strong>博主信息</strong></a>
            </div>
            <div class="tab-category-item">
                <ul class="index_recd">
                    <li class="index_recd_item"><i class="Hui-iconfont">&#xe653;</i>用户名：Test****</li>

                    <li class="index_recd_item"><i class="Hui-iconfont">&#xe63b;</i>邮箱：<a href="mailto:Test****">Test****</a></li>
                    <li class="index_recd_item"><i class="Hui-iconfont">&#xe671;</i>定位：中国 &middot; 江苏</li>
                </ul>
            </div>
        </div>
  	
  	
  	<!--热门推荐-->
  	<div class="bg-fff box-shadow radius mb-20">
			<div class="tab-category">
				<a href=""><strong>热门推荐</strong></a>
			</div>
			<div class="tab-category-item">
				<ul class="index_recd">
					<li>
						<a href="#">阻止a标签href默认跳转事件</a>
						<p class="hits"><i class="Hui-iconfont" title="点击量">&#xe622;</i> 276 </p>
					</li>
					<li >
						<a href="#">PHP面试题汇总</a>
						<p class="hits"><i class="Hui-iconfont" title="点击量">&#xe622;</i> 276 </p>
					</li>
					<li >
						<a href="#">阻止a标签href默认跳转事件</a>
						<p class="hits"><i class="Hui-iconfont" title="点击量">&#xe622;</i> 276 </p>
					</li>
					<li >
						<a href="#">阻止a标签href默认跳转事件</a>
						<p class="hits"><i class="Hui-iconfont" title="点击量">&#xe622;</i> 276 </p>
					</li>
					<li >
						<a href="#">PHP面试题汇总</a>
						<p class="hits"><i class="Hui-iconfont" title="点击量">&#xe622;</i> 276 </p>
					</li>
				</ul>
			</div>
		</div>
		
		<!--点击排行-->
        <div class="bg-fff box-shadow radius mb-20">
            <div class="tab-category">
                <a href=""><strong>点击排行</strong></a>
            </div>
            <div class="tab-category-item">
                <ul class="index_recd clickTop">
                    <li>
                        <a href="#">AJAX的刷新和前进后退问题解决</a>
                        <p class="hits"><i class="Hui-iconfont" title="点击量">&#xe6c1;</i> 276° </p>
                    </li>
                    <li>
                        <a href="#">AJAX的刷新和前进后退问题解决</a>
                        <p class="hits"><i class="Hui-iconfont" title="点击量">&#xe6c1;</i> 276° </p>
                    </li>
                    <li>
                        <a href="#">AJAX的刷新和前进后退问题解决</a>
                        <p class="hits"><i class="Hui-iconfont" title="点击量">&#xe6c1;</i> 276° </p>
                    </li>
                    <li>
                        <a href="#">AJAX的刷新和前进后退问题解决</a>
                        <p class="hits"><i class="Hui-iconfont" title="点击量">&#xe6c1;</i> 276° </p>
                    </li>
                    <li>
                        <a href="#">AJAX的刷新和前进后退问题解决</a>
                        <p class="hits"><i class="Hui-iconfont" title="点击量">&#xe6c1;</i> 276° </p>
                    </li>
                    <li>
                        <a href="#">AJAX的刷新和前进后退问题解决</a>
                        <p class="hits"><i class="Hui-iconfont" title="点击量">&#xe6c1;</i> 276° </p>
                    </li>
                    <li>
                        <a href="#">AJAX的刷新和前进后退问题解决</a>
                        <p class="hits"><i class="Hui-iconfont" title="点击量">&#xe6c1;</i> 276° </p>
                    </li>
                </ul>
            </div>
        </div>
        
		<!--标签-->
		<div class="bg-fff box-shadow radius mb-20">
			<div class="tab-category">
				<a href=""><strong>标签云</strong></a>
			</div>
			<div class="tab-category-item">
				<div class="tags"> <a href="http://www.h-ui.net/">H-ui前端框架</a> <a href="http://www.h-ui.net/websafecolors.shtml">Web安全色</a> <a href="http://www.h-ui.net/Hui-4.4-Unslider.shtml">jQuery轮播插件</a> <a href="http://idc.likejianzhan.com/vhost/korea_hosting.php">韩国云虚拟主机</a> <a href="http://www.h-ui.net/bug.shtml">IEbug</a> <a href="http://www.h-ui.net/site.shtml">IT网址导航</a> <a href="http://www.h-ui.net/icon/index.shtml">网站常用小图标</a> <a href="http://www.h-ui.net/tools/jsformat.shtml">web工具箱</a> <a href="http://www.h-ui.net/bg/index.shtml">网站常用背景素材</a> <a href="http://www.h-ui.net/yuedu/chm.shtml">H-ui阅读</a> <a href="http://www.h-ui.net/easydialog-v2.0/index.html">弹出层插件</a> <a href="http://www.h-ui.net/SuperSlide2.1/demo.html">SuperSlide插件</a> <a href="http://www.h-ui.net/TouchSlide1.1/demo.html">TouchSlide</a></div>
			</div>
		</div>
		<!--&lt;!&ndash;图片&ndash;&gt;-->
		<!--<div class="bg-fff box-shadow radius mb-20">-->
			<!--<div class="tab-category">-->
				<!--<a href=""><strong>扫我关注</strong></a>-->
			<!--</div>-->
			<!--<div class="tab-category-item">-->
				<!--<img data-original="temp/gg.jpg" class="img-responsive lazyload" alt="响应式图片">-->
			<!--</div>-->
		<!--</div>-->
		
		<!--友情链接-->
		<div class="bg-fff box-shadow radius mb-20">
			<div class="tab-category">
				<a href=""><strong>友情链接</strong></a>
			</div>
			<div class="tab-category-item">
				<span><i class="Hui-iconfont">&#xe6f1;</i><a href="#" class="btn-link">百度</a></span>
				<span><i class="Hui-iconfont">&#xe6f1;</i><a href="#" class="btn-link">淘宝</a></span>
				<span><i class="Hui-iconfont">&#xe6f1;</i><a href="#" class="btn-link">腾讯</a></span>
				<span><i class="Hui-iconfont">&#xe6f1;</i><a href="#" class="btn-link">慕课网</a></span>
				<span><i class="Hui-iconfont">&#xe6f1;</i><a href="#" class="btn-link">h-ui</a></span>
			</div>
		</div>
		<!--最近访客-->
		<div class="bg-fff box-shadow radius mb-20">
            <div class="tab-category">
                <a href=""><strong>最近访客</strong></a>
            </div>
            <div class="panel-body">
                <ul class="recent">
                    <div class="item"><img src="img/40.jpg" alt=""></div>
                    <div class="item"><img src="img/40.jpg" alt=""></div>
                    <div class="item"><img src="img/40.jpg" alt=""></div>
                    <div class="item"><img src="img/40.jpg" alt=""></div>
                    <div class="item"><img src="img/40.jpg" alt=""></div>
                    <div class="item"><img src="img/40.jpg" alt=""></div>
                    <div class="item"><img src="img/40.jpg" alt=""></div>
                    <div class="item"><img src="img/40.jpg" alt=""></div>
                    <div class="item"><img src="img/40.jpg" alt=""></div>
                    <div class="item"><img src="img/40.jpg" alt=""></div>
                </ul>
            </div>
        </div>
  </div>
  
</section>
<footer class="footer mt-20">
    <div class="container-fluid" id="foot">
		<p>Copyright &copy; 2018 <a href="https://github.com/Eirckwang"><font color="#1e90ff">https://github.com/Eirckwang</font> </a><br>
			<a href="#" target="_blank">Niit Cyberspace 个人空间系统</a>
        </p>
    </div>
</footer>
<script type="text/javascript" src="plugin/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="plugin/layer/3.0/layer.js"></script>
<script type="text/javascript" src="plugin/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="plugin/pifu/pifu.js"></script>
<script type="text/javascript" src="js/common.js"></script>
<script> $(function(){ $(window).on("scroll",backToTopFun); backToTopFun(); }); </script>
<script type="text/javascript" src="plugin/jquery.SuperSlide/2.1.1/jquery.SuperSlide.min.js"></script>

<script>
$(function(){
//幻灯片
jQuery(".slider_main .slider").slide({mainCell: ".bd ul", titCell: ".hd li", trigger: "mouseover", effect: "leftLoop", autoPlay: true, delayTime: 700, interTime: 2000, pnLoop: true, titOnClassName: "active"})
//tips
jQuery(".slideTxtBox").slide({titCell: ".hd ul", mainCell: ".bd ul", autoPage: true, effect: "top", autoPlay: true});
//标签
	$(".tags a").each(function(){
		var x = 9;
		var y = 0;
		var rand = parseInt(Math.random() * (x - y + 1) + y);
		$(this).addClass("tags"+rand)
	});
	
	$("img.lazyload").lazyload({failurelimit : 3});
});

</script> 

</body>
</html>
