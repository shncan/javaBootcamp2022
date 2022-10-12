package entities;

public class Educator {

        private int id;
        private String EducatorFirstName;
        private String EducatorLastName;

        public Educator() {
            super();
        }

        public Educator(int id, String educatorFirstName, String educatorLastName) {
            super();
            this.id = id;
            EducatorFirstName = educatorFirstName;
            EducatorLastName = educatorLastName;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getEducatorFirstName() {
            return EducatorFirstName;
        }

        public void setEducatorName(String educatorFirstName) {
            EducatorFirstName = educatorFirstName;
        }

        public String getEducatorLastName() {
            return EducatorLastName;
        }

        public void setEducatorSurname(String educatorLastName) {
            EducatorLastName = educatorLastName;
        }
    }