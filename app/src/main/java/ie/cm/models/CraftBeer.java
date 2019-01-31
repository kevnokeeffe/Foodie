package ie.cm.models;

import java.io.Serializable;

public class CraftBeer implements Serializable {

        public int beerId;
        public String beerName;
        public String craftBar;
        public double rating;
        public double price;
        public boolean favourite;


        public CraftBeer() {}

        public CraftBeer(String name, String bar, double rating, double price, boolean fav)
        {
            this.beerName = name;
            this.craftBar = bar;
            this.rating = rating;
            this.price = price;
            this.favourite = fav;
        }

        @Override
        public String toString() {
            return beerName + ", " + craftBar + ", " + rating
                    + ", " + price + ", fav =" + favourite;
        }
    }

