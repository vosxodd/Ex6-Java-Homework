package exercises.Ex6;

public class Ex6 {
    public static void main(String[] args) throws PhoneNumberAlreadyExists, RecordNotValid {
        Record alexey = new Record(1, "+79566783425", "Alexey");
        Record roman = new Record(2, "+79833247756", "Roman");
        Record maxim = new Record(3, "+79833261225", "Maxim");
        Record polina = new Record(3, "+79529371948", "");
        Record natasha = new Record(1, "+79133832962", "Natasha");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.createRecord(alexey);
        phoneBook.createRecord(roman);
        phoneBook.createRecord(maxim);
        try {
            phoneBook.createRecord(natasha);
        } catch (PhoneNumberAlreadyExists e) {
            System.out.println("Запись с таким id уже существует.");
        }

        try {
            phoneBook.updateRecord(polina);
        } catch (RecordNotValid e) {
            System.out.println("Некорректные данные в записи.");
        }

        phoneBook.deleteRecord(1);

        System.out.println(phoneBook.getAllRecords());
    }
}
