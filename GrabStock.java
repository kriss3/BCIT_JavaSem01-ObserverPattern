
/**
 * Write a description of class GrabStock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GrabStock
{
    public static void main()
    {
        StockGrabber stockGrabber = new StockGrabber();
        
        StockObserver sob1 = new StockObserver(stockGrabber);
        
        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setAaplPrice(667.50);
        stockGrabber.setGoogPrice(676.40);
        
        StockObserver sob2 = new StockObserver(stockGrabber);
        
        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setAaplPrice(667.50);
        stockGrabber.setGoogPrice(676.40);
        
        stockGrabber.unregister(sob1);
        
        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setAaplPrice(667.50);
        stockGrabber.setGoogPrice(676.40);
        
        
        
    }
}
