package a.b.service;

import a.b.domain.Student;

public interface StudentService {

    Student findStudentById(int id);

    void saveStudent(Student student);
}
