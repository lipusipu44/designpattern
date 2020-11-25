package decorator.refactoring_guru.decorator;

public class DataSourceDecorator implements  DataSource{
    private DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String readData() {
        return dataSource.readData();
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData(data);
    }
}
