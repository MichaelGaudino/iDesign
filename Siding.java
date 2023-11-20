public class Siding {
    public class SidingDesign {
        // Fields
        private String material;
        private String color;
        private String brickCut;

        private String[] availableSidingOptions;

        // Constructor
        public SidingDesign() {
            // Initialize fields to default values or leave them empty
        }

        // Methods for Siding Material
        public void selectMaterial(String material) {
            // Set the selected siding material
            this.material = material;
        }

        // Methods for Siding Color
        public void selectColor(String color) {
            // Set the selected siding color
            this.color = color;
        }

        // Methods for Siding Brick Cut
        public void selectBrickCut(String brickCut) {
            // Set the selected siding brick cut
            this.brickCut = brickCut;
        }

        // Getters for Siding Details
        public String getMaterial() {
            return material;
        }

        public String getColor() {
            return color;
        }

        public String getBrickCut() {
            return brickCut;
        }
    }


}
