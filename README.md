# Calculator Application

This app is intended to function as a calculator similar to the iPhone default calculator app.

## Functionality 

The following **required** functionality is completed:

* User enters a number (which is displayed on the top textview). 
* User hits an operation (for instance + ). 
* User can enter another number now. The textview still shows the old number until the user 
starts entering another number. 
* User enters another number (which is displayed on top textview) 
* If the user presses =, the result is displayed and the user can press another operation. 
* If the user presses an operation (for instance, -), the result of the previous operation is 
displayed on the textview until the user starts entering nother number.
* C button clears everything.
* +/- makes a number positive or negative.
* % divides the number by a hundred and displays it on the textview

The following **extensions** are implemented:

import android.annotation.SuppressLint //this was given by QuickFixes
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

## Video Walkthrough

![project1walkthrough5](https://github.com/lukeyarian/Project_1/assets/70252777/481c0856-6ee9-4833-bd9d-bf869beb5ac2)

## Notes

Some operators were a bit of a challenge and working with Kotlin is new. The immuatable types 
posed a bit of a challenge and I had tofigure out how to work with that. The biggest challenge 
was the flow from the first number, to the operator, to the next number, to the result.

Basically, everything needed to end with the "=" button, as it was difficult to get
everything working in a flow like the iPhone app.

I also was helped by some of the quickfixes offered in Android Studio. For example, the lateinit intializer
for my result text view variable. Also, the SuppressLint did something for me in terms of permissions.

## License

    Copyright [2023] [Luke Yarian]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

