package com.zhangzemin.modules.upload;

import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.AdaptBy;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;
import org.nutz.mvc.upload.FieldMeta;
import org.nutz.mvc.upload.TempFile;
import org.nutz.mvc.upload.UploadAdaptor;

import java.io.File;

/**
 * @author zhangzemin
 * @date 2020/3/24 16:29
 */
@At("/upload")
@IocBean
public class UploadAdaptorController {

    @At("/test1")
    @Ok("->:/modules/upload/test1.jsp")
    public void test1(){

    }

    @At("/file")
    @AdaptBy(type = UploadAdaptor.class,args = {"${app.root}/WEB-INF/tmp"})
    public void upload(@Param("file")TempFile tf){
        File file = tf.getFile();
        FieldMeta meta = tf.getMeta();
        String oldName = meta.getFileLocalName();
        System.out.println(oldName);
    }
}
