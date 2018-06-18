package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    private static int countOfEggs;

    UkrainianHen() {
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
                " Моя страна - "+Country.UKRAINE+
                ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
