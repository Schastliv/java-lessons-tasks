public abstract class Figure {
    float x;
    float y;
    float radius;
    Figure () {

    }
    Figure (float x, float y) {
        this.x = x;
        this.y = y;
        this.radius = radius;

    }
    abstract  public float getSquare ();
    abstract public float getPerimeterTet ();

}
