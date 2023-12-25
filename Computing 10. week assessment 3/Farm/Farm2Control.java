public class Farm2Control
{
    private Farm2 f2;
    private Animal an1;
    private Animal an2;
    private Animal an3;
    private Animal an4;
    public Farm2Control()
    {
        f2 = new Farm2();
        an1 = new Animal("Goat",4);
        an2 = new Animal("Horse",4);
        an3 = new Animal("Cow",4);
        an4 = new Animal("Pig",4);
        System.out.println("==============Add 4 animals=============");
        System.out.println("Number of animals: " + f2.addToList(an1));
        System.out.println("Number of animals: " + f2.addToList(an2));
        System.out.println("Number of animals: " + f2.addToList(an3));
        System.out.println("Number of animals: " + f2.addToList(an4));
        f2.printAll();
        System.out.println("=============get item 1===============");
        System.out.println(f2.getItem(1));
        System.out.println("==============get item 5==(gives error)=============");
        System.out.println(f2.getItem(5));
        System.out.println("==============count items==============");
        System.out.println("There are " + f2.noOfItems() + " items");
        f2.printAll();
         System.out.println("=============remove item 2==============");
        System.out.println(f2.removeAtPosition(2));      
        System.out.println("There are " + f2.noOfItems() + " items");
        f2.printAll();
        System.out.println("===============remove item 5===========");
        System.out.println(f2.removeAtPosition(5));
        f2.printAll();
        System.out.println("===============add at position 0==========");
        System.out.println(f2.addFirst(new Animal("Hen",2)));
        f2.printAll();
        System.out.println("===============items begin with H======");
        f2.itemsBeginWith("H");
        System.out.println("===============items begin with X===(none)==");
        f2.itemsBeginWith("X");
        System.out.println("===========search for the Horse object================");
        f2.printAll();
        System.out.println("an2 is at position " + f2.searchForAnimal(an2));
        System.out.println("======================================");
        f2.printAll();
        System.out.println("=============Remove Goat=================");
        System.out.println("=======before=====");
        f2.printAll();
        f2.removeAnimal(an1);
        System.out.println("=======after=====");
        f2.printAll(); 
        
    }

   
}
