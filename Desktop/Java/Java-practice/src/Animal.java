class Animal
{
    public String Name;
    public int Age;

    public void ShowProfile()
    {
        System.out.println( "名前は、" + Name + "、" + Age + "歳です。" );
    }

    public void Speak()
    {
        System.out.println( "......" );
    }
}

class Cat extends Animal
{
    public void Sleep()
    {
        System.out.println( "スースー" );
    }

    public void Speak()
    {
        System.out.println( "ニャー" );
    }
}

class Dog extends Animal
{
    public void Run()
    {
        System.out.println( "トコトコ" );
    }

    public void Speak()
    {
        System.out.println( "ワンワン" );
    }
}

public class Exercise
{
    public static void main( String[] args )
    {
        Cat MyCat = new Cat();
        Dog MyDog = new Dog();

        MyCat.Name = "たま";
        MyCat.Age = 3;
        MyDog.Name = "ぽち";
        MyDog.Age = 4;
        MyCat.ShowProfile();
        MyDog.ShowProfile();
        MyCat.Speak();
        MyDog.Speak();
    }
}