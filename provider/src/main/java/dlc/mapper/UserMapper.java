package dlc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import dlc.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ：aiyk
 * @date ：Created in 2022/12/13 14:41
 * @description：1
 * @modified By：
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
