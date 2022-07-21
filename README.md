## JMath

A library I'm developing for personal use, to make certain math operations easier in any future graphics/scientific projects I do.

### Features
#### Vector declaration and functions:
```java
Vector3 u = new Vector3(); // creates a 3D vector with values 0, 0, 0
Vector3 v = new Vector3(u); // creates a 3D vector with values of u.x, u.y, u.z

Vector3 w = new Vector3(1, 2, 3);

// Local and Static functions
double dot = w.dot(v);
double dot2 = Vector3.dot(w, v); 
```
#### Matrix declaration and functions:
```java
Vector2 v = new Vector2(1, 2, 3);
Matrix2 T = new Matrix2(
    3, 2,
    1, 6
);
T.transpose();
Vector2 transformedV = Vector2.transform(T, v); // returns a new vector

Matrix3 A = new Matrix3(); // creates a 3x3 Identity matrix
```
#### Trigonometry
```java
// Using Trig.PI
double areaOfCircle(double radius) {
    return 2 * Trig.PI * radius;
}

double angle = Trig.PI / 2.0;
double angle2 = 60;

double angleToDeg = angle * Trig.RAD_TO_DEG;
double angle2ToRad = angle2 * Trig.DEG_TO_RAD;

double result = Trig.sin(angle);
```

#### Other Utilities
``` java
double five = Utils.sqrt(25.0);
double inverseFive = Utils.invSqrt(25.0);

// returns 3 * 2 + 4
double num = Utils.fma(3, 2, 4); 
// returns 1 + (2-1) * 0.5
double lerped = Utils.lerp(1, 2, .5);
````