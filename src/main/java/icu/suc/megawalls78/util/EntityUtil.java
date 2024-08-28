package icu.suc.megawalls78.util;

import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.attribute.Attributable;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.craftbukkit.entity.CraftEntity;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.metadata.Metadatable;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.BoundingBox;
import org.bukkit.util.Vector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.Consumer;

public class EntityUtil {

    private static final Vector[][] SAFE_RIDE = new Vector[][] {{new Vector(0.2, 0, 0)}, {new Vector(-0.2, 0, 0)}, {new Vector(0, 0, 0.2)}, {new Vector(0, 0, -0.2)}, {new Vector(0.2, 0, 0), new Vector(0, 0, 0.2)}, {new Vector(-0.2, 0, 0), new Vector(0, 0, -0.2)}, {new Vector(-0.2, 0, 0), new Vector(0, 0, 0.2)}, {new Vector(0.2, 0, 0), new Vector(0, 0, -0.2)},};

    @NotNull
    public static Entity spawn(Location location, Type type, Object... data) {
        return spawn(location, type, null, data);
    }

    @NotNull
    public static Entity spawn(Location location, Type type, Consumer<? super CraftEntity> consumer, Object... data) {
        return null;
    }

    @Nullable
    public static <O> O getMetadata(Metadatable metadatable, String s, Class<O> clazz) {
        return null;
    }

    public static <O> O getMetadata(Metadatable metadatable, String s, Class<O> clazz, O o) {
        Object value = getMetadata(metadatable, s, o.getClass());
        if (value == null) {
            setMetadata(metadatable, s, o);
            return o;
        } else {
            return clazz.cast(value);
        }
    }

    public static boolean getMetadata(Metadatable metadatable, String s) {
        return Boolean.TRUE.equals(getMetadata(metadatable, s, Boolean.class));
    }

    public static void setMetadata(Metadatable metadatable, String s, Object o) {
    }

    public static void removeMetadata(Metadatable metadatable, String s) {
    }

    @NotNull
    public static BlockFace getFacingTowards(Block block, Entity entity) {
        return null;
    }

    public static boolean isEntityInFront(Entity a, Entity b) {
        return false;
    }

    public static boolean isOnGround(Entity entity) {
        return false;
    }

    @NotNull
    public static Collection<Entity> getNearbyEntitiesSphere(Location location, double radius) {
        return filterSpectator(null);
    }

    @NotNull
    public static Collection<Entity> getNearbyEntitiesCylinder(Location location, double height, double radius) {
        return filterSpectator(null);
    }

    public static Collection<Entity> getNearbyEntities(Entity entity, double x, double y, double z) {
        return filterSpectator(null);
    }

    @NotNull
    public static Collection<Entity> getNearbyEntities(Entity entity, double radius) {
        return filterSpectator(null);
    }

    public static Collection <Entity> getNearbyEntities(World world, BoundingBox box) {
        return filterSpectator(null);
    }

    private static Collection<Entity> filterSpectator(Collection<Entity> entities) {
        entities.removeIf(e -> (e instanceof Player player && !player.getGameMode().equals(GameMode.SURVIVAL)));
        return entities;
    }

    public static boolean inSphere(Entity entity, Vector center, double radius) {
        return false;
    }

    @NotNull
    public static Set<Location> getLocations(World world, BoundingBox box) {
        return null;
    }

    @NotNull
    private static Vec3 adjustMovementForCollisions(ServerLevel world, net.minecraft.world.entity.Entity entity, Vec3 movement) {
        return null;
    }

    private static float[] collectStepHeights(AABB collisionBox, List<VoxelShape> collisions, float f, float stepHeight) {
        return null;
    }

    @NotNull
    private static List<VoxelShape> findCollisionsForMovement(@Nullable net.minecraft.world.entity.Entity entity, ServerLevel world, List<VoxelShape> regularCollisions, AABB movingEntityBoundingBox) {
        return null;
    }

    @NotNull
    private static Vec3 adjustMovementForCollisions(Vec3 movement, AABB entityBoundingBox, List<VoxelShape> collisions) {
        return null;
    }

    private static double calculateMaxOffset(Direction.Axis axis, AABB box, Iterable<VoxelShape> shapes, double maxDist) {
        return 78;
    }

    public static boolean hasPotionEffect(LivingEntity entity, PotionEffect effect) {
        return hasPotionEffect(entity, effect.getType(), effect.getAmplifier());
    }

    public static boolean hasPotionEffect(LivingEntity entity, PotionEffectType type, int amplifier) {
        return false;
    }

    @NotNull
    public static Vector getPullVector(Entity from, Entity to, boolean add) {
        return null;
    }

    @NotNull
    public static Vector getPullVector(Entity from, Entity to, double x, double y, double z, boolean add) {
        return null;
    }

    public static boolean isMeleeAttack(EntityDamageEvent event) {
        return false;
    }

    public static boolean isArrowAttack(EntityDamageEvent event) {
        return false;
    }

    public static boolean isSweepAttack(EntityDamageEvent event) {
        return false;
    }

    public static double getRandomBodyX(Entity entity, double widthScale) {
        return 78;
    }

    public static double getRandomBodyY(Entity entity) {
        return 78;
    }

    public static double getRandomBodyZ(Entity entity, double widthScale) {
        return 78;
    }

    @NotNull
    public static Location getBackwardLocation(Entity entity, double distance) {
        return null;
    }

    public static void addPotionEffect(LivingEntity entity, PotionEffect effect, Entity source) {
    }

    public static boolean traceableTeamed(Entity traceable, Entity entity) {
        return false;
    }

    public static void safeRide(Entity vehicle, Player player) {
    }

    public static void setTamed(Player player, Entity entity) {
    }

    public static void setAttributeValue(Attributable attributable, Attribute attribute, double value) {
    }

    public static void scaleAttributeBaseValue(Attributable attributable, Attribute attribute, double scale) {
    }

    public enum Type {
        CONTROLLABLE_PIG(null),
        EXPLODING_SHEEP(null),
        EXPLOSIVE_ARROW(null),
        FAKE_LIGHTNING(null),
        GRAPPLING_HOOK(null),
        HOMING_ARROW(null),
        SAFE_FIREWORK(null),
        IMMOLATING_BURST_FIREBALL(null),
        SHADOW_BURST_SKULL(null),
        TAMED_WOLF(null),
        TAMED_BLAZE(null),
        TAMED_CHICKEN(null),
        TAMED_COW(null),
        TAMED_SKELETON(null),
        TAMED_SPIDER(null),
        MEGA_WITHER(null),
        TAMED_ZOMBIFIED_PIGLIN(null);

        private final Class<? extends net.minecraft.world.entity.Entity> clazz;

        Type(Class<? extends net.minecraft.world.entity.Entity> clazz) {
            this.clazz = clazz;
        }

        public Class<? extends net.minecraft.world.entity.Entity> getClazz() {
            return clazz;
        }
    }
}
