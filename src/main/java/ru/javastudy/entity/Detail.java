package ru.javastudy.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Сергеева on 09.06.2016.
 */
@Entity
@Table(name = "Detail")
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "caption")
    private String caption;
    @ManyToMany
    @JoinTable(name = "MD", joinColumns = {@JoinColumn(name = "detail_id", referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "machine_id", referencedColumnName = "id")})
    private List<Machine> machines;

    public Detail() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public List<Machine> getMachines() {
        return machines;
    }

    public void setMachines(List<Machine> machines) {
        this.machines = machines;
    }
}
