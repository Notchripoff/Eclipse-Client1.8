package proclient.command.commands;

import proclient.Dragon;
import proclient.command.Command;
import net.minecraft.client.Minecraft;

public class Help extends Command {
    public Help() {
        super("Help", "Shows all commands", "Help", "help");
    }

	@Override
	public void onCommand(String[] args, String command) {
		if (args.length == 0) {
			Dragon.moduleManager.addChatMessage("---Eclipse Commands---");
            Dragon.moduleManager.addChatMessage(".help - shows this");
            Dragon.moduleManager.addChatMessage(".vclip <distance> - vclips you through blocks");
            Dragon.moduleManager.addChatMessage("----------------------");
			return;
		}
	}

    
    
}
