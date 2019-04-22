# Stock Portfolio Management

This is a web application that will allow a user to manage a fake stock portfolio and cash balance.

The user will be able to:

- Add or remove amounts to their cash balance, which is then used for buying shares.
- Execute “buy” or “sell” orders for a quantity of stock. For example, the user may wish to buy 3 GOOG shares. The amount of shares times the current price-per-share would then be deducted from their cash balance.
- Current cash and share holdings will be visible to the user.

## Run the application
- To build the application, run `mvn clean install` on the command line
- To run the application, run `mvn spring-boot:run` on the command line
- Go to https://localhost:8080 on the browser and search for a stock name, for eg., MSFT and get its current price
- Use the Buy button
