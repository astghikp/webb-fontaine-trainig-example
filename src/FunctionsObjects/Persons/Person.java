package FunctionsObjects.Persons;

public class Person {
    int age;
    String name;
    Company companyName;

    public Person(String nameInp, int ageInp, Company companyInp) {
        age = ageInp;
        name = nameInp;
        companyName = companyInp;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", companyName=" + companyName +
                '}';
    }

    public Company getCompanyName() {
        return companyName;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

