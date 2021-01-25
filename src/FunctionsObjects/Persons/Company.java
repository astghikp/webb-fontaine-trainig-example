package FunctionsObjects.Persons;

import java.util.Objects;

public class Company {

    String name;
    String address;


    public Company(String nameInp, String addressInp) {
        this.name = nameInp;
        this.address = addressInp;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return name.equals(company.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getCompanyName() {
        return name;


    }

    public String getAddress() {
        return address;
    }
}
