package J5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class KnightHop {
	public static int num = 0;
	public static int counter = 0;
	public static Set<Point> history= new HashSet<Point>(); 
	public static int findNumOfMoves(List<Point> points, Point destination){
		Set<Point> newPoints = new HashSet<Point>();
		points.removeAll(history);
		for(int i = 0; i<points.size(); i++){
			//if()
			int x = points.get(i).x;
			int y = points.get(i).y;
			if(x == destination.x && y == destination.y){
				//System.out.println(x + " " + y);
				return num;
			}else{
				history.addAll(points);
			}
			Point one = new Point(); one.x = x-1; one.y = y+2;
			Point two = new Point(); two.x = x+1; two.y = y+2;
			Point three = new Point(); three.x = x+2; three.y = y+1;
			Point four = new Point(); four.x = x+2; four.y = y-1;
			Point five = new Point(); five.x = x+1; five.y = y-2;
			Point six = new Point(); six.x = x-1; six.y = y-2;
			Point seven = new Point(); seven.x = x-2; seven.y = y-1;
			Point eight = new Point(); eight.x = x-2; eight.y = y+1;
			newPoints.add(one);
			newPoints.add(two);
			newPoints.add(three);
			newPoints.add(four);
			newPoints.add(five);
			newPoints.add(six);
			newPoints.add(seven);
			newPoints.add(eight);
			Iterator it = newPoints.iterator();
			while(it.hasNext()){
				Point p = (Point) it.next();
				if(p.x<1 || p.y<1 || p.x>8 || p.y>8){
					it.remove();
					System.out.println(newPoints.size() + "     " + p.x + " " + p.y);
				}
				
			}
			counter++;
		}
		
		num++;
		return findNumOfMoves(new ArrayList<Point>(newPoints), destination);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int startx = sc.nextInt();
		int starty = sc.nextInt();
		int endx = sc.nextInt();
		int endy = sc.nextInt();
		Point startingPoint = new Point();
		startingPoint.x = startx;
		startingPoint.y = starty;
		Point endingPoint = new Point();
		endingPoint.x =endx;
		endingPoint.y =endy;
		List<Point> initialPoint = new ArrayList<Point>();
		initialPoint.add(startingPoint);
		System.out.println(findNumOfMoves(initialPoint, endingPoint) + "   " + counter);
	}

}
 class Point{
	int x;
	int y;
    @Override
    public boolean equals(Object o) {
    	Point myPoint = (Point)o;
    	return myPoint.x==x && myPoint.y==y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
