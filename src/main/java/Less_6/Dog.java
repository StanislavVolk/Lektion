package Less_6;

public class Dog  extends Animals
{

    public int run;
    public int plavat;


    public Dog(String name, int run, int plavat )
    {
        this.name = name;
        this.run = run;
        this.plavat = plavat;

    }
    public void dogInfo()
    {
        System.out.println("Имя_Собаки: " + name + " \nПробежит_Растояние: " + run +
                " метров" + " \nПроплывет: " + plavat + " метров");
    }


}
