package org.emely.act1.entity;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="mark")
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="id_student")
    private Student student;

    @ManyToOne
    @JoinColumn(name="id_subject")
    private Subject subject;

    private LocalDate date;
    private Integer mark;

    public Mark() {
    }

    public Mark(Integer mark) {
        this.mark = mark;
    }

    public Mark(Student student, Subject subject, LocalDate date, Integer mark) {
        this.student = student;
        this.subject = subject;
        this.date = date;
        this.mark = mark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "id=" + id +
                //", student=" + student +
                ", subject=" + subject +
                ", date=" + date +
                ", mark=" + mark +
                '}';
    }
}
