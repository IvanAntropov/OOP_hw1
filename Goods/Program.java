//package Goods;

public class app {

//    public String ToString(){
//        Return String.format(   "Имя: %s\n" +
//                "Кол-во: %d %s",name,count,unit);
//    }
    public void print(Good good){
        System.println(good.getClass().getName() + ":\n" + good.ToString());
        System.println();
}

    public static void main(String[] args) {
        Good b = new Good("Kurwa",5,"шт");
//        Bread a = new Bread("superbread",5,"кг","05.12.21","3");

//        print(a);
        print(b);

        //Здесь поитдее реализацияпрограммы, но не получается связать с классами в других файлах


    }

}