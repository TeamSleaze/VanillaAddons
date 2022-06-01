//package net.teamsleaze.vanillaaddons.events;
//
//import net.fabricmc.fabric.api.event.Event;
//import net.fabricmc.fabric.api.event.EventFactory;
//import net.minecraft.block.entity.BlockEntity;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.util.ActionResult;
//
//public interface ShovelFlattenCallback {
//
//    /**
//     * Callback for shearing a sheep.
//     * Called before the sheep is sheared, items are dropped, and items are damaged.
//     * Upon return:
//     * - SUCCESS cancels further processing and continues with normal shearing behavior.
//     * - PASS falls back to further processing and defaults to SUCCESS if no other listeners are available
//     * - FAIL cancels further processing and does not shear the sheep.
//     **/
//
//    Event<ShovelFlattenCallback> EVENT = EventFactory.createArrayBacked(ShovelFlattenCallback.class,
//            (listeners) -> (player, block) -> {
//                for (ShovelFlattenCallback listener : listeners) {
//                    ActionResult result = listener.interact(player, block);
//
//                    if(result != ActionResult.PASS) {
//                        return result;
//                    }
//                }
//
//                return ActionResult.PASS;
//            });
//
//    ActionResult interact(PlayerEntity player, BlockEntity block);
//}
