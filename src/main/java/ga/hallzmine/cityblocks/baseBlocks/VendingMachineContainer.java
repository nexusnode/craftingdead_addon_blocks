package ga.hallzmine.cityblocks.baseBlocks;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;

public class VendingMachineContainer extends Container {

    protected VendingMachineContainer() {
        super(ContainerType.GENERIC_9X3, 5391);
    }

    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return true;
    }
}
