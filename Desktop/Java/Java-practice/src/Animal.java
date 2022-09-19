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

