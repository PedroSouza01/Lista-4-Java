public class Ponto {
    private double x;
    private double y;

    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distancia(Ponto outro) {
        return Math.sqrt(Math.pow(outro.getX() - this.x, 2) + Math.pow(outro.getY() - this.y, 2));
    }

    public double distancia(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

    public static void main(String[] args) {

        Ponto ponto1 = new Ponto();

        Ponto ponto2 = new Ponto(2, 5);

        double distancia1 = ponto1.distancia(ponto2);
        System.out.println("Distância do ponto1 ao ponto2: " + distancia1);

        double distancia2 = ponto2.distancia(7, 2);
        System.out.println("Distância do ponto2 às coordenadas (7, 2): " + distancia2);

        ponto1.setX(10);

        ponto1.setY(3);

        System.out.println("Novo valor de x no ponto1: " + ponto1.getX());
        System.out.println("Novo valor de y no ponto1: " + ponto1.getY());
  }
}