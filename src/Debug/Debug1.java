package Debug;

public class Debug1 {

        private int width;
        private int length;
        private int height;
        public Debug1()
        {
            length = 1;
            width = 1;
            height = 1;
        }
        public Debug1(int width, int height)
        {
            this.width = width;
            this.length = length;
            this.height = height;
        }
        public void showData()
        {
            System.out.println("Width: "  + width + "  Length: " + length + "  Height: " + height);
        }
        public double getVolume() {
            double vol = length * width * height;

            return vol;

        }

}
