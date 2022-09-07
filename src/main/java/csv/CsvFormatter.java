package csv;

import java.util.Arrays;

public class CsvFormatter {

    private final String DELIMITER_PERSONS = ";";
    private final String DELIMITER_FIELD = ",";
    private final String DELIMITER_KEY_VALUE = "=";
    private final int LIMIT = 2;


    public Person[] getPersonsFromCsvFile(String csvString) {
        String[] myArray = csvString.split(DELIMITER_PERSONS);
        Person[] result = new Person[myArray.length];
        for( int i = 0; i < myArray.length; i++){
            String[] k = myArray[i].split(DELIMITER_FIELD, LIMIT);
            String[] name = k[0].split(DELIMITER_KEY_VALUE, LIMIT);
            String[] lastname = k[1].split(DELIMITER_KEY_VALUE, LIMIT);
            result[i] = new Person(name[1], lastname[1]);
        }

        System.out.println();
        return result;
    }
}



