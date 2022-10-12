package business;

import core.logging.Logger;
import dataAccess.Abstract.EducatorDao;
import entities.Educator;

import java.util.List;

public class EducatorManager {

    private EducatorDao educatorDao;
    private List<Logger> loggers;

    public EducatorManager(EducatorDao educatorDao,List<Logger> loggers) {
        this.educatorDao=educatorDao;
        this.loggers=loggers;
    }

    public static void add(Educator educator) {
        educatorDao.addEducator(educator);
        for(Logger logger:loggers) {
            logger.log(educator.getEducatorFirstName()+" Eklendi");
        }
    }

    public void update(Educator educator) {
        educatorDao.updateEducator(educator);
        for(Logger logger:loggers) {
            logger.log(educator.getEducatorFirstName()+" Güncellendi");
        }
    }

    public void delete(Educator educator) {
        educatorDao.deleteEducator(educator);
        for(Logger logger:loggers) {
            logger.log(educator.getEducatorFirstName()+" Silindi");
        }
    }
}
