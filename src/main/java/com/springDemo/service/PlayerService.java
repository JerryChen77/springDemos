package com.springDemo.service;

import com.springDemo.dao.PlayerDao;
import com.springDemo.entity.Player;

/**
 * @author Cjl
 * @date 2021/7/7 17:45
 */
public interface PlayerService {

   Player findPlayerById(Integer id);
}
