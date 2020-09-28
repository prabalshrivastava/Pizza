package com.learning.project.pizza;


import com.learning.project.pizza.entities.Items;
import org.hibernate.Session;

import static java.lang.System.out;

public class PizzaMain {
    public static void main(String[] args) {
        try {
            Session session = HbUtil.getCurrentSession();
            HbUtil.beginTransaction();
//            Query q1 = session.createQuery("from Items i");
//            q1.getResultList().forEach(System.out::println);
//            System.out.println();

//            Query q2 = session.createQuery("from VegItems vi");
//            q2.getResultList().forEach(System.out::println);
//            System.out.println();
            Items items = (Items) session.get(Items.class, 1);
            out.println(items);
            HbUtil.commitTransaction();
        } catch (Exception e) {
            e.printStackTrace();
            HbUtil.rollbackTransaction();
        }
        out.println();

        HbUtil.shutdown();
    }
}
