
public class CryptoPriceUpdater {
    public static void main(String[] args) {

        PricesContainer pricesContainer = new PricesContainer();
        PriceUpdater pricesUpdater = new PriceUpdater(pricesContainer);
        pricesUpdater.start();

        while (true) {
            if (pricesContainer.getLockObject().tryLock()) {
                try {
                    System.out.println("BTC: " + pricesContainer.getBitcoinPrice());
                    System.out.println("ETH: " + pricesContainer.getEtherPrice());
                    System.out.println("LTC: " + pricesContainer.getLitecoinPrice());
                    System.out.println("TRUMP: " + pricesContainer.getTrumpCoinPrice());
                    System.out.println("---------------------------");
                } finally {
                    pricesContainer.getLockObject().unlock();
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}