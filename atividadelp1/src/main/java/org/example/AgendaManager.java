package org.example;

import java.util.*;
import java.util.Scanner;

public class AgendaManager {
    private boolean isEnglish = true;
    private Scanner scanner = new Scanner(System.in);
    private Map<String, List<String>> agendaMap = new HashMap<>();

    public static void main(String[] args) {
        AgendaManager manager = new AgendaManager();
        manager.chooseLanguage();
        manager.start();
    }

    private void chooseLanguage() {
        System.out.println("_________________________________________________________________¬ ");
        System.out.println("Welcome to Calendar App/ Bem vindo ao Aplicativo De Agenda        |");
        System.out.println("Choose language / Escolha o idioma:                               |");
        System.out.println("1. English                                                        |");
        System.out.println("2. Português                                                      |");
        System.out.println("__________________________________________________________________");
        int langChoice = scanner.nextInt();
        scanner.nextLine();

        isEnglish = langChoice == 1;
    }

    private void start() {
        while (true) {
            System.out.println("\n" + (isEnglish ? "Choose an option:" : "Escolha uma opção:"));
            System.out.println("|_________________________________________________________________________¬");
            System.out.println("|  1. " + (isEnglish ? "schedule an event" : "Agendar um evento           "));
            System.out.println("|  2. " + (isEnglish ? "schedule a task" : "Agendar uma tarefa            "));
            System.out.println("|  3. " + (isEnglish ? "schedule a reminder" : "Agendar um lembrete       "));
            System.out.println("|  4. " + (isEnglish ? "View Items by Date" : "Visualizar itens por data  "));
            System.out.println("|  5. " + (isEnglish ? "Edit an Item" : "Editar um item                   "));
            System.out.println("|  6. " + (isEnglish ? "Exit" : "Sair                                     "));
            System.out.println("|_________________________________________________________________________");
            int option = scanner.nextInt();
            scanner.nextLine(); //

            switch (option) {
                case 1:
                    schedulEvent();
                    break;
                case 2:
                    scheduleTask();
                    break;
                case 3:
                    scheduReminder();
                    break;
                case 4:
                    viewItemsByDate();
                    break;
                case 5:
                    editItem();
                    break;
                case 6:
                    exit();
                    break;

                default:
                    System.out.println((isEnglish ? "Invalid option." : "Opção inválida."));
                    break;
            }
        }
    }

    private void scheduReminder() {
        System.out.print((isEnglish ? "Enter date (YYYY-MM-DD): " : "Digite a data (DD-MM-AAAA): "));
        String date = scanner.nextLine();
        System.out.print((isEnglish ? "Enter reminder description: " : "Digite a descrição do lembrete: "));
        String description = scanner.nextLine();
        if (!agendaMap.containsKey(date)) {
            agendaMap.put(date, new ArrayList<>());
        }
        agendaMap.get(date).add(description);

        System.out.println((isEnglish ? "Item scheduled successfully." : "Item agendado com sucesso."));
    }



    private void scheduleTask() {
        System.out.print((isEnglish ? "Enter date (YYYY-MM-DD): " : "Digite a data (DD-MM-AAAA): "));
        String date = scanner.nextLine();
        System.out.print((isEnglish ? "Enter Task description: " : "Digite a descrição da Tarefa: "));
        String description = scanner.nextLine();
        if (!agendaMap.containsKey(date)) {
            agendaMap.put(date, new ArrayList<>());
        }
        agendaMap.get(date).add(description);

        System.out.println((isEnglish ? "Item scheduled successfully." : "Item agendado com sucesso."));
    }

    private void schedulEvent() {
        System.out.print((isEnglish ? "Enter date (YYYY-MM-DD): " : "Digite a data (DD-MM-AAAA): "));
        String date = scanner.nextLine();
        System.out.print((isEnglish ? "Enter event description: " : "Digite a descrição do Evento: "));
        String description = scanner.nextLine();
        if (!agendaMap.containsKey(date)) {
            agendaMap.put(date, new ArrayList<>());
        }
        agendaMap.get(date).add(description);

        System.out.println((isEnglish ? "Item scheduled successfully." : "Item agendado com sucesso."));
    }


    private void scheduleItem() {
        System.out.print((isEnglish ? "Enter date (YYYY-MM-DD): " : "Digite a data (DD-MM-AAAA): "));
        String date = scanner.nextLine();
        System.out.print((isEnglish ? "Enter item description: " : "Digite a descrição do item: "));
        String description = scanner.nextLine();

        if (!agendaMap.containsKey(date)) {
            agendaMap.put(date, new ArrayList<>());
        }
        agendaMap.get(date).add(description);

        System.out.println((isEnglish ? "Item scheduled successfully." : "Item agendado com sucesso."));
    }

    private void viewItemsByDate() {
        System.out.print((isEnglish ? "Enter date (YYYY-MM-DD): " : "Digite a data (DD-MM-AAAA): "));
        String date = scanner.nextLine();

        List<String> items = agendaMap.getOrDefault(date, new ArrayList<>());

        if (items.isEmpty()) {
            System.out.println((isEnglish ? "No items scheduled for this date." : "Nenhum item agendado para esta data."));
        } else {
            System.out.println((isEnglish ? "Items scheduled for " : "Itens agendados para ") + date + ":");
            for (String item : items) {
                System.out.println("- " + item);
            }
        }
    }

    private void editItem() {
        System.out.print((isEnglish ? "Enter date (YYYY-MM-DD): " : "Digite a data (DD-MM-AAAA): "));
        String date = scanner.nextLine();

        if (!agendaMap.containsKey(date)) {
            System.out.println((isEnglish ? "No items scheduled for this date." : "Nenhum item agendado para esta data."));
            return;
        }

        List<String> items = agendaMap.get(date);

        System.out.println((isEnglish ? "Items scheduled for " : "Itens agendados para ") + date + ":");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }

        System.out.print((isEnglish ? "Enter the number of the item to edit: " : "Digite o número do item a ser editado: "));
        int itemNumber = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        if (itemNumber < 1 || itemNumber > items.size()) {
            System.out.println((isEnglish ? "Invalid item number." : "Número de item inválido."));
            return;
        }

        System.out.print((isEnglish ? "Enter the new item description: " : "Digite a nova descrição do item: "));
        String newDescription = scanner.nextLine();
        items.set(itemNumber - 1, newDescription);

        System.out.println((isEnglish ? "Item edited successfully." : "Item editado com sucesso."));
    }

    private void exit() {
        System.out.println((isEnglish ? "Exiting the program." : "Saindo do programa."));
        System.exit(0);
    }
}
