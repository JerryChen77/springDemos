package com.springDemo.service;

import com.springDemo.config.SpringConfig000;
import com.springDemo.entity.Player;
import com.springDemo.service.impl.PlayerServiceImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Cjl
 * @date 2021/7/7 19:31
 */
public class SpringConfigTest {
    @Test
    public void getDataSource() throws SQLException {
        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(SpringConfig000.class);
        DataSource dataSource = (DataSource) ioc.getBean("dataSource");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

        PlayerServiceImpl playService = ioc.getBean("playerService", PlayerServiceImpl.class);
        playService.findPlayerById(2);

        Player player = (Player) ioc.getBean("player");
        System.out.println(player);
        ioc.close();
    }
}
