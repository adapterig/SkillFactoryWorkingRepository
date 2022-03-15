package module3;

public class LimitingRectangle {
    int[][] points;

    public LimitingRectangle(int[][] points) {
        this.points = points;
    }

    int getWidth() {
        int maxX = points[0][0], minX = points[0][0];
        for (int[] coords : points) {
            maxX = maxX > coords[0] ? maxX : coords[0];
            minX = minX < coords[0] ? minX : coords[0];
        }
        return maxX - minX;
    }

    int getHeight() {
        int maxY = points[0][1], minY = points[0][1];
        for (int[] coords : points) {
            maxY = maxY > coords[1] ? maxY : coords[1];
            minY = minY < coords[1] ? minY : coords[1];
        }
        return maxY - minY;
    }

    String getBorders() {
        int maxX = points[0][0], maxY = points[0][1], minX = points[0][0], minY = points[0][1];
        for (int[] coords : points) {
            maxX = maxX > coords[0] ? maxX : coords[0];
            minX = minX < coords[0] ? minX : coords[0];
            maxY = maxY > coords[1] ? maxY : coords[1];
            minY = minY < coords[1] ? minY : coords[1];
        }
        return minY + ", " + maxY + ", " + minX + ", " + maxX;
    }
}
