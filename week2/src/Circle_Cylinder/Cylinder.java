package Circle_Cylinder;

    public class Cylinder extends Circle {
        private double height = 1;

        public Cylinder() {
        }

        public Cylinder(double height) {
            super();
            this.height = height;
        }

        public Cylinder(double radius, String color, double height) {
            super(radius, color);
            this.height = height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getHeight() {
            return height;
        }

        public double getVolume() {
            return PI * Math.pow(this.getRadius(), 2) * height;
        }

        @Override
        public String toString() {
            return "Cylinder: " +
                    "height=" + height +
                    " which is the subclass " +
                    super.toString();
        }
    }