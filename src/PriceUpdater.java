import java.util.Random;

public class PriceUpdater extends Thread{

    private PricesContainer pricesContainer;
    private Random random = new Random();

    public PriceUpdater(PricesContainer pricesContainer){
        this.pricesContainer = pricesContainer;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            pricesContainer.getLockObject().lock();
            try {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
                pricesContainer.setBitcoinPrice(random.nextInt(1000000));
                pricesContainer.setEtherPrice(random.nextInt(3180));
                pricesContainer.setLitecoinPrice(random.nextInt(120));
                pricesContainer.setTrumpCoinPrice(random.nextDouble());
            } finally {
                pricesContainer.getLockObject().unlock();
            }
        }
    }
}
