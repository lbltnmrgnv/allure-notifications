package guru.qa.allure.notifications.journal;

import guru.qa.allure.notifications.config.helpers.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplicationJournal {
    private static final Logger LOG = LoggerFactory.getLogger("Journal");

    public static void buildInfo() {
        LOG.info(
                "\n========BUILD INFO========"
                        + "\nPROJECT: {}"
                        + "\nENV: {}"
                        + "\nCOMMENT: {}"
                        + "\nREPORT LINK: {}",
                Build.projectName(), Build.env(), Build.comment(), Build.reportLink());
    }

    public static void botInfo() {
        LOG.info(
                "\n========BOT INFO========"
                        + "\nTOKEN: {}"
                        + "\nCHAT: {}"
                        + "\nREPLY TO: {}",
                Bot.token(), Bot.chat(), Bot.replyTo());
    }
}
