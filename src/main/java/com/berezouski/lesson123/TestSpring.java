package com.berezouski.lesson123;

import com.berezouski.lesson123.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
