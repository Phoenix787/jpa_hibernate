package ru.javastudy.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Сергеева on 09.06.2016.
 */
@Entity
@Table(name = "parent")
public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "caption")
    private String caption;
    @OneToMany(mappedBy = "parent")
    private List<Child> children;

    public Parent() {
    }

    public Parent(int id, String caption) {
        this.id = id;
        this.caption = caption;
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

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }
}
