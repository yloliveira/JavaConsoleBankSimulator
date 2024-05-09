public class BankAgency {
    private String bankName;
    private String agencyId;
    private String address;

    BankAgency(String agencyId, String bankName, String address) {
        this.bankName = bankName;
        this.address = address;
        this.agencyId = agencyId;
        this.validate();
    }

    public String getAgencyId() {
        return this.agencyId;
    }

    private void validate() {
        if (this.agencyId.trim().length() < 1) {
            throw new IllegalArgumentException("The bank agency's agencyId must be at least 1 digit.");
        }
        if (this.bankName.trim().length() < 3) {
            throw new IllegalArgumentException("The bank agency's bankName must be at least 3 digits.");
        }
        if (this.address.trim().length() < 5) {
            throw new IllegalArgumentException("The bank agency's address must be at least 5 digits.");
        }
    }
}
