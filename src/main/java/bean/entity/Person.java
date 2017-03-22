package bean.entity;

/**
 * Created by dmirry on 05.03.17.
 */
public class Person {
    int idPerson;
    String phone;
    String contactInfo;
    String fullName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (idPerson != person.idPerson) return false;
        if (phone != null ? !phone.equals(person.phone) : person.phone != null) return false;
        if (contactInfo != null ? !contactInfo.equals(person.contactInfo) : person.contactInfo != null) return false;
        return fullName != null ? fullName.equals(person.fullName) : person.fullName == null;
    }

    @Override
    public int hashCode() {
        int result = idPerson;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (contactInfo != null ? contactInfo.hashCode() : 0);
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        return result;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idPerson=" + idPerson +
                ", phone='" + phone + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
