package Goods;

public class Hygiene extends Good {
    int countOfPack = 0;
    public Food(String name, int count, String unit, int countOfPack){
        this.name = name;
        this.count = count;
        this.unit = unit;

        this.countOfPack = countOfPack;
    }

    @Override
    public String ToString(){
        Return String.format(   "Имя: %s\n" +
                "Кол-во: %d %s\n" +
                "Шт в упаковке: %d",name,count,unit,countOfPack);
    }
}