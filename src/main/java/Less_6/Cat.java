package Less_6;

public class Cat extends Animals
{
    private boolean plavat;

    public Cat(String name, int run, boolean plavat)
    {
        this.name = name;
        this.run = run;
        this.plavat = plavat;
    }

    public void catInfo()
    {
        System.out.println("Имя_Кошки: " + name + " \nПробежит_Растояние: " + run +
                " метров" + " \nПроплывет: " + plavat);
    }
}
