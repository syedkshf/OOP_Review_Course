public class Square extends Shape{
    double side;

    public Square(double side, String name)
    {
        super(name);
        this.side=side;

    }


    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return this.side * 4;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return this.name.equals(square.name) && this.side==square.side;
    }

    @Override
    public String toString()
    {
        return this.name + ":" + this.side;
    }
}