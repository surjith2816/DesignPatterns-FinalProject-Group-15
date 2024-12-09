The main objective is to develop a stock managing application for pharmacies with  which they can maintain their product sales.

1) Update the stock prices dynamically for loyalty based on the customer type, such as customers who registered, regular, employee etc.
2) Tracking and maintaining the stocks as a retailer based on the sales. 
3) Improving user experience for the staff to manage the orders and interact with the customers.
4) Adding Bonus and rewards for the customers through regular subscriptions for certain products and providing with membership specific offers which will increase the overall sales and more customer attrition.

Implemented Design Patterns:
1) Facade Pattern: To create a simple interface to handle the inventory of the pharmacy
2) Strategy Pattern: To dynamically update the product price depending on the type of the user
3) Command Pattern: To convert each action in the application into a command for simpler management
4) Observer Pattern: To keep Track of any changes in the flow of the application and update the other states of the application depending on the change
5) Bridge Pattern: To decouple the stock updates from the users and abstracting its action from the view
6) Decorator Pattern:  To add temporary promotions and loyalty points for certain purchases by adding a decorator on top of the action
7) Adapter Pattern: To connect the application with external API’s as required and making them compatible to integrate with the application
8) Prototype Pattern: To use existing templates to set up and implement new features
9) Factory Pattern: To manage the addition of new products from a single point for a more consistent codebase
