package service;

public class MemRepository implements Store {

    @Override
    public String[] findAll() {
        return new String[] {"Nikita Nesterenko", "Danila Orbanin", "Andrey Zaikovich"};
    }
}