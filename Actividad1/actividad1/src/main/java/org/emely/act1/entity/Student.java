package org.emely.act1.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;

    //@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "student")
    @ManyToOne
    @JoinColumn(name="id_group")
    private Groups gruop;

    /*@OneToMany
    private List<Mark> marks;*/

    public Student() {
    }

    public Student(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Groups getGruop() {
        return gruop;
    }

    public void setGruop(Groups gruop) {
        this.gruop = gruop;
    }

    /*public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
               // ", gruop=" + gruop +
                '}';
    }
}
