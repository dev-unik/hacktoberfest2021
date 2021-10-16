#include<iostream.h>
# include<conio.h>

class Point
{
private:
    int x, y;

    // Default constructor

    public:

    Point()
     {
       x=30;
       y=40;
     }

    // Parameterized Constructor

    Point(int x1, int y1)
     {
       x = x1;
       y = y1;
     }

    // Copy constructor

    Point(Point &p)
    {
      x = p.x;
      y = p.y;
    }

    int getX()
     {
       return x;
     }
    int getY()
     {
       return y;
     }
};

int main()
{
    clrscr();
    Point p1;  // default constructor is called here
    Point p2(10, 15); // parameterized constructor is called here
    Point p3 = p1; // Copy constructor is called here

    // Let us access values assigned by constructors
    cout << "\np1.x = " << p1.getX() << ", p1.y = " << p1.getY(); // 30, 40
    cout << "\np2.x = " << p2.getX() << ", p2.y = " << p2.getY(); // 10, 15
    cout << "\np3.x = " << p3.getX() << ", p3.y = " << p3.getY(); // 30, 40

    return 0;
}
