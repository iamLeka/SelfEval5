package be.cegeka.selfeval.domain.Highway;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Named
public class HighwayRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Highway> getAllHighways(){
        return entityManager.createQuery("Select h from Highway h",Highway.class).getResultList();
    }
}
