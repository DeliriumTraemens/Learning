package graph.it_fun;

public class Graph {
    private int maxN = 10; // Amount of Vertex
    private int[][] mas;  // Adjacency matrix
    Vertex[] vertexList;
    private int curN; //Current Vertex number
    private MyStack stack = new MyStack();

    public Graph() {
        vertexList = new Vertex[maxN];
        mas = new int[maxN][maxN];
        curN = 0;
    }

    public void addVertex(char name) {
        vertexList[curN++] = new Vertex(name);
    }

    public void addEdge(int start, int end, int val) {
        mas[start][end] = 1;
        mas[end][start] = val;
    }

    public int check(int v) {
        for (int i = 0; i < curN; i++) {
            //если есть связь (1) и извизитед == false те не посещена
            if (mas[v][i] == 1 && vertexList[i].isVisited == false) {
                return i; // Это и есть искомая непосещенная вершина
            }
        }
        return -1;//
    }

    public void passInDeep(int index) {
        System.out.println(vertexList[index].name);
        vertexList[index].isVisited = true; // Отметили посещение
        stack.push(index); // Pushed into Stack
            System.out.println("stack pushed " + stack.toString());

        while (!stack.isEmpty()) {
            int neigh = check(stack.peek());
            System.out.println("stack peeked " + stack.toString());
            if (neigh == -1) {
                neigh = stack.pop();
            System.out.println("stack poped " + stack.toString());
            } else {
                System.out.println(vertexList[neigh].name);
                vertexList[neigh].isVisited = true; // Отметили посещение
                stack.push(neigh); // Pushed into Stack
            }
        }
        for (int i = 0; i < curN ; i++) {
            vertexList[i].isVisited = false;
        }
    }

    public int[][] getMas() {
        return mas;
    }

    public Vertex[] getVertexList() {
        return vertexList;
    }
}
