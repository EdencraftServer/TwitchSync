package me.okx.twitchsync.util.generic;

import static me.okx.twitchsync.util.generic.Prefixes.*;

public class Messages {
    // Error messages
    public static String
        CONSOLE_EXECUTION = ERROR_PREFIX + "Este comando no puede ser ejectuado por la consola.",
        ERROR_OCCURRED = ERROR_PREFIX + "Ha ocurrido un error. Por favor, vuelve a intentarlo.";
    // Success messages
    public static String
        SYNC_TWITCH = SUCCESS_PREFIX + "Haz click en este texto para sincronizar tu cuenta de Twitch",
        SYNC_TWITCH_ALERT = SUCCESS_PREFIX + "Haz click para sincronizar con Twitch",
        REVOKE_COMMAND = "Revocando privilegios a aquellos que ya no están suscritos o siguiendo el canal.";

}
