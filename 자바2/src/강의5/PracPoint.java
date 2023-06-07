package 강의5;

import java.util.Objects;

public class PracPoint {

	int x;
	int y;
	int z;
	
	PracPoint(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public String toString()
	{
		return "x: " + x + " y: " + y + " z: " + z;
	}

	public boolean equals(PracPoint point) {
		if (this == point)
			return true;
		if (point == null)
			return false;
		if (getClass() != point.getClass())
			return false;
		PracPoint other = (PracPoint) point;
		return x == other.x && y == other.y && z == other.z;
	}
	
	
	
}
