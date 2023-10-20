package org.emely.act1.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "tbl_subject_teacher", joinColumns = @JoinColumn(name="teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"teacher_id", "subject_id"}))
    private List<Subject> subject;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "tbl_subject_teacher", joinColumns = @JoinColumn(name="teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "groups_id"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"teacher_id", "groups_id"}))
    private List<Groups> groups;

    public Teacher() {
    }

    public Teacher(String nombre, String apellido) {
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

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
