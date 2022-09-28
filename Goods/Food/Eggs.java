package Goods;

public class Eggs extends Food {
    int countInPack = 10;

    public Eggs(String name, int count, String unit, int countInPack, boolean allergenic){
        this.name = name;
        this.count = count;
        this.unit = unit;

        this.countInPack = countInPack;
    }

    @Override
    public String ToString(){
        Return String.format(   "Имя: %s\n" +
                "Кол-во: %d %s\n" +
                "Кол-во в упаковке: %d",name,count,unit,countInPack);
    }
}