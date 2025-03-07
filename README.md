# Shape Calculator

## Description

The **Shape Calculator** is a Java-based application that calculates the **area, perimeter, and volume** of various **2D and 3D shapes**. It utilizes **Object-Oriented Programming (OOP) principles**, including **abstraction, inheritance, and interfaces**, for structured design.

### Features:
- **Supports 2D Shapes**: Triangle, Rectangle, Square, Circle
- **Supports 3D Shapes**: Cube, Sphere, Cylinder, Equilateral Pyramid
- **Interactive Menu**: Simple user-friendly interface

---

## Prerequisites

Ensure you have the following before running the program:
- **Java Development Kit (JDK) 8 or later**
- An IDE or text editor (e.g., IntelliJ IDEA, Eclipse, VS Code, Notepad++)
- Command-line or terminal access to compile and run Java programs

To check if Java is installed, run:
```sh
java -version
```

---

## Project Structure

### **1. Shape.java**
- Defines an abstract base class for all shapes.
- Contains common attributes and abstract methods.

### **2. VolumeInterface.java**
- Defines an interface for **3D shapes** to calculate volume.

### **3. Shape Implementations**
#### **2D Shapes**
- `Triangle.java` (extends Shape)
- `Rectangle.java` (extends Shape)
- `Square.java` (extends Shape)
- `Circle.java` (extends Shape)

#### **3D Shapes**
- `Cube.java` (extends Shape, implements VolumeInterface)
- `Sphere.java` (extends Shape, implements VolumeInterface)
- `Cylinder.java` (extends Shape, implements VolumeInterface)
- `EquilateralPyramid.java` (extends Shape, implements VolumeInterface)

### **4. Main.java**
- Provides a **menu-driven program** for user interaction.

---

## Classes & Methods Overview

### **Shape.java**
- `Shape()`: Default constructor initializing dimensions to zero.
- `Shape(double dim_one, double dim_two, double dim_three, int num_sides)`: Parameterized constructor.
- `calculateArea()`: Abstract method to calculate area.
- `calculatePerimeter()`: Abstract method to calculate perimeter.
- `getNumSides()`: Returns the number of sides.

### **VolumeInterface.java**
- `calculateVolume()`: Abstract method for volume computation (implemented by 3D shapes).

### **Shape Implementations**
#### **Triangle.java**
- `Triangle(double base, double height)`: Constructor initializes base and height.
- `calculateArea()`: Computes area as `0.5 * base * height`.
- `calculatePerimeter()`: Computes perimeter using the Pythagorean theorem.

#### **Rectangle.java**
- `Rectangle(double length, double breadth)`: Constructor initializes length and breadth.
- `calculateArea()`: Computes area as `length * breadth`.
- `calculatePerimeter()`: Computes perimeter as `2 * (length + breadth)`.

#### **Square.java**
- `Square(double side)`: Constructor initializes side.
- `calculateArea()`: Computes area as `side * side`.
- `calculatePerimeter()`: Computes perimeter as `4 * side`.

#### **Circle.java**
- `Circle(double radius)`: Constructor initializes radius.
- `calculateArea()`: Computes area as `π * radius²`.
- `calculatePerimeter()`: Computes circumference as `2 * π * radius`.

#### **Cube.java**
- `Cube(double side)`: Constructor initializes side.
- `calculateArea()`: Computes surface area as `6 * side²`.
- `calculatePerimeter()`: Computes perimeter as `12 * side`.
- `calculateVolume()`: Computes volume as `side³`.

#### **Sphere.java**
- `Sphere(double radius)`: Constructor initializes radius.
- `calculateArea()`: Computes surface area as `4 * π * radius²`.
- `calculatePerimeter()`: Computes circumference as `2 * π * radius`.
- `calculateVolume()`: Computes volume as `(4/3) * π * radius³`.

#### **Cylinder.java**
- `Cylinder(double radius, double height)`: Constructor initializes radius and height.
- `calculateArea()`: Computes surface area as `2 * π * radius * (radius + height)`.
- `calculatePerimeter()`: Computes perimeter as `2 * (2 * radius + height)`.
- `calculateVolume()`: Computes volume as `π * radius² * height`.

#### **EquilateralPyramid.java**
- `EquilateralPyramid(double side, double height)`: Constructor initializes side and height.
- `calculateArea()`: Computes surface area using pyramid formula.
- `calculatePerimeter()`: Computes perimeter as `4 * side`.
- `calculateVolume()`: Computes volume as `(1/3) * base_area * height`.

---

## Menu-Driven Program

Users can select a shape and perform calculations through an interactive menu.

### **Menu Options:**
- **1**: Compute area and perimeter of a Triangle.
- **2**: Compute area and perimeter of a Rectangle.
- **3**: Compute area, perimeter, and volume of a Cube.
- **4**: Compute area and perimeter of a Square.
- **5**: Compute area and perimeter of a Circle.
- **6**: Compute area, perimeter, and volume of a Sphere.
- **7**: Compute area, perimeter, and volume of a Cylinder.
- **8**: Compute area, perimeter, and volume of an Equilateral Pyramid.
- **9**: Exit the program.

---

## How to Run the Program

1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/Shape-Calculator.git
   cd Shape-Calculator
   ```
2. Compile the Java files:
   ```sh
   javac *.java
   ```
3. Run the program:
   ```sh
   java Main
   ```

---

## License
This project is open-source and available under the **MIT License**.

---

## Author
**Your Name**  
*Java Developer & OOP Enthusiast*

For contributions, feel free to submit a pull request! 🚀

