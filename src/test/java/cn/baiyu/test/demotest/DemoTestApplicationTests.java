package cn.baiyu.test.demotest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoTestApplicationTests {

    @Resource
    private C c;

    @Test
    void contextLoads() {
        c.print();
    }

}
