package cn.baiyu.test.demotest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author baiyu
 * @data 2019-10-28 10:59
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class testC {

    @Resource
    private B b;

    @Test
    public void test1(){
        b.test();
    }
}
