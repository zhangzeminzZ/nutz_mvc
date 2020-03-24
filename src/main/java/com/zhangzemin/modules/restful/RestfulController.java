package com.zhangzemin.modules.restful;

import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;

/**
 * @author zhangzemin
 * @date 2020/3/24 17:11
 */
@At("/restful")
@IocBean
public class RestfulController {
    @At("/test1")
    @Ok("->:/modules/restful/test1.jsp")
    public void test1(){

    }

    @At("/restful1/?/?")
    public void restful1(String name,Integer age){
        System.out.println(name);
        System.out.println(age);
    }

    @At("/test2")
    @Ok("->:/modules/restful/test2.jsp")
    public void test2(){

    }

    @At("/restful2/*")
    public void restful2(String name,Integer age,String email){
        System.out.println(name);
        System.out.println(age);
        System.out.println(email);
    }
}
