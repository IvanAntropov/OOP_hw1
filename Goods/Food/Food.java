package Goods;

public class Food extends Good {
    String shelfLife = "shelfLife";
    public Food(String name, int count, String unit, Strng date){
        this.name = name;
        this.count = count;
        this.unit = unit;

        this.shelfLife = date;
    }

    @Override
    public String ToString(){
        Return String.format(   "Имя: %s\n" +
                "Кол-во: %d %s\n" +
                "Годен до: %s",name,count,unit,shelfLife);
    }
}
}