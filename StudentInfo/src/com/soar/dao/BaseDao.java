package com.soar.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.soar.util.DbUtil;

/*
 * 	主要用到第15章：JDBC数据库编程
 */
public class BaseDao {
	public Connection con = new DbUtil().getCon();		//获取连接对象
	public void closeDao(){								//关闭连接
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
