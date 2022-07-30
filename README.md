Alphabet Bitmap Generator
=========================

Alphabet Bitmap Generator is a simple library that generates a rectangular or circular bitmap image containing the first alphabet from a provided String name.

Dependencies
------------
This library uses [DesignColors](https://github.com/IODevBlue/DesignColors) to provide default colors. This is already bundled in the library.

Uses
----
You can use Alphabet Bitmap Generator when you need single alphabet circular bitmap images for applications that display contacts.

<p align="center"><img src="/art/square1.png" alt="Rectangular Bitmap"></p>
<p align="center"><img src="/art/circle (1).png" alt="Circular Bitmap 1"></p>
<p align="center"><img src="/art/circle (2).png" alt="Circular Bitmap 2"></p>
<p align="center"><img src="/art/circle (3).png" alt="Circular Bitmap 3"></p>

Usage
-----
Initialize an Alphabet Image Generator instance using a Context:
```KOTLIN
private var alphabetBitmapGenerator = AlphabetBitmapGenerator(context)
```

Apply your configurations to the Alphabet Image Generator Instance:
```KOTLIN
alphabetBitmapGenerator.apply {
  setDimension(100)
  alphabetTextColor = Color.WHITE
}
```
**NOTE:**
- Apply the configurations before generating a bitmap.
- The Dimension should be the same as that of the ImageView for conformity. It is best to set the ImageView's height and width to wrap_content.

Generate a rectangular bitmap by passing in a name string:
- The name must be a valid string for an alphabet bitmap to be generated. The default image would be used if the name parameter is an invalid string.
- The second parameter takes in an optional background color integer. If null is passed, a random Material Blue is chosen from the [DesignColors](https://github.com/IODevBlue/DesignColors) library.
```KOTLIN
val bitmap = alphabetBitmapGenerator.generateAlphabetBitmap(name, null)
```

Or generate a circular bitmap also passing in a name string:
- This method takes in an optional float radius parameter. If 0F is passed, the radius would be calculated using the width or height parameter set by either setDimension(), setSpecificDimension() or the default width and height.
```KOTLIN
val bitmap = alphabetBitmapGenerator.generateCircularAlphabetBitmap(name, 0F, null)
```

Set the bitmap as the ImageView's bitmap:
```KOTLIN
imageView.setImageBitmap(bitmap)
```

See sample project for more details.

Configurations:
|Variable |Default |Use |
|:---|:---:|:---:|
|`alphabetTextColor` |Black |The text color of the alphabet. |
|`alphabetTypeface` |Gotham Medium |The font of the alphabet. |
|`fontSize`|17F |The font size of alphabet (Float). |
|`defaultDrawable` | ![](/art/default_image.png) |The default image to use if the name provided is not a String. |

|Method |Returns |Use |
|:---|:---:|:---:|
|`setDimension(dimension: Int)` |Unit |Sets an equal dimension for the generated Alphabet Image. |
|`setSpecificDimension(width: Int, height: Int)` |Unit |Sets a specific dimension for the generated Alphabet Image. |
|`generateAlphabetBitmap(displayName: String, @ColorInt backgroundColor: Int?)` |A bitmap containing either an alphabet or the default bitmap. |
|`generateCircularAlphabetBitmap(displayName: String, radius: Float, @ColorInt backgroundColor: Int?)`|A circular bitmap containing either an alphabet or the default bitmap. |

Changelog
---------
* **1.0.0**
    * Initial release