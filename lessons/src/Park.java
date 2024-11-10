public class Park {
    public class Attraction {
        private String openHours;
        private int price;

        public Attraction(String openHours, int price) {
            this.openHours = openHours;
            this.price = price;
        }

        public String getOpenHours() {
            return openHours;
        }

        public void setOpenHours(String openHours) {
            this.openHours = openHours;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

    }
}






