package DesignPatterns.BuilderDesignPattern;

public class LunchOrder {
    public static class Builder {
        private String bread;
        private String candiments;
        private String dressing;
        private String meat;

        public Builder() {

        }

        public LunchOrder build() {
            return new LunchOrder(this);
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder candiments(String candiments) {
            this.candiments = candiments;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }


    }

    private LunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.candiments = builder.candiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    private final String bread;
    private final String candiments;
    private final String dressing;
    private final String meat;


    public String getBread() {
        return bread;
    }

    public String getCandiments() {
        return candiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
