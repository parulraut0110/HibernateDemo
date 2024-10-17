package com.parul;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.awt.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        // create a configuration object
        Configuration config = new Configuration();

        // read the configuration
        config.configure("hibernate.cfg.xml");

        // create factory
        SessionFactory sessionFactory = config.buildSessionFactory();

        // open the session
        Session session = sessionFactory.openSession();

        // begin transaction
        Transaction transaction = session.beginTransaction();

        // create object
        //Student student = new Student();
        //student.setId(2);
        //student.setName("Paul");
        //student.setEmail("p@gmail.com");

        // save the object
        //session.save(student);

        // update
//        Student student = new Student();
//        student.setId(1);
//        student.setName("Mark");
//        student.setEmail("m@gmail.com");
//        session.update(student);

        // delete
//        Student student = new Student();
//        student.setId(1);
//        session.delete(student);

        // retrieving data from table
        /**
         * get() - it return null if object doesn't exist
         * it affect the performance of the app
         *
         * load() - it throw ObjectNotFoundException if object does not exist
         * it result in a better performance
         *
         * */

        //Student student = session.get(Student.class, 2);
        Student student1 = session.get(Student.class, 3);
        //System.out.println(student);
        System.out.println(student1);


        // commit
        transaction.commit();

        //close the connection
        session.close();

    }
}
