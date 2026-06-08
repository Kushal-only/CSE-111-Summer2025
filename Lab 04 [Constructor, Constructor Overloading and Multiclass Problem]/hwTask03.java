//Task3
public class Triangle {
  int a,b,c;
  int perimeter;
  public Triangle(int s1,int s2,int s3) {
    a = s1;
    b = s2;
    c = s3;
    perimeter = a+b+c;
  }
  public void triangleDetails() {
    System.out.println("Three sides of the triangle are: " + a + ", " + b + ", " + c);
    System.out.println("Perimeter:" + perimeter);
  }
  public String printTriangleType() { 
    if(a==b && b==c) {
      return "This is an Equilateral Triangle.";
    }
    else if(a==b || a==c || b==c) {
      return "This is a Isoceles Triangle.";
    }
    else {
      return "This is a Scalene Triangle.";
    }
  }
  public void compareTriangles(Triangle a) {
    if(this!=a) {
      if(this.a==a.a && this.b==a.b && this.c==a.c) {
        System.out.println("Addresses are different but the sides of the triangles are equal.");
      }
      else {
        if(this.perimeter==a.perimeter) {
          System.out.println("Only the perimeter of both triangles is equal.");
        }
        else {
          System.out.println("Addresses, length of the sides and perimeter all are different.");
        }
      }
    }
    else {
      System.out.println("These two triangle objects have the same address.");
    }
  }
}
     
      
      
      
      
      
      
      
      
      
      
      
      
      
      