package 강의5;

public class Point {
	int x;
	int y;
	int z;

	Point(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public String toString()
	{
		return "x : " + x + "\ty : " + y + "\tz : " + z;  
	}
	
	public boolean equals(Object obj)
	{
		Point other = (Point) obj;
	    if (x != other.x || y != other.y || z != other.z) {
	        return false;
	    }
		
		return true;
				
	}
}

/* 
  if(obj instancof Point)
  
  {
  	Point p = (Point)obj;
  	return x==p.x && x==p.y && x==p.z;
  }
  	return false;
  	
  	
  	if(obj instancof Point)
  
  {
  	Point p = (Point)obj;
  	
  	return this.toString().equals(p.toString());
  	}
  	return false;
  	
  	
   
 */
