package dlc.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import dlc.entity.Dcc;
import dlc.entity.User;
import dlc.mapper.DccMapper;
import dlc.service.DccService;
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
public class DccServiceImpl extends ServiceImpl<DccMapper, Dcc> implements DccService {

    @Autowired
    DccMapper dccMapper;

    @Override
    public void add(Dcc dcc) {
        dccMapper.insert(dcc);
        int a = 0 / 1;
    }
}
