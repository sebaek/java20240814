package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> queue = new LinkedList<>();

        queue.offer(new Message("sendMail", "hong gil dong"));
        queue.offer(new Message("sendSMS", "shin"));
        queue.offer(new Message("sendTalk", "gam"));

        while (!queue.isEmpty()) {

            Message message = queue.poll();

            switch (message.command) {
                case "sendMail" -> {
                    System.out.println(message.to + "님에게 메일 보냄");
                }
                case "sendSMS" -> {
                    System.out.println(message.to + "님에게 sms 보냄");
                }
                case "sendTalk" -> {
                    System.out.println(message.to + "님에게 톡 보냄");
                }
            }
        }

    }
}
