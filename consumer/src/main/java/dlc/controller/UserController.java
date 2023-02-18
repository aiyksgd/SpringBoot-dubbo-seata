package dlc.controller;

import dlc.entity.Cdd;
import dlc.entity.Dcc;
import dlc.entity.User;
import dlc.service.CddService;

import dlc.service.ConImpl;
import dlc.service.DccService;
import dlc.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


/**
 * @author ：aiyk
 * @date ：Created in 2022/12/5 15:43
 * @description：1
 * @modified By：
 */
@Controller
public class UserController {

    //先开 p-D p-C p-P Co


    @Resource
    ConImpl con;




    @ResponseBody
    @RequestMapping("www")
    public String www() {
        con.testCommit();
        return "OK!";
    }


    @ResponseBody
    @RequestMapping("ccc")
    public String ccc() {
        con.testRollback();
        return "NO!";
    }
//
//    @ResponseBody
//    @RequestMapping("zzz")
//    public String zzz() {
//        con.testRollback();
//        return "NO!";
//    }


//    @ResponseBody
//    @RequestMapping("user")
//    public User add(User user) {
//        user = userService.dome(user);
//        System.out.println(user);
//        return user;
//    }
//
//    @ResponseBody
//    @RequestMapping("ddd")
//    public User ccc(User user) {
//        user = dccService.domed(user);
//        System.out.println(user);
//        return user;
//    }
//
//    @ResponseBody
//    @RequestMapping("ccc")
//    public User ddd(User user) {
//        user = cddService.domec(user);
//        System.out.println(user);
//        return user;
//    }
}
