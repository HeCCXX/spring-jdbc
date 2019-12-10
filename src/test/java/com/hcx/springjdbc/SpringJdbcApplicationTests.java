package com.hcx.springjdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJdbcApplicationTests {

    @Autowired
    DataSource dataSource;

    /**
    * @Author HCX 
    * @Description //TODO 注意需要修改Test的包，否则调用nullpointException
    * @Date 15:44 2019-12-10
    * @param 
    * @return void
    * @exception       
    **/
    @Test
    public void contextLoads() throws SQLException {
        System.out.println(dataSource.getClass());

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

}
