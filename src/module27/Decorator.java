package module27;

public class Decorator {
    //  Общий интерфейс для всех
    //  На схеме обозначен Component
    interface Notifier {
        String sendData();
    }

    // Базовый нотификатор. На схеме ConcreteComponent.
    // Отправляет сообщение по e-mail.
    static class BaseNotifier implements Notifier {
        BaseNotifier() {
        }// Базовый конструктор

        @Override
        public String sendData() {
            return "Отправляю сообщения по e-mail. ";
        }
    }

    //Родитель всех декораторов. На схеме Decorator.
    static class NotifierDecorator implements Notifier {
        Notifier notifier;// ссылка на изменяемый объект

        NotifierDecorator(Notifier notifier) {
            this.notifier = notifier;
        }

        @Override
        public String sendData() {
            // Метод sendData() вызывает sendData() у объекта notifier.
            return notifier.sendData();
        }
    }

    //Улучшеный декоратор, добаляет отправку сообщения в телеграмм.
    static class AdvencedDecorator extends NotifierDecorator {
        AdvencedDecorator(Notifier notifier) {
            super(notifier);
        }

        // отправка сообщения в телеграмм
        public String sendToTelegram() {
            return "Отправляю сообщение в телеграмм";
        }

        @Override
        public String sendData() {// к основной отправке сообщения добавляем отпраку в телеграмм
            return super.sendData() + sendToTelegram();
        }
    }
}