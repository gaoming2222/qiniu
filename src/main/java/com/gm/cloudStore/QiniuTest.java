package com.gm.cloudStore;

import com.qiniu.api.auth.AuthException;
import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;

import java.io.File;


/**
 * Created by shadow on 2015/11/29.
 */
public class QiniuTest {
    private QiniuServiceImpl qiniuService = null;

    @Test
    @Before
    public void init() {
        qiniuService = new QiniuServiceImpl();
        //设置AccessKey
        qiniuService.setAccessKey("iEmBFmp6umvh4xlTsARNKBXPv7u7-JvsNu18EnfW");
        //设置SecretKey
        qiniuService.setSecretKey("QS3PR7oPkwLVyEt8ExzYEqbFdIb5Er_RC3TSG5qB");
        //设置存储空间
        qiniuService.setBucketName("codergaoming");
        //设置七牛域名
        qiniuService.setDomain("oybsbqy5u.bkt.clouddn.com");
    }

    @Test
    public void testUpload() throws AuthException, JSONException {
        File file = new File("C:/shadow.jpg");
        qiniuService.uploadFile(file);
    }

    @Test
    public void testDownloadFileUrl() throws Exception {
        String filePath = qiniuService.getDownloadFileUrl("shadow.jpg");
        System.out.println("file path == " + filePath);
    }
}
