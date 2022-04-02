package Less_7;

public class App
{


    public static void main(String[] args)
    {

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Васька", 150, 3);
        cat[1] = new Cat("Мурка", 100, 4);
        cat[2] = new Cat("Антон", 40, 1);
        Tarelka tarelka = new Tarelka(800);
        System.out.println("У Вас есть " + cat.length + " кота: " + cat[0].getName() + "," +
                " " + cat[1].getName() + " и " + cat[2].getName() +", которые хотят есть каждые "
                + cat[0].getSatietyOn() + ", " + cat[1].getSatietyOn() + " и " + cat[2].getSatietyOn() + " часа.");
        System.out.println("Вы решили насыпать " + tarelka.getFood() + "грамм корма.");
        int count = 0;


        for(int j = 0; j < 24; j ++)
        {
            for (Cat i : cat)
            {
                if (i.getSatiety() == 0 )
                {
                    if (!tarelka.checkFood(i.getAppetite()))
                    {
                       System.out.println("Недостаточно корма,\nпо этому мы добавим по умолчанию...");
                        tarelka.increaseFood();

                    }
                    i.eat(tarelka);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() +
                            " граммов корма и проголодается через " + i.getSatiety() + " часа");
                }
               else if (tarelka.getFood() < i.getAppetite())
                {
                    System.out.println("Кот " + i.getName() + " отказался кушать, в миске мало еды...");
                }

                i.setSatiety(i.getSatiety() - 1);
            }
            count ++;
            System.out.println("На время " + count +"ч:00м в миске осталось " + tarelka.getFood() + " граммов корма.");
            System.out.println("*************************************************************");
            System.out.println("\n\n\n");

        }
    }
}