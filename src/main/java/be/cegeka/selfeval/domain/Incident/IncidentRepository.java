package be.cegeka.selfeval.domain.Incident;


import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Named
public class IncidentRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void addIncident(Incident incidentDetails) {
        entityManager.persist(incidentDetails);

    }
}
