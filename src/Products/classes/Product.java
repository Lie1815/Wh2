package Products.classes;

public class Product  {

        private String name;
        private double proteins;
        private double fats;
        private double carbohydrates;
        private double calories;

        public Product(String name, double proteins, double fats, double carbohydrates) {
            this(name, proteins, fats, carbohydrates, calculateCalories(proteins, fats, carbohydrates));
        }

        public Product(String name, double proteins, double fats, double carbohydrates, double calories) {
            if (validateData(proteins, fats, carbohydrates, calories)) {
                this.name = name;
                this.proteins = proteins;
                this.fats = fats;
                this.carbohydrates = carbohydrates;
                this.calories = calories;
            } else {
                throw new IllegalArgumentException("Некорректные значения для продукта.");
            }
        }

        public Product(String name) {
            this(name, 0, 0, 0);
        }

        public Product(String name, double calories) {
            this(name, 0, 0, 0, calories);
        }

        static double calculateCalories(double proteins, double fats, double carbohydrates) {
            return (proteins * 4) + (fats * 9) + (carbohydrates * 4);
        }

        private boolean validateData(double proteins, double fats, double carbohydrates, double calories) {
            return proteins >= 0 && fats >= 0 && carbohydrates >= 0 && calories >= 0;
        }

        @Override
        public String toString() {
            return "Продукт: " + name + ", Белки: " + proteins + "g, Жиры: " + fats + "g, Углеводы: " + carbohydrates + "g, Калории: " + calories;
        }
    }



