package com.springDemo.service;
import com.springDemo.config.SpringConfig000;
import com.springDemo.entity.Emp;
import com.springDemo.entity.Player;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Cjl
 * @date 2021/7/7 20:33
 */

/**
 * @runwith(springjunit4classrunner.class)——使用@runwith注解替换原来的运行期
 * 使用@ContextConfiguration(value="")或(classes="")——指定配置文件或配置类
 * 使用@Autowired自动注入需要测试的对象
 * @test——创建测试方法进行测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes =SpringConfig000.class)
public class Test {
    @Autowired
    private Player player;
    @Autowired
    private PlayerService playerService;
    @Autowired
    private Emp emp;
    @org.junit.Test
    public void getPlayer(){
//        System.out.println(player);
//        playerService.findPlayerById(1);
        System.out.println(emp);


    }
}
