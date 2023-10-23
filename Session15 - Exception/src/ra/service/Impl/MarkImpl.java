package ra.service.Impl;

import ra.modal.Mark;
import ra.service.IMarkService;

import java.util.ArrayList;
import java.util.List;

public class MarkImpl implements IMarkService {
    static List<Mark> markList = new ArrayList<>();
    @Override
    public List<Mark> findAll() {
        return markList;
    }

    @Override
    public void save(Mark mark) {

    }

    @Override
    public void update(Mark mark) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Mark findById(int id) {
        return null;
    }
}
