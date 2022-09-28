package Goods;

public class ToiletPaper extends Hygiene {
    int countOfLay = 0;
    public ToiletPaper(String name, int count, String unit, int countOfPack,int countOfLay){
        this.name = name;
        this.count = count;
        this.unit = unit;
        this.countOfPack = countOfPack;
        this.countOfLay = countOfLay;
    }

    @Override
    public String ToString(){
        Return String.format(   "Имя: %s\n" +
                "Кол-во: %d %s\n" +
                "Шт в упаковке: %d\n" +
                "Слоев: %d",name,count,unit,countOfPack,countOfLay);
    }
}