package de.eldritch.spigot.poppy_hats.core;

import org.bukkit.Material;

/**
 * Utility class to determine if a {@link Material} is a valid hat.
 */
public class Hats {
    public static final Material[] MATERIALS = {
            Material.DANDELION,
            Material.POPPY,
            Material.BLUE_ORCHID,
            Material.ALLIUM,
            Material.AZURE_BLUET,
            Material.RED_TULIP,
            Material.ORANGE_TULIP,
            Material.WHITE_TULIP,
            Material.PINK_TULIP,
            Material.OXEYE_DAISY,
            Material.BROWN_MUSHROOM,
            Material.RED_MUSHROOM,
            Material.SUNFLOWER,
            Material.LILAC,
            Material.ROSE_BUSH,
            Material.PEONY,
            Material.TALL_GRASS,
            Material.LARGE_FERN,
            Material.CORNFLOWER,
            Material.LILY_OF_THE_VALLEY,
            Material.WITHER_ROSE,
            Material.CRIMSON_FUNGUS,
            Material.WARPED_FUNGUS,
            Material.CRIMSON_ROOTS,
            Material.WARPED_ROOTS,
            Material.NETHER_SPROUTS
    };

    /**
     * Checks whether the provided {@link Material} is a valid hat.
     */
    public static boolean isHat(Material material) {
        if (material == null) return false;

        for (Material hat : MATERIALS)
            if (material.equals(hat))
                return true;
        return false;
    }
}
