package dataAccess.Concrete.jdbc;

import dataAccess.Abstract.EducatorDao;
import entities.Educator;

import java.util.ArrayList;
import java.util.List;

public class JdbcEducatorDao implements  EducatorDao {
    private List<Educator> educators = new ArrayList<Educator>();

    @Override
    public List<Educator> getAllEducators() {
        System.out.println("JDBC ile getirildi");
        return educators;
    }

    @Override
    public Educator getEducator(int id) throws Exception {
        System.out.println("JDBC ile getirildi");
        for (Educator educator : educators) {
            if (educator.getId() == id) {
                return educator;
            }
        }
        throw new Exception("Eğitmen Bulunamadı");
    }

    @Override
    public void addEducator(Educator educator) {
        System.out.println("JDBC ile Eğitmen veritabanına eklendi.");
        this.educators.add(educator);

    }

    @Override
    public void updateEducator(Educator educator) {
        System.out.println("JDBC ile Eğitmen Güncellendi");
    }

    @Override
    public void deleteEducator(Educator educator) {
        System.out.println("JDBC ile Eğitmen Silindi");

    }
}
