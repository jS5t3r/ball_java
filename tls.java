
package tls;
/**
 * @author Peter
 */
public class TLS{
  public static void main(String[] args) {
    Ball tennisBall = new Ball(4, "Lime");    //4 inch size, color: lime
    Ball soccerBall = new Ball(10, "White");
    tennisBall.bounce();
    soccerBall.bounce();
    soccerBall.paint("Blue");
    soccerBall.bounce();
    
  }
}
