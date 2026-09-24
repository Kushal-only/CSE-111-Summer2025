//Task 05
class ComplexNumber extends RealNumber {
  double imaginary;
  public ComplexNumber() {
    super(1.0);
    imaginary = 1.0;
  }
  public ComplexNumber(double r,double i) {
    realValue = r;
    imaginary = i;
  }
  public String toString() {
    return String.format("RealPart: %s, ImaginaryPart: %s", realValue, imaginary);
  }
}