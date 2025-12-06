package job.marcelojunior.estruturas;

import job.marcelojunior.auxs.Telefone;

import java.util.Arrays;

public class ListaDeTelefonesNaoOrdenados {

    //Vetor de telefones onde criaremos a nossa lista
    private Telefone[] telefones;
    //Controlar o tamanho da lista - O QUANTO EU JÁ GUARDEI
    private int tamanhoLista;
    //Capacidade inicial de 3 elementos (pode ser alterada depois) - O QUANTO EU POSSO GUARDAR
    public static final int CAPACIDADE_PADRAO = 2;
    //Nosso código robusto para garantir capacidade
    private int capacidadePadrao = CAPACIDADE_PADRAO;

    public int getCapacidadeInicial() {
        return capacidadePadrao;
    }

    //Construtor da Lista
    public ListaDeTelefonesNaoOrdenados() {
        this.telefones = new Telefone[CAPACIDADE_PADRAO];
        this.tamanhoLista = 0;
    }

    public boolean isEmpty() {
        return tamanhoLista == 0;
    }

    public boolean isFull() {
        return tamanhoLista == CAPACIDADE_PADRAO + 1;
    }

    public void adicionarTelefone(Telefone telefone) {
        //Verificar length em tempo real a capacidade "atual" da lista
        if (this.tamanhoLista <= CAPACIDADE_PADRAO) {
            //tamanho é o "index+1", usar o tamanho para adicionar
            this.telefones[this.tamanhoLista] = telefone;
            //incrementa o tamanho
            this.tamanhoLista++;
        } else {
            System.out.println("Lista cheia! Não é possível adicionar mais telefones.");
        }
    }

    public void removerTelefone(Telefone telefone) {
        int indice = buscarTelefoneIndex(telefone);
        if (indice != -1) {
            // Deslocar os elementos para a esquerda para sobrescrever o telefone removido
            for (int i = indice; i < this.tamanhoLista - 1; i++) {
                this.telefones[i] = this.telefones[i + 1];
            }
            //Reduzir o tamanho da lista
            this.tamanhoLista = tamanhoLista - 1;
            telefones[tamanhoLista] = null; // Limpa o último elemento
            System.out.println("Telefone removido com sucesso.");
        }else{
            System.out.println("Não foi possível remover o telefone.");
        }
    }

    //Procurar o index do telefone no VETOR
    private int buscarTelefoneIndex(Telefone telefone) {
        for (int i = 0; i < this.tamanhoLista; i++) {
            //validar s eo telefone existe
            if (this.telefones[i].equals(telefone)) {
                return i; // Retorna o índice se encontrar o telefone
            }
        }
        System.out.println("Telefone não encontrado na lista.");
        return -1; // Retorna -1 se o telefone não for encontrado
    }


    @Override
    public String toString() {
        return Arrays.toString(telefones);
    }
}