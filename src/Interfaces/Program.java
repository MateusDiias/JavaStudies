//Uma empresa deseja automatizar o processamento de seus contratos. O processamento deum contrato consiste em gerar as parcelas a serem pagas para aquele contrato, com base nonúmero de meses desejado.
//A empresa utiliza um serviço de pagamento online para realizar o pagamento das parcelas.Os serviços de pagamento online tipicamente cobram um juro mensal, bem como uma taxapor pagamento. Por enquanto, o serviço contratado pela empresa é o do Paypal, que aplicajuros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%.
//Fazer um programa para ler os dados de um contrato (número do contrato, data do contrato,e valor total do contrato). Em seguida, o programa deve ler o número de meses paraparcelamento do contrato, e daí gerar os registros de parcelas a serem pagas (data e valor),sendo a primeira parcela a ser paga um mês após a data do contrato, a segunda parcela doismeses após o contrato e assim por diante. Mostrar os dados das parcelas na tela.

package Interfaces;

import Interfaces.Model.Entities.Contract;
import Interfaces.Model.Entities.Installment;
import Interfaces.Model.Service.ContractService;
import Interfaces.Model.Service.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Enter with the contract data:");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Contract value: ");
        double value = sc.nextDouble();
        Contract contract = new Contract(number, date, value);

        System.out.print("Number of installments: ");
        int installments = sc.nextInt();

        ContractService service = new ContractService(new PaypalService());
        service.processContract(contract, installments);

        System.out.println("Installments: ");

        System.out.println(contract);


        sc.close();
    }
}
