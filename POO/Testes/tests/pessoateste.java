import static org.junit.Assert.assertEquals;
import org.junit.Tests;
import models.Pessoa;

public class pessoateste {
    Pessoa pessoa = new Pessoa();
    pessoa.setNome("Joao");
    pessoa.setIdade(15);
    assertEquals("Joao", pessoa.getNome());
    assertEquals(15, pessoa.getIdade());
}

@Test(expected = IllegalArgumentException.class)

public class testNomePessoa {
    Pessoa pessoa = new Pessoa();
    pessoa.setNome("M");
    pessoa.setIdade(35);
    assertEquals("M", pessoa.getNome());
    assertEquals(35, pessoa.getIdade());
}
