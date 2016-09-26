package ua.epam;

/**
 * Created by Volodymyr_Zaverukha on 9/19/2016.
 */
public class RDEmployee extends EpamEmployee{
    private Speciality speciality;

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RDEmployee)) return false;
        if (!super.equals(o)) return false;

        RDEmployee that = (RDEmployee) o;

        return getSpeciality() == that.getSpeciality();

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getSpeciality().hashCode();
        return result;
    }
}
