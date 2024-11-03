1-Why did you choose a HashMap to store product information? What are its advantages compared to other data structures?

A HashMap was chosen to store products by their ID because it provides fast access to product information through key-based lookup. With a HashMap, search, insertion, and deletion operations average O(1) time complexity, making it particularly efficient for quick access to products by their ID. Compared to other structures like lists (ArrayList or LinkedList), a HashMap performs better for unique key-based lookups.

2-How does using an ArrayList for daily shipments help in maintaining the order of arrival?

An ArrayList preserves the insertion order of elements, making it well-suited for recording daily shipments in the order products arrive. When products are added to the ArrayList as they are received, the arrival order is maintained automatically. To display the products in arrival order, simply iterate through the list. Additionally, accessing elements by index in an ArrayList is fast, which simplifies managing shipments.

3-What changes would you make if products needed to be sorted by both name and ID?

If products needed to be sorted by name, and by ID in cases of identical names, a TreeSet with a custom Comparator could be used to handle this sort order. The Comparator could compare names first, then, if they match, compare IDs. Alternatively, an ArrayList could be used for products, with Collections.sort() and an appropriate Comparator applied whenever sorting is needed. This approach would allow for multiple sorting criteria without modifying the underlying data structures.

4-What would you do differently if products could have non-unique IDs or if shipments had to be tracked with timestamps?

*Non-unique IDs: If products could have non-unique IDs, a HashMap would no longer be suitable, as it requires unique keys. In this case, a List or a Map of type Map<String, List<Product>> could be used, where the key might be the product name or another unique attribute, and the value is a list of products with the same ID.
*Tracking shipments with timestamps: To record shipments with a timestamp, a LinkedHashMap could be used to store each received product with its timestamp as either the key or value (depending on the needs). Another option would be to create a ShipmentEntry class containing a product and a timestamp, then store each shipment as a ShipmentEntry object in an ArrayList.


              *&*****************************************************Data Structure Choices and Implementation****************************************************
HashMap<Integer, Product>: Used to store products by ID for quick access.
ArrayList for daily shipments: Records products in arrival order.
TreeSet for sorting by name: Maintains a set of products sorted alphabetically.
