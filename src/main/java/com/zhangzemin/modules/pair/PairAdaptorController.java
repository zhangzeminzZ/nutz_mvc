package com.zhangzemin.modules.pair;

import com.zhangzemin.bean.Person;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;

/**
 * @author zhangzemin
 * @date 2020/3/23 16:03
 */
@IocBean
@At("/pair/test")
public class PairAdaptorController {

    @At("/test1")
    @Ok("->:/modules/pair/test1.jsp")
    public void test1(){

    }

    @At("/savePerson1")
    public void test1(@Param("name")String name,@Param("age")String age){
        System.err.println("名字:"+name);
        System.err.println("年龄:"+age);
    }


    @At("/test2")
    @Ok("->:/modules/pair/test2.jsp")
    public void test2(){

    }


    @At("/savePerson2")
    public void test2(@Param("..")Person person){
        System.err.println(person.toString());
    }

    @At("/test3")
    @Ok("->:/modules/pair/test3.jsp")
    public void test3(){

    }


    @At("/savePerson3")
    public void test3(@Param("::person.")Person person){
        System.err.println(person.toString());
    }

}
