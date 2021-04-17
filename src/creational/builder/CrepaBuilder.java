package creational.builder;

public class CrepaBuilder {

    public static class Builder{
        private String cheese;
        private String mushrooms;
        private String turkey;
        private String mayonnaise;
        private String salami;
        private String nuttela;
        private String biscuit;

        public Builder(){

        }

        public CrepaBuilder build(){
            return new CrepaBuilder(this);
        }

        public Builder cheese(String cheese){
            this.cheese = cheese;
            return this;
        }

        public Builder mushrooms(String mushrooms){
            this.mushrooms = mushrooms;
            return this;
        }

        public Builder turkey(String turkey){
            this.turkey = turkey;
            return this;
        }

        public Builder mayonnaise(String mayonnaise){
            this.mayonnaise = mayonnaise;
            return this;
        }

        public Builder salami(String salami){
            this.salami = salami;
            return this;
        }

        public Builder nuttela(String nuttela){
            this.nuttela = nuttela;
            return this;
        }

        public Builder biscuit(String biscuit){
            this.biscuit = biscuit;
            return this;
        }
    }

    private String cheese;
    private String mushrooms;
    private String turkey;
    private String mayonnaise;
    private String salami;
    private String nuttela;
    private String biscuit;

    private CrepaBuilder(Builder builder){
        this.cheese = builder.cheese;
        this.mushrooms = builder.mushrooms;
        this.turkey = builder.turkey;
        this.mayonnaise = builder.mayonnaise;
        this.salami = builder.salami;
        this.nuttela = builder.nuttela;
        this.biscuit = builder.biscuit;
    }

    public String getCheese() {
        return cheese;
    }

    public String getMushrooms() {
        return mushrooms;
    }

    public String getTurkey() {
        return turkey;
    }

    public String getMayonnaise() {
        return mayonnaise;
    }

    public String getSalami() {
        return salami;
    }

    public String getNuttela() {
        return nuttela;
    }

    public String getBiscuit() {
        return biscuit;
    }

    @Override
    public String toString() {
        return "CrepaBuilder{" +
                (cheese!=null ? "cheese='" + cheese + '\'' + "," : "" )+
                (mushrooms!=null ? " mushrooms='" + mushrooms + '\'' + "," : "" )+
                (turkey!=null? " turkey='" + turkey + '\'' + "," : "") +
                (mayonnaise!=null ? " mayonnaise='" + mayonnaise + '\'' + "," : "") +
                (salami!=null ? " salami='" + salami + '\'' + "," : "") +
                (nuttela!=null ? " nuttela='" + nuttela + '\'' + "," : "") +
                (biscuit!=null ? " biscuit='" + biscuit + '\'' + "," : "") +
                " ..."+'}';
    }
}
