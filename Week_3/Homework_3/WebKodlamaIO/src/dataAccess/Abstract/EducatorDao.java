package dataAccess.Abstract;

import entities.Educator;

import java.util.List;

public interface EducatorDao {
    List<Educator> getAllEducators();
    Educator getEducator(int id) throws Exception;
    void addEducator(Educator educator);
    void updateEducator(Educator educator);
    void deleteEducator(Educator educator);
}
