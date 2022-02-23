package ga.hallzmine.cityblocks.baseBlocks;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;

public class VendingMachineContainer extends AbstractContainerMenu {

  protected VendingMachineContainer() {
    super(MenuType.GENERIC_9x3, 5391);
  }

  @Override
  public boolean stillValid(Player playerIn) {
    return true;
  }
}
