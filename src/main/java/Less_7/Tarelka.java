package Less_7;

public class Tarelka
{
    private int food;

    int getFood()
    {
        return food;
    }


    Tarelka(int food)
    {
        this.food = food;
    }


    void decreaseFood(int n)
    {
        food -= n;
    }


    void increaseFood()
    {
        this.food += 400;
        System.out.println("В миску добавили 400 грамм корма");
    }


    boolean checkFood(int n)
    {
        return (food - n) >= 0;
    }

}