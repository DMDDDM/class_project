package cn.dmdddm.service;

import cn.dmdddm.Util.JWTUtil;
import cn.dmdddm.entity.User;
import cn.dmdddm.entity.YdmaConstant;
import cn.dmdddm.entity.YdmaResult;
import cn.dmdddm.Util.PasswordUtil;
import cn.dmdddm.ydma.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userDao ;

    public YdmaResult addUser(String name, String password){

        User user = new User();

        user.setName(name);
        //加密密码
        String salt = PasswordUtil.salt();
        String md5Password = PasswordUtil.md5(password+salt);

        user.setPassword(md5Password);
        user.setSalt(salt);
        user.setRegtime(new Date());
        userDao.insertSelective(user);

        YdmaResult ydmaresult = new YdmaResult();
        ydmaresult.setCode(0);
        ydmaresult.setMsg("注册成功");
        ydmaresult.setDate(new Date());

        return ydmaresult;
    }
    public YdmaResult checkUser(String name, String password){
        //检查账号和密码的正确性
        YdmaResult result = new YdmaResult();
        User user = userDao.selectByName(name);
        // 获取User盐值
        String salt = user.getSalt();
        //获取加密后的密码
        String md5Password = PasswordUtil.md5(password+salt);
        //没有这个用户
        if(user==null) {
            result.setCode(YdmaConstant.ERROR1);
            result.setMsg(YdmaConstant.LOGIN_ERROP1);
            return result;
        }
        //密码认证不成功
        if( !md5Password.equals(user.getPassword())) {
            result.setCode(YdmaConstant.ERROR2);
            result.setMsg(YdmaConstant.LOGIN_ERROP2);
            return result;
        }
        //验证成功
        String token = JWTUtil.sign(user);
        result.setCode(YdmaConstant.SUCCESS);
        result.setMsg(YdmaConstant.LOGIN_SUCCESS);
        result.setData(token);
        return result;
    }
}
