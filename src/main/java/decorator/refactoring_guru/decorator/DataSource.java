package decorator.refactoring_guru.decorator;

public interface DataSource {
    String readData();
    void writeData(String data);
}
