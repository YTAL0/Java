import Enums.TypeOfPlan;
import Enums.TypeStudent;
import entities.Payment;
import entities.Registration;
import entities.Student;

void main(){

    Student s1 = new Student(TypeStudent.STUDENT, 22, "Jorge", "85989-0000");
    Registration r1 = new Registration(LocalDate.now(), s1, TypeOfPlan.ANNUAL);
    Payment p1 = new Payment(r1);
    IO.println(r1.toString());
    IO.println(p1.GenerateFinalValue());
}