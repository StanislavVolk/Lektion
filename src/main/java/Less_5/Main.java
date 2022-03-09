package Less_5;

public class Main

{
    public static void main(String[] args)
    {
        Rabotnik engineer = new Rabotnik("Иван", "Инженер",
                "mail@email.com", 87026844016l, 800000, 26);
        System.out.println("Имя: " + engineer.getName()+"\n"+"Должность: "
                + engineer.getDolznost()+"\n"+"Email: "+engineer.getEmail()+"\n"+
                "Телефон: "+engineer.getPhone()+"\n"+"Зарплата: "+engineer.getZarplata()+
                "\n"+"Возраст: "+engineer.getAge() );


        System.out.println("*************");

        Rabotnik slesar = new Rabotnik("Николай", "Слесарь", "mail@email.ru", 87762763919l,
                60000,50);

        System.out.println("*************" );

       Rabotnik.info(slesar);

        System.out.println("*************" );

        Rabotnik [] persArray = new Rabotnik[5];
        persArray[0] = new Rabotnik("Иван","Инженер","mail@email.com",87026844016l,80000,26);
        persArray[1] = new Rabotnik("Николай","Слесарь","mail@email.ru",87762763919l,60000,50);
        persArray[2] = new Rabotnik("Федор","Мастер","master.fedot@gmail.com",87026844017l,70000,45);
        persArray[3] = new Rabotnik("Кирил","Токарь","tokar.kira@gmail.com",87026844015l,80000,65);
        persArray[4] = new Rabotnik("Данила","Кофе-леди","Данила.кофеюру",89451234567l,15500,32);


        for (int i=0; i < persArray.length; i++)
            if (persArray[i].getAge() > 40) System.out.println(persArray[i].getName()+"\n Старше 40-ка лет.");






    }


}
