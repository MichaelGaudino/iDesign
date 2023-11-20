public class Exterior {

    public static class ExteriorDesign {
        // Fields
       private String roofingMaterial;
       private String sidingMaterial;
       private String sidingColor;
       private String frontDoorStyle;
       private String frontDoorColor;
       private String backDoorStyle;
       private String backDoorColor;
       private String windowStyle;
       private String windowColor;


        // Constructor
        public ExteriorDesign() {
            // Initialize fields to default values or leave them empty
        }

        // Getters for Exterior Design
        public String getRoofingMaterial() {
            return roofingMaterial;
        }

        public String getSidingMaterial() {
            return sidingMaterial;
        }

        public String getSidingColor() {
            return sidingColor;
        }

        public String getFrontDoorStyle() {
            return frontDoorStyle;
        }

        public String getFrontDoorColor() {
            return frontDoorColor;
        }

        public String getBackDoorStyle() {
            return backDoorStyle;
        }

        public String getBackDoorColor() {
            return backDoorColor;
        }

        public String getWindowStyle() {
            return windowStyle;
        }

        public String getWindowColor() {
            return windowColor;
        }

        // Methods for Roofing Material
        public void selectRoofingMaterial(String material) {
            // Set the selected roofing material
            this.roofingMaterial = material;
        }

        // Methods for Siding Material
        public void selectSidingMaterial(String material) {
            // Set the selected siding material
            this.sidingMaterial = material;
        }

        // Methods for Siding Color
        public void selectSidingColor(String color) {
            // Set the selected siding color
            this.sidingColor = color;
        }

        // Methods for Front Door
        public void selectFrontDoorStyle(String style) {
            // Set the selected front door style
            this.frontDoorStyle = style;
        }

        public void selectFrontDoorColor(String color) {
            // Set the selected front door color
            this.frontDoorColor = color;
        }

        // Methods for Back Door
        public void selectBackDoorStyle(String style) {
            // Set the selected back door style
            this.backDoorStyle = style;
        }

        public void selectBackDoorColor(String color) {
            // Set the selected back door color
            this.backDoorColor = color;
        }

        // Methods for Windows
        public void selectWindowStyle(String style) {
            // Set the selected window style
            this.windowStyle = style;
        }

        public void selectWindowColor(String color) {
            // Set the selected window color
            this.windowColor = color;
        }

        public void displayRoofingStyles() {
        }

        public void displaySidingStyles() {
        }

        public void displayDoorStyles() {
        }

        public void displayWindowStyles() {
        }

        public String[] getRoofingStyles() {
            return getRoofingStyles();
        }

        public String[] getSidingStyles() {
            return getSidingStyles();
        }

        public String[] getDoorStyles() {
            return getDoorStyles();
        }

        public String[] getWindowStyles() {
            return getWindowStyles();
        }
    }

}
