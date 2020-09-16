package cn.dmdddm.service;

import cn.dmdddm.entity.YdmaResult;

public interface UserService {
   /**
    * 向数据库中添加一个用户。
    *
    * @param name       用户名
    * @param password   密码
    * @return           ydmaResult
    */
   YdmaResult addUser(String name, String password);

   /**
    * 验证账号密码是否正确。
    *
    * @param name       用户名
    * @param password   密码
    * @return           ydmaResult
    */
   YdmaResult checkUser(String name, String password);
}
