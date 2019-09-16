/**
 * ShopOwner.java - Implementation of Observer.java
 *
 * @author Larry Gunter
 */
public class ShopOwner implements Observer {

  Subject watchman;

  public ShopOwner(Subject watchman) {
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
      System.out.println("Shop Owner: Close down shop and head home");
    } else if (warning == 2) {
      System.out.println("Shop Owner: Drops everything and find nearest hideout");
    }
  }
}
