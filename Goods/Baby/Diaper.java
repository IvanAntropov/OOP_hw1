package Goods;

public class Diaper extends BabyProducts {
    int size;
    int minWeight;
    int maxWeight;
    String type = "Empty";

    public Diaper(String name, int count, String unit, int minAge, boolean allergenic, int size, int min, int max, String type){
        this.name = name;
        this.count = count;
        this.unit = unit;

        this.minAge = minAge;
        if(allergenic){
            this.hypoallergenic = "Гиппоаллергенно";
        }else{
            this.hypoallergenic = "Негиппоаллергенно";
        }

        this.size = size;
        this.minWeight = min;
        this.maxWeight = max;
        this.type = type;
    }

    @Override
    public String ToString(){
        Return String.format(   "Имя: %s\n" +
                "Кол-во: %d %s\n" +
                "Минимальный возраст: %d\n" +
                "%s\n" +
                "Размер: %d\n" +
                "Мин/макс вес: %d/%d кг\n" +
                "Тип: %s" ,name,count,unit,minAge,hypoallergenic,size,minWeight,maxWeight,type);
    }
}