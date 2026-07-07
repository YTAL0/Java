package entities;

import Enums.TypeOfPlan;
import Enums.TypeStudent;
import java.time.LocalDate;

public class Registration {
    private double ID;
    private LocalDate dateOfStart;
    private Student student;
    private TypeOfPlan plan;
    private Payment payment;

    public Registration(LocalDate dateOfStart, Student students, TypeOfPlan plan) {
        this.dateOfStart = dateOfStart;
        this.student = students;
        this.plan = plan;
    }

    public TypeOfPlan getPlan() {
        return plan;
    }

    public TypeStudent getTypeStudent(){
        return student.getTypeStudent();
    }

    @Override
    public String toString() {
        return "Registration{" +
                "ID=" + ID +
                ", dateOfStart=" + dateOfStart +
                ", student=" + student +
                ", plan=" + plan +
                '}';
    }
}

