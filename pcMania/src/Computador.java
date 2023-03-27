public class Computador {
    String marca;
    float preco;
    // agregação
    MemoriaUSB memoria;
    // composição
    SistemaOperacional system = new SistemaOperacional();
    HardwareBasico hardware[] = new HardwareBasico[3];
    String system_nome = system.nome;
    int system_tipo = system.tipo;

    public Computador(String marca, float preco, String system_nome, int system_tipo,  float capacidadeRAM, String HD, float capacidadeHD, String processador, float capacidadeProcessador) {
        this.marca = marca;
        this.preco = preco;
        this.system_nome = system_nome;
        this.system_tipo = system_tipo;
        hardware[1] = new HardwareBasico(" Gb de Memoria RAM", capacidadeRAM);
        hardware[2] = new HardwareBasico(HD, capacidadeHD);
        hardware[0] = new HardwareBasico(processador, capacidadeProcessador);
    }

    public void mostraPCConfigs() {

        System.out.println("Marca: " + marca);
        System.out.println("Preco: R$ " + preco);
        System.out.println(hardware[0].nome + "(" + hardware[0].capacidade + " Mhz)");
        System.out.println(hardware[1].capacidade + hardware[1].nome);
        System.out.println(hardware[2].capacidade + hardware[2].nome);
        System.out.println("Sitema Operacional " + system_nome + " (" + system_tipo + " bits)");
        System.out.println("Acompanha " + memoria.nome + " capacidade: " + memoria.capacidade);
        System.out.println();
    }

    public void addMemoria(MemoriaUSB musb) {
        memoria = musb;
    }
}
