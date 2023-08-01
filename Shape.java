// Интерфейс для геометрических фигур
package HW4;

interface Shape {
    /**
     * Вычисляет площадь фигуры.
     *
     * @return Площадь фигуры.
     */
    double getArea();
    /**
     * Вычисляет периметр фигуры.
     *
     * @return Периметр фигуры.
     */
    double getPerimeter();
}