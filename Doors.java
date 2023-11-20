public class Doors {

    public class Door {
        // Fields
        private String style;
        private String color;

        // Constructor
        public Door() {
            // Initialize fields to default values or leave them empty
        }

        // Methods for Door Style
        public void selectStyle(String style) {
            // Set the selected door style
            this.style = style;
        }

        // Methods for Door Color
        public void selectColor(String color) {
            // Set the selected door color
            this.color = color;
        }

        // Getters for Door Details
        public String getStyle() {
            return style;
        }

        public String getColor() {
            return color;
        }
    }

}
