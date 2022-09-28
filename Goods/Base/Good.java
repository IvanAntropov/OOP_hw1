//package Goods;

public class Good {
    String name = "name";
    int count = 0;
    String unit = "unit";


    public String ToString(){
        Return String.format(   "Имя: %s\n" +
                                "Кол-во: %d %s",name,count,unit);
    }
}
