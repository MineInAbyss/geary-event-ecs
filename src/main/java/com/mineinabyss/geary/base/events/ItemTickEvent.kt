package com.mineinabyss.geary.base.events

import com.mineinabyss.geary.event.Event
import org.bukkit.entity.Player
import org.bukkit.inventory.Inventory
import org.bukkit.inventory.ItemStack

class ItemTickEvent(
        val itemStack: ItemStack,
        val inventory: Inventory,
        val player: Player
) : Event()
