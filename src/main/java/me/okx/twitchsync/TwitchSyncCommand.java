package me.okx.twitchsync;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static me.okx.twitchsync.util.generic.Messages.*;

public class TwitchSyncCommand implements CommandExecutor {
  private TwitchSync plugin;

  public TwitchSyncCommand(TwitchSync plugin) {
    this.plugin = plugin;
  }

  @Override
  public boolean onCommand(CommandSender cs, Command command, String s, String[] args) {
    if (!(cs instanceof Player)) {
      cs.sendMessage(CONSOLE_EXECUTION);
      return true;
    }

    Player player = (Player) cs;

    String url = plugin.getValidator().createAuthenticationUrl(player.getUniqueId());
    if(url == null) {
      player.sendMessage(ERROR_OCCURRED);
      return true;
    }

    player.spigot().sendMessage(new ComponentBuilder(SYNC_TWITCH)
        .color(net.md_5.bungee.api.ChatColor.GREEN)
        .event(new ClickEvent(ClickEvent.Action.OPEN_URL, url))
        .event(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(SYNC_TWITCH_ALERT).create()))
        .create());

    return true;
  }
}
