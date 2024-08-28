package icu.suc.megawalls78.util;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.block.banner.Pattern;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffect;

public class ItemBuilder {

    public static ItemBuilder of(Material type) {
        return new ItemBuilder().setType(type);
    }

    public ItemBuilder setType(Material type) {
        return this;
    }

    public ItemBuilder setAmount(Integer amount) {
        return this;
    }

    public ItemBuilder setMaxStackSize(Integer maxStackSize) {
        return this;
    }

    public ItemBuilder setDisplayName(Component displayName) {
        return this;
    }

    public ItemBuilder setUnbreakable(Boolean unbreakable) {
        return this;
    }

    public ItemBuilder setHideToolTip(Boolean hideToolTip) {
        return this;
    }

    public ItemBuilder addLore(Component... lore) {
        return this;
    }

    public ItemBuilder setDurability(Integer durability) {
        return this;
    }

    public ItemBuilder setMaxDurability(Integer maxDurability) {
        return this;
    }

    public <P, C> ItemBuilder addPersistentData(NamespacedKey namespacedKey, PersistentDataType<P, C> persistentDataType, C c) {
        return this;
    }

    public ItemBuilder setMW78Id(String id) {
        return addPersistentData(ItemUtil.ID, PersistentDataType.STRING, id);
    }

    public <P, C> ItemBuilder addMW78Tag(NamespacedKey namespacedKey, PersistentDataType<P, C> persistentDataType, C c) {
        return this;
     }

    public ItemBuilder setEnchantmentGlintOverride(Boolean enchantmentGlintOverride) {
        return this;
    }

    public ItemBuilder addEnchantment(Enchantment enchantment, int level) {
        return addEnchantment(enchantment, level, true);
    }

    public ItemBuilder addEnchantment(Enchantment enchantment, int level, boolean ignoreRestrictions) {
        return this;
    }

    public ItemBuilder addCustomEffect(PotionEffect potionEffect, boolean ambient) {
        return this;
    }

    public ItemBuilder addAttribute(Attribute attribute, AttributeModifier attributeModifier) {
        return this;
    }

    public ItemBuilder clearAttributes() {
        return this;
    }

    public ItemBuilder addItemFlag(ItemFlag itemFlag) {
        return this;
    }

    public ItemBuilder setSkullSkin(String value, String signature) {
        return this;
    }

    public ItemBuilder setArmorColor(Color armorColor) {
        return this;
    }

    public ItemBuilder addBannerPattern(Pattern pattern) {
        return this;
    }

    public ItemBuilder addPrefix(Component prefix) {
        return this;
    }

    public ItemBuilder addSuffix(Component suffix) {
        return this;
    }

    public ItemBuilder setNameColor(TextColor nameColor) {
        return this;
    }

    public ItemBuilder addDecoration(TextDecoration decoration, TextDecoration.State state) {
        return this;
    }

    public ItemStack build() {
        return ItemStack.of(type);
    }

    private record PersistentData<P, C>(NamespacedKey namespacedKey, PersistentDataType<P, C> persistentDataType, C c) {
    }

    private record Enchant(Enchantment enchantment, int level, boolean ignoreRestrictions) {
    }

    private record CustomEffect(PotionEffect potionEffect, boolean ambient) {
    }

    private record Decoration(TextDecoration decoration, TextDecoration.State state) {
    }
}
