package com.zhangzemin.modules.json;

import com.zhangzemin.bean.Person;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.adaptor.JsonAdaptor;
import org.nutz.mvc.annotation.AdaptBy;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;

/**
 * @author zhangzemin
 * @date 2020/3/24 13:51
 */
@At("/json")
@IocBean
public class JsonAdaptorController {

    @At("/test1")
    @Ok("->:/modules/json/test1.jsp")
    public void test1(){

    }

    @At("/savePerson1")
    @AdaptBy(type = JsonAdaptor.class)
    public void test1(@Param("person") Person person){
        System.err.println(person);
    }
}
