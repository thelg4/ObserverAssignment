/**
 * Subject.java - Interface to be extended by Watchman.java
 *
 * @author Larry Gunter
 */
public interface Subject {
  public void registerObserver(Observer observer);

  public void removeObserver(Observer observer);

  public void notifyObservers();
}
