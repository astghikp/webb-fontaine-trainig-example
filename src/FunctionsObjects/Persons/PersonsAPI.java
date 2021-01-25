package FunctionsObjects.Persons;

public class PersonsAPI {


    static void getPersonsByCompanyName(Person[] persons, String companyNameInp) {
        boolean personFound = false;
        for (Person person : persons) {
            if (person.companyName.getCompanyName().equals(companyNameInp)) {
                System.out.println("Person working in " + companyNameInp + " is " + person);
                personFound = true;
            }

        }
        if (!personFound)
            System.out.println("No one is working in that company");

    }

    static void getYoungestPerson(Person[] persons) {
        int ageCompare = 0;
        for (int i = 0; i < persons.length - 1; i++) {

            ageCompare = Math.min(persons[i].getAge(), persons[i + 1].getAge());

        }
        for (Person element : persons) {
            if (element.getAge() == ageCompare)
                System.out.println("The Youngest Person is " + element);
        }

    }

    static void getOldestPerson(Person[] persons) {
        int ageCompare = persons[0].getAge();
        for (int i = 1; i < persons.length - 1; i++) {

            if (ageCompare < persons[i + 1].getAge()) {
                ageCompare = persons[i + 1].getAge();
            }


        }
        for (Person element : persons) {
            if (element.getAge() == ageCompare)
                System.out.println("The Oldest Person is " + element);
        }

    }

    static void getRepeatingAge(Person[] persons) {


        int counter = 1, tempVar;
        int tempCount;
        int ageCompare = persons[0].getAge();

        for (int j = 0; j < persons.length - 1; j++) {

            tempVar = persons[j].getAge();
            tempCount = 0;
            for (int i = 1; i < persons.length; i++) {

                if (tempVar == persons[i].getAge())
                    tempCount++;
            }
            if (tempCount > counter) {
                ageCompare = tempVar;
                counter = tempCount;
            }


        }
        System.out.println("Most repeating age is: " + ageCompare);
    }

    static void sortingByAge(Person[] persons) {

        Person terminalPersonVar;
        for (int i = 0; i < persons.length; i++) {
            for (int j = 0; j < persons.length - 1; j++) {
                if (persons[i].getAge() < persons[j].getAge()) {

                    terminalPersonVar = persons[i];
                    persons[i] = persons[j];
                    persons[j] = terminalPersonVar;

                }


            }
        }
        for (Person element : persons) {

            System.out.println("Persons list is Ordered from Youngest to oldest " + element);
        }

    }

    static void sortingByName(Person[] persons) {

        Person terminalPersonVar;

        for (int i = 0; i < persons.length; i++) {
            for (int j = 0; j < persons.length - 1; j++) {
                if (persons[i].getName().compareTo(persons[j].getName()) < 0) {

                    terminalPersonVar = persons[i];
                    persons[i] = persons[j];
                    persons[j] = terminalPersonVar;

                }


            }
        }

        for (Person element : persons) {

            System.out.println("Persons list is Ordered By Name " + element);
        }

    }

    static void sortingByCompanyName(Person[] persons) {

        Person terminalPersonVar;
        for (int i = 0; i < persons.length; i++) {
            for (int j = 0; j < persons.length - 1; j++) {
                if (persons[i].companyName.getCompanyName().compareTo(persons[j].companyName.getCompanyName()) < 0) {

                    terminalPersonVar = persons[i];
                    persons[i] = persons[j];
                    persons[j] = terminalPersonVar;

                }


            }
        }


        for (Person element : persons) {

            System.out.println("Persons list is Ordered By Company Name " + element);
        }

    }

}
