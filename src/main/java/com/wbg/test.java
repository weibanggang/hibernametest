package com.wbg;


import com.wbg.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class test {

    public static void main(String[] args) {

        Configuration configuration=new Configuration();
        Configuration configure=configuration.configure("hibernate.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
       Book book= session.get(Book.class,2L);
        System.out.println(book.toString());

    }
}
