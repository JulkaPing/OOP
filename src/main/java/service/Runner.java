package service;

public class Runner {
    public static void main(String[] args) {
        Service serviceMem = new Service(new MemRepository());
        serviceMem.getOnlyName();

        Service serviceDataBase = new Service(new DataBaseRepository());
        serviceDataBase.getOnlyName();
    }
}