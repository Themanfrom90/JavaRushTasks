package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {
    private static int countOfEggs;

    MoldovanHen() {
        increaseCountOfEggs();
    }

    @Override
    int getCountOfEggs() {
        return countOfEggs;
    }

    @Override
    public void increaseCountOfEggs() {
        countOfEggs++;
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return getCountOfEggs();
    }

    @Override
    public String getDescription() {
        return super.getDescription() +
                " Моя страна - "+Country.MOLDOVA+
                ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
