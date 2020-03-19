package pers.antion.ewish.shop;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @创建人 yuxun.wu
 * @创建时间 2020/3/19
 * @描述
 **/
public class MainTest {

    public static void main(String[] args) {
        File f = new File("pom.xml");
        System.out.println(f.getAbsolutePath());
        System.out.println(f.exists());
        testTryCatch();
    }

    public static void testTryCatch() {

    }
}
