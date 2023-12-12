import java.util.ArrayList;
import java.util.HashMap;

class Tarefa {
    String descricao;
    int prioridade;
    // Outras informações da tarefa, se necessário

    public Tarefa(String descricao, int prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
    }
}

class ListaDeTarefas {
    ArrayList<Tarefa> tarefas;
    HashMap<String, Tarefa> hashTarefas;

    public ListaDeTarefas() {
        tarefas = new ArrayList<>();
        hashTarefas = new HashMap<>();
    }

    public void adicionarTarefa(String descricao, int prioridade) {
        Tarefa novaTarefa = new Tarefa(descricao, prioridade);
        tarefas.add(novaTarefa);

        // Ordenar por prioridade usando Insertion Sort
        int index = tarefas.size() - 1;
        while (index > 0 && tarefas.get(index - 1).prioridade > novaTarefa.prioridade) {
            tarefas.set(index, tarefas.get(index - 1));
            index--;
        }
        tarefas.set(index, novaTarefa);

        // Adicionar à tabela hash
        hashTarefas.put(descricao, novaTarefa);
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaRemovida = hashTarefas.get(descricao);
        if (tarefaRemovida != null) {
            tarefas.remove(tarefaRemovida);
            hashTarefas.remove(descricao);
        }
    }

    public void listarTarefas() {
        for (Tarefa tarefa : tarefas) {
            System.out.println("Descrição: " + tarefa.descricao + ", Prioridade: " + tarefa.prioridade);
        }
    }

}


