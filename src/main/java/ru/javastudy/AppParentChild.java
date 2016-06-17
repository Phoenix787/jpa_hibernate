package ru.javastudy;

import ru.javastudy.entity.Child;
import ru.javastudy.entity.Parent;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Сергеева on 16.06.2016.
 */
public class AppParentChild {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa_demo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Parent parent_1 = entityManager.find(Parent.class, 1);
//        entityManager.getTransaction().begin();
//        entityManager.persist(parent_1);
//        entityManager.getTransaction().commit();

        //System.out.println(entityManager.find(Parent.class, 1).getCaption());

        Child child_500 = new Child();
        child_500.setParent(parent_1);
        child_500.setCaption("child_100000123456500!!!");

        parent_1.getChildren().add(child_500);

        entityManager.getTransaction().begin();
        entityManager.persist(child_500);
        entityManager.getTransaction().commit();

        System.out.println(entityManager.find(Parent.class, 1).getChildren().get(0).getCaption());





        entityManager.close();
        entityManagerFactory.close();
    }
}
