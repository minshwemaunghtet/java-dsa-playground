package source;

public class Box
{
    double len;
    double hei;
    double wid;

    // Constructor 1 with no arguments
    Box()
    {
        this.len = 0;
        this.hei = 0;
        this.wid = -0;
    }

    // Constructor 2 with three arguments
    Box(double l,double h,double w)
    {
        this.len = l;
        this.hei = h;
        this.wid = w;
    }

    Box(Box oldObj)
    {
        this.len = oldObj.len;
        this.hei = oldObj.hei;
        this.wid = oldObj.wid;
    }
    
}