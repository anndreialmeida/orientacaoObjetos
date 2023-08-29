public class Triangulo {

    private float x;
    private float y;
    private float z;
    private float propriedadeTriangulo;

    public Triangulo(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        if ((this.x == this.y) && (this.y == this.z) && (this.x == this.z)) {
            return "Triângulo Equilatero";
        }

        if ((this.x != this.y) && (this.y != this.z) && (this.x != this.z)){
            return "Triângulo Escaleno";
        }

        if(((this.x==this.y) && (this.y!=this.z)) || ((this.y==this.z) && (this.z!=this.x)) || (this.x == this.z) && (this.z != this.y)){
            return "Triângulo Isóceles";
        }

        return "Não é um triângulo";
    }
}
