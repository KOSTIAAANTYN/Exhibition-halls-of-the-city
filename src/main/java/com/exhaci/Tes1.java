package com.exhaci;

import com.exhaci.model.Hall_owner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Tes1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Hall_owner.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Hall_owner Vasyl = new Hall_owner("Natalia","Freddy Fazbear 2231","68392634");
            session.beginTransaction();
            session.save(Vasyl);

            long id =Vasyl.getId();
            Hall_owner hall_owner=session.get(Hall_owner.class,id);
            System.out.println(hall_owner);
            session.getTransaction().commit();
            System.out.println("Done");



        }
        finally {
            factory.close();
        }


    }
}
