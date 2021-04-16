package com.Invoice.vishal004;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BillDao {
	
	public static boolean insertBillToDB(Details dt) {
		
		boolean f = false;
		
		try {
			//jdbc connect .....
			Connection con = CUP.createC();
			String q = "insert into bills(cname,mobile,address,proName,proprice,quqntity,totalprice,paymethod,totalpay) values(?,?,?,?,?,?,?,?,?)";
			//prepraedStatment..
			PreparedStatement pstmt = con.prepareStatement(q);
			//set the value of parameter..
			pstmt.setString(1, dt.getCoustmername());
			pstmt.setString(2, dt.getMobile());
			pstmt.setString(3, dt.getaddress());
			pstmt.setString(4, dt.getProductName());
			pstmt.setDouble(5, dt.getProductPrice());
			pstmt.setDouble(6, dt.getQuantity());
			pstmt.setDouble(7, dt.getTotalPrice());
			pstmt.setString(8, dt.getPaymentMethod());
			pstmt.setDouble(9, dt.getTotalPayment());
			
			//execute..
			pstmt.executeUpdate();
			f=true;
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
		
	}

}
