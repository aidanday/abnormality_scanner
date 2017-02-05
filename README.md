# Abnormality Scanner
Computer vision that takes a PNG and creates a heatmap of abnormalities in the image. If the photo read has name `IMAGENAME.png`, the output has name `abnscan_IMAGENAME.png`.

## Arguments
The scanner accepts the file name of the image to be scanned as a parameter. It may also take two optional parameters: `num_expected` and `threshold`, which should be given in that order. Default values are 5 and 10 respectively.

`num_expected` is the max number of colors the program will treat as expected. It must be a positive `int`.

`threshold` is the max difference between RGBs before they are treated as different colors. It must be an `int` from 0 to 255.

## Other Info
This project was made for uWaterloo's EngHack17 by [Aidan Day](https://github.com/aidanday) and [Marcin Rachwal](https://github.com/MarcinZR). It uses Java because we're both proficient in it. Thanks for your interest!
