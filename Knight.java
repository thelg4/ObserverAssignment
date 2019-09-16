/**
 * Knight.java - Implementation of Observer.java
 *
 * @author Larry Gunter
 */
public class Knight implements Observer {

  Subject watchman;

  public Knight(Subject watchman) {
    this.watchman = watchman;
    watchman.registerObserver(this);
  }
  /**
   * Method to print the update messages
   *
   * @param warning - A variable of type int
   */
  public void update(int warning) {
    if (warning == 1) {
      System.out.println("Knight: Helps everyone get home safe");
    } else if (warning == 2) {
      System.out.println("Knight: Prepares for battle");
    }
  }
}
