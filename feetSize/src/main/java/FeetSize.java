public enum FeetSize {

    FEET_SIZE40(24),
    FEET_SIZE41(25),
    FEET_SIZE42(26),
    FEET_SIZE43(27),
    FEET_SIZE44(28);

    private Integer feetsSizesValue;

    FeetSize(int feetsSizesValue) {
        this.feetsSizesValue = feetsSizesValue;
    }

    public Integer getFeetsSizesValue() {
        return feetsSizesValue;
    }
}
