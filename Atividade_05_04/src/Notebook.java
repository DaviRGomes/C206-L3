public class Notebook extends Produto {

    // variaveis
    private double armazenamento;
    private String gpu;
    private String processador;

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    @Override
    public String etiquetaPreco() {
        super.etiquetaPreco();
        System.out.println("Armazenamento: " + armazenamento);
        System.out.println("Gpu: " + gpu);
        System.out.println("Processador: " + processador);
        System.out.println();
        return gpu;
    }
}
