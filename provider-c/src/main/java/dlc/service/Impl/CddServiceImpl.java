package dlc.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import dlc.entity.Cdd;
import dlc.entity.User;
import dlc.mapper.CddMapper;
import dlc.service.CddService;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ：aiyk
 * @date ：Created in 2022/11/22 20:06
 * @description：1
 * @modified By：
 */
@DubboService
public class CddServiceImpl extends ServiceImpl<CddMapper, Cdd> implements CddService {

    @Autowired
    CddMapper cddMapper;
//
//    @Override
//    public User domec(User user) {
//        user.setId(2);
//        user.setName("cccc");
//        user.setAge(6666);
//        return user;
//    }
//
//    @Override
//    public Cdd getCdd(String id) {
//        return cddMapper.selectById(id);
//    }

    @Override
    public void add(Cdd cdd) {
//        int a = 0/1;
//        System.out.println(a);
        cddMapper.insert(cdd);
    }


}
