# 🎭 Advanced Design Patterns Exercises


**👨‍💻 Author**: Lucy Castro  

**🧠 Learning Focus**: Builder, Observer, and Callback Patterns  

**🛠️ IDE**: IntelliJ IDEA  

**💡 Java SDK**: 21  

**📦 Build Tool**: Gradle  


## 📄 Description
This repository contains advanced exercises exploring essential design patterns for flexible software construction. Patterns covered:
- Builder pattern for object creation
- Observer pattern for event notification
- Callback pattern for payment processing

Each pattern is implemented with practical, real-world use cases demonstrating their applications.

## 💻 Technologies Used

- ☕ Java 21

- 🧠 IntelliJ IDEA

- 📦 Gradle

- 🗃️ Git & GitHub

- ⌨️ Command Line Tools

## 📋 Requirements

- ✅ Java JDK 21

- ✅ Gradle 7+

- ✅ IntelliJ IDEA

- ✅ Git

## 📚 Exercise Catalog

### 📂 Level 1: Builder Pattern
<details>
<summary><strong>Exercise: Pizza Order Management System</strong></summary>

Implement a pizza builder system with:
1. `Pizza` class with attributes:
   - Size (Small, Medium, Large)
   - Dough type (Thin, Thick, Gluten-Free)
   - Toppings (List of ingredients)

2. `PizzaBuilder` interface with methods:
   - `setSize()`
   - `setDough()`
   - `addTopping()`
   - `build()`

3. Concrete builders for:
   - HawaiianPizzaBuilder (Ham, Pineapple)
   - VeggiePizzaBuilder (Mushrooms, Peppers, Onions)
   - SupremePizzaBuilder (Pepperoni, Sausage, Olives)

4. `PizzaMaster` class that:
   - Accepts a PizzaBuilder
   - Constructs pizza step-by-step
   - Returns finished pizza

**Main Class Demo**:
- Create different pizza types
- Show construction process
- Print pizza configurations
</details>

---

### 📂 Level 2: Observer Pattern
<details>
<summary><strong>Exercise: Stock Market Notification System</strong></summary>

Implement a stock exchange system with:
1. `StockExchange` (Observable) that:
   - Maintains list of observer agencies
   - Tracks current stock index
   - Notifies observers on index change

2. `StockAgency` (Observer) interface with:
   - `update(stockIndex)` method

3. Concrete agencies:
   - `BullMarketAgency` (Buys when index rises)
   - `BearMarketAgency` (Sells when index falls)
   - `NeutralAgency` (Tracks trends)

**Main Class Demo**:
- Simulate market fluctuations
- Show agency reactions
- Demonstrate add/remove observers
</details>

---

### 📂 Level 3: Callback Pattern
<details>
<summary><strong>Exercise: Payment Gateway System</strong></summary>

Implement a shoe store payment system with:
1. `PaymentMethod` interface with:
   - `processPayment(amount)` method

2. Concrete payment methods:
   - `CreditCardPayment`
   - `PayPalPayment`
   - `BankTransferPayment`

3. `PaymentGateway` class that:
   - Accepts any PaymentMethod
   - Invokes `processPayment()`
   - Returns control to caller

4. `ShoeStore` class that:
   - Selects payment method
   - Initiates payment via gateway
   - Handles success/failure

**Main Class Demo**:
- Simulate shoe purchases
- Show different payment methods
- Demonstrate payment processing flow
</details>

---

## 🎯 Learning Goals

✅ Builder pattern for complex object creation  

✅ Observer pattern for event-driven systems  

✅ Callback pattern for payment processing  

✅ Decoupled system components  

✅ Interface-based implementations  

## 🏆 Best Practices

✔️ Fluent builder interfaces  

✔️ Loose coupling between observers/subjects  

✔️ Anonymous inner classes for callbacks  

✔️ Parameterized payment processing  

✔️ Encapsulated business logic  

## 🤝 Contributions

1. ⭐ Star the repository  

2. 🍴 Fork the project  

3. 📥 Create a pull request  

## 🌐 Deployment
For educational purposes only.  

## 🚀 Thanks for Visiting = )
