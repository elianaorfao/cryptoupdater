import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PricesContainer {

    private Lock lockObject = new ReentrantLock();

    private double bitcoinPrice;
    private double etherPrice;
    private double litecoinPrice;
    private double trumpCoinPrice;

    public Lock getLockObject() {
        return lockObject;
    }

    public double getBitcoinPrice() {
        return bitcoinPrice;
    }

    public double getEtherPrice() {
        return etherPrice;
    }

    public double getLitecoinPrice() {
        return litecoinPrice;
    }

    public double getTrumpCoinPrice() {
        return trumpCoinPrice;
    }

    public void setBitcoinPrice(double bitcoinPrice) {
        this.bitcoinPrice = bitcoinPrice;
    }

    public void setEtherPrice(double etherPrice) {
        this.etherPrice = etherPrice;
    }

    public void setLitecoinPrice(double litecoinPrice) {
        this.litecoinPrice = litecoinPrice;
    }

    public void setTrumpCoinPrice(double trumpCoinPrice) {
        this.trumpCoinPrice = trumpCoinPrice;
    }

}
