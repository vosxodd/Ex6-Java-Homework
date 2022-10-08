package exercises.Ex6;

import java.util.ArrayList;

public class PhoneBook {
    private final ArrayList<Record> records = new ArrayList<>();

    public void createRecord(Record record) throws PhoneNumberAlreadyExists {
        for (Record rec: this.records) {
            if (rec.id() == record.id()) {
                throw new PhoneNumberAlreadyExists("Запись уже существует");
            }
        }
        this.records.add(record);
    }

    public ArrayList<Record> getAllRecords() {
        return records;
    }

/*  Метод обновляет запись в справочнике. Если запись с таким идентификатором
    не существует, выбросить непроверяемое исключение RecordNotFound. Если в новой записи не заполнено поле name и/или
    поле phoneNumber, выбросить проверяемое исключение RecordNotValid. */
    public void updateRecord(Record record) throws RecordNotValid {
    if (!(record.name().equals("") || record.phoneNumber().equals(""))) {
        deleteRecord(record.id());
        this.records.add(record);
    } else {
    throw new RecordNotValid("Некорректные данные в записи");
    }
    }

/*  Удаляет запись из справочника по идентификатору, если подходящая запись в
    справочнике не найдена - выбрасывается непроверяемое исключение RecordNotFound. */
    public void deleteRecord(long id) {
        for (Record record: this.records) {
            if (record.id() == id) {
                this.records.remove(record);
                return;
            }
        }
        throw new RecordNotFound("Запись не найдена");
    }
}