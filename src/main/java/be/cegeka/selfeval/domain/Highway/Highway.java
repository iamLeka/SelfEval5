package be.cegeka.selfeval.domain.Highway;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "INCIDENT")

public class Highway {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "distance")
    private int distance;
    @OneToMany
    @JoinColumn(name="HIGHWAY_ID")
    private List<Highway> highway;

    public Highway(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public Highway() {
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }
}
