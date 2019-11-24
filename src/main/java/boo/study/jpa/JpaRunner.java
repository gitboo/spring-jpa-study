package boo.study.jpa;


import org.hibernate.Session;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class JpaRunner implements ApplicationRunner {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {
        Account account = new Account();
        account.setUsername("boo2");
        account.setPassword("pass2");
        //entityManager.persist(account);

        Session session = entityManager.unwrap(Session.class);
        session.save(account);
    }
}



