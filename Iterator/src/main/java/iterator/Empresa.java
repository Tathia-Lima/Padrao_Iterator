package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Empresa implements Iterable<Funcionario>{

    private List<Funcionario> Funcionarios = new ArrayList<Funcionario>();

    public Empresa(Funcionario... Funcionarios) {
        this.Funcionarios = Arrays.asList(Funcionarios);
    }

    @Override
    public Iterator<Funcionario> iterator() {
        return Funcionarios.iterator();
    }

}
