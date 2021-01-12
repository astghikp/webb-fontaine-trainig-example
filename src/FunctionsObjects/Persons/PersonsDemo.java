package FunctionsObjects.Persons;

import java.util.Scanner;

public class PersonsDemo {

    public static void main(String[] args) {
        Person[] persons = DataProvider.persons;
        Scanner scanner = new Scanner(System.in);
        String companyInput = getCorrectInput(scanner);
        //Input Company name and Find persons working there
        PersonsAPI.getPersonsByCompanyName(persons, companyInput);
        //Find Youngest person
        PersonsAPI.getYoungestPerson(persons);
        //Find Oldest person
        PersonsAPI.getOldestPerson(persons);
        // Find repeating age
        PersonsAPI.getRepeatingAge(persons);
        //Sort by Age
        PersonsAPI.sortingByAge(persons);
        //Sort by Name
        PersonsAPI.sortingByName(persons);
        //Sort By Company Name
        PersonsAPI.sortingByCompanyName(persons);


    }

    static String getCorrectInput(Scanner scanner) {
        System.out.println("Please enter Company Name");
        return scanner.next();
    }
}
