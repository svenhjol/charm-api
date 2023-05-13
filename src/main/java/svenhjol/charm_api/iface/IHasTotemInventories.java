package svenhjol.charm_api.iface;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

import java.util.List;
import java.util.function.Function;

public interface IHasTotemInventories {
    List<Function<Player, List<ItemStack>>> getTotemInventories();
}
