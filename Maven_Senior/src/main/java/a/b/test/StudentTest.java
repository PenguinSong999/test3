package a.b.test;

import a.b.dao.StudentDao;
import a.b.domain.Student;
import a.b.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    @Test
    public void  testDao(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao dao = ac.getBean(StudentDao.class);
        Student student = dao.findStudentById(1);
        System.out.println(student);
        StudentService service = ac.getBean(StudentService.class);
        Student student1 = service.findStudentById(2);
        System.out.println(student1);

        Student student2 = new Student();
        student2.setName("Alice");
        student2.setGender("女");
        service.saveStudent(student2);
    }
}
