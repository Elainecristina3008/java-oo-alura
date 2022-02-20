package com.general;

public class GeneralTest {

    public static void main(String[] args) {

        Address address1 = new Address();
        address1.publicplace = "Rua Salvatore";
        address1.number = 104;
        address1.district = "Bairro de Salvador";
        address1.complement = "Em frente do Prassaí";
        address1.city = "Salvador";
        address1.zipCode = "41.000-000";

        Company company = new Company();
        company.razaoSocial = "NCK Gestão da Informação";
        company.cnpj = "12.345.678/0001-11";
        company.address = address1;



        Person person = new Person();
        person.name = "Elaine Cristina";
        person.ages = 35;
        person.cpf = "123.456.789-10";
        person.work = "Systems Analist";
        person.employee = company;
        person.address = address1;


        System.out.println("My name is: " + person.name);
        System.out.println("I'm  " + person.ages + " years old");
        System.out.println("This is my CPF: " + person.cpf);
        System.out.println("I am " + person.work);
        System.out.println();



        System.out.println("I'm a " + person.work + " at the Company " + person.employee.razaoSocial);
        System.out.println("The company address is " + company.address.publicplace);
        System.out.println("My address is " + person.address.publicplace + " too.");


    }
}
