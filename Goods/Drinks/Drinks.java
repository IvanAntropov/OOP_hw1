package Goods;

public class Drinks extends Good {
    int volume = 0;
    public Food(String name, int count, String unit, int volume){
        this.name = name;
        this.count = count;
        this.unit = unit;

        this.volume = volume;
    }

    @Override
    public String ToString(){
        Return String.format(   "Имя: %s\n" +
                "Кол-во: %d %s\n" +
                "Объем: %d мл",name,count,unit,volume);
    }
}