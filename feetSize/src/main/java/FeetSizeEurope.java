public enum FeetSizeEurope {


    FEET_SIZE_EUROPE40(7),
    FEET_SIZE_EUROPE41(8),
    FEET_SIZE_EUROPE42(9),
    FEET_SIZE_EUROPE43(10),
    FEET_SIZE_EUROPE44(11);

    private Integer value;



    FeetSizeEurope(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
