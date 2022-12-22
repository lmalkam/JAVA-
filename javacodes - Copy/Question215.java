class Rectangle {
    int length;
    int breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void Perimeter() {
        System.out.println(2 * (length + breadth));
    }

    void Area() {
        System.out.println(length * breadth);
    }

}

class Square extends Rectangle {
    int side;

    public Square(int s) {
        super(s, s);
    }
}

class Question215 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 5);
        r.Area();
        r.Perimeter();

        Square s = new Square(4);
        s.Area();
        s.Perimeter();

        Square[] a = new Square[10];
        int x = 5;
        for (int i = 0; i < 10; i++) {
            a[i] = new Square(x);
            x++;
        }

        for (int i = 0; i < 10; i++) {
            a[i].Area();
            a[i].Perimeter();
        }
    }
}