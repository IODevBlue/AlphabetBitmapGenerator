package com.blueiobase.api.android.alphabetbitmapgenerator

import android.content.Context
import android.content.res.Resources
import android.graphics.*
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.text.TextPaint
import androidx.annotation.ColorInt
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import com.blueiobase.api.android.R
import com.blueiobase.api.android.designcolors.DesignColors

/**
 * This class generates a circular [Bitmap] containing a single Alphabet from the first [Char] of a given [String].
 *
 * A default image is used if no Character is available.
 * @author IO DevBlue
 * @see [DesignColors]
 * @since 1.0.0
 */
open class AlphabetBitmapGenerator (context: Context) {

   companion object {

        /**
         * Provides a [Bitmap] from the given [Drawable].
         *
         * If the [Drawable] object is a [BitmapDrawable], then its [Bitmap] is returned.
         * @param drawable The [Drawable] to convert to [Bitmap].
         * @return A [Bitmap] from the [drawable]
         */
        fun convertDrawableToBitmap(drawable: Drawable): Bitmap {

            if (drawable is BitmapDrawable) {
                drawable.bitmap?.let { return it }
            }

            val bitmap = if (drawable.intrinsicWidth <= 0 || drawable.intrinsicHeight <= 0) {
                Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888)
            } else {
                Bitmap.createBitmap(drawable.intrinsicWidth, drawable.intrinsicHeight, Bitmap.Config.ARGB_8888)
            }

            val canvas = Canvas(bitmap)
            drawable.apply {
                setBounds(0, 0, canvas.width, canvas.height)
                draw(canvas)
            }

            return bitmap
        }

        /**
         * Validates if the given [Char] object is an Alphabet or a Digit.
         * @param character The [Char] object to be verified as an Alphabet or Digit.
         * @return True if the [character] is an Alphabet or a Digit. False if otherwise.
         */
        fun verifyIfAlphabetOrDigit(character: Char) = Character.isLetterOrDigit(character)

        /**
         * Converts Density-Independent Pixels to Pixels
         * @param dp Density-Independent Pixels in [Integer]
         * @return Pixels in [Integer]
         */
        fun dpToPx(dp: Int) = (dp * Resources.getSystem().displayMetrics.density).toInt()

    }

    /** The [TextPaint] object for drawing the Alphabet.*/
    private val mPaint = TextPaint()

    /** The rectangular boundary of the Alphabet. */
    private val mBounds = Rect()

    /** The [CharArray] object holding the first Alphabet of the provided [String]. */
    private val mFirstCharacter = CharArray(1)

    /**
     * The Color [Int] for the Alphabet text.
     *
     * Default is [Color.WHITE].
     */
    @ColorInt var alphabetTextColor = Color.BLACK
        set(value) {
            mPaint.color = value
            field = value
        }

    /**
     * The font for the Alphabet text.
     *
     * Default is Gotham Medium.
     */
    var alphabetTypeface = ResourcesCompat.getFont(context, R.font.gotham_medium)
        set(value) {
            mPaint.typeface = value
            field = value
        }

    /** The default image in [Drawable] to be used if there is no character provided to generate an Alphabet. */
    var defaultDrawable = ContextCompat.getDrawable(context, R.drawable.profile_pic)!!
        set(value) {
            mDefaultBitmap = convertDrawableToBitmap(value)
            field = value
        }

    /** The default image in [Bitmap] to be used if there is no character provided to generate an Alphabet. */
    private var mDefaultBitmap = convertDrawableToBitmap(defaultDrawable)

    /** The default width dimension of the generated Alphabet Image. */
    private var mWidth = 50

    /** The default height dimension of the generated Alphabet Image. */
    private var mHeight = 50

    /** The density of the display used to set the [font size][fontSize] properly. */
    private val scale = context.resources.displayMetrics.density

    /**
     * The font size (in [Float]) of the generated Alphabet Image.
     *
     * Default = 17F
     */
    var fontSize = 17F
        set(value) {
            if (value == 0f) return
            else field = value * scale
            mPaint.textSize = field
        }

    init {
        mPaint.apply {
            typeface = alphabetTypeface
            color = alphabetTextColor
            textAlign = Paint.Align.CENTER
            isAntiAlias = true
            textSize = fontSize * scale
        }

    }

    /**
     * Sets an equal dimension for the generated Alphabet Image.
     * This is usually set to the dimension of the [ImageView][android.widget.ImageView] which would contain the generated [Bitmap].
     *
     * Default = 50 x 50.
     * @param dimension The dimension to be applied to both the width and height.
     * @see setSpecificDimension
     */
    fun setDimension(dimension: Int) {
        dimension.let {
            if (it == 0) return
            else {
                mWidth = it
                mHeight = it
            }
        }
    }

    /**
     * Sets a specific dimension for the generated Alphabet Image.
     *
     * If either the [width] or [height] parameter is zero, the dimensions are automatically reset to the default dimension.
     *
     * Default = 50 x 50.
     *
     * @param width The width dimension.
     * @param height The height dimension.
     * @see setDimension
     */
    fun setSpecificDimension(width: Int, height: Int) {
        if (width == 0 || height == 0) {
           setDimension(50)
            return
        }
        mWidth = width
        mHeight = height
    }

    /**
     * Generates a rectangular Alphabet Image [Bitmap] using the first character from the [displayName] parameter.
     * @param displayName The name [String] whose first character would be used in generating an Alphabet Image.
     * @param backgroundColor The background color to be applied to the [Bitmap]. A random [Material][DesignColors.MaterialDesign] Blue color is chosen if none is specified.
     * @return A [Bitmap] containing either an Alphabet or the [Default Bitmap][mDefaultBitmap].
     * @see generateCircularAlphabetBitmap
     */
    fun generateAlphabetBitmap(displayName: String, @ColorInt backgroundColor: Int? = null): Bitmap? {

        if (displayName.isEmpty()) return null
        val alphabetBitmap = Bitmap.createBitmap(mWidth, mHeight, Bitmap.Config.ARGB_8888)
        val firstChar = displayName[0]
        val canvas = Canvas(alphabetBitmap)
        canvas.apply {
            drawColor(backgroundColor?:DesignColors.MaterialDesign.randomBlueColor())
            if (verifyIfAlphabetOrDigit(firstChar)) {
                mFirstCharacter[0] = firstChar.uppercaseChar()
                mPaint.getTextBounds(mFirstCharacter, 0, 1, mBounds)
                drawText(mFirstCharacter, 0, 1, (mWidth / 2).toFloat(), (mHeight/2)+ (mBounds.bottom - mBounds.top)/2.toFloat(), mPaint)
            } else {
                drawBitmap(mDefaultBitmap, dpToPx(0).toFloat(), dpToPx(0).toFloat(), null)
            }
            return alphabetBitmap
        }
    }

    /**
     * Generates an circular Alphabet Image [Bitmap] using the first character from the [displayName] parameter.
     * - When the [radius] parameter is set to 0 (the default value), it would result in the radius of the generated [Bitmap]
     * being calculated using the [width][mWidth] or [height][mHeight] set by either [setDimension], [setSpecificDimension]
     * or default width and height. Default = 25F.
     * @param displayName The name [String] whose first character would be used in generating an Alphabet Image.
     * @param radius The radius of the circle which would contain the Alphabet.
     * @param backgroundColor The background color to be applied to the [Bitmap]. A random [Material][DesignColors.MaterialDesign] Blue color is chosen if none is specified.
     * @return A circular [Bitmap] containing either an Alphabet or the [Default Bitmap][mDefaultBitmap].
     * @see generateAlphabetBitmap
     */
    fun generateCircularAlphabetBitmap(displayName: String, radius: Float = 0F, @ColorInt backgroundColor: Int? = null): Bitmap? {

        if (displayName.isEmpty()) return null
        val alphabetBitmap = Bitmap.createBitmap(mWidth, mHeight, Bitmap.Config.ARGB_8888)
        val firstChar = displayName[0]
        val canvas = Canvas(alphabetBitmap)
        canvas.apply {
            drawColor(backgroundColor?:DesignColors.MaterialDesign.randomBlueColor())
            return if (verifyIfAlphabetOrDigit(firstChar)) {
                mFirstCharacter[0] = firstChar.uppercaseChar()
                mPaint.getTextBounds(mFirstCharacter, 0, 1, mBounds)
                drawText(mFirstCharacter, 0, 1, (mWidth / 2).toFloat(), (mHeight/2)+ (mBounds.bottom - mBounds.top)/2.toFloat(), mPaint)
                generateCircularBitmap(alphabetBitmap, radius)
            } else {
                drawBitmap(mDefaultBitmap, dpToPx(0).toFloat(), dpToPx(0).toFloat(), null)
                generateCircularBitmap(mDefaultBitmap, radius)
            }

        }

    }

    /**
     * Internal method which reshapes the [bitmap] parameter into a circular shape.
     * @param bitmap The [Bitmap] to be given a circular shape.
     * @param radius The radius of the circle which would contain the Alphabet.
     * @return A circular [Bitmap].
     *
     */
    private fun generateCircularBitmap(bitmap: Bitmap, radius: Float): Bitmap {
        val output: Bitmap = if (bitmap.width > bitmap.height) {
            Bitmap.createBitmap(bitmap.height, bitmap.height, Bitmap.Config.ARGB_8888)
        } else {
            Bitmap.createBitmap(bitmap.width, bitmap.width, Bitmap.Config.ARGB_8888)
        }

        val r  = radius.let {
            if (it != 0F) it
            else {
                if (bitmap.width > bitmap.height) {
                    (bitmap.height/2).toFloat()
                } else {
                    (bitmap.width/2).toFloat()
                }
            }
        }
        val color = DesignColors.MaterialDesign.randomGreyColor()
        val canvas = Canvas(output)
        val paint = Paint()
        val rect = Rect(0, 0, bitmap.width, bitmap.height)

        paint.isAntiAlias = true
        canvas.drawARGB(0, 0, 0, 0)
        paint.color = color
        canvas.drawCircle(r, r, r, paint)
        paint.xfermode = PorterDuffXfermode(PorterDuff.Mode.SRC_IN)
        canvas.drawBitmap(bitmap, rect, rect, paint)
        return output
    }

}