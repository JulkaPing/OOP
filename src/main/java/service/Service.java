package service;

public class Service  {

    final String SPACE_DELIMITER = " ";

    private Store store;

    public Service(Store store) {
        this.store = store;
    }

    public void findAll() {
        store.findAll();
    }

    public void getOnlyName() {
        for (String string : store.findAll()) {
            System.out.println(string.split(SPACE_DELIMITER)[0]);
        }
    }
}