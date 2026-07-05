import Enums.TypeOfPlan;
import Enums.TypeStudent;
import entities.Registration;
import entities.Student;

void main(){

    Student s1 = new Student(TypeStudent.REGULAR, 22, "Jorge", "85989-0000");
    Registration r1 = new Registration(LocalDate.now(), s1, TypeOfPlan.MONTHLY);

    IO.println(r1.toString());
}