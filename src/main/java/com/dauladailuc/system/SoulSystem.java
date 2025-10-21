package com.dauladailuc.system;

import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;

public class SoulSystem {

    public static void init() {
        System.out.println("[Đấu La Đại Lục] Hệ thống Võ Hồn đã được khởi tạo!");
    }

    public static void awaken(Player player) {
        player.sendSystemMessage(Component.literal("✨ Bạn đã thức tỉnh Võ Hồn!"));
    }

    public static void gainSoulPower(Player player, int amount) {
        player.sendSystemMessage(Component.literal("⚡ Hồn lực của bạn tăng lên: +" + amount));
    }

    public static void activateSpiritSkill(Player player, String skill) {
        player.sendSystemMessage(Component.literal("🔥 Kích hoạt Hồn Kỹ: " + skill));
    }
}
