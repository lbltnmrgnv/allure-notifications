package guru.qa.allure.notifications.clients;

import guru.qa.allure.notifications.clients.telegram.Telegram;

import java.util.EnumMap;
import java.util.function.Supplier;

public class ClientFactory {
    private static final EnumMap<Messenger, Supplier<Notifier>> factory =
            new EnumMap<>(Messenger.class);

    static {
        factory.put(Messenger.telegram, Telegram::new);
    }

    public static Notifier initClientFor(Messenger messenger) {
        return factory.get(messenger).get();
    }
}
