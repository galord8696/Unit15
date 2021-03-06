package unit15;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block {

    private int xSpeed;
    private int ySpeed;

    public Ball() {
        super(200, 200);
        xSpeed = 3;
        ySpeed = 1;
    }

    public Ball(int x, int y) {
        super(x, y);
        xSpeed = 2;
        ySpeed = 3;
    }

    public Ball(int x, int y, int w, int h) {
        super(x, y, w, h);
        xSpeed = 2;
        ySpeed = 3;
    }

    public Ball(int x, int y, int w, int h, Color c) {
        super(x, y, w, h, c);
        xSpeed = 2;
        ySpeed = 3;
    }

    public Ball(int x, int y, int w, int h, Color c, int xSp, int ySp) {
        super(x, y, w, h, c);
        xSpeed = xSp;
        ySpeed = ySp;
    }
	//add the other Ball constructors	

    //add the set methods
    public void moveAndDraw(Graphics window) {
        //draw a white ball at old ball location
        draw(window, Color.WHITE);
        setX(getX() + getxSpeed());
        setY(getY() + getySpeed());
		//setY

        //draw the ball at its new location
        draw(window);
    }

    public boolean equals(Object obj) {
        Ball ob = (Ball) obj;
        return super.equals(ob) && this.getySpeed() == ob.getySpeed() && this.getxSpeed() == ob.getxSpeed();
    }

    //add the get methods
    //add a toString() method
    /**
     * @return the xSpeed
     */
    public int getxSpeed() {
        return xSpeed;
    }

    /**
     * @param xSpeed the xSpeed to set
     */
    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    /**
     * @return the ySpeed
     */
    public int getySpeed() {
        return ySpeed;
    }

    public void collideLeft(Block pad) {

        if((getX()<=(pad.getX()+pad.getWidth())) && (getY() >= pad.getY() && getY() <= (pad.getY()+pad.getHeight()))){
                this.ySpeed *= -1;
            } else {
                this.xSpeed *= -1;
            }
    }
    
    public void collideRight(Block pad) {
        if(((getX() + getWidth())>=(pad.getX()+pad.getWidth())) && (getY() >= pad.getY() && getY() <= (pad.getY()+pad.getHeight()))){
                this.ySpeed *= -1;
            } else {
                this.xSpeed *= -1;
            }
    }

    /**
     * @param ySpeed the ySpeed to set
     */

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
}
