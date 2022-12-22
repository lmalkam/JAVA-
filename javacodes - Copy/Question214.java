class Rectangle {
    int length;
    int breadth;

    Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    void printPerimeter() {
        System.out.println((length + breadth) *2);
    }

    void printArea() {
        System.out.println(length*breadth);
    }

}

class Question214 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 5);
        r.printArea();
        r.printPerimeter();
    }
}