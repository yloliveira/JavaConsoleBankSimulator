public class Customer {
    private String documentId;
    private String fisrtName;
    private String lastName;

    public Customer(String documentId, String fisrtName, String lastName) {
        this.documentId = documentId;
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        validate();
    }

    public String getFirstName() {
        return this.fisrtName;
    }

    public String getFullName() {
        return this.fisrtName + " " + this.lastName;
    }

    private void validate() {
        if (this.documentId.trim().length() != 11) {
            throw new IllegalArgumentException("The customer's documentId must be 11 digits.");
        }
        if (this.fisrtName.trim().length() < 3) {
            throw new IllegalArgumentException("The customer's fisrt name must be at least 3 digits.");
        }
        if (this.lastName.trim().length() < 3) {
            throw new IllegalArgumentException("The customer's last name must be at least 3 digits.");
        }
    }
}
