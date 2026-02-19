class RestaurantOrder {
    private String customerName;
    private String orderType;
    private StringBuilder specialInstructions;
    private String[] itemsOrdered;

    RestaurantOrder(String customerName, String orderType) {
        this.customerName = customerName;
        this.orderType = orderType;
        specialInstructions = new StringBuilder();
    }

    private void addSpecialInstruction(String instruction) {
        specialInstructions.append(instruction).append("\n");
    }

    private void addItemsOrdered(String... items) {
        this.itemsOrdered = items;
    }

    public String toString() {
        StringBuilder orderDetails = new StringBuilder();
        orderDetails.append("Customer Name: ").append(customerName).append("\n");
        orderDetails.append("Order Type: ").append(orderType).append("\n");
        orderDetails.append("Items Ordered: ");
        for (String item : itemsOrdered) {
            orderDetails.append(item).append(", ");
        }
        orderDetails.setLength(orderDetails.length() - 2); // Remove the last comma and space
        orderDetails.append("\nSpecial Instructions:\n").append(specialInstructions.toString());
        return orderDetails.toString();
    }

    public static void main(String[] args) {
        RestaurantOrder order = new RestaurantOrder("Kavin", "Dine-In"); // offline order
        order.addItemsOrdered("Burger", "Fries", "Soda");
        order.addSpecialInstruction("No onions on the burger.");
        order.addSpecialInstruction("Extra ketchup on the side.");
        System.out.println(order);

        RestaurantOrder takeoutOrder = new RestaurantOrder("Emily", "Takeout"); // online order
        takeoutOrder.addItemsOrdered("Pizza", "Salad");
        takeoutOrder.addSpecialInstruction("Gluten-free crust for the pizza.");
        System.out.println(takeoutOrder);

        RestaurantOrder deliveryOrder = new RestaurantOrder("Michael", "Delivery"); // online delivery order
        deliveryOrder.addItemsOrdered("Pasta", "Garlic Bread");
        deliveryOrder.addSpecialInstruction("No nuts in the pasta.");
        deliveryOrder.addSpecialInstruction("Leave the food at the doorstep.");
        System.out.println(deliveryOrder);
    }
}