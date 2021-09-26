package com.springDemo.dao.impl;

import com.springDemo.dao.PlayerDao;
import com.springDemo.entity.Player;
import org.springframework.stereotype.Repository;

/**
 * @author Cjl
 * @date 2021/7/7 17:44
 */
@Repository("playerDao")
public class PlayerDaoImpl implements PlayerDao {

    @Override
    public Player findPlayerById(Integer id) {

        System.out.println("dao层查找。。。");
        return null;
    }
}
