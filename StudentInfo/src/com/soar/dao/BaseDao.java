package com.soar.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.soar.util.DbUtil;

/*
 * 	��Ҫ�õ���15�£�JDBC���ݿ���
 */
public class BaseDao {
	public Connection con = new DbUtil().getCon();		//��ȡ���Ӷ���
	public void closeDao(){								//�ر�����
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
