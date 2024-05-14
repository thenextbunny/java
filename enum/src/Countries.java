public enum Countries {
    BRAZIL ("BR", "Brazil"),
    UNITED_STATES_OF_AMERICA ("USA", "United States of America"),
    FRANCE ("FR", "France");

    private String abbreviation;
    private String name;

    private Countries(String abbreviation, String name) {
        this.abbreviation = abbreviation;
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getName() {
        return name;
    }

    public String getNameInUpperCase() {
        return name.toUpperCase();
    }
}