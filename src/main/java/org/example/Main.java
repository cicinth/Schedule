package org.example;

import org.example.model.*;
import org.example.service.EventService;
import org.example.service.ScheduleService;
import org.example.service.TaskService;
import org.example.service.UserService;

import org.example.utils.ShowUtilInfos;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserService();
        ScheduleService scheduleService = new ScheduleService();
        TaskService taskService = new TaskService();
        EventService eventService = new EventService();


        boolean runSystem  = true;

        while (runSystem) {
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Adicionar um novo usuario");
            System.out.println("2 - Adicionar uma agenda");
            System.out.println("3 - Adicionar uma task");
            System.out.println("4 - Adicionar um evento");
            System.out.println("5 - Adicionar um lembrete");
            System.out.println("6 - Exibir agenda");
            System.out.println("0 - Encerrar sistema");

            int optionChoose = scanner.nextInt();

            if (optionChoose == 1) {
                System.out.println("Digite o ID do usuário");
                long userId = scanner.nextLong();

                System.out.println("Digite o nome do usuário");
                String username = scanner.next();

                userService.createUser(userId, username);
            } else if (optionChoose == 2) {

                System.out.println("Digite o ID do agenda");
                long scheduleId = scanner.nextLong();

                System.out.println("Digite o titulo da agenda");
                String scheduleTitle = scanner.next();

                System.out.println("Digite o id do usuario");
                Long userId = scanner.nextLong();

                scheduleService.addSchedule(scheduleId, scheduleTitle, userId);

            } else if (optionChoose == 3) {

                System.out.println("Digite o ID da tarefa");
                long taskId = scanner.nextLong();

                System.out.println("Digite o nome da tarefa: ");
                String taskName = scanner.next();

                System.out.println("Digite a descricao da tarefa: ");
                String taskDescription = scanner.next();

                System.out.println("Digite a data da tarefa (formato:AAAA-MM-DD): ");
                String taskDateStr = scanner.next();
                LocalDate taskDate = LocalDate.parse(taskDateStr);

                System.out.println("Digite o id da agenda que deseja adicionar a tarefa: ");
                Long idSchedule = scanner.nextLong();

                System.out.println("Digite o id do usuario que deseja adicionar a tarefa: ");
                Long userId = scanner.nextLong();

                taskService.createTask(taskId, taskName, taskDescription, taskDate, idSchedule, userId);

            } else if (optionChoose == 4 ) {

                System.out.println("Digite o ID do evento");
                long eventId = scanner.nextLong();

                System.out.println("Digite o nome do evento: ");
                String eventName = scanner.next();

                System.out.println("Digite a descricao do evento: ");
                String eventDescription = scanner.next();

                System.out.println("Digite a data do evento (formato:AAAA-MM-DD): ");
                String eventDateStr = scanner.next();
                LocalDate eventDate = LocalDate.parse(eventDateStr);

                System.out.println("Digite o endereco da evento: ");
                String eventAddress = scanner.next();

                System.out.println("Digite o id da agenda que deseja adicionar a tarefa: ");
                Long idSchedule = scanner.nextLong();

                System.out.println("Digite o id do usuario que deseja adicionar a tarefa: ");
                Long userId = scanner.nextLong();

                eventService.create(eventId, eventName, eventDescription, eventDate, eventAddress,idSchedule, userId);

            } else if (optionChoose == 6) {
                System.out.println("Digite o id do usuario que você quer visualizar");
                Long userId = scanner.nextLong();

                System.out.println("Digite o id da agenda que você quer visualizar");
                Long scheduleId = scanner.nextLong();

                User user = userService.getUser(userId);

                System.out.println(user.getId());
                System.out.println(user.getUsername());
                System.out.println(user.getSchedules().get(scheduleId).getTitle());
                ShowUtilInfos.showScheduleItens(user.getSchedules().get(scheduleId).getScheduleItems());
            } else if(optionChoose == 0 ){
                runSystem = false;
            } else {
                System.out.println("Opcao invalida");
            }
        }
    }


}