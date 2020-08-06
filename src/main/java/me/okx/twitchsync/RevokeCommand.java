package me.okx.twitchsync;

import static me.okx.twitchsync.util.generic.Messages.REVOKE_COMMAND;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class RevokeCommand implements CommandExecutor {
  private TwitchSync plugin;

  public RevokeCommand(TwitchSync plugin) {
    this.plugin = plugin;
  }

  @Override
  public boolean onCommand(CommandSender cs, Command command, String s, String[] strings) {
    new Revoker(plugin).runTaskAsynchronously(plugin);
    cs.sendMessage(REVOKE_COMMAND);
    return true;
  }
}
