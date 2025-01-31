package cs3220.hw3.model;

import jakarta.persistence.*;

import java.time.Year;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer session;
    private Integer birthYear;
    private String level;
    private String timeSlot1;
    private String timeSlot2;

    @ManyToOne(optional = true)
    @JoinColumn(name = "class_id")
    private Classes assignedClass;

    public Classes getAssignedClass() {
        return assignedClass;
    }

    public void setAssignedClass(Classes assignedClass) {
        this.assignedClass = assignedClass;
    }

    public Student() {
    }

    public Student(long id, String name, Integer session, int birthYear, String level, String timeSlot1, String timeSlot2) {
        this.id = id;
        this.name = name;
        this.session = session;
        this.birthYear = birthYear;
        this.level = level;
        this.timeSlot1 = timeSlot1;
        this.timeSlot2 = timeSlot2;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getSession() {
        return session;
    }

    @Transient
    public int getAge() {
        return Year.now().getValue() - birthYear;
    }

    public String getLevel() {
        return level;
    }

    public String getTimeSlot1() {
        return timeSlot1;
    }

    public String getTimeSlot2() {
        return timeSlot2;
    }

    public void setSession(Integer session) {
        this.session = session;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setTimeSlot1(String timeSlot1) {
        this.timeSlot1 = timeSlot1;
    }

    public void setTimeSlot2(String timeSlot2) {
        this.timeSlot2 = timeSlot2;
    }
}