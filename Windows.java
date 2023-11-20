public class Windows {

    /*
    Notes: Window Type, Window Style, Window Color,
    Window Quantity and (Quantity of each), Window Glass Type,
    */
    public class Window {
        // Fields
        private String style;
        private String color;
        private String frameMaterial;
        private String frameColor;
        private String gridPattern;
        private String tint;

        // Constructor
        public Window() {
            // Initialize fields to a default value or leave them empty
        }

        // Methods for Window Style
        public void selectStyle(String style) {
            // Set the selected window style
            this.style = style;
        }


        // Methods for Window Frame Design Options
        public void selectFrameMaterial(String material) {
            // Set the selected window frame material
            this.frameMaterial = material;
        }

        // Methods for Window Frame Color
        public void selectFrameColor(String color) {
            // Set the selected window frame color
            this.frameColor = color;
        }

        // Methods for Window Grid Pattern
        public void selectGridPattern(String pattern) {
            // Set the selected window grid pattern
            this.gridPattern = pattern;
        }

        // Methods for Window Tint
        public void selectTint(String tint) {
            // Set the selected window tint
            this.tint = tint;
        }

        // Getters for Window Details
        public String getStyle() {
            return style;
        }


        public String getFrameMaterial() {
            return frameMaterial;
        }

        public String getFrameColor() {
            return frameColor;
        }

        public String getTint() {
            return tint;
        }
    }

}
