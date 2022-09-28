package Goods;

public class Breaad extends Food {
    String typeOfFlour = "typeOfFlour";
    public Bread(String name, int count, String unit, Strng date, String typeOfFlour){
        this.name = name;
        this.count = count;
        this.unit = unit;

        this.shelfLife = date;

        this.typeOfFlour = typeOfFlour;
    }

    @Override
    public String ToString(){
        Return String.format(   "Имя: %s\n" +
                "Кол-во: %d %s\n" +
                "Годен до: %s\n" +
                "Тип муки: %s",name,count,unit,shelfLife,typeOfFlour);
    }
}