
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle sunset;
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
wall.makeVisible();
wall.moveDown();
wall.slowMoveHorizontal(200);
wall.slowMoveHorizontal(-100);
wall.slowMoveVertical(200);
wall.changeSize(2);
wall.changeSize(700);
wall.changeSize(300);
wall.changeSize(100);
wall.slowMoveVertical(-100);

        
        window = new Square();
       window.makeVisible();
window.changeColor("1");
window.slowMoveHorizontal(100);
window.slowMoveVertical(200);
window.slowMoveVertical(-75);
window.slowMoveVertical(15);
window.slowMoveHorizontal(10);
window.slowMoveHorizontal(10);

        roof = new Triangle();  
        roof.makeVisible();
roof.changeSize(30, 100);
roof.slowMoveHorizontal(200);
roof.slowMoveVertical(100);
roof.slowMoveVertical(50);
roof.slowMoveVertical(-25);
roof.slowMoveHorizontal(-30);
roof.changeSize(50, 300);
roof.changeSize(50, 200);
roof.slowMoveHorizontal(-10);
roof.slowMoveVertical(-10);
roof.changeSize(50, 150);


        sun = new Circle();
        sun.makeVisible();
sun.changeColor("yellow");
sun.slowMoveHorizontal(100);

        
        sunset = new Circle();
        
        
               
    }

}
