package com.blueiobase.api.android.designcolors

import android.graphics.Color
import androidx.annotation.ColorInt

/**
 * DesignColors is a Kotlin Singleton object that provides access to:
 *
 * - Material Design Colors specified in the [Material Color System][https://material.io/design/color/the-color-system.html#color-theme-creation].
 * - Flat UI colors used in web design.
 *
 * @author IO DevBlue
 * @since 1.0.0
 */
object DesignColors {

    /**
     * The Material Design color system helps you apply color to your UI in a meaningful way.
     */
    object MaterialDesign {

        @ColorInt val RED_50 = Color.rgb(255, 235, 238)
        @ColorInt val RED_100 = Color.rgb(255, 205, 210)
        @ColorInt val RED_200 = Color.rgb(239, 154, 154)
        @ColorInt val RED_300 = Color.rgb(229, 115, 115)
        @ColorInt val RED_400 = Color.rgb(239, 83, 80)
        @ColorInt val RED_500 = Color.rgb(244, 67, 54)
        @ColorInt val RED_600 = Color.rgb(229, 57, 53)
        @ColorInt val RED_700 = Color.rgb(211, 47, 47)
        @ColorInt val RED_800 = Color.rgb(198, 40, 40)
        @ColorInt val RED_900 = Color.rgb(183, 28, 28)
        @ColorInt val RED_A100 = Color.rgb(255, 138, 128)
        @ColorInt val RED_A200 = Color.rgb(255, 82, 82)
        @ColorInt val RED_A400 = Color.rgb(255, 23, 68)
        @ColorInt val RED_A700 = Color.rgb(213, 0, 0)

        @ColorInt val PINK_50 = Color.rgb(252, 228, 236)
        @ColorInt val PINK_100 = Color.rgb(248, 187, 208)
        @ColorInt val PINK_200 = Color.rgb(244, 143, 177)
        @ColorInt val PINK_300 = Color.rgb(240, 98, 146)
        @ColorInt val PINK_400 = Color.rgb(236, 64, 122)
        @ColorInt val PINK_500 = Color.rgb(233, 30, 99)
        @ColorInt val PINK_600 = Color.rgb(216, 27, 91)
        @ColorInt val PINK_700 = Color.rgb(194, 24, 91)
        @ColorInt val PINK_800 = Color.rgb(173, 20, 87)
        @ColorInt val PINK_900 = Color.rgb(136, 14, 79)
        @ColorInt val PINK_A100 = Color.rgb(255, 128, 171)
        @ColorInt val PINK_A200 = Color.rgb(255, 64, 129)
        @ColorInt val PINK_A400 = Color.rgb(245, 0, 87)
        @ColorInt val PINK_A700 = Color.rgb(197, 17, 98)

        @ColorInt val PURPLE_50 = Color.rgb(243, 229, 245)
        @ColorInt val PURPLE_100 = Color.rgb(225, 190, 231)
        @ColorInt val PURPLE_200 = Color.rgb(206, 147, 216)
        @ColorInt val PURPLE_300 = Color.rgb(186, 104,200)
        @ColorInt val PURPLE_400 = Color.rgb(171, 71, 188)
        @ColorInt val PURPLE_500 = Color.rgb(156, 39, 176)
        @ColorInt val PURPLE_600 = Color.rgb(142, 36, 170)
        @ColorInt val PURPLE_700 = Color.rgb(123, 31, 162)
        @ColorInt val PURPLE_800 = Color.rgb(106, 27, 154)
        @ColorInt val PURPLE_900 = Color.rgb(74, 20, 140)
        @ColorInt val PURPLE_A100 = Color.rgb(234, 128, 252)
        @ColorInt val PURPLE_A200 = Color.rgb(224, 64, 251)
        @ColorInt val PURPLE_A400 = Color.rgb(213, 0, 249)
        @ColorInt val PURPLE_A700 = Color.rgb(170, 0, 255)

        @ColorInt val DEEP_PURPLE_50 = Color.rgb(237, 231, 246)
        @ColorInt val DEEP_PURPLE_100 = Color.rgb(209, 196, 233)
        @ColorInt val DEEP_PURPLE_200 = Color.rgb(179, 157, 219)
        @ColorInt val DEEP_PURPLE_300 = Color.rgb(149, 117, 205)
        @ColorInt val DEEP_PURPLE_400 = Color.rgb(126, 87, 194)
        @ColorInt val DEEP_PURPLE_500 = Color.rgb(103, 58, 183)
        @ColorInt val DEEP_PURPLE_600 = Color.rgb(94, 53, 177)
        @ColorInt val DEEP_PURPLE_700 = Color.rgb(81, 45, 168)
        @ColorInt val DEEP_PURPLE_800 = Color.rgb(69, 39, 160)
        @ColorInt val DEEP_PURPLE_900 = Color.rgb(49, 27, 146)
        @ColorInt val DEEP_PURPLE_A100 = Color.rgb(179, 136, 255)
        @ColorInt val DEEP_PURPLE_A200 = Color.rgb(124, 77, 255)
        @ColorInt val DEEP_PURPLE_A400 = Color.rgb(101, 31, 255)
        @ColorInt val DEEP_PURPLE_A700 = Color.rgb(98, 0, 234)

        @ColorInt val INDIGO_50 = Color.rgb(232, 234, 246)
        @ColorInt val INDIGO_100 = Color.rgb(197, 202, 233)
        @ColorInt val INDIGO_200 = Color.rgb(159, 168, 218)
        @ColorInt val INDIGO_300 = Color.rgb(121, 134, 203)
        @ColorInt val INDIGO_400 = Color.rgb(92, 107, 192)
        @ColorInt val INDIGO_500 = Color.rgb(63, 81, 181)
        @ColorInt val INDIGO_600 = Color.rgb(57, 73, 171)
        @ColorInt val INDIGO_700 = Color.rgb(48, 63, 159)
        @ColorInt val INDIGO_800 = Color.rgb(40, 53, 147)
        @ColorInt val INDIGO_900 = Color.rgb(26, 35, 126)
        @ColorInt val INDIGO_A100 = Color.rgb(140, 158, 255)
        @ColorInt val INDIGO_A200 = Color.rgb(83, 109, 254)
        @ColorInt val INDIGO_A400 = Color.rgb(61, 90, 254)
        @ColorInt val INDIGO_A700 = Color.rgb(48, 79, 254)

        @ColorInt val BLUE_50 = Color.rgb(227, 242, 253)
        @ColorInt val BLUE_100 = Color.rgb(187, 222, 251)
        @ColorInt val BLUE_200 = Color.rgb(144, 202, 249)
        @ColorInt val BLUE_300 = Color.rgb(100, 181, 246)
        @ColorInt val BLUE_400 = Color.rgb(66, 165, 245)
        @ColorInt val BLUE_500 = Color.rgb(33, 150, 243)
        @ColorInt val BLUE_600 = Color.rgb(30, 136, 229)
        @ColorInt val BLUE_700 = Color.rgb(25, 118, 210)
        @ColorInt val BLUE_800 = Color.rgb(21, 101, 192)
        @ColorInt val BLUE_900 = Color.rgb(13, 71, 161)
        @ColorInt val BLUE_A100 = Color.rgb(130, 177, 255)
        @ColorInt val BLUE_A200 = Color.rgb(68, 138, 255)
        @ColorInt val BLUE_A400 = Color.rgb(41, 121, 255)
        @ColorInt val BLUE_A700 = Color.rgb(41, 98, 255)

        @ColorInt val LIGHT_BLUE_50 = Color.rgb(225, 245, 254)
        @ColorInt val LIGHT_BLUE_100 = Color.rgb(179, 229, 252)
        @ColorInt val LIGHT_BLUE_200 = Color.rgb(129, 212, 250)
        @ColorInt val LIGHT_BLUE_300 = Color.rgb(79, 195, 247)
        @ColorInt val LIGHT_BLUE_400 = Color.rgb(41, 182, 246)
        @ColorInt val LIGHT_BLUE_500 = Color.rgb(3, 169, 244)
        @ColorInt val LIGHT_BLUE_600 = Color.rgb(3, 155, 229)
        @ColorInt val LIGHT_BLUE_700 = Color.rgb(2, 136, 209)
        @ColorInt val LIGHT_BLUE_800 = Color.rgb(2, 119, 189)
        @ColorInt val LIGHT_BLUE_900 = Color.rgb(1, 87, 155)
        @ColorInt val LIGHT_BLUE_A100 = Color.rgb(128, 216, 255)
        @ColorInt val LIGHT_BLUE_A200 = Color.rgb(64, 196, 255)
        @ColorInt val LIGHT_BLUE_A400 = Color.rgb(0, 176, 255)
        @ColorInt val LIGHT_BLUE_A700 = Color.rgb(0, 145, 234)

        @ColorInt val CYAN_50 = Color.rgb(224, 247, 250)
        @ColorInt val CYAN_100 = Color.rgb(178, 235, 242)
        @ColorInt val CYAN_200 = Color.rgb(128, 222, 234)
        @ColorInt val CYAN_300 = Color.rgb(77, 208, 225)
        @ColorInt val CYAN_400 = Color.rgb(38, 198, 218)
        @ColorInt val CYAN_500 = Color.rgb(0, 188, 212)
        @ColorInt val CYAN_600 = Color.rgb(0, 172, 193)
        @ColorInt val CYAN_700 = Color.rgb(0, 151, 167)
        @ColorInt val CYAN_800 = Color.rgb(0, 131, 143)
        @ColorInt val CYAN_900 = Color.rgb(0, 96, 100)
        @ColorInt val CYAN_A100 = Color.rgb(133, 255, 255)
        @ColorInt val CYAN_A200 = Color.rgb(24, 255, 255)
        @ColorInt val CYAN_A400 = Color.rgb(0, 229, 255)
        @ColorInt val CYAN_A700 = Color.rgb(0, 184, 212)

        @ColorInt val TEAL_50 = Color.rgb(224, 242, 241)
        @ColorInt val TEAL_100 = Color.rgb(178, 223, 219)
        @ColorInt val TEAL_200 = Color.rgb(128, 203, 196)
        @ColorInt val TEAL_300 = Color.rgb(77, 182, 172)
        @ColorInt val TEAL_400 = Color.rgb(38, 166, 154)
        @ColorInt val TEAL_500 = Color.rgb(0, 150, 136)
        @ColorInt val TEAL_600 = Color.rgb(0, 137, 123)
        @ColorInt val TEAL_700 = Color.rgb(0, 121, 107)
        @ColorInt val TEAL_800 = Color.rgb(0, 105, 92)
        @ColorInt val TEAL_900 = Color.rgb(0, 77, 64)
        @ColorInt val TEAL_A100 = Color.rgb(167, 255, 235)
        @ColorInt val TEAL_A200 = Color.rgb(100, 255, 218)
        @ColorInt val TEAL_A400 = Color.rgb(29, 233, 182)
        @ColorInt val TEAL_A700 = Color.rgb(0, 191, 165)

        @ColorInt val GREEN_50 = Color.rgb(232, 245, 233)
        @ColorInt val GREEN_100 = Color.rgb(200, 230, 201)
        @ColorInt val GREEN_200 = Color.rgb(165, 214, 167)
        @ColorInt val GREEN_300 = Color.rgb(129, 199, 132)
        @ColorInt val GREEN_400 = Color.rgb(102, 187, 106)
        @ColorInt val GREEN_500 = Color.rgb(76, 175, 80)
        @ColorInt val GREEN_600 = Color.rgb(67, 160, 71)
        @ColorInt val GREEN_700 = Color.rgb(56, 142, 60)
        @ColorInt val GREEN_800 = Color.rgb(46, 125, 50)
        @ColorInt val GREEN_900 = Color.rgb(27, 94, 32)
        @ColorInt val GREEN_A100 = Color.rgb(185, 246, 202)
        @ColorInt val GREEN_A200 = Color.rgb(105, 240, 174)
        @ColorInt val GREEN_A400 = Color.rgb(0, 230, 118)
        @ColorInt val GREEN_A700 = Color.rgb(0, 200, 83)

        @ColorInt val LIGHT_GREEN_50 = Color.rgb(241, 248, 233)
        @ColorInt val LIGHT_GREEN_100 = Color.rgb(220, 237, 200)
        @ColorInt val LIGHT_GREEN_200 = Color.rgb(197, 225, 165)
        @ColorInt val LIGHT_GREEN_300 = Color.rgb(174, 213, 219)
        @ColorInt val LIGHT_GREEN_400 = Color.rgb(156, 204, 101)
        @ColorInt val LIGHT_GREEN_500 = Color.rgb(139, 195, 74)
        @ColorInt val LIGHT_GREEN_600 = Color.rgb(124, 179, 66)
        @ColorInt val LIGHT_GREEN_700 = Color.rgb(104, 159, 56)
        @ColorInt val LIGHT_GREEN_800 = Color.rgb(85, 139, 47)
        @ColorInt val LIGHT_GREEN_900 = Color.rgb(51, 105, 30)
        @ColorInt val LIGHT_GREEN_A100 = Color.rgb(204, 255, 144)
        @ColorInt val LIGHT_GREEN_A200 = Color.rgb(178, 255, 89)
        @ColorInt val LIGHT_GREEN_A400 = Color.rgb(118, 255, 3)
        @ColorInt val LIGHT_GREEN_A700 = Color.rgb(100, 221, 23)

        @ColorInt val LIME_50 = Color.rgb(249, 251, 231)
        @ColorInt val LIME_100 = Color.rgb(240, 244, 195)
        @ColorInt val LIME_200 = Color.rgb(230, 238, 156)
        @ColorInt val LIME_300 = Color.rgb(220, 231, 117)
        @ColorInt val LIME_400 = Color.rgb(212, 225, 87)
        @ColorInt val LIME_500 = Color.rgb(205, 220, 57)
        @ColorInt val LIME_600 = Color.rgb(192, 202, 51)
        @ColorInt val LIME_700 = Color.rgb(175, 180, 43)
        @ColorInt val LIME_800 = Color.rgb(158, 157, 36)
        @ColorInt val LIME_900 = Color.rgb(130, 119, 23)
        @ColorInt val LIME_A100 = Color.rgb(244, 255, 129)
        @ColorInt val LIME_A200 = Color.rgb(238, 255, 65)
        @ColorInt val LIME_A400 = Color.rgb(198, 255, 0)
        @ColorInt val LIME_A700 = Color.rgb(174, 234, 0)

        @ColorInt val YELLOW_50 = Color.rgb(255, 253, 231)
        @ColorInt val YELLOW_100 = Color.rgb(255, 249, 196)
        @ColorInt val YELLOW_200 = Color.rgb(255, 245, 157)
        @ColorInt val YELLOW_300 = Color.rgb(255, 241, 118)
        @ColorInt val YELLOW_400 = Color.rgb(255, 238, 88)
        @ColorInt val YELLOW_500 = Color.rgb(255, 235, 59)
        @ColorInt val YELLOW_600 = Color.rgb(253, 216, 53)
        @ColorInt val YELLOW_700 = Color.rgb(251, 192, 45)
        @ColorInt val YELLOW_800 = Color.rgb(249, 168, 37)
        @ColorInt val YELLOW_900 = Color.rgb(245, 127, 23)
        @ColorInt val YELLOW_A100 = Color.rgb(255, 255, 130)
        @ColorInt val YELLOW_A200 = Color.rgb(255, 255, 0)
        @ColorInt val YELLOW_A400 = Color.rgb(255, 234, 0)
        @ColorInt val YELLOW_A700 = Color.rgb(255, 214, 0)

        @ColorInt val AMBER_50 = Color.rgb(255, 248, 225)
        @ColorInt val AMBER_100 = Color.rgb(255, 236, 179)
        @ColorInt val AMBER_200 = Color.rgb(255, 224, 130)
        @ColorInt val AMBER_300 = Color.rgb(255, 213, 79)
        @ColorInt val AMBER_400 = Color.rgb(255, 202, 40)
        @ColorInt val AMBER_500 = Color.rgb(255, 193, 7)
        @ColorInt val AMBER_600 = Color.rgb(255, 179, 0)
        @ColorInt val AMBER_700 = Color.rgb(255, 160, 0)
        @ColorInt val AMBER_800 = Color.rgb(255, 143, 0)
        @ColorInt val AMBER_900 = Color.rgb(255, 111, 0)
        @ColorInt val AMBER_A100 = Color.rgb(255, 229, 127)
        @ColorInt val AMBER_A200 = Color.rgb(255, 215, 64)
        @ColorInt val AMBER_A400 = Color.rgb(255, 196, 0)
        @ColorInt val AMBER_A700 = Color.rgb(255, 171, 0)

        @ColorInt val ORANGE_50 = Color.rgb(255, 243 , 224)
        @ColorInt val ORANGE_100 = Color.rgb(255, 224, 178)
        @ColorInt val ORANGE_200 = Color.rgb(255, 204, 128)
        @ColorInt val ORANGE_300 = Color.rgb(255, 183, 77)
        @ColorInt val ORANGE_400 = Color.rgb(255, 167, 38)
        @ColorInt val ORANGE_500 = Color.rgb(255, 152, 0)
        @ColorInt val ORANGE_600 = Color.rgb(251, 140, 0)
        @ColorInt val ORANGE_700 = Color.rgb(245, 124, 0)
        @ColorInt val ORANGE_800 = Color.rgb(239, 108, 0)
        @ColorInt val ORANGE_900 = Color.rgb(230, 81, 0)
        @ColorInt val ORANGE_A100 = Color.rgb(255, 209, 128)
        @ColorInt val ORANGE_A200 = Color.rgb(255, 171, 64)
        @ColorInt val ORANGE_A400 = Color.rgb(255, 145, 0)
        @ColorInt val ORANGE_A700 = Color.rgb(255, 109, 0)

        @ColorInt val DEEP_ORANGE_50 = Color.rgb(251, 233, 231)
        @ColorInt val DEEP_ORANGE_100 = Color.rgb(255, 204, 188)
        @ColorInt val DEEP_ORANGE_200 = Color.rgb(255, 171, 145)
        @ColorInt val DEEP_ORANGE_300 = Color.rgb(255, 138, 101)
        @ColorInt val DEEP_ORANGE_400 = Color.rgb(255, 112, 67)
        @ColorInt val DEEP_ORANGE_500 = Color.rgb(255, 87, 34)
        @ColorInt val DEEP_ORANGE_600 = Color.rgb(244, 81, 30)
        @ColorInt val DEEP_ORANGE_700 = Color.rgb(230, 74, 25)
        @ColorInt val DEEP_ORANGE_800 = Color.rgb(216, 67, 21)
        @ColorInt val DEEP_ORANGE_900 = Color.rgb(191, 54, 12)
        @ColorInt val DEEP_ORANGE_A100 = Color.rgb(255, 158, 128)
        @ColorInt val DEEP_ORANGE_A200 = Color.rgb(255, 110, 64)
        @ColorInt val DEEP_ORANGE_A400 = Color.rgb(255, 61, 0)
        @ColorInt val DEEP_ORANGE_A700 = Color.rgb(221, 44, 0)

        @ColorInt val BROWN_50 = Color.rgb(239, 235, 233)
        @ColorInt val BROWN_100 = Color.rgb(215, 204, 200)
        @ColorInt val BROWN_200 = Color.rgb(188, 170, 164)
        @ColorInt val BROWN_300 = Color.rgb(161, 136, 127)
        @ColorInt val BROWN_400 = Color.rgb(141, 110, 99)
        @ColorInt val BROWN_500 = Color.rgb(121, 85, 72)
        @ColorInt val BROWN_600 = Color.rgb(109, 76, 65)
        @ColorInt val BROWN_700 = Color.rgb(93, 64, 55)
        @ColorInt val BROWN_800 = Color.rgb(78, 52, 46)
        @ColorInt val BROWN_900 = Color.rgb(62, 39, 35)

        @ColorInt val GREY_50 = Color.rgb(250, 250, 250)
        @ColorInt val GREY_100 = Color.rgb(245, 245, 245)
        @ColorInt val GREY_200 = Color.rgb(238, 238, 238)
        @ColorInt val GREY_300 = Color.rgb(224, 224, 224)
        @ColorInt val GREY_400 = Color.rgb(189, 189, 189)
        @ColorInt val GREY_500 = Color.rgb(158, 158, 158)
        @ColorInt val GREY_600 = Color.rgb(117, 117, 117)
        @ColorInt val GREY_700 = Color.rgb(97, 97, 97)
        @ColorInt val GREY_800 = Color.rgb(66, 66, 66)
        @ColorInt val GREY_900 = Color.rgb(33, 33, 33)

        @ColorInt val BLUE_GREY_50 = Color.rgb(236, 239, 241)
        @ColorInt val BLUE_GREY_100 = Color.rgb(207, 216, 220)
        @ColorInt val BLUE_GREY_200 = Color.rgb(176, 190, 197)
        @ColorInt val BLUE_GREY_300 = Color.rgb(144, 164, 174)
        @ColorInt val BLUE_GREY_400 = Color.rgb(120, 144, 156)
        @ColorInt val BLUE_GREY_500 = Color.rgb(96, 125, 139)
        @ColorInt val BLUE_GREY_600 = Color.rgb(84, 110, 122)
        @ColorInt val BLUE_GREY_700 = Color.rgb(69, 90, 100)
        @ColorInt val BLUE_GREY_800 = Color.rgb(55, 71, 79)
        @ColorInt val BLUE_GREY_900 = Color.rgb(38, 50, 56)

        @ColorInt val WHITE = Color.WHITE
        @ColorInt val BLACK = Color.BLACK

        /**
         * An array containing all 14 Material RED colors.
         */
        val redColorArray = intArrayOf(RED_50, RED_100, RED_200, RED_300, RED_400, RED_500, RED_600, RED_700, RED_800, RED_900, RED_A100, RED_A200, RED_A400, RED_A700)

        /**
         * An array containing all 14 Material PINK colors.
         */
        val pinkColorArray = intArrayOf(PINK_50, PINK_100, PINK_200, PINK_300, PINK_400, PINK_500, PINK_600, PINK_700, PINK_800, PINK_900, PINK_A100, PINK_A200, PINK_A400, PINK_A700)

        /**
         * An array containing all 14 Material PURPLE colors.
         */
        val purpleColorArray = intArrayOf(PURPLE_50, PURPLE_100, PURPLE_200, PURPLE_300, PURPLE_400, PURPLE_500, PURPLE_600, PURPLE_700, PURPLE_800, PURPLE_900, PURPLE_A100, PURPLE_A200, PURPLE_A400, PURPLE_A700)

        /**
         * An array containing all 14 Material DEEP PURPLE colors.
         */
        val deepPurpleColorArray = intArrayOf(DEEP_PURPLE_50, DEEP_PURPLE_100, DEEP_PURPLE_200, DEEP_PURPLE_300, DEEP_PURPLE_400, DEEP_PURPLE_500, DEEP_PURPLE_600, DEEP_PURPLE_700, DEEP_PURPLE_800, DEEP_PURPLE_900, DEEP_PURPLE_A100, DEEP_PURPLE_A200, DEEP_PURPLE_A400, DEEP_PURPLE_A700)

        /**
         * An array containing all 14 Material INDIGO colors.
         */
        val indigoColorArray = intArrayOf(INDIGO_50, INDIGO_100, INDIGO_200, INDIGO_300, INDIGO_400, INDIGO_500, INDIGO_600, INDIGO_700, INDIGO_800, INDIGO_900, INDIGO_A100, INDIGO_A200, INDIGO_A400, INDIGO_A700)

        /**
         * An array containing all 14 Material BLUE colors.
         */
        val blueColorArray = intArrayOf(BLUE_50, BLUE_100, BLUE_200, BLUE_300, BLUE_400, BLUE_500, BLUE_600, BLUE_700, BLUE_800, BLUE_900, BLUE_A100, BLUE_A200, BLUE_A400, BLUE_A700)

        /**
         * An array containing all 14 Material LIGHT BLUE colors.
         */
        val lightBlueColorArray = intArrayOf(LIGHT_BLUE_50, LIGHT_BLUE_100, LIGHT_BLUE_200, LIGHT_BLUE_300, LIGHT_BLUE_400, LIGHT_BLUE_500, LIGHT_BLUE_600, LIGHT_BLUE_700, LIGHT_BLUE_800, LIGHT_BLUE_900, LIGHT_BLUE_A100, LIGHT_BLUE_A200, LIGHT_BLUE_A400, LIGHT_BLUE_A700)

        /**
         * An array containing all 14 Material  CYAN colors.
         */
        val cyanColorArray = intArrayOf(CYAN_50, CYAN_100, CYAN_200, CYAN_300, CYAN_400, CYAN_500, CYAN_600, CYAN_700, CYAN_800, CYAN_900, CYAN_A100, CYAN_A200, CYAN_A400, CYAN_A700)

        /**
         * An array containing all 14 Material TEAL colors.
         */
        val tealColorArray = intArrayOf(TEAL_50, TEAL_100, TEAL_200, TEAL_300, TEAL_400, TEAL_500, TEAL_600, TEAL_700, TEAL_800, TEAL_900, TEAL_A100, TEAL_A200, TEAL_A400, TEAL_A700)

        /**
         * An array containing all 14 Material GREEN colors.
         */
        val greenColorArray = intArrayOf(GREEN_50, GREEN_100, GREEN_200, GREEN_300, GREEN_400, GREEN_500, GREEN_600, GREEN_700, GREEN_800, GREEN_900, GREEN_A100, GREEN_A200, GREEN_A400, GREEN_A700)

        /**
         * An array containing all 14 Material LIGHT GREEN colors.
         */
        val lightGreenColorArray = intArrayOf(LIGHT_GREEN_50, LIGHT_GREEN_100, LIGHT_GREEN_200, LIGHT_GREEN_300, LIGHT_GREEN_400, LIGHT_GREEN_500, LIGHT_GREEN_600, LIGHT_GREEN_700, LIGHT_GREEN_800, LIGHT_GREEN_900, LIGHT_GREEN_A100, LIGHT_GREEN_A200, LIGHT_GREEN_A400, LIGHT_GREEN_A700)

        /**
         * An array containing all 14 Material LIME colors.
         */
        val limeColorArray = intArrayOf(LIME_50, LIME_100, LIME_200, LIME_300, LIME_400, LIME_500, LIME_600, LIME_700, LIME_800, LIME_900, LIME_A100, LIME_A200, LIME_A400, LIME_A700)

        /**
         * An array containing all 14 Material YELLOW colors.
         */
        val yellowColorArray = intArrayOf(YELLOW_50, YELLOW_100, YELLOW_200, YELLOW_300, YELLOW_400, YELLOW_500, YELLOW_600, YELLOW_700, YELLOW_800, YELLOW_900, YELLOW_A100, YELLOW_A200, YELLOW_A400, YELLOW_A700)

        /**
         * An array containing all 14 Material AMBER colors.
         */
        val amberColorArray = intArrayOf(AMBER_50, AMBER_100, AMBER_200, AMBER_300, AMBER_400, AMBER_500, AMBER_600, AMBER_700, AMBER_800, AMBER_900, AMBER_A100, AMBER_A200, AMBER_A400, AMBER_A700)

        /**
         * An array containing all 14 Material ORANGE colors.
         */
        val orangeColorArray = intArrayOf(ORANGE_50, ORANGE_100, ORANGE_200, ORANGE_300, ORANGE_400, ORANGE_500, ORANGE_600, ORANGE_700, ORANGE_800, ORANGE_900, ORANGE_A100, ORANGE_A200, ORANGE_A400, ORANGE_A700)

        /**
         * An array containing all 14 Material DEEP ORANGE colors.
         */
        val deepOrangeColorArray = intArrayOf(DEEP_ORANGE_50, DEEP_ORANGE_100, DEEP_ORANGE_200, DEEP_ORANGE_300, DEEP_ORANGE_400, DEEP_ORANGE_500, DEEP_ORANGE_600, DEEP_ORANGE_700, DEEP_ORANGE_800, DEEP_ORANGE_900, DEEP_ORANGE_A100, DEEP_ORANGE_A200, DEEP_ORANGE_A400, DEEP_ORANGE_A700)

        /**
         * An array containing all 10 Material BROWN colors.
         */
        val brownColorArray = intArrayOf(BROWN_50, BROWN_100, BROWN_200, BROWN_300, BROWN_400, BROWN_500, BROWN_600, BROWN_700, BROWN_800, BROWN_900)

        /**
         * An array containing all 10 Material PINK colors.
         */
        val greyColorArray = intArrayOf(GREY_50, GREY_100, GREY_200, GREY_300, GREY_400, GREY_500, GREY_600, GREY_700, GREY_800, GREY_900)

        /**
         * An array containing all 10 Material BLUE GREY colors.
         */
        val blueGreyColorArray = intArrayOf(BLUE_GREY_50, BLUE_GREY_100, BLUE_GREY_200, BLUE_GREY_300, BLUE_GREY_400, BLUE_GREY_500, BLUE_GREY_600, BLUE_GREY_700, BLUE_GREY_800, BLUE_GREY_900)

        private val arrayOfAllColorArrays = arrayOf(
            redColorArray, pinkColorArray, purpleColorArray, deepPurpleColorArray, indigoColorArray, blueColorArray,
            lightBlueColorArray, cyanColorArray, tealColorArray, greenColorArray, lightGreenColorArray, limeColorArray,
            yellowColorArray, amberColorArray, orangeColorArray, deepOrangeColorArray, brownColorArray, greyColorArray,
            blueGreyColorArray
        )

        /**
         * Gets a random shade of Material RED from the [Red Color Array][redColorArray].
         *
         * @return @[ColorInt] RED.
         */
        fun randomRedColor() = redColorArray[(redColorArray.indices).random()]

        /**
         * Gets a random shade of Material PINK from the [Pink Color Array][pinkColorArray].
         *
         * @return @[ColorInt] PINK.
         */
        fun randomPinkColor() = pinkColorArray[(pinkColorArray.indices).random()]

        /**
         * Gets a random shade of Material PURPLE from the [Purple Color Array][purpleColorArray].
         *
         * @return @[ColorInt] PURPLE.
         */
        fun randomPurpleColor() = purpleColorArray[(purpleColorArray.indices).random()]

        /**
         * Gets a random shade of Material DEEP PURPLE from the [Deep Purple Color Array][deepPurpleColorArray].
         *
         * @return @[ColorInt] DEEP PURPLE.
         */
        fun randomDeepPurpleColor() = deepPurpleColorArray[(deepPurpleColorArray.indices).random()]

        /**
         * Gets a random shade of Material INDIGO from the [Indigo Color Array][indigoColorArray].
         *
         * @return @[ColorInt] INDIGO.
         */
        fun randomIndigoColor() = indigoColorArray[(indigoColorArray.indices).random()]

        /**
         * Gets a random shade of Material BLUE from the [Blue Color Array][blueColorArray].
         *
         * @return @[ColorInt] BLUE.
         */
        fun randomBlueColor() = blueColorArray[(blueColorArray.indices).random()]

        /**
         * Gets a random shade of Material LIGHT BLUE from the [Light Blue Color Array][lightBlueColorArray].
         *
         * @return @[ColorInt] LIGHT BLUE.
         */
        fun randomLightBlueColor() = lightBlueColorArray[(lightBlueColorArray.indices).random()]

        /**
         * Gets a random shade of Material CYAN  from the [Cyan Color Array][cyanColorArray].
         *
         * @return @[ColorInt] CYAN.
         */
        fun randomCyanColor() = cyanColorArray[(cyanColorArray.indices).random()]

        /**
         * Gets a random shade of Material TEAL from the [Teal Color Array][tealColorArray].
         *
         * @return @[ColorInt] TEAL.
         */
        fun randomTealColor() = tealColorArray[(tealColorArray.indices).random()]

        /**
         * Gets a random shade of Material GREEN from the [Green Color Array][greenColorArray].
         *
         * @return @[ColorInt] GREEN.
         */
        fun randomGreenColor() = greenColorArray[(greenColorArray.indices).random()]

        /**
         * Gets a random shade of Material LIGHT GREEN from the [Light Green Color Array][lightGreenColorArray].
         *
         * @return @[ColorInt] LIGHT GREEN.
         */
        fun randomLightGreenColor() = lightGreenColorArray[(lightGreenColorArray.indices).random()]

        /**
         * Gets a random shade of Material LIME from the [Lime Color Array][limeColorArray].
         *
         * @return @[ColorInt] LIME.
         */
        fun randomLimeColor() = limeColorArray[(limeColorArray.indices).random()]

        /**
         * Gets a random shade of Material YELLOW from the [Yellow Color Array][yellowColorArray].
         *
         * @return @[ColorInt] YELLOW.
         */
        fun randomYellowColor() = yellowColorArray[(yellowColorArray.indices).random()]

        /**
         * Gets a random shade of Material AMBER from the [Amber Color Array][amberColorArray].
         *
         * @return @[ColorInt] AMBER.
         */
        fun randomAmberColor() = amberColorArray[(amberColorArray.indices).random()]

        /**
         * Gets a random shade of Material ORANGE from the [Orange Color Array][orangeColorArray].
         *
         * @return @[ColorInt] ORANGE.
         */
        fun randomOrangeColor() = orangeColorArray[(orangeColorArray.indices).random()]

        /**
         * Gets a random shade of Material DEEP ORANGE from the [Deep Orange Color Array][deepOrangeColorArray].
         *
         * @return @[ColorInt] DEEP ORANGE.
         */
        fun randomDeepOrangeColor() = deepOrangeColorArray[(deepOrangeColorArray.indices).random()]

        /**
         * Gets a random shade of Material BROWN from the [Brown Color Array][brownColorArray].
         *
         * @return @[ColorInt] BROWN.
         */
        fun randomBrownColor() = brownColorArray[(brownColorArray.indices).random()]

        /**
         * Gets a random shade of Material GREY from the [Grey Color Array][greyColorArray].
         *
         * @return @[ColorInt] GREY.
         */
        fun randomGreyColor() = greyColorArray[(greyColorArray.indices).random()]

        /**
         * Gets a random shade of Material BLUE GREY from the [Blue Grey Color Array][blueGreyColorArray].
         *
         * @return @[ColorInt] BLUE GREY.
         */
        fun randomBlueGreyColor() = blueGreyColorArray[(blueGreyColorArray.indices).random()]

        /**
         * Picks a random color from one of the [MaterialDesign] colors.
         *
         */
        fun selectRandomColor(): Int {
            val anyColorIntArray = arrayOfAllColorArrays[(arrayOfAllColorArrays.indices).random()]
            return anyColorIntArray[((anyColorIntArray.indices).random())]
        }
    }

    /**
     * The Flat Design UI colors are popular in web design and are used to create simple user-friendly interfaces.
     * Flat Design technique uses simple effects to create designs without effects like shadows, bevels, gradients and embossing.
     */
    object FlatDesign {

        @ColorInt val POMEGRANATE_50 = Color.rgb(249, 235, 234)
        @ColorInt val POMEGRANATE_100 = Color.rgb(242, 215, 213)
        @ColorInt val POMEGRANATE_200 = Color.rgb(230, 176, 170)
        @ColorInt val POMEGRANATE_300 = Color.rgb(217, 136, 128)
        @ColorInt val POMEGRANATE_400 = Color.rgb(205, 97, 85)
        @ColorInt val POMEGRANATE_500 = Color.rgb(192, 57, 43)
        @ColorInt val POMEGRANATE_600 = Color.rgb(169, 50, 38)
        @ColorInt val POMEGRANATE_700 = Color.rgb(146, 43, 33)
        @ColorInt val POMEGRANATE_800 = Color.rgb(123, 36, 28)
        @ColorInt val POMEGRANATE_900 = Color.rgb(100, 30, 22)

        @ColorInt val ALIZARIN_50 = Color.rgb(253, 237, 236)
        @ColorInt val ALIZARIN_100 = Color.rgb(250, 219, 216)
        @ColorInt val ALIZARIN_200 = Color.rgb(245, 183, 177)
        @ColorInt val ALIZARIN_300 = Color.rgb(241, 148, 138)
        @ColorInt val ALIZARIN_400 = Color.rgb(236, 112, 99)
        @ColorInt val ALIZARIN_500 = Color.rgb(231, 76, 60)
        @ColorInt val ALIZARIN_600 = Color.rgb(203, 67, 53)
        @ColorInt val ALIZARIN_700 = Color.rgb(176, 58, 46)
        @ColorInt val ALIZARIN_800 = Color.rgb(148, 49, 38)
        @ColorInt val ALIZARIN_900 = Color.rgb(120, 40, 31)

        @ColorInt val AMETHYST_50 = Color.rgb(245, 238, 248)
        @ColorInt val AMETHYST_100 = Color.rgb(235, 222, 240)
        @ColorInt val AMETHYST_200 = Color.rgb(215, 189, 226)
        @ColorInt val AMETHYST_300 = Color.rgb(195, 155, 211)
        @ColorInt val AMETHYST_400 = Color.rgb(175, 122, 197)
        @ColorInt val AMETHYST_500 = Color.rgb(155, 89, 182)
        @ColorInt val AMETHYST_600 = Color.rgb(136, 78, 160)
        @ColorInt val AMETHYST_700 = Color.rgb(118, 68, 138)
        @ColorInt val AMETHYST_800 = Color.rgb(99, 57, 116)
        @ColorInt val AMETHYST_900 = Color.rgb(81, 46, 95)

        @ColorInt val WISTERIA_50 = Color.rgb(244, 236, 247)
        @ColorInt val WISTERIA_100 = Color.rgb(232, 218, 239)
        @ColorInt val WISTERIA_200 = Color.rgb(210, 180, 222)
        @ColorInt val WISTERIA_300 = Color.rgb(187, 143, 206)
        @ColorInt val WISTERIA_400 = Color.rgb(165, 105, 189)
        @ColorInt val WISTERIA_500 = Color.rgb(142, 68, 173)
        @ColorInt val WISTERIA_600 = Color.rgb(125, 60, 152)
        @ColorInt val WISTERIA_700 = Color.rgb(108, 52, 131)
        @ColorInt val WISTERIA_800 = Color.rgb(91, 44, 111)
        @ColorInt val WISTERIA_900 = Color.rgb(74, 35, 90)

        @ColorInt val BELIZE_HOLE_50 = Color.rgb(234, 242, 248)
        @ColorInt val BELIZE_HOLE_100 = Color.rgb(212, 230, 241)
        @ColorInt val BELIZE_HOLE_200 = Color.rgb(169, 204, 227)
        @ColorInt val BELIZE_HOLE_300 = Color.rgb(127, 179, 213)
        @ColorInt val BELIZE_HOLE_400 = Color.rgb(84, 153, 199)
        @ColorInt val BELIZE_HOLE_500 = Color.rgb(41, 128, 185)
        @ColorInt val BELIZE_HOLE_600 = Color.rgb(36, 113, 163)
        @ColorInt val BELIZE_HOLE_700 = Color.rgb(31, 97, 141)
        @ColorInt val BELIZE_HOLE_800 = Color.rgb(26, 82, 118)
        @ColorInt val BELIZE_HOLE_900 = Color.rgb(21, 67, 96)

        @ColorInt val PETER_RIVER_50 = Color.rgb(235, 245, 251)
        @ColorInt val PETER_RIVER_100 = Color.rgb(214, 234, 248)
        @ColorInt val PETER_RIVER_200 = Color.rgb(174, 214, 241)
        @ColorInt val PETER_RIVER_300 = Color.rgb(133, 193, 233)
        @ColorInt val PETER_RIVER_400 = Color.rgb(93, 173, 226)
        @ColorInt val PETER_RIVER_500 = Color.rgb(52, 152, 219)
        @ColorInt val PETER_RIVER_600 = Color.rgb(46, 134, 193)
        @ColorInt val PETER_RIVER_700 = Color.rgb(40, 116, 166)
        @ColorInt val PETER_RIVER_800 = Color.rgb(33, 97, 140)
        @ColorInt val PETER_RIVER_900 = Color.rgb(27, 79, 114)

        @ColorInt val TORQUOISE_50 = Color.rgb(232, 248, 245)
        @ColorInt val TORQUOISE_100 = Color.rgb(209, 242, 235)
        @ColorInt val TORQUOISE_200 = Color.rgb(163, 228, 215)
        @ColorInt val TORQUOISE_300 = Color.rgb(118, 215, 196)
        @ColorInt val TORQUOISE_400 = Color.rgb(72, 201, 176)
        @ColorInt val TORQUOISE_500 = Color.rgb(26, 188, 156)
        @ColorInt val TORQUOISE_600 = Color.rgb(23, 165, 137)
        @ColorInt val TORQUOISE_700 = Color.rgb(20, 143, 119)
        @ColorInt val TORQUOISE_800 = Color.rgb(17, 120, 100)
        @ColorInt val TORQUOISE_900 = Color.rgb(14, 98, 81)

        @ColorInt val GREEN_SEA_50 = Color.rgb(232, 246, 243)
        @ColorInt val GREEN_SEA_100 = Color.rgb(208, 236, 231)
        @ColorInt val GREEN_SEA_200 = Color.rgb(162, 217, 206)
        @ColorInt val GREEN_SEA_300 = Color.rgb(115, 198, 182)
        @ColorInt val GREEN_SEA_400 = Color.rgb(69, 179, 157)
        @ColorInt val GREEN_SEA_500 = Color.rgb(22, 160, 133)
        @ColorInt val GREEN_SEA_600 = Color.rgb(19, 141, 117)
        @ColorInt val GREEN_SEA_700 = Color.rgb(17, 122, 101)
        @ColorInt val GREEN_SEA_800 = Color.rgb(14, 102, 85)
        @ColorInt val GREEN_SEA_900 = Color.rgb(11, 83, 69)

        @ColorInt val NEPHRITIS_50 = Color.rgb(233, 247, 239)
        @ColorInt val NEPHRITIS_100 = Color.rgb(212, 239, 223)
        @ColorInt val NEPHRITIS_200 = Color.rgb(169, 223, 191)
        @ColorInt val NEPHRITIS_300 = Color.rgb(125, 206, 160)
        @ColorInt val NEPHRITIS_400 = Color.rgb(82, 190, 128)
        @ColorInt val NEPHRITIS_500 = Color.rgb(39, 174, 96)
        @ColorInt val NEPHRITIS_600 = Color.rgb(34, 153, 84)
        @ColorInt val NEPHRITIS_700 = Color.rgb(30, 132, 73)
        @ColorInt val NEPHRITIS_800 = Color.rgb(25, 111, 61)
        @ColorInt val NEPHRITIS_900 = Color.rgb(20, 90, 50)

        @ColorInt val EMERALD_50 = Color.rgb(234, 250, 241)
        @ColorInt val EMERALD_100 = Color.rgb(213, 245, 227)
        @ColorInt val EMERALD_200 = Color.rgb(171, 235, 198)
        @ColorInt val EMERALD_300 = Color.rgb(130, 224, 170)
        @ColorInt val EMERALD_400 = Color.rgb(88, 214, 141)
        @ColorInt val EMERALD_500 = Color.rgb(46, 204, 113)
        @ColorInt val EMERALD_600 = Color.rgb(40, 180, 99)
        @ColorInt val EMERALD_700 = Color.rgb(35, 155, 86)
        @ColorInt val EMERALD_800 = Color.rgb(29, 131, 72)
        @ColorInt val EMERALD_900 = Color.rgb(24, 106, 59)

        @ColorInt val SUNFLOWER_50 = Color.rgb(254, 249, 231)
        @ColorInt val SUNFLOWER_100 = Color.rgb(252, 243, 207)
        @ColorInt val SUNFLOWER_200 = Color.rgb(249, 231, 159)
        @ColorInt val SUNFLOWER_300 = Color.rgb(247, 220, 111)
        @ColorInt val SUNFLOWER_400 = Color.rgb(244, 208, 63)
        @ColorInt val SUNFLOWER_500 = Color.rgb(241, 196, 15)
        @ColorInt val SUNFLOWER_600 = Color.rgb(212, 172, 13)
        @ColorInt val SUNFLOWER_700 = Color.rgb(183, 149, 11)
        @ColorInt val SUNFLOWER_800 = Color.rgb(154, 125, 10)
        @ColorInt val SUNFLOWER_900 = Color.rgb(125, 102, 8)

        @ColorInt val ORANGE_50 = Color.rgb(254, 245, 231)
        @ColorInt val ORANGE_100 = Color.rgb(253, 235, 208)
        @ColorInt val ORANGE_200 = Color.rgb(250, 215, 160)
        @ColorInt val ORANGE_300 = Color.rgb(248, 196, 113)
        @ColorInt val ORANGE_400 = Color.rgb(245, 176, 65)
        @ColorInt val ORANGE_500 = Color.rgb(243, 156, 18)
        @ColorInt val ORANGE_600 = Color.rgb(214, 137, 16)
        @ColorInt val ORANGE_700 = Color.rgb(185, 119, 14)
        @ColorInt val ORANGE_800 = Color.rgb(156, 100, 12)
        @ColorInt val ORANGE_900 = Color.rgb(126, 81, 9)

        @ColorInt val CARROT_50 = Color.rgb(253, 242, 233)
        @ColorInt val CARROT_100 = Color.rgb(250, 229, 211)
        @ColorInt val CARROT_200 = Color.rgb(245, 203, 167)
        @ColorInt val CARROT_300 = Color.rgb(240, 178, 122)
        @ColorInt val CARROT_400 = Color.rgb(235, 152, 78)
        @ColorInt val CARROT_500 = Color.rgb(230, 126, 34)
        @ColorInt val CARROT_600 = Color.rgb(202, 111, 30)
        @ColorInt val CARROT_700 = Color.rgb(175, 96, 26)
        @ColorInt val CARROT_800 = Color.rgb(147, 81, 22)
        @ColorInt val CARROT_900 = Color.rgb(120, 66, 18)

        @ColorInt val PUMPKIN_50 = Color.rgb(251, 238, 230)
        @ColorInt val PUMPKIN_100 = Color.rgb(246, 221, 204)
        @ColorInt val PUMPKIN_200 = Color.rgb(237, 187, 153)
        @ColorInt val PUMPKIN_300 = Color.rgb(229, 152, 102)
        @ColorInt val PUMPKIN_400 = Color.rgb(220, 118, 51)
        @ColorInt val PUMPKIN_500 = Color.rgb(211, 84, 0)
        @ColorInt val PUMPKIN_600 = Color.rgb(186, 74, 0)
        @ColorInt val PUMPKIN_700 = Color.rgb(160, 64, 0)
        @ColorInt val PUMPKIN_800 = Color.rgb(135, 54, 0)
        @ColorInt val PUMPKIN_900 = Color.rgb(110, 44, 0)

        @ColorInt val CLOUD_50 = Color.rgb(253, 254, 254)
        @ColorInt val CLOUD_100 = Color.rgb(251, 252, 252)
        @ColorInt val CLOUD_200 = Color.rgb(247, 249, 249)
        @ColorInt val CLOUD_300 = Color.rgb(244, 246, 247)
        @ColorInt val CLOUD_400 = Color.rgb(240, 243, 244)
        @ColorInt val CLOUD_500 = Color.rgb(236, 240, 241)
        @ColorInt val CLOUD_600 = Color.rgb(208, 211, 212)
        @ColorInt val CLOUD_700 = Color.rgb(179, 182, 183)
        @ColorInt val CLOUD_800 = Color.rgb(151, 154, 154)
        @ColorInt val CLOUD_900 = Color.rgb(123, 125, 125)

        @ColorInt val SILVER_50 = Color.rgb(248, 249, 249)
        @ColorInt val SILVER_100 = Color.rgb(242, 243, 244)
        @ColorInt val SILVER_200 = Color.rgb(229, 231, 233)
        @ColorInt val SILVER_300 = Color.rgb(215, 219, 221)
        @ColorInt val SILVER_400 = Color.rgb(202, 207, 210)
        @ColorInt val SILVER_500 = Color.rgb(189, 195, 199)
        @ColorInt val SILVER_600 = Color.rgb(166, 172, 175)
        @ColorInt val SILVER_700 = Color.rgb(144, 148, 151)
        @ColorInt val SILVER_800 = Color.rgb(121, 125, 127)
        @ColorInt val SILVER_900 = Color.rgb(98, 101, 103)

        @ColorInt val CONCRETE_50 = Color.rgb(244, 246, 246)
        @ColorInt val CONCRETE_100 = Color.rgb(234, 237, 237)
        @ColorInt val CONCRETE_200 = Color.rgb(213, 219, 219)
        @ColorInt val CONCRETE_300 = Color.rgb(191, 201, 202)
        @ColorInt val CONCRETE_400 = Color.rgb(170, 183, 184)
        @ColorInt val CONCRETE_500 = Color.rgb(149, 165, 166)
        @ColorInt val CONCRETE_600 = Color.rgb(131, 145, 146)
        @ColorInt val CONCRETE_700 = Color.rgb(113, 125, 126)
        @ColorInt val CONCRETE_800 = Color.rgb(95, 106, 106)
        @ColorInt val CONCRETE_900 = Color.rgb(77, 86, 86)

        @ColorInt val ASBESTOS_50 = Color.rgb(242, 244, 244)
        @ColorInt val ASBESTOS_100 = Color.rgb(229, 232, 232)
        @ColorInt val ASBESTOS_200 = Color.rgb(204, 209, 209)
        @ColorInt val ASBESTOS_300 = Color.rgb(178, 186, 187)
        @ColorInt val ASBESTOS_400 = Color.rgb(153, 163, 164)
        @ColorInt val ASBESTOS_500 = Color.rgb(127, 140, 141)
        @ColorInt val ASBESTOS_600 = Color.rgb(112, 123, 124)
        @ColorInt val ASBESTOS_700 = Color.rgb(97, 106, 107)
        @ColorInt val ASBESTOS_800 = Color.rgb(81, 90, 90)
        @ColorInt val ASBESTOS_900 = Color.rgb(66, 73, 73)

        @ColorInt val WET_ASPHALT_50 = Color.rgb(235, 237, 239)
        @ColorInt val WET_ASPHALT_100 = Color.rgb(214, 219, 223)
        @ColorInt val WET_ASPHALT_200 = Color.rgb(174, 182, 191)
        @ColorInt val WET_ASPHALT_300 = Color.rgb(133, 146, 158)
        @ColorInt val WET_ASPHALT_400 = Color.rgb(93, 109, 126)
        @ColorInt val WET_ASPHALT_500 = Color.rgb(52, 73, 94)
        @ColorInt val WET_ASPHALT_600 = Color.rgb(46, 64, 83)
        @ColorInt val WET_ASPHALT_700 = Color.rgb(40, 55, 71)
        @ColorInt val WET_ASPHALT_800 = Color.rgb(33, 47, 60)
        @ColorInt val WET_ASPHALT_900 = Color.rgb(27, 38, 49)

        @ColorInt val MIDNIGHT_BLUE_50 = Color.rgb(234, 236, 238)
        @ColorInt val MIDNIGHT_BLUE_100 = Color.rgb(213, 216, 220)
        @ColorInt val MIDNIGHT_BLUE_200 = Color.rgb(171, 178, 185)
        @ColorInt val MIDNIGHT_BLUE_300 = Color.rgb(128, 139, 150)
        @ColorInt val MIDNIGHT_BLUE_400 = Color.rgb(86, 101, 115)
        @ColorInt val MIDNIGHT_BLUE_500 = Color.rgb(44, 62, 80)
        @ColorInt val MIDNIGHT_BLUE_600 = Color.rgb(39, 55, 70)
        @ColorInt val MIDNIGHT_BLUE_700 = Color.rgb(33, 47, 61)
        @ColorInt val MIDNIGHT_BLUE_800 = Color.rgb(28, 40, 51)
        @ColorInt val MIDNIGHT_BLUE_900 = Color.rgb(23, 32, 42)

        /**
         * An array containing all 10 FlatDesign POMEGRANATE colors.
         */
        val pomegranateColorArray = intArrayOf( POMEGRANATE_50, POMEGRANATE_100, POMEGRANATE_200, POMEGRANATE_300, POMEGRANATE_400, POMEGRANATE_500, POMEGRANATE_600, POMEGRANATE_700, POMEGRANATE_800, POMEGRANATE_900)

        /**
         * An array containing all 10 FlatDesign ALIZARIN colors.
         */
        val alizarinColorArray = intArrayOf( ALIZARIN_50, ALIZARIN_100, ALIZARIN_200, ALIZARIN_300, ALIZARIN_400, ALIZARIN_500, ALIZARIN_600, ALIZARIN_700, ALIZARIN_800, ALIZARIN_900)

        /**
         * An array containing all 10 FlatDesign AMETHYST colors.
         */
        val amethystColorArray = intArrayOf( AMETHYST_50, AMETHYST_100, AMETHYST_200, AMETHYST_300, AMETHYST_400, AMETHYST_500, AMETHYST_600, AMETHYST_700, AMETHYST_800, AMETHYST_900)

        /**
         * An array containing all 10 FlatDesign WISTERIA colors.
         */
        val wisteriaColorArray = intArrayOf( WISTERIA_50, WISTERIA_100, WISTERIA_200, WISTERIA_300, WISTERIA_400, WISTERIA_500, WISTERIA_600, WISTERIA_700, WISTERIA_800, WISTERIA_900)

        /**
         * An array containing all 10 FlatDesign BELIZE HOLE colors.
         */
        val belizeHoleColorArray = intArrayOf( BELIZE_HOLE_50, BELIZE_HOLE_100, BELIZE_HOLE_200, BELIZE_HOLE_300, BELIZE_HOLE_400, BELIZE_HOLE_500, BELIZE_HOLE_600, BELIZE_HOLE_700, BELIZE_HOLE_800, BELIZE_HOLE_900)

        /**
         * An array containing all 10 FlatDesign PETER RIVER colors.
         */
        val peterRiverColorArray = intArrayOf( PETER_RIVER_50, PETER_RIVER_100, PETER_RIVER_200, PETER_RIVER_300, PETER_RIVER_400, PETER_RIVER_500, PETER_RIVER_600, PETER_RIVER_700, PETER_RIVER_800, PETER_RIVER_900)

        /**
         * An array containing all 10 FlatDesign TORQUOISE colors.
         */
        val torquoiseColorArray = intArrayOf( TORQUOISE_50, TORQUOISE_100, TORQUOISE_200, TORQUOISE_300, TORQUOISE_400, TORQUOISE_500, TORQUOISE_600, TORQUOISE_700, TORQUOISE_800, TORQUOISE_900)

        /**
         * An array containing all 10 FlatDesign GREEN SEA colors.
         */
        val greenSeaColorArray = intArrayOf( GREEN_SEA_50, GREEN_SEA_100, GREEN_SEA_200, GREEN_SEA_300, GREEN_SEA_400, GREEN_SEA_500, GREEN_SEA_600, GREEN_SEA_700, GREEN_SEA_800, GREEN_SEA_900)

        /**
         * An array containing all 10 FlatDesign NEPHRITIS colors.
         */
        val nephritisColorArray = intArrayOf( NEPHRITIS_50, NEPHRITIS_100, NEPHRITIS_200, NEPHRITIS_300, NEPHRITIS_400, NEPHRITIS_500, NEPHRITIS_600, NEPHRITIS_700, NEPHRITIS_800, NEPHRITIS_900)

        /**
         * An array containing all 10 FlatDesign EMERALD colors.
         */
        val emeraldColorArray = intArrayOf( EMERALD_50, EMERALD_100, EMERALD_200, EMERALD_300, EMERALD_400, EMERALD_500, EMERALD_600, EMERALD_700, EMERALD_800, EMERALD_900)

        /**
         * An array containing all 10 FlatDesign SUNFLOWER colors.
         */
        val sunflowerColorArray = intArrayOf( SUNFLOWER_50, SUNFLOWER_100, SUNFLOWER_200, SUNFLOWER_300, SUNFLOWER_400, SUNFLOWER_500, SUNFLOWER_600, SUNFLOWER_700, SUNFLOWER_800, SUNFLOWER_900)

        /**
         * An array containing all 10 FlatDesign ORANGE colors.
         */
        val orangeColorArray = intArrayOf( ORANGE_50, ORANGE_100, ORANGE_200, ORANGE_300, ORANGE_400, ORANGE_500, ORANGE_600, ORANGE_700, ORANGE_800, ORANGE_900)

        /**
         * An array containing all 10 FlatDesign CARROT colors.
         */
        val carrotColorArray = intArrayOf( CARROT_50, CARROT_100, CARROT_200, CARROT_300, CARROT_400, CARROT_500, CARROT_600, CARROT_700, CARROT_800, CARROT_900)

        /**
         * An array containing all 10 FlatDesign PUMPKIN colors.
         */
        val pumpkinColorArray = intArrayOf( PUMPKIN_50, PUMPKIN_100, PUMPKIN_200, PUMPKIN_300, PUMPKIN_400, PUMPKIN_500, PUMPKIN_600, PUMPKIN_700, PUMPKIN_800, PUMPKIN_900)

        /**
         * An array containing all 10 FlatDesign CLOUD colors.
         */
        val cloudColorArray = intArrayOf( CLOUD_50, CLOUD_100, CLOUD_200, CLOUD_300, CLOUD_400, CLOUD_500, CLOUD_600, CLOUD_700, CLOUD_800, CLOUD_900)

        /**
         * An array containing all 10 FlatDesign SILVER colors.
         */
        val silverColorArray = intArrayOf( SILVER_50, SILVER_100, SILVER_200, SILVER_300, SILVER_400, SILVER_500, SILVER_600, SILVER_700, SILVER_800, SILVER_900)

        /**
         * An array containing all 10 FlatDesign CONCRETE colors.
         */
        val concreteColorArray = intArrayOf( CONCRETE_50, CONCRETE_100, CONCRETE_200, CONCRETE_300, CONCRETE_400, CONCRETE_500, CONCRETE_600, CONCRETE_700, CONCRETE_800, CONCRETE_900)

        /**
         * An array containing all 10 FlatDesign ASBESTOS colors.
         */
        val asbestosColorArray = intArrayOf( ASBESTOS_50, ASBESTOS_100, ASBESTOS_200, ASBESTOS_300, ASBESTOS_400, ASBESTOS_500, ASBESTOS_600, ASBESTOS_700, ASBESTOS_800, ASBESTOS_900)

        /**
         * An array containing all 10 FlatDesign WET ASPHALT colors.
         */
        val wetAsphaltColorArray = intArrayOf( WET_ASPHALT_50, WET_ASPHALT_100, WET_ASPHALT_200, WET_ASPHALT_300, WET_ASPHALT_400, WET_ASPHALT_500, WET_ASPHALT_600, WET_ASPHALT_700, WET_ASPHALT_800, WET_ASPHALT_900)

        /**
         * An array containing all 10 FlatDesign MIDNIGHT BLUE colors.
         */
        val midNightBlueColorArray = intArrayOf( MIDNIGHT_BLUE_50, MIDNIGHT_BLUE_100, MIDNIGHT_BLUE_200, MIDNIGHT_BLUE_300, MIDNIGHT_BLUE_400, MIDNIGHT_BLUE_500, MIDNIGHT_BLUE_600, MIDNIGHT_BLUE_700, MIDNIGHT_BLUE_800, MIDNIGHT_BLUE_900)

        /**
         * Gets a random shade of FlatDesign POMEGRANATE from the [Pomegranate Color Array][pomegranateColorArray].
         *
         * @return @[ColorInt] POMEGRANATE.
         */
        fun randomPomegranateColor() = pomegranateColorArray[(pomegranateColorArray.indices).random()]

        /**
         * Gets a random shade of FlatDesign ALIZARIN from the [Alizarin Color Array][alizarinColorArray].
         *
         * @return @[ColorInt] ALIZARIN.
         */
        fun randomAlizarinColor() = alizarinColorArray[(alizarinColorArray.indices).random()]

        /**
         * Gets a random shade of FlatDesign AMETHYST from the [Amethyst Color Array][amethystColorArray].
         *
         * @return @[ColorInt] AMETHYST.
         */
        fun randomAmethystColor() = amethystColorArray[(amethystColorArray.indices).random()]

        /**
         * Gets a random shade of FlatDesign WISTERIA from the [Wisteria Color Array][wisteriaColorArray].
         *
         * @return @[ColorInt] WISTERIA.
         */
        fun randomWisteriaColor() = wisteriaColorArray[(wisteriaColorArray.indices).random()]

        /**
         * Gets a random shade of FlatDesign BELIZE HOLE from the [Belize Hole Color Array][belizeHoleColorArray].
         *
         * @return @[ColorInt] BELIZE HOLE.
         */
        fun randomBelizeHoleColor() = belizeHoleColorArray[(belizeHoleColorArray.indices).random()]

        /**
         * Gets a random shade of FlatDesign PETER RIVER from the [Peter River Color Array][peterRiverColorArray].
         *
         * @return @[ColorInt] PETER RIVER.
         */
        fun randomPeterRiverColor() = peterRiverColorArray[(peterRiverColorArray.indices).random()]

        /**
         * Gets a random shade of FlatDesign TORQUOISE from the [Torquoise Color Array][torquoiseColorArray].
         *
         * @return @[ColorInt] TORQUOISE.
         */
        fun randomTorquoiseColor() = torquoiseColorArray[(torquoiseColorArray.indices).random()]

        /**
         * Gets a random shade of FlatDesign GREEN SEA from the [Green Sea Color Array][greenSeaColorArray].
         *
         * @return @[ColorInt] GREEN SEA.
         */
        fun randomGreenSeaColor() = greenSeaColorArray[(greenSeaColorArray.indices).random()]

        /**
         * Gets a random shade of FlatDesign NEPHRITIS from the [Nephritis Color Array][nephritisColorArray].
         *
         * @return @[ColorInt] NEPHRITIS.
         */
        fun randomNephritisColor() = nephritisColorArray[(nephritisColorArray.indices).random()]

        /**
         * Gets a random shade of FlatDesign EMERALD from the [Emerald Color Array][emeraldColorArray].
         *
         * @return @[ColorInt] EMERALD.
         */
        fun randomEmeraldColor() = emeraldColorArray[(emeraldColorArray.indices).random()]

        /**
         * Gets a random shade of FlatDesign SUNFLOWER from the [Sunflower Color Array][sunflowerColorArray].
         *
         * @return @[ColorInt] SUNFLOWER.
         */
        fun randomSunflowerColor() = sunflowerColorArray[(sunflowerColorArray.indices).random()]

        /**
         * Gets a random shade of FlatDesign ORANGE from the [Orange Color Array][orangeColorArray].
         *
         * @return @[ColorInt] ORANGE.
         */
        fun randomOrangeColor() = orangeColorArray[(orangeColorArray.indices).random()]

        /**
         * Gets a random shade of FlatDesign CARROT from the [Carrot Color Array][carrotColorArray].
         *
         * @return @[ColorInt] CARROT.
         */
        fun randomCarrotColor() = carrotColorArray[(carrotColorArray.indices).random()]

        /**
         * Gets a random shade of FlatDesign PUMPKIN from the [Pumpkin Color Array][pumpkinColorArray].
         *
         * @return @[ColorInt] PUMPKIN.
         */
        fun randomPumpkinColor() = pumpkinColorArray[(pumpkinColorArray.indices).random()]

        /**
         * Gets a random shade of FlatDesign CLOUD from the [Cloud Color Array][cloudColorArray].
         *
         * @return @[ColorInt] CLOUD.
         */
        fun randomCloudColor() = cloudColorArray[(cloudColorArray.indices).random()]

        /**
         * Gets a random shade of FlatDesign SILVER from the [Silver Color Array][silverColorArray].
         *
         * @return @[ColorInt] SILVER.
         */
        fun randomSilverColor() = silverColorArray[(silverColorArray.indices).random()]

        /**
         * Gets a random shade of FlatDesign CONCRETE from the [Concrete Color Array][concreteColorArray].
         *
         * @return @[ColorInt] CONCRETE.
         */
        fun randomConcreteColor() = concreteColorArray[(concreteColorArray.indices).random()]

        /**
         * Gets a random shade of FlatDesign ASBESTOS from the [Asbestos Color Array][asbestosColorArray].
         *
         * @return @[ColorInt] ASBESTOS.
         */
        fun randomAsbestosColor() = asbestosColorArray[(asbestosColorArray.indices).random()]

        /**
         * Gets a random shade of FlatDesign WET ASPHALT from the [Wet Asphalt Color Array][wetAsphaltColorArray].
         *
         * @return @[ColorInt] WET ASPHALT.
         */
        fun randomWetAsphaltColor() = wetAsphaltColorArray[(wetAsphaltColorArray.indices).random()]

        /**
         * Gets a random shade of FlatDesign MIDNIGHT BLUE from the [MidNight Blue Array][midNightBlueColorArray].
         *
         * @return @[ColorInt] MIDNIGHT BLUE.
         */
        fun randomMidNightBlueColor() = midNightBlueColorArray[(midNightBlueColorArray.indices).random()]

        private val arrayOfAllColorArrays = arrayOf(
            pomegranateColorArray, alizarinColorArray, amethystColorArray,
            wisteriaColorArray, belizeHoleColorArray, peterRiverColorArray,
            torquoiseColorArray, greenSeaColorArray, nephritisColorArray,
            emeraldColorArray, sunflowerColorArray, orangeColorArray,
            carrotColorArray, pumpkinColorArray, cloudColorArray,
            silverColorArray, concreteColorArray, asbestosColorArray,
            wetAsphaltColorArray, midNightBlueColorArray

        )

        /**
         * Picks a random color from one of the [FlatDesign] colors.
         *
         */
        fun selectRandomColor(): Int {
            val anyColorIntArray = arrayOfAllColorArrays[(arrayOfAllColorArrays.indices).random()]
            return anyColorIntArray[((anyColorIntArray.indices).random())]
        }
    }

}