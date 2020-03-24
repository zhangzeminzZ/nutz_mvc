package com.zhangzemin.modules.extra;

import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.lang.util.NutMap;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author zhangzemin
 * @date 2020/3/24 16:58
 */
@At("/extra")
@IocBean
public class ExtraController {
    @At("/test1")
    @Ok("->:/modules/extra/test1.jsp")
    public void test1(){

    }

    @At("/extra1")
    public void extra1(@Param("..") Map map, HttpSession session, HttpServletRequest request, HttpServletResponse response){
        System.out.println(map);
    }
}
