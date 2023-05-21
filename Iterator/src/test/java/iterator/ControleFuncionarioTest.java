package iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControleFuncionarioTest {

    @Test
    void deveContarFuncionariosAtivosEmpresa() {
        Empresa Empresa = new Empresa(
                new Funcionario("Erik", true),
                new Funcionario("Tathia", true),
                new Funcionario("Luiza", false),
                new Funcionario("Ana", true)
        );
        assertEquals(3, ControleFuncionario.contarFuncionariosAtivosEmpresa(Empresa));
    }

    @Test
    void deveContarTotalFuncionariosEmpresa() {
        Empresa Empresa = new Empresa(
                new Funcionario("Erik", true),
                new Funcionario("Tathia", true),
                new Funcionario("Luiza", false),
                new Funcionario("Ana", true)
        );
        assertEquals(4, ControleFuncionario.contarTotalFuncionariosEmpresa(Empresa));
    }

}