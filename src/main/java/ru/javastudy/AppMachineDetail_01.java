package ru.javastudy;

import ru.javastudy.entity.Detail;
import ru.javastudy.entity.Machine;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.spi.PersistenceProvider;

/**
 * Created by Сергеева on 14.06.2016.
 */
public class AppMachineDetail_01 {
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa_demo");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager();
    public static void main(String[] args) {



        //experiment1
        //объекты будут равны, ссылочное равенство, из  базы данных будет сохранена запись в heap
        // и второму объекту будет присвоена ссылка на этот объект

        //                                                  первичный ключ
        Machine machineA = entityManager.find(Machine.class, 1);
        Machine machineB = entityManager.find(Machine.class, 2);
//        System.out.println(machineA == machineB);
        System.out.println(machineA.getCaption());
        System.out.println(machineB.getCaption());
//
//        Detail detail = entityManager.find(Detail.class, 1);
//        System.out.println(detail.getCaption());


        entityManager.close();
        entityManagerFactory.close();




    }

    public static Machine save(Machine machine) {
       // if (machine.getId() == 0) {
            entityManager.persist(machine);
       // } else {
       //     entityManager.merge(machine);
      //  }
        System.out.println("Machine saved with id: " + machine.getId());
        return machine;
    }
}
