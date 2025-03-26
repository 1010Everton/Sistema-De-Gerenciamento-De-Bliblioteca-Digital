package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.Bibliotecas.Livros;

import java.util.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("digite o nome do livro : ");
        String nome = scan.nextLine();
        System.out.print("digite o nome do autor : ");
        String autor = scan.nextLine();
        System.out.print("digite o resumo : ");
        String resumo = scan.nextLine();


        Livros livro = new Livros(nome,autor,resumo);
        EntityManagerFactory em = Persistence.createEntityManagerFactory("produtos");
        EntityManager emf = em.createEntityManager();


        emf.getTransaction().begin();
        emf.persist(livro);
        emf.getTransaction().commit();
        emf.close();
        em.close();



    }
}