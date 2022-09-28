package Goods;

public class Milk extends Drinks {
    int perFat;
    String shelfLife = "shelfLife";

    public Milk(String name, int count, String unit, int volume, int perFat,String shelfLife){
        this.name = name;
        this.count = count;
        this.unit = unit;

        this.volume = volume;

        this.perFat = perFat;
        this.shelfLife = shelfLife;
    }

    @Override
    public String ToString(){
        Return String.format(   "Имя: %s\n" +
                "Кол-во: %d %s\n" +
                "Объем: %d мл\n" +
                "Годно до: %s",name,count,unit,volume,shelfLife);
    }
}