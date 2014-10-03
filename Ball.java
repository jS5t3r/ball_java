package tls;
/**
 *
 * @author Peter
 */
public class Ball {
  private int size;
  private String color;
  private int air_pressure = 20; 
  private boolean is_flat = false;  //is the ball flat yes/no?
  
  public Ball(int initSize, String initColor) {
    size = initSize;
    color = initColor; 
  }
  public void bounce(){
    if(is_flat)
      System.out.println("Sorry, the ball is so flat, so it cannot bounce.");
    else
      System.out.println("The " + color + " is bouncing.");
    
  }
  
  public void deflate() {
    air_pressure = 0;
    is_flat = true;
  }
  
  public void inflate() {
    air_pressure = 20;
    is_flat = false;
  }
  
  public void paint(String new_color) {
    color = new_color;
  }
    
}
