
/**
 * Write a description of class testBigFarm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class testBigFarm
{
    private Animal hen;
    private Animal horse;
    private Animal cow;
    private Animal chicken;
    private Animal pig;
    private BigFarm f1;
    
    public testBigFarm()
    {
        f1 = new BigFarm();
        hen = new Animal("hen", 2);
        horse = new Animal("horse", 4);
        cow = new Animal("cow", 4);
        chicken = new Animal("chicken", 2);
        pig = new Animal("pig", 4);
        System.out.println("****************addingAnimals****************");
        f1.addToList(hen);
        f1.addToList(horse);
        f1.addToList(cow);
        f1.addToList(chicken);
        System.out.println("****************getItem(index 1 and 6)****************");
        System.out.println(f1.getItem(1));
        System.out.println(f1.getItem(6));
        System.out.println("****************noOfItems****************");
        System.out.println(f1.noOfItems());
        System.out.println("****************removeAtPosition****************");
        System.out.println(f1.removeAtPosition(2));
        System.out.println("****************noOfItems****************");
        System.out.println(f1.noOfItems());
        System.out.println("****************printAll*****************");
        f1.printAll();
        System.out.println("****************removeAtPosition****************");
        System.out.println(f1.removeAtPosition(5));
        System.out.println("****************addFirst****************");
        System.out.println(f1.addFirst(pig));
        System.out.println("****************printAll*****************");
        f1.printAll();
        System.out.println("****************itemsBeginWith****************");
        f1.itemsBeginWith("c");
        System.out.println("****************itemsBeginWithCapital****************");
        f1.itemsBeginWith("C");
        System.out.println("****************itemsBeginWith****************");
        f1.itemsBeginWith("x");
        System.out.println("****************searchForObject****************");
        System.out.println(f1.searchForObject(chicken));
        f1.printAll();
        System.out.println("****************printToString****************");
        f1.printToString();
        System.out.println("****************removeByName****************");
        f1.removeByName(chicken);
        f1.printAll();
    }
}
