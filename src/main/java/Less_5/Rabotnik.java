package Less_5;


public class Rabotnik
{
    private String name;
    private String dolznost;
    private String email;
    private long phone;
    private int zarplata ;
    private int age ;



    public Rabotnik(String name, String dolznost, String email, long phone, int zarplata, int age){
        this.name = name;
        this.dolznost = dolznost;
        this.email = email;
        this.phone = phone;
        this.zarplata = zarplata;
        this.age = age;
    }



    public static void info(Rabotnik slesar)
    {
        System.out.println("Имя: " + slesar.getName() +"\n"+"Должность: "+
                slesar.getDolznost()+"\n"+"Email: "+slesar.getEmail()+"\n"+
                "Телефон: "+slesar.getPhone()+"\n"+"Зарплата: "+slesar.getZarplata()+
                "\n"+"Возраст: "+slesar.getAge());
    }







    private void setAge(int age)
    {
        this.age = age;
    }

    public  int getAge()
    {
        return age;
    }



    public void setDolznost()
    {
        this.dolznost = dolznost;
    }

    public  String getDolznost()
    {
        return dolznost;
    }



    public void setName(String name)
    {
        this.name = name;
    }

    public  String getName()
    {
        return name;
    }



    public void setPhone(long phone)
    {
        this.phone = phone;
    }

    public  long getPhone()
    {
        return phone;
    }



    public void setEmail(String email)
    {
        this.email = email;
    }
    public  String getEmail()
    {
        return email;
    }




    public void setZarplata(int zarplata)
    {
        this.zarplata = zarplata;
    }

    public int getZarplata()
    {
        return zarplata;
    }


}
