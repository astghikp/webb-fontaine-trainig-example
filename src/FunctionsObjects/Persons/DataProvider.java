package FunctionsObjects.Persons;

public class DataProvider {

    static Person[] persons = new Person[7];
    static Company[] companies = new Company[4];

    // Person data arrays
    static String[] names = {"Steve", "James", "Amy", "Mary", "John", "Dean", "Sam"};
    static int[] ages = {30, 35, 30, 57, 65, 18, 25};
    // Company data
    static String[] companyNames = {"WebbFontaine", "SFL", "VOLO", "Ineco Bank"};
    static String[] companyAdress = {"Armenakyan", "Azatutyan", "Komitas", "Abovyan"};

    // Fill array with Persons data
    static {
        for (int j = 0; j < companyNames.length; j++) {
            companies[j] = new Company(companyNames[j], companyAdress[j]);

        }
        for (int i = 0; i < names.length; i++) {

            if (i < companyNames.length - 1) {
                persons[i] = new Person(names[i], ages[i], companies[i]);
            } else persons[i] = new Person(names[i], ages[i], companies[6 - i]);

        }


    }
}
