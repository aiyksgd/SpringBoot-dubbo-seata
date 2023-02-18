package dlc.service;

import dlc.entity.Cdd;
import dlc.entity.Dcc;
import dlc.entity.User;
import dlc.service.CddService;
import dlc.service.DccService;
import dlc.service.UserService;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ：aiyk
 * @date ：Created in 2022/12/13 15:00
 * @description：1
 * @modified By：
 */
@Service
public class ConImpl {
    @DubboReference
    UserService userService;
    @DubboReference
    CddService cddService;

    @GlobalTransactional(rollbackFor = Exception.class)
    public void testCommit() {
        // 第一个TCC 事务参与者
        cddService.add(getCdd());
        // 数据库操作
        userService.add(getUser());
    }


    /**
     * 测试分布式事务回滚示例
     *
     * @return string string
     */
    @GlobalTransactional
    public void testRollback() {
        //第一个TCC 事务参与者
        cddService.add(getCdd());
        // 数据库操作
        userService.add(getUser());
//        int a = 1 / 0;
    }


    private User getUser() {
        User user = new User();
        user.setId(1);
        user.setName("eee");
        user.setPwd("rrr");
        return user;
    }
    
    private Cdd getCdd() {
        Cdd user = new Cdd();
        user.setId(1);
        user.setName("eee");
        user.setPwd("rrr");
        return user;
    }
}

