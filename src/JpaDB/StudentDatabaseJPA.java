package JpaDB;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentDatabaseJPA {

    public static void main(String[] args) {
        Student obj1 = new Student(1,"Tersornpat",3.14);
        Student obj2 = new Student(2,"Jeff",2.98);
        Student obj3 = new Student(3,"Deff",1.43);
        Student obj4 = new Student(4,"Weff",4.00);
        updateName(obj1, "Patty");
        updateGpa(obj1, 4.00);
        
        updateNameByID(2,"Jave");
        
        
        List<Student> stuList = StudentTable.findAllStudent();
        printAllstudent(stuList);
    }
}
