package com.myxq.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.myxq.domain.Goods;
import com.myxq.util.JdbcUtil;

@WebServlet("/GoodsServlet")
public class GoodsServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/**
		1.?????????
		2.????????��??????
		3.??????????????????????request????
		4.?????????��???��??????request??????
		
		 */
		
		//1.?????????
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		//2.????????��??????
		String sql ="select * from goods";
		List<Goods> allGoods = null;
		try {
			allGoods = qr.query(sql, new BeanListHandler<Goods>(Goods.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//3.??????????????????????request????
		request.setAttribute("allGoods", allGoods);
		//4.?????????��???��??????request??????
		request.getRequestDispatcher("/goods_list.jsp").forward(request, response);
	}

}
