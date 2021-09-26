package com.springDemo.service.impl;

import com.springDemo.dao.PlayerDao;
import com.springDemo.entity.Player;
import com.springDemo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Cjl
 * @date 2021/7/7 17:46
 */
@Service("playerService")
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    @Qualifier("playerDao")
    private PlayerDao playerDao;
    @Override
    public Player findPlayerById(Integer id) {
        System.out.println("service中调用的查找方法。。。。");
        playerDao.findPlayerById(id);
        return null;
    }
}
