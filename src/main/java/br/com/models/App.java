package br.com.models;



import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.senai.enuns.Estado;
import br.com.senai.enuns.Genero;


public class App 
{
    public static void main( String[] args )
    {

        Endereco endereco = new Endereco();
        endereco.cep = "64000000";
        endereco.logradouro = "Rua Porto, 3555";
        endereco.cidade = "Teresina";
        endereco.estado = Estado.PI;

        Candidato joaneBorges = new Candidato();
       joaneBorges.nomeCompleto = "Joane Borges Silva Sousa";
       joaneBorges.dataNascimento = LocalDate.of(2000, 10, 16);
        joaneBorges.email = "joaneborges@gmail.com";
        joaneBorges.genero = Genero.F;
        joaneBorges.naturalidade = Estado.PI.toString();
        joaneBorges.nacionalidade = "Brasil";
        joaneBorges.endereco = endereco;

        Escolaridade e1 = new Escolaridade();
        e1.nomeCurso = "Sistema para Internet";
        e1.nomeInstituicao = "Senai";
        e1.dataInicio = LocalDate.of(2022, 10, 01);
        e1.dataFim = LocalDate.of(2023, 06, 10);

        Escolaridade e2 = new Escolaridade();
        e2.nomeCurso = "Engenharia Civil";
        e2.nomeInstituicao = "IFPI - Inst. Federal do Piauí";
        e2.dataInicio = LocalDate.of(2020, 02, 01);
        e2.dataFim = LocalDate.of(2023, 06, 10);

        // List<Escolaridade> list = new ArrayList<>();
        // list.add(e1);
        // list.add(e2);

        joaneBorges.escolaridades = Arrays.asList(e1,e2);

        System.out.println("Nome Completo "+joaneBorges.nomeCompleto);
        System.out.println("Idade: "+ Period.between(joaneBorges.dataNascimento, 
            LocalDate.now()).getYears());
        System.out.println("Endereço:" + joaneBorges.endereco.logradouro);

        for (Escolaridade escolaridade : joaneBorges.escolaridades) {
            System.out.println(escolaridade.nomeCurso+" - "+escolaridade.nomeInstituicao);
        }

    }
}