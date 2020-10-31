package a.b.dao;

import a.b.domain.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao {

    //根据id查询学生
    @Select("select * from students where id = #{id}")
    Student findStudentById(int id);

    //保存学生
     @Insert("insert into students (name,gender) values(#{name},#{gender})")
    void saveStudent(Student student);
}
