import java.util.*;

class Coordinates {
    int x;
    int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Coordinates> coordinates = new ArrayList<>();

        for(int i=0; i<N; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            coordinates.add(new Coordinates(x, y));
        }

        Collections.sort(coordinates, new Comparator<Coordinates>() {
            @Override
            public int compare(Coordinates c1, Coordinates c2) {
                if(c1.y == c2.y){
                    return c1.x - c2.x;
                }
                return c1.y - c2.y;
            }
        });

        for(Coordinates coordinate: coordinates){
            System.out.println(coordinate.x + " " + coordinate.y);
        }
    }
}
