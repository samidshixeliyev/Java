package quiz4;

public class ShapeFactory {
    public static Shape makeShape(String shapeType) {
        if (shapeType == null) {
            throw new IllegalArgumentException("Shape type cannot be null");
        }
        return switch (shapeType.trim().toLowerCase()) {
            case "circle" -> new Circle();
            case "rectangle" -> new Rectangle();
            default -> throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        };
    }
}
