# Crypto Price Updater

A multithreaded Java application that simulates live cryptocurrency price updates and provides thread-safe access for reading and updating the prices.

## Features

- **Real-Time Price Updates**: 
  - Randomly generates prices for Bitcoin, Ethereum, Litecoin and TrumpCoin.
  - Updates prices at regular intervals using a separate thread (PriceUpdater).

- **Thread-Safe Access**: 
  - Ensures safe access to shared resources using ReentrantLock.
  - Prevents race conditions.

- **Non-Blocking Reads**: 
  - Main thread uses tryLock() to avoid being blocked while reading prices.
  - Ensures efficient execution and responsiveness.
