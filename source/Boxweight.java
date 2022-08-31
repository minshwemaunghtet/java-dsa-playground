package source;


public class Boxweight extends Box
{
    double weight;
    
    public Boxweight(double we)
    {
        this.weight = we;
    }

    public Boxweight(double l,double h,double w, double we)
    {
        super(l,h,w);
        this.weight = we;

    }
    
    

    
    
}