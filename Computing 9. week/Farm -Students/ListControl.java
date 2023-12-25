
public class ListControl
{
    private Farm f1;

    public ListControl()
    {
        f1 = new Farm();
        System.out.println("There are " + f1.addToList("Goat"));
        System.out.println("There are " + f1.addToList("Horse"));
        System.out.println("There are " + f1.addToList("Cow"));
        System.out.println("There are " + f1.addToList("Pig"));
        System.out.println(f1.getItem(1));
        //check validation
        System.out.println(f1.getItem(5));
        System.out.println("There are " + f1.noOfItems() + " items");
        System.out.println(f1.removeAtPosition(2));
        System.out.println("There are " + f1.noOfItems() + " items");
        f1.printAll();
        System.out.println(f1.removeAtPosition(5));
        System.out.println(f1.addFirst("Hen"));
        f1.printAll();        
        f1.itemsBeginWith("H");
        f1.itemsBeginWith("X");
    }

    public void findAnimalPositionInList(String aName)
    {
        int index = f1.searchForAnimal(aName);
        if(index != -1){
            System.out.println("The " + aName + "is at index " + index);
        }
        else{
            System.out.println("No such animal");
        }

    }
}
