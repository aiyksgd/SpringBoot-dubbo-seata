package dlc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @author ：aiyk
 * @date ：Created in 2022/12/13 14:38
 * @description：1
 * @modified By：
 */
@Data
public class Dcc implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private String pwd;
}
