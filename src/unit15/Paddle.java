package unit15;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block {

    //instance variables
    private int speed;

    public Paddle() {
        super(10, 10);
        speed = 5;
    }
    
    public Paddle(int x, int y) {
        super(x, y);
        speed = 5;
    }
    
    public Paddle(int x, int y, int w, int h) {
        super(x, y, w, h);
        speed = 5;
    }
    
    public Paddle(int x, int y, int w) {
        super(x, y, w, 30);
        speed = 5;
    }
    
    public Paddle(int x, int y, int w, int h, int Sp) {
        super(x, y);
        speed = Sp;
    }
    
    public Paddle(int x, int y, int w, int h, Color c, int Sp){
        super(x, y, w, h, c);
        speed = Sp;
    }

    public Paddle(int x, int y, int Sp, int w, int h, Color c) {
        super(x, y, w, h, c);
        speed = Sp;
    }

    //add the other Paddle constructors
    public void moveUpAndDraw(Graphics window) {
        if (getY() >= 5){
            draw(window, Color.WHITE);
            setY(getY() - getSpeed());
		//setY

            //draw the ball at its new location
            draw(window);
        }
        else{
                    moveDownAndDraw(window);
        }
    }

    public void moveDownAndDraw(Graphics window) {
        if (getY() <= 475){
            draw(window, Color.WHITE);
            setY(getY() + getSpeed());
		//setY

            //draw the ball at its new location
            draw(window);
        }
        else{
                    moveUpAndDraw(window);
                }
        
    }

   //add get methods
    //add a toString() method

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
