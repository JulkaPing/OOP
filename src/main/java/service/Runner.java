package service;

public class Runner {
    public static void main(String[] args) {
        Service serviceMem = new Service(new MemRepository());
        serviceMem.getOnlyName();
        // Đŕńęîěĺíňčđîâŕňü č čńďđŕâčňü ęîä, ÷ňîáű îí đŕáîňŕë. Âĺđőíčé ęîä äîëćĺí îńňŕâŕňüń˙ íĺňđîíóňűě.
        //Service serviceDataBase = new Service(new DataBaseRepository());
        //serviceDataBase.getOnlyName();
    }
}