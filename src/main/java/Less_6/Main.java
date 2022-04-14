package Less_6;


public class Main
{
    public static void main(String[] args)
    {

        Animals animal_cat = new Animals("Cats");
        Cat cat = new Cat("Мурка", 200, false);
        animal_cat.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Animals animal_dog = new Animals("Dogs");
        Dog dog = new Dog("Мухтар", 500, 10);
        animal_dog.animalInfo();
        dog.animalInfo();
        dog.dogInfo();

       
    }
}
