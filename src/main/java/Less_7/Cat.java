package Less_7;

public class Cat
{

    private String name;
    private int appetite;
    private int satietyOn;
    private int satiety;

    String getName()
    {
        return name;
    }

    int getAppetite()
    {
        return appetite;
    }


    int getSatietyOn() {
        return satietyOn;
    }


    int getSatiety()
    {
       return satiety;
    }


    void setSatiety(int satiety)
    {
        this.satiety = satiety;
    }


    Cat(String name, int appetite, int satietyOn)
    {
        this.name = name;
        this.appetite = appetite;
        this.satietyOn = satietyOn;
        this.satiety = 0;
    }


    void eat(Tarelka p)
    {
        p.decreaseFood(appetite);
        satiety += satietyOn;
    }
}