package dlc.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import dlc.entity.Dcc;
import dlc.entity.User;
import dlc.mapper.UserMapper;
import dlc.service.DccService;
import dlc.service.UserService;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ：aiyk
 * @date ：Created in 2022/11/22 20:06
 * @description：1
 * @modified By：
 */
@DubboService
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;

    @DubboReference
    DccService dccService;

    //    @Override
//    public User dome(User user) {
//        user.setId(2);
//        user.setName("ppp");
//        user.setAge(55);
//        return user;
//    }
    @Override
    @GlobalTransactional
    public void add(User user) {
        dccService.add(getDcc());
        userMapper.insert(user);
        int a = 1/0;
    }

    private Dcc getDcc() {
        Dcc user = new Dcc();
        user.setId(1);
        user.setName("eee1");
        user.setPwd("rrr");
        return user;
    }
}
