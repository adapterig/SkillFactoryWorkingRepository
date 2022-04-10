package module9.task6;

public class Vector3D extends Vector {

    public Vector3D(int x1, int y1, int z1, int x2, int y2, int z2) {
        super(x1, y1, z1, x2, y2, z2);
    }

    @Override
    public double getLength() {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) + Math.pow(z1 - z2, 2));
    }

    @Override
    public String getVectorCords() {
        return (x2 - x1) + " " + (y2 - y1) + " " + (z2 - z1);
    }

    public double getScalarProduct(Vector3D vector) {
        return (x1 - x2) * (vector.x1 - vector.x2) + (y1 - y2) * (vector.y1 - vector.y2) +
                (z1 - z2) * (vector.z1 - vector.z2);
    }
}
