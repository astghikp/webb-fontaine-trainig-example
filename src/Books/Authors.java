package Books;

import java.time.LocalDate;


public class Authors {

    private String name;
    private LocalDate dateOfBirth;
    private String country;

    public Authors(String name, LocalDate dateOfBirth, String country) {
        setName(name);
        setDateOfBirth(dateOfBirth);
        setCountry(country);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    private void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCountry() {
        return country;
    }

    private void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Author is" + name + ", date of birth is:" + dateOfBirth + ", country is:" + country;
    }
}
