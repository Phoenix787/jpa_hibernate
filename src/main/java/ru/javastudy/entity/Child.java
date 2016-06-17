package ru.javastudy.entity;

import javax.persistence.*;

/**
 * Created by Сергеева on 09.06.2016.
 */
@Entity
@Table(name = "child")
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "caption")
    private String caption;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "parent_id")
    private Parent parent;

    public Child() {
    }

    public int getId() {
        return id;
    }

    public String getCaption() {
        return caption;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public Parent getParent() {
        return parent;
    }
}
