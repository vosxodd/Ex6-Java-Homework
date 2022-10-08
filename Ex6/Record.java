package exercises.Ex6;

public record Record(long id, String phoneNumber, String name) {

    @Override
    public String toString() {
        return "Record_" + this.id + "_" + this.name;
    }
}