package ra.service.Impl;

import ra.modal.Student;
import ra.service.IStudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentImpl implements IStudentService {
    static List<Student> studentList = new ArrayList<>();
    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public List<Student> findByName(String name) {
        return null;
    }
}
