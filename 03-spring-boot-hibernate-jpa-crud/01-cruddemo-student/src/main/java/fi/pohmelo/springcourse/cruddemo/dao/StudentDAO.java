package fi.pohmelo.springcourse.cruddemo.dao;

import fi.pohmelo.springcourse.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student student);

    Student findById(Integer id);

    List<Student> findAll();
}
