package com.dauladailuc;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.common.MinecraftForge;
import com.dauladailuc.system.SoulSystem;

@Mod(Dauladailuc.MODID)
public class Dauladailuc {
    public static final String MODID = "dauladailuc";

    public Dauladailuc() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        SoulSystem.init();
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        System.out.println("[Đấu La Đại Lục] Khởi động hệ thống Võ Hồn!");
    }
}
