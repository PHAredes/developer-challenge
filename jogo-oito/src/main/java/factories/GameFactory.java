package factories;

import interfaces.Edge;
import interfaces.Vertex;
import model.Row;

public interface GameFactory {

    Vertex createCell();

    Edge createAdjacentUp(Vertex cell);
    Edge createAdjacentDown(Vertex cell);
    Edge createAdjacentLeft(Vertex cell);
    Edge createAdjacentRight(Vertex cell);

    Row createRow();

}