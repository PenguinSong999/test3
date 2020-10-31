package a.b.service.impl;

import a.b.dao.StudentDao;
import a.b.domain.Student;
import a.b.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao dao;
    @Override
    public Student findStudentById(int id) {
        Student stu = dao.findStudentById(id);
        return stu;
    }

    @Override
    public void saveStudent(Student student) {
        dao.saveStudent(student);
    }
}
