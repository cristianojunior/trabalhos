package dao.o;

import java.util.List;

import com.db4o.ObjectSet;

import entidade.Pessoa;

public class PessoaDao extends Dao<Pessoa> {

    @Override
    public void criar(Pessoa object) {
        objectContainer.store(object);

    }

    @Override
    public Pessoa ler(Pessoa object) {
        ObjectSet<Pessoa> pessoas = objectContainer. //
                queryByExample(object);

        Pessoa pessoa = null;
        if (pessoas.size() > 0) {
            pessoa = pessoas.get(0);
        }
        System.out.println("nome = " + object.getNome() + " ID = " + object.getId());
        return pessoa;
    }

    public Pessoa ler(Integer id) {
        Pessoa pessoa = new Pessoa();
        pessoa.setId(id);
        return ler(pessoa);
    }

    @Override
    public List<Pessoa> lerTudo() {
        ObjectSet<Pessoa> pessoas = objectContainer. //
                queryByExample(new Pessoa());
        while (pessoas.hasNext()) {
            System.out.println(pessoas.next().getNome());
        }
        return pessoas;
    }

    @Override
    public void atualizar(Pessoa object) {
        // objectContainer.store(object);
        criar(object);
    }

    @Override
    public void excluir(Pessoa object) {
        System.out.println("Excluido " + object.getNome());
        objectContainer.delete(object);
        System.out.println("Excluido com sucesso");
        lerTudo();
    }
    
    public void deleteAll(){
        ObjectSet<Pessoa> pessoas = objectContainer. //
                queryByExample(new Pessoa());
        while(pessoas.hasNext()){
            System.out.println("Deletando  " + pessoas.next().getNome());
            objectContainer.delete(pessoas);
        }
        lerTudo();
        
    }
}

