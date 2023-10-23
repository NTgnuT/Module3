package ra.service.Impl;

import ra.modal.Subject;
import ra.service.ISubjectService;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements ISubjectService {
    static List<Subject> subjectList = new ArrayList<>();
    @Override
    public List<Subject> findAll() {
        return subjectList;
    }

    @Override
    public void save(Subject subject) {

    }

    @Override
    public void update(Subject subject) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Subject findById(int id) {
        return null;
    }
}
