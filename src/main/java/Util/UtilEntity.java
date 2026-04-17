package Util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UtilEntity {

// EntityManagerFactory es que hace que nos abre las puertas para nuestra bd
        private static final EntityManagerFactory entityManagerFactory = buildEntityManagerFactory();

        private static EntityManagerFactory buildEntityManagerFactory(){
            return Persistence.createEntityManagerFactory("myPersistenceUnit");
        }
///  EntityManager nos permite hacer nuestras operaciones
        public static EntityManager getEntityManager(){
            return entityManagerFactory.createEntityManager();
        }

}
