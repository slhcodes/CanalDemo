package com.atguigu.canal;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
       String a= ImageAndBase64Util.imageToBase64("C:\\Users\\施立豪\\Desktop\\OIP-C.jpg");
        System.out.println(a);

    }

}
