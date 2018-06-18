package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
//        System.out.println(hen.getCountOfEggsPerMonth());
//        System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            switch (country){
                case Country.UKRAINE: hen = new UkrainianHen(); break;
                case Country.RUSSIA: hen = new RussianHen(); break;
                case Country.BELARUS: hen = new BelarusianHen(); break;
                case Country.MOLDOVA: hen = new MoldovanHen(); break;
            }
            return hen;
        }
    }


}
abstract  class Hen {

    abstract int getCountOfEggs() ;

    abstract void increaseCountOfEggs();

    abstract int getCountOfEggsPerMonth() ;

    String getDescription() {
        return "Я - курица.";
    }
}