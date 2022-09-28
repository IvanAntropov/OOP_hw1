import Goods

public class nipple extends BabyProducts {
    public nipple(String name, int count, String unit, int minAge, boolean allergenic){
        this.name = name;
        this.count = count;
        this.unit = unit;

        this.minAge = minAge;
        if(allergenic){
            this.hypoallergenic = "Гиппоаллергенно";
        }else{
            this.hypoallergenic = "Негиппоаллергенно";
        }
    }

    @Override
    public String ToString(){
        Return String.format(   "Имя: %s\n" +
                "Кол-во: %d %s\n" +
                "Минимальный возраст: %d\n" +
                "%s",name,count,unit,minAge,hypoallergenic);
    }
}

