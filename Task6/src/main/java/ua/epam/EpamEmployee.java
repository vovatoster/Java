package ua.epam;

/**
 * Created by Volodymyr_Zaverukha on 9/19/2016.
 */
public class EpamEmployee {
    private String name;
    private int age;
    private String education;
    private String maritalStatus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        }
        else throw new IllegalArgumentException("Employee can`t be younger then 18");
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EpamEmployee epamEmployee = (EpamEmployee) o;

        if (age != epamEmployee.age) return false;
        if (!name.equals(epamEmployee.name)) return false;
        if (!education.equals(epamEmployee.education)) return false;
        return maritalStatus.equals(epamEmployee.maritalStatus);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + education.hashCode();
        result = 31 * result + maritalStatus.hashCode();
        return result;
    }
}
