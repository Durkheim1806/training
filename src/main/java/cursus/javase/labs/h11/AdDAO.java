package cursus.javase.labs.h11;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import lombok.extern.slf4j.Slf4j;

@Dependent
@Slf4j
public class AdDAO {

    private EntityManager em;

    @Inject
    public AdDAO(EntityManager em) {
        this.em = em;
    }

    public void insert(Ad add) {

        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            em.merge(add);
            transaction.commit();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            transaction.rollback();
        }
    }

}
