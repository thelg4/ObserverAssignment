/**
 * Watchman.java - Implements Subject.java
 *
 * @author Larry Gunter
 */
import java.util.ArrayList;

public class Watchman implements Subject {

  int warning = 0;
  ArrayList<Observer> observers;

  public Watchman() {
    observers = new ArrayList<Observer>();
  }

  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  /** Method to notify the observers */
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(warning);
    }
  }

  /**
   * Method to push warning to observers
   *
   * @param warning
   */
  public void issueWarning(int warning) {
    if (warning == 1) {
      System.out.println("WARNING:  1 trumpet was played!");
    } else if (warning == 2) {
      System.out.println("WARNING:  2 trumpets were played!");
    }
    this.warning = warning;
    notifyObservers();
  }
}
