package dataAccess.Concrete.hibernate;

import dataAccess.Abstract.EducatorDao;
import entities.Educator;

import java.util.ArrayList;
import java.util.List;

public class HibernateEducatorDao implements EducatorDao {

    private List<Educator> educators = new ArrayList<Educator>();

    @Override
    public List<Educator> getAllEducators() {
        System.out.println("Hibernate ile getirildi");
        return educators;
    }


    @Override
    public Educator getEducator(int id) throws Exception {
        System.out.println("Hibernate ile getirildi");
        for (Educator educator : educators) {
            if (educator.getId() == id) {
                return educator;
            }
        }
        throw new Exception("Eğitmen Bulunamadı");
    }

    @Override
    public void addEducator(Educator educator) {
        System.out.println("Hibernate ile Eğitmen eklendi.");
        this.educators.add(educator);

    }

    @Override
    public void updateEducator(Educator educator) {
        System.out.println("Hibernate ile Eğitmen Güncellendi");
    }

    @Override
    public void deleteEducator(Educator educator) {
        System.out.println("Hibernate ile Eğitmen Silindi");

    }
}









