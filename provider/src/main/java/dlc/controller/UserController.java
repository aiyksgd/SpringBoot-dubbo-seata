//package dlc.controller;
//
//import dlc.entity.Dcc;
//import dlc.entity.User;
//import dlc.service.DccService;
//import org.apache.dubbo.config.annotation.DubboReference;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//
///**
// * @author ：aiyk
// * @date ：Created in 2022/12/5 15:43
// * @description：1
// * @modified By：
// */
//@Controller
//public class UserController {
//
//    @DubboReference
//    DccService dccService;
//
//
//    @ResponseBody
//    @RequestMapping("ddd")
//    public String add() {
//        dccService.add(getDcc());
//
//        return "OK!";
//    }
//
//
//
//    private Dcc getDcc() {
//        Dcc user = new Dcc();
//        user.setId(1);
//        user.setName("eee");
//        user.setPwd("rrr");
//        return user;
//    }
//}
