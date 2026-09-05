package Array;

import Array.classes.Cliente;
import Array.classes.Conta;
import java.util.ArrayList;

public class MainArray {

    public static void main(String[] args) {
    
        Cliente novo = new Cliente();
        novo.setNome("bella");
        novo.setTelefone(123445665);
        novo.setCpf("1234554");
        novo.setContas(new ArrayList<>());

        Conta principal = new Conta();
        principal.setAgencia(4040);
        principal.setNumeroConta(1234567898);
        principal.setSaldo(50000);
        novo.getContas().add(principal);

        Conta secundaria = new Conta();
        secundaria.setAgencia(2020);
        secundaria.setNumeroConta(98765432);
        secundaria.setSaldo(1000);
        novo.getContas().add(secundaria);

        System.out.println(novo.getContas().get(0).getAgencia());

        for (int i = 0; i < novo.getContas().size(); i++) {
            System.out.println(novo.getContas().get(i).getAgencia());
        }

    }
}