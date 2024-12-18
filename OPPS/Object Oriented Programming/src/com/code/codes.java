//// Core Model: User Class
//public class User {
//    // Private fields for encapsulation
//    private String userId;
//    private String name;
//    private String email;
//    private String phoneNumber;
//    private String upiPin;
//    private double accountBalance;
//
//    // Constructor with comprehensive initialization
//    public User(String name, String email, String phoneNumber) {
//        this.userId = generateUniqueId();
//        this.name = name;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//        this.accountBalance = 0.0;
//    }
//
//    // Generate unique user ID
//    private String generateUniqueId() {
//        return "USER_" + System.currentTimeMillis() +
//                Math.round(Math.random() * 1000);
//    }
//
//    // Method to set UPI PIN with validation
//    public void setUpiPin(String pin) {
//        if (isValidPin(pin)) {
//            this.upiPin = hashPin(pin);
//        } else {
//            throw new IllegalArgumentException("Invalid PIN format");
//        }
//    }
//
//    // PIN validation method
//    private boolean isValidPin(String pin) {
//        return pin != null && pin.matches("\\d{4}");
//    }
//
//    // Simple PIN hashing (in real-world, use more secure hashing)
//    private String hashPin(String pin) {
//        return String.valueOf(pin.hashCode());
//    }
//
//    // Method to validate PIN
//    public boolean validatePin(String inputPin) {
//        return this.upiPin != null &&
//                this.upiPin.equals(hashPin(inputPin));
//    }
//
//    // Account balance methods
//    public void creditAmount(double amount) {
//        if (amount > 0) {
//            this.accountBalance += amount;
//        } else {
//            throw new IllegalArgumentException("Credit amount must be positive");
//        }
//    }
//
//    public boolean debitAmount(double amount) {
//        if (amount > 0 && this.accountBalance >= amount) {
//            this.accountBalance -= amount;
//            return true;
//        }
//        return false;
//    }
//
//    // Getters with controlled access
//    public String getUserId() {
//        return userId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public double getAccountBalance() {
//        return accountBalance;
//    }
//}
//
//// Transaction Class to Represent Payment Transactions
//public class Transaction {
//    // Enum to represent transaction status
//    public enum TransactionStatus {
//        PENDING, SUCCESSFUL, FAILED
//    }
//
//    // Transaction details
//    private String transactionId;
//    private User sender;
//    private User receiver;
//    private double amount;
//    private TransactionStatus status;
//    private LocalDateTime timestamp;
//
//    // Constructor
//    public Transaction(User sender, User receiver, double amount) {
//        this.transactionId = generateTransactionId();
//        this.sender = sender;
//        this.receiver = receiver;
//        this.amount = amount;
//        this.timestamp = LocalDateTime.now();
//        this.status = TransactionStatus.PENDING;
//    }
//
//    // Generate unique transaction ID
//    private String generateTransactionId() {
//        return "TXN_" + System.currentTimeMillis() +
//                Math.round(Math.random() * 1000);
//    }
//
//    // Process transaction method
//    public boolean processTransaction(String senderPin) {
//        // Validate sender PIN
//        if (!sender.validatePin(senderPin)) {
//            status = TransactionStatus.FAILED;
//            return false;
//        }
//
//        // Check sender's balance
//        if (sender.debitAmount(amount)) {
//            receiver.creditAmount(amount);
//            status = TransactionStatus.SUCCESSFUL;
//            return true;
//        }
//
//        status = TransactionStatus.FAILED;
//        return false;
//    }
//
//    // Getters for transaction details
//    public String getTransactionId() {
//        return transactionId;
//    }
//
//    public TransactionStatus getStatus() {
//        return status;
//    }
//
//    public double getAmount() {
//        return amount;
//    }
//}
//
//// Payment Service to Manage Transactions
//public class PaymentService {
//    // Transaction limit constants
//    private static final double MAX_TRANSACTION_LIMIT = 100000.0;
//    private static final double DAILY_TRANSACTION_LIMIT = 200000.0;
//
//    // List to track transactions
//    private List<Transaction> transactionHistory;
//
//    // Constructor
//    public PaymentService() {
//        this.transactionHistory = new ArrayList<>();
//    }
//
//    // Method to initiate payment
//    public Transaction makePayment(User sender, User receiver,
//                                   double amount, String senderPin) {
//        // Validate transaction amount
//        validateTransactionAmount(amount);
//
//        // Create transaction
//        Transaction transaction = new Transaction(sender, receiver, amount);
//
//        // Process transaction
//        boolean transactionResult = transaction.processTransaction(senderPin);
//
//        // Store transaction history
//        transactionHistory.add(transaction);
//
//        return transaction;
//    }
//
//    // Validate transaction amount
//    private void validateTransactionAmount(double amount) {
//        if (amount <= 0) {
//            throw new IllegalArgumentException("Transaction amount must be positive");
//        }
//
//        if (amount > MAX_TRANSACTION_LIMIT) {
//            throw new IllegalArgumentException("Transaction exceeds maximum limit");
//        }
//    }
//
//    // Get transaction history
//    public List<Transaction> getTransactionHistory() {
//        return new ArrayList<>(transactionHistory);
//    }
//
//    // Get total transaction amount for a user
//    public double getTotalTransactionAmount(User user) {
//        return transactionHistory.stream()
//                .filter(t -> t.getSender().equals(user))
//                .mapToDouble(Transaction::getAmount)
//                .sum();
//    }
//}
//
//// Main Application to Demonstrate the System
//public class PaymentSystemApplication {
//    public static void main(String[] args) {
//        // Create users
//        User alice = new User("Alice", "alice@example.com", "9876543210");
//        User bob = new User("Bob", "bob@example.com", "9876543211");
//
//        // Set UPI PINs
//        alice.setUpiPin("1234");
//        bob.setUpiPin("5678");
//
//        // Add initial balance
//        alice.creditAmount(50000.0);
//        bob.creditAmount(30000.0);
//
//        // Create payment service
//        PaymentService paymentService = new PaymentService();
//
//        // Process payment
//        Transaction transaction = paymentService.makePayment(
//                alice, bob, 5000.0, "1234"
//        );
//
//        // Print transaction details
//        System.out.println("Transaction ID: " + transaction.getTransactionId());
//        System.out.println("Transaction Status: " + transaction.getStatus());
//        System.out.println("Alice's Balance: " + alice.getAccountBalance());
//        System.out.println("Bob's Balance: " + bob.getAccountBalance());
//    }
//}