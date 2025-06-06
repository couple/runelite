/*
 * Copyright (c) 2018, SomeoneWithAnInternetConnection
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.agility;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import java.util.List;
import java.util.Set;
import net.runelite.api.gameval.ObjectID;
import net.runelite.client.game.AgilityShortcut;

class Obstacles
{
	static final Set<Integer> OBSTACLE_IDS = ImmutableSet.of(
		// Gnome
		ObjectID.OBSTICAL_NET2, ObjectID.CLIMBING_BRANCH, ObjectID.CLIMBING_TREE, ObjectID.OBSTICAL_NET3, ObjectID.OBSTICAL_PIPE3_1,
		ObjectID.OBSTICAL_PIPE3_2, ObjectID.GNOME_LOG_BALANCE1, ObjectID.BALANCING_ROPE,
		// Brimhaven
		ObjectID.AGILITYARENA_PLANK3, ObjectID.AGILITYARENA_PLANK2, ObjectID.AGILITYARENA_PLANK, ObjectID.AGILITYARENA_ROPESWING, ObjectID.AGILITYARENA_PILLAR_TOP, ObjectID.AGILITYARENA_LOWWALL, ObjectID.AGILITYARENA_LOGBALANCE1, ObjectID.AGILITYARENA_LOGBALANCE3,
		ObjectID.AGILITYARENA_LEDGEBALANCE2, ObjectID.AGILITYARENA_LEDGEBALANCE, ObjectID.AGILITYARENA_MONKEYBARS_END, ObjectID.AGILITYARENA_ROPEBALANCE, ObjectID.AGILITYARENA_HANDHOLDS,
		// Draynor
		ObjectID.ROOFTOPS_DRAYNOR_WALLCLIMB, ObjectID.ROOFTOPS_DRAYNOR_TIGHTROPE_1, ObjectID.ROOFTOPS_DRAYNOR_TIGHTROPE_2, ObjectID.ROOFTOPS_DRAYNOR_WALLCROSSING, ObjectID.ROOFTOPS_DRAYNOR_WALLSCRAMBLE, ObjectID.ROOFTOPS_DRAYNOR_LEAPDOWN, ObjectID.ROOFTOPS_DRAYNOR_CRATE, ObjectID.FARMING_STYLE,
		// Al-Kharid
		ObjectID.ROOFTOPS_KHARID_WALLCLIMB, ObjectID.ROOFTOPS_KHARID_TIGHTROPE_1, ObjectID.ROOFTOPS_KHARID_ROPE_SWING, ObjectID.ROOFTOPS_KHARID_SLIDE_SIDE, ObjectID.ROOFTOPS_KHARID_BAMBOO_TREE_TOP, ObjectID.ROOFTOPS_KHARID_WALLCLIMB_2,
		ObjectID.ROOFTOPS_KHARID_TIGHTROPE_4, ObjectID.ROOFTOPS_KHARID_LEAPDOWN,
		// Pyramid
		ObjectID.AGILITY_PYRAMID_STEPS1, ObjectID.AGILITY_PYRAMID_LOW_WALL, ObjectID.AGILITY_PYRAMID_LEDGE_HOTSPOT, ObjectID.AGILITY_PYRAMID_PLANK_START, ObjectID.AGILITY_PYRAMID_WALLHANG_START_SOUTH_HOTSPOT, ObjectID.AGILITY_PYRAMID_LEDGEBALANCE_START_SOUTH_HOTSPOT, ObjectID.AGILITY_PYRAMID_STEPS1, ObjectID.AGILITY_PYRAMID_WALLHANG_START_WEST_HOTSPOT,
		ObjectID.AGILITY_PYRAMID_JUMP_HOTSPOT, ObjectID.AGILITY_PYRAMID_WALLHANG_START_HOTSPOT_GROUND, ObjectID.AGILITY_PYRAMID_LOW_WALL, ObjectID.AGILITY_PYRAMID_JUMP_HOTSPOT, ObjectID.AGILITY_PYRAMID_LEDGEBALANCE_START_WEST_HOTSPOT, ObjectID.AGILITY_PYRAMID_PLANK_START, ObjectID.AGILITY_PYRAMID_WALL_ROCKS, ObjectID.AGILITY_PYRAMID_DOOR_HOTSPOT,
		// Varrock
		ObjectID.ROOFTOPS_VARROCK_WALLCLIMB, ObjectID.ROOFTOPS_VARROCK_CLOTHESLINE, ObjectID.ROOFTOPS_VARROCK_LEAPTORUINS, ObjectID.ROOFTOPS_VARROCK_WALLSWING, ObjectID.ROOFTOPS_VARROCK_WALLSCRAMBLE, ObjectID.ROOFTOPS_VARROCK_LEAPTOBALCONY, ObjectID.ROOFTOPS_VARROCK_LEAPDOWN, ObjectID.ROOFTOPS_VARROCK_STEPUPROOF, ObjectID.ROOFTOPS_VARROCK_FINISH,
		// Penguin
		ObjectID.PENG_AGILITY_CRUSHCOURSE_STEPSTONE01, ObjectID.PENG_JUMP_STONE_CLICKZONE_01, ObjectID.PENG_JUMP_STONE_CLICKZONE_02, ObjectID.PENG_JUMP_STONE_CLICKZONE_03,
		ObjectID.PENG_JUMP_STONE_CLICKZONE_04, ObjectID.PENG_JUMP_STONE_CLICKZONE_05, ObjectID.PENG_JUMP_STONE_CLICKZONE_06, ObjectID.PENG_JUMP_STONE_CLICKZONE_07,
		ObjectID.PENG_ICICLEPILLAR_CLICKZONE, ObjectID.PENG_AGILITY_SLIPPERY_GLITTERS01, ObjectID.PENG_AGILITY_SLIPPERY_GLITTERS02, ObjectID.PENG_AGILITY_SLIPPERY_GLITTERS03, ObjectID.PENG_AGILITY_SLIPPERY_GLITTERS04, ObjectID.PENG_AGILITY_SLIPPERY_GLITTERS05, ObjectID.PENG_AGILITY_SLIPPERY_GLITTERS06, ObjectID.PENG_AGILITY_SLIPPERY_GLITTERS07, ObjectID.PENG_AGILITY_SLIPPERY_GLITTERS08, ObjectID.PENG_AGILITY_SLIPPERY_GLITTERS09, ObjectID.PENG_AGILITY_FENCING_DOOR,
		// Barbarian
		ObjectID.OBSTICAL_ROPESWING1, ObjectID.BARBARIAN_LOG_BALANCE1, ObjectID.AGILITY_OBSTICAL_NET_BARBARIAN, ObjectID.BALANCING_LEDGE1, ObjectID.BARBARIAN_LADDERTOP_NORIM, ObjectID.CASTLECRUMBLY1,
		// Canifis
		ObjectID.ROOFTOPS_CANIFIS_START_TREE, ObjectID.ROOFTOPS_CANIFIS_JUMP, ObjectID.ROOFTOPS_CANIFIS_JUMP_2, ObjectID.ROOFTOPS_CANIFIS_JUMP_5, ObjectID.ROOFTOPS_CANIFIS_JUMP_3, ObjectID.ROOFTOPS_CANIFIS_POLEVAULT, ObjectID.ROOFTOPS_CANIFIS_JUMP_4, ObjectID.ROOFTOPS_CANIFIS_LEAPDOWN,
		// Ape atoll
		ObjectID._100_ILM_STEPPING_STONE, ObjectID._100_ILM_CLIMBABLE_TREE, ObjectID._100_ILM_MONKEYBARS_START, ObjectID._100_ILM_CLIFF_CLIMB_1, ObjectID._100_ILM_ROPE_SWING, ObjectID._100_ILM_AGILITY_TREE_BASE,
		// Falador
		ObjectID.ROOFTOPS_FALADOR_WALLCLIMB, ObjectID.ROOFTOPS_FALADOR_TIGHTROPE_1, ObjectID.ROOFTOPS_FALADOR_HANDHOLDS_START, ObjectID.ROOFTOPS_FALADOR_GAP_1, ObjectID.ROOFTOPS_FALADOR_GAP_2, ObjectID.ROOFTOPS_FALADOR_TIGHTROPE_2,
		ObjectID.ROOFTOPS_FALADOR_TIGHTROPE_3, ObjectID.ROOFTOPS_FALADOR_GAP_3, ObjectID.ROOFTOPS_FALADOR_LEDGE_1, ObjectID.ROOFTOPS_FALADOR_LEDGE_2, ObjectID.ROOFTOPS_FALADOR_LEDGE_3A, ObjectID.ROOFTOPS_FALADOR_LEDGE_3B, ObjectID.ROOFTOPS_FALADOR_LEDGE_4, ObjectID.ROOFTOPS_FALADOR_EDGE,
		// Wilderness
		ObjectID.OBSTICAL_PIPE2, ObjectID.OBSTICAL_ROPESWING2, ObjectID.STEPPINGSTONE1, ObjectID.WILDERNESS_LOG_BALANCE1, ObjectID.WILDCLIMBINGROCK,
		// Seers
		ObjectID.ROOFTOPS_SEERS_WALLCLIMB, ObjectID.ROOFTOPS_SEERS_JUMP, ObjectID.ROOFTOPS_SEERS_TIGHTROPE, ObjectID.ROOFTOPS_SEERS_JUMP_1, ObjectID.ROOFTOPS_SEERS_JUMP_2, ObjectID.ROOFTOPS_SEERS_LEAPDOWN,
		// Dorgesh-Kaan
		ObjectID.DORGESH_CABLEBALANCE_START, ObjectID.DORGESH_CAVES_ROPE_SWING, ObjectID.DORGESH_CAVES_MONKEYBARS_END, ObjectID.DORGESH_CAVE_JUTTINGWALL, ObjectID.DORGESH_CAVES_PIPE_AGILITY2, ObjectID.DORGESH_PYLON_GRAPPLE_BASE,
		ObjectID.DORGESH_OLD_GENERATOR_CONSOLE, ObjectID.DORGESH_OLD_GENERATOR_BOILER, ObjectID.DORGESH_OLD_GENERATOR_STEPS2, ObjectID.DORGESH_OLD_GENERATOR_STEPS_BLANK_TOP, ObjectID.DORGESH_GENERATOR_STEPS_BLANK_TOP, ObjectID.DORGESH_GENERATOR_STEPS2,
		// Pollniveach
		ObjectID.ROOFTOPS_POLLNIVNEACH_BASKET, ObjectID.ROOFTOPS_POLLNIVNEACH_MARKETSTALL, ObjectID.ROOFTOPS_POLLNIVNEACH_HANGINGBANNER, ObjectID.ROOFTOPS_POLLNIVNEACH_GAP, ObjectID.ROOFTOPS_POLLNIVNEACH_TREE, ObjectID.ROOFTOPS_POLLNIVNEACH_WALLCLIMB,
		ObjectID.ROOFTOPS_POLLNIVNEACH_MONKEYBARS_START, ObjectID.ROOFTOPS_POLLNIVNEACH_TREETOP, ObjectID.ROOFTOPS_POLLNIVNEACH_LINE,
		// Rellaka
		ObjectID.ROOFTOPS_RELLEKKA_WALLCLIMB, ObjectID.ROOFTOPS_RELLEKKA_GAP_1, ObjectID.ROOFTOPS_RELLEKKA_TIGHTROPE_1, ObjectID.ROOFTOPS_RELLEKKA_GAP_2, ObjectID.ROOFTOPS_RELLEKKA_GAP_3, ObjectID.ROOFTOPS_RELLEKKA_TIGHTROPE_3, ObjectID.ROOFTOPS_RELLEKKA_DROPOFF,
		// Ardougne
		ObjectID.ROOFTOPS_ARDY_WALLCLIMB, ObjectID.ROOFTOPS_ARDY_JUMP, ObjectID.ROOFTOPS_ARDY_PLANK, ObjectID.ROOFTOPS_ARDY_JUMP_2, ObjectID.ROOFTOPS_ARDY_JUMP_3, ObjectID.ROOFTOPS_ARDY_WALLCROSSING, ObjectID.ROOFTOPS_ARDY_JUMP_4,
		// Meiyerditch
		ObjectID.SANG_BOAT_WATER_MULTILOC, ObjectID.SANG_BOAT_JUMP_ROCK, ObjectID.SANG_BOAT_WALL_CLIMB_UP_ROCK, ObjectID.SANG_BOAT_WALL_CLIMB_DOWN_ROCK, ObjectID.SANG_BOAT_EDGE_JUMP, ObjectID.MEIYERDITCH_WALL_FLOORBOARDS_MULTI_LOC, ObjectID.MIEYERDITCH_WALL_UNDERBOARDS_MULTI_LOC, ObjectID.MYQ3_RUBBLE_WEST_WALL,
		ObjectID.MYQ3_RUBBLE_EAST_WALL, ObjectID.MYQ3_AGIL_2_JUMP_SOUTH, ObjectID.MYQ3_AGIL_2_JUMP_NORTH, ObjectID.MYQ3_AGIL_3_JUMP_EAST, ObjectID.MYQ3_AGIL_3_JUMP_WEST, ObjectID.MYQ3_AGIL_4_FLOORACTIVE_MULTI_1, ObjectID.MYQ3_AGIL_4_FLOORACTIVE_MULTI_2,
		ObjectID.MYQ3_AGIL_5_CRAWL_WALL, ObjectID.MYQ3_AGIL_6_FLOORACTIVE_MULTI_1, ObjectID.MYQ3_AGIL_6_FLOORACTIVE_MULTI_2, ObjectID.MYQ3_AGIL_8_TRAPDOOR_TUNNEL_MULTI, ObjectID.MYQ3_AGIL_9_TUNNEL_SOUTH, ObjectID.MYQ3_AGIL_10_SHELF_CLIMB_UP, ObjectID.MYQ3_AGIL_10_SHELF_CLIMB_DOWN, ObjectID.MYQ3_AGIL_11_CRAWL_WALL,
		ObjectID.MYQ3_AGIL_12_JUMP_EAST, ObjectID.MYQ3_AGIL_12_JUMP_WEST, ObjectID.MYQ3_AGIL_14_LOCKED_DOOR, ObjectID.MYQ3_AGIL_17_JUMP_SOUTH, ObjectID.MYQ3_AGIL_17_JUMP_NORTH, ObjectID.MYQ3_AGIL_18_SHELF_CLIMB_UP,
		ObjectID.MYQ3_AGIL_18_SHELF_CLIMB_DOWN, ObjectID.MYQ3_AGIL_20_JUMP_SOUTH, ObjectID.MYQ3_AGIL_20_JUMP_NORTH, ObjectID.MYQ3_AGIL_22_TIGHTROPE_WEST, ObjectID.MYQ3_AGIL_22_TIGHTROPE_EAST,
		ObjectID.MYQ3_AGIL_24_FLOORACTIVE_MULTI_1, ObjectID.MYQ3_AGIL_24_FLOORACTIVE_MULTI_2, ObjectID.MYQ3_AGIL_25_SHELF_CLIMB_UP, ObjectID.MYQ3_AGIL_25_SHELF_CLIMB_DOWN, ObjectID.MYQ3_AGIL_26_SHELF_CLIMB_DOWN, ObjectID.MYQ3_AGIL_26_SHELF_CLIMB_UP, ObjectID.MYQ3_AGIL_27_JUMP_NORTH,
		ObjectID.MYQ3_AGIL_27_JUMP_SOUTH, ObjectID.MYQ3_AGIL_29_JUMP_SOUTH, ObjectID.MYQ3_AGIL_29_JUMP_NORTH, ObjectID.MYQ3_AGIL_30_JUMP_WEST, ObjectID.MYQ3_AGIL_30_JUMP_EAST,
		ObjectID.MYQ3_AGIL_33_LADDER_FLOOR_MULTI, ObjectID.MYQ3_AGIL_41_JUMP_EAST, ObjectID.MYQ3_AGIL_41_JUMP_WEST, ObjectID.AREA_SANGUINE_GHETTO_STAIRS_DOWN, ObjectID.AREA_SANGUINE_MYREQUE_SECRET_WALL_CLOSED, ObjectID.MYQ3_GHETTO_BARICADE_WALL_SECRETPASS, ObjectID.MYQ3_LADDER_DOWN,
		ObjectID.MYQ3_LADDER_UP, ObjectID.MYQ3_LADDER_DOWN_2, ObjectID.MYQ3_LADDER_UP_2, ObjectID.MYQ3_SECRET_ROCK_BARRICADE_UNLOCK, ObjectID.DARKM_OUTER_WALL_3H_MEYERDITCH_WALL_SHORTCUT_TOP, ObjectID.DARKM_OUTER_WALL_3H_MEYERDITCH_WALL_SHORTCUT_BOTTOM,
		// Werewolf
		ObjectID.WEREWOLF_STEPING_STONE, ObjectID.WEREWOLF_HURDLE_MID, ObjectID.WEREWOLF_HURDLE_END, ObjectID.WEREWOLF_HURDLE_END_MIRROR, ObjectID.WAA_PIPE, ObjectID._100_ILM_CLIFF_CLIMB_1, ObjectID.WEREWOLF_SLIDE_CENTER,
		ObjectID.WEREWOLF_SLIDE_SIDE, ObjectID.WEREWOLF_SLIDE_SIDE_MIRROR,
		// Prifddinas
		ObjectID.PRIF_AGILITY_START_LADDER, ObjectID.PRIF_AGILITY_TIGHTROPE_START1, ObjectID.PRIF_AGILITY_CHIMNEY_JUMP, ObjectID.PRIF_AGILITY_ROOF_JUMP, ObjectID.PRIF_AGILITY_DARK_HOLE_ACTIVE, ObjectID.PRIF_AGILITY_TREE_LADDER_LONG, ObjectID.PRIF_AGILITY_TREE_LADDER_SHORT,
		ObjectID.PRIF_AGILITY_ROPE_BRIDGE1, ObjectID.PRIF_AGILITY_TIGHTROPE1, ObjectID.PRIF_AGILITY_ROPE_BRIDGE2, ObjectID.PRIF_AGILITY_TIGHTROPE2, ObjectID.PRIF_AGILITY_TIGHTROPE3, ObjectID.PRIF_AGILITY_DARK_HOLE_END,
		// Rellekka Lighthouse
		ObjectID.HORROR_JUMPING_SPOT2, ObjectID.HORROR_JUMPING_SPOT4, ObjectID.HORROR_JUMPING_SPOT5, ObjectID.HORROR_JUMPING_SPOT7, ObjectID.HORROR_JUMPING_SPOT9, ObjectID.HORROR_JUMPING_SPOT10,
		ObjectID.HORROR_JUMPING_SPOT8, ObjectID.HORROR_JUMPING_SPOT6, ObjectID.HORROR_JUMPING_SPOT3, ObjectID.HORROR_JUMPING_SPOT1,
		// Shayzien
		ObjectID.SHAYZIEN_AGILITY_BOTH_START_LADDER, ObjectID.SHAYZIEN_AGILITY_BOTH_ROPE_CLIMB, ObjectID.SHAYZIEN_AGILITY_BOTH_ROPE_WALK,
		// Shayzien basic
		ObjectID.SHAYZIEN_AGILITY_LOW_BAR_CLIMB, ObjectID.SHAYZIEN_AGILITY_LOW_ROPE_WALK_1, ObjectID.SHAYZIEN_AGILITY_LOW_ROPE_WALK_2, ObjectID.SHAYZIEN_AGILITY_LOW_END_JUMP,
		// Shayzien hard
		ObjectID.SHAYZIEN_AGILITY_UP_SWING_JUMP_1, ObjectID.SHAYZIEN_AGILITY_UP_JUMP_PLATFORM_1, ObjectID.SHAYZIEN_AGILITY_UP_JUMP_PLATFORM_2, ObjectID.SHAYZIEN_AGILITY_UP_SWING_JUMP_2, ObjectID.SHAYZIEN_AGILITY_UP_END_JUMP,
		// Necropolis
		ObjectID.BCS_NECROPOLIS_ENTRY,
		// Colossal Wyrm
		ObjectID.VARLAMORE_WYRM_AGILITY_START_LADDER_TRIGGER, ObjectID.VARLAMORE_WYRM_AGILITY_BALANCE_1_TRIGGER, ObjectID.VARLAMORE_WYRM_AGILITY_END_ZIPLINE_TRIGGER,
		// Colossal Wyrm basic
		ObjectID.VARLAMORE_WYRM_AGILITY_BASIC_BALANCE_1_TRIGGER, ObjectID.VARLAMORE_WYRM_AGILITY_BASIC_MONKEYBARS_1_TRIGGER, ObjectID.VARLAMORE_WYRM_AGILITY_BASIC_LADDER_1_TRIGGER,
		// Colossal Wyrm advanced
		ObjectID.VARLAMORE_WYRM_AGILITY_ADVANCED_LADDER_1_TRIGGER, ObjectID.VARLAMORE_WYRM_AGILITY_ADVANCED_JUMP_1_TRIGGER, ObjectID.VARLAMORE_WYRM_AGILITY_ADVANCED_BALANCE_1_TRIGGER
	);

	static final Set<Integer> PORTAL_OBSTACLE_IDS = ImmutableSet.of(
		// Prifddinas portals
		ObjectID.PRIF_AGILITY_SHORTCUT_PORTAL_1, ObjectID.PRIF_AGILITY_SHORTCUT_PORTAL_2, ObjectID.PRIF_AGILITY_SHORTCUT_PORTAL_3, ObjectID.PRIF_AGILITY_SHORTCUT_PORTAL_4, ObjectID.PRIF_AGILITY_SHORTCUT_PORTAL_5, ObjectID.PRIF_AGILITY_SHORTCUT_PORTAL_6
	);

	static final Multimap<Integer, AgilityShortcut> SHORTCUT_OBSTACLE_IDS;

	static final Set<Integer> TRAP_OBSTACLE_IDS = ImmutableSet.of(
		// Agility pyramid
		ObjectID.INVISWALL_SERVERSIDE, ObjectID.AGILITY_PYRAMID_PENNY_MULTILOC_LEVEL_2, ObjectID.AGILITY_PYRAMID_PENNY_MULTILOC_LEVEL_4
	);

	static final List<Integer> TRAP_OBSTACLE_REGIONS = ImmutableList.of(12105, 13356);

	static
	{
		final ImmutableMultimap.Builder<Integer, AgilityShortcut> builder = ImmutableMultimap.builder();
		for (final AgilityShortcut item : AgilityShortcut.values())
		{
			for (int obstacle : item.getObstacleIds())
			{
				builder.put(obstacle, item);
			}
		}
		SHORTCUT_OBSTACLE_IDS = builder.build();
	}

	static final Set<Integer> SEPULCHRE_OBSTACLE_IDS = ImmutableSet.of(
		// Stairs and Platforms (and one Gate)
		ObjectID.HALLOWED_PATH_END_GATE, ObjectID.HALLOWED_PATH_END_JUMPOVER_01_NORTH, ObjectID.HALLOWED_PATH_END_JUMPOVER_01_EAST, ObjectID.HALLOWED_PATH_END_JUMPOVER_01_SOUTH, ObjectID.HALLOWED_PATH_END_JUMPOVER_01_WEST, ObjectID.HALLOWED_PATH_END_JUMPOVER_02,
		ObjectID.HALLOWED_FLOOR_2_STEPPINGSTONE, ObjectID.HALLOWED_FLOOR_5_STEPPINGSTONE, ObjectID.HALLOWED_FLOOR_1_NORTHPATH_DROP, ObjectID.HALLOWED_FLOOR_1_EASTPATH_STAIRS, ObjectID.HALLOWED_FLOOR_1_SOUTHPATH_STAIRS, ObjectID.HALLOWED_FLOOR_1_WESTPATH_DROP,
		ObjectID.HALLOWED_FLOOR_2_NORTHPATH_STAIRS, ObjectID.HALLOWED_FLOOR_2_EASTPATH_STAIRS, ObjectID.HALLOWED_FLOOR_2_SOUTHPATH_STAIRS, ObjectID.HALLOWED_FLOOR_2_WESTPATH_DROP, ObjectID.HALLOWED_FLOOR_3_EASTPATH_DROP, ObjectID.HALLOWED_FLOOR_3_WESTPATH_DROP,
		ObjectID.HALLOWED_FLOOR_4_NORTHPATH_DROP, ObjectID.HALLOWED_FLOOR_4_SOUTHPATH_STAIRS, ObjectID.HALLOWED_FLOOR_5_DROP_1, ObjectID.HALLOWED_FLOOR_5_DROP_2
	);

	static final Set<Integer> SEPULCHRE_SKILL_OBSTACLE_IDS = ImmutableSet.of(
		// Grapple, Portal, and Bridge skill obstacles
		// They are multilocs, thus we use the NullObjectID
		ObjectID.HALLOWED_RANGED_PILLAR_MULTI, ObjectID.HALLOWED_PRAYER_MULTI, ObjectID.HALLOWED_PRAYER_MULTI_MIRROR, ObjectID.HALLOWED_CONSTRUCTION_MULTI, ObjectID.HALLOWED_CONSTRUCTION_POOL_MULTI, ObjectID.HALLOWED_MAGIC_MULTI
	);
}
