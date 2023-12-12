public class Main {
    public static void main(String[] args) {
        ListaDeTarefas lista = new ListaDeTarefas();

        lista.adicionarTarefa("Estudar algoritmos", 2);
        lista.adicionarTarefa("Fazer exercícios", 1);
        lista.adicionarTarefa("Projeto de programação", 3);
        lista.adicionarTarefa("Estudar para prova", 5);
        System.out.println("Lista de Tarefas:");
        lista.listarTarefas();

        lista.removerTarefa("Fazer exercícios");

        System.out.println("\nLista de Tarefas após remoção:");
        lista.listarTarefas();
    }
}