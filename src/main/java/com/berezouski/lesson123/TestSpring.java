package com.berezouski.lesson123;

import com.berezouski.lesson123.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*https://www.youtube.com/watch?v=aXDMYy930b4&list=PLAma_mKffTOR5o0WNHnY0mTjKxnCgSXrZ&index=9*/
public class TestSpring {
    public static void main(String[] args) {
        /*Подтягивает зависимости описанные в applicationContext.xml папка resources должна быть помечена - как ресурсы*/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        /*Создаем бин. указываем Id из файла и сам класс*/
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());

        context.close();
    }
}
