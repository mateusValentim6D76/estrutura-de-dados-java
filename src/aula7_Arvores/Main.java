package aula7_Arvores;


import aula7_Arvores.model.Obj;

public class Main {

    public static void main(String[] args) {
        ArvoreBinaria<Obj> minhaArvoreBinaria = new ArvoreBinaria<Obj>();

        minhaArvoreBinaria.inserir(new Obj(13));
        minhaArvoreBinaria.inserir(new Obj(10));
        minhaArvoreBinaria.inserir(new Obj(25));
        minhaArvoreBinaria.inserir(new Obj(2));
        minhaArvoreBinaria.inserir(new Obj(12));
        minhaArvoreBinaria.inserir(new Obj(20));
        minhaArvoreBinaria.inserir(new Obj(31));
        minhaArvoreBinaria.inserir(new Obj(29));

        minhaArvoreBinaria.exibirInOrdem();
        minhaArvoreBinaria.exibirPreOrdem();
        minhaArvoreBinaria.exibirPosOrdem();
    }
}
