package iterator;

import java.util.Iterator;

public class ControleFuncionario {

    public static Integer contarFuncionariosAtivosEmpresa(Empresa Empresa) {
        int quantidade = 0;
        for (Funcionario Funcionario : Empresa) {
            if (Funcionario.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalFuncionariosEmpresa(Empresa Empresa) {
        int quantidade = 0;
        for (Iterator a = Empresa.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
