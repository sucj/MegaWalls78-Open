package icu.suc.megawalls78.util;

import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;

public class ParticleUtil {

    public static void spawnFirework(Location location, FireworkEffect... effects) {
    }

    public static void spawnParticleOverhead(LivingEntity entity, Particle particle, int count) {
    }

    public static <T> void spawnParticleOverhead(LivingEntity entity, Particle particle, int count, T data) {
    }

    public static void spawnParticleRandomBody(Entity entity, Particle particle, int count) {
    }

    public static void spawnParticleRandomBody(Entity entity, Particle particle, int count, double extra) {
    }

    public static <T> void spawnParticleRandomBody(Entity entity, Particle particle, int count, double extra, T data) {
    }

    public static <T> void spawnParticle(World world, Particle particle, Location location, int count, T data) {
    }

    public static void spawnParticle(World world, Particle particle, Location location, int count) {
    }

    public static void spawnParticle(World world, Particle particle, Location location, int count, double offsetX, double offsetY, double offsetZ) {
    }

    public static void spawnParticle(World world, Particle particle, Location location, int count, double offsetX, double offsetY, double offsetZ, double extra) {
    }

    public static <T> void spawnParticle(World world, Particle particle, Location location, int count, double offsetX, double offsetY, double offsetZ, double extra, T data) {
    }

    public static void playExpandingCircleParticle(Location center, Particle particle, int count, double maxRadius, long duration) {
    }

    public static <T> void playExpandingCircleParticle(Location center, Particle particle, int count, double maxRadius, long duration, T data) {
    }

    public static void playContractingCircleParticle(Location center, Particle particle, int count, double maxRadius, long duration) {
        playContractingCircleParticle(center, particle, count, maxRadius, duration, null);
    }

    public static <T> void playContractingCircleParticle(Location center, Particle particle, int count, double maxRadius, long duration, T data) {
    }
}
