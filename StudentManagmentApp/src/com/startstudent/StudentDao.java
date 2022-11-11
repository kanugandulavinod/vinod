package com.startstudent;

import java.sql.Connection;
import java.sql.PreparedStatement;

//import com.sun.jdi.connect.spi.Connection;

public class StudentDao {

// private static final int studentId = 0;

//private static final Connection ConnectionProvider = null;

public static void addStudenttoDB (Student st) {
	 try {
		 Connection con = ConnectionProvider.create();
		 String Query1 = "insert into students (sname,sphone,scity) + values(?,?,?)";
		 
		 PreparedStatement pstmt = con.prepareStatement(Query1);
		 pstmt.setString(1, st.getStudentName());
		 pstmt.setString(2, st.getStudentPhone());
		 pstmt.setString(3, st.getStudentCity());
		 
	 }catch (Exception e) {
		 
	 }
}
}