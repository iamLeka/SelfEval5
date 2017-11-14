package be.cegeka.selfeval.domain.Incident;

import javax.persistence.*;

@Entity
@Table(name = "INCIDENT")

public class Incident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private String type;
    @Column(name = "distance")
    private int distance;

    public Incident(String name, String type, int distance) {
        this.name = name;
        this.type = type;
        this.distance = distance;
    }
}
