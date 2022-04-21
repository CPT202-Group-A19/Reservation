package com.cpt202a19.reservation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class ReservationApplicationTests {
<<<<<<< HEAD
	/** Test whether the database is connected */
    @Autowired // automatic assembly
    private DataSource dataSource;

    @Test
	void contextLoads() {}

	/** Hikari manages database connection objects */
	@Test
	void getConnection() throws SQLException {
		System.out.println(dataSource.getConnection());
	}
=======
//测试数据库是否连通
   @Autowired//自动装配
   private DataSource dataSource;
    @Test
	void contextLoads() {
	}
	 //Hikari管理数据库连接对象
	 @Test
	 void getConnection() throws SQLException {
		 System.out.println(dataSource.getConnection());
	 }
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8

}
