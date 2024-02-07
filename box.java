class box {
    int length, breadth, height;

    // Parameterized constructor
    box(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    // Method to display the volume of the box
    void displayVolume() {
        int volume = length * breadth * height;
        System.out.println("Volume: " + volume);
    }

    public static void main(String args[]) {
        // Creating an object of Box class with parameterized constructor
        box myBox = new box(2, 3, 4);

        // Displaying the volume of the box
        myBox.displayVolume();
    }
}
