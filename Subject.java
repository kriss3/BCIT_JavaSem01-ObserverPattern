
/**
 * Write a description of interface Subject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Subject
{
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();
}
