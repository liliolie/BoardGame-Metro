# Assignment Two Feedback


## Group  wed10j
u7076870 Charlie Xu
u6486892 Xikang Song
u6004244 Lili Chen

## Tutor Comment

Good! Thank you for your efforts on this assignment! Your game runs without error from the jar file with most of the basic functions. 

For the object-orientation features, it is nice that you created several additional classes that works for different parts of the game separately. 
You could improve the implementation of the classes. For example, for the Tile class, you may also add some fields to it by considering what attibutes a tile may have. 
Your solution still mainly relies on the manipulation of strings, you may consider how you could decode the strings into objects 
and then deal with the objects. 

Your code is well-formatted with well named variables and methods. "TilesEnum" or "CoordinatesEnum" may not be a very good name for enum classes, 
as it is hard to get what the object is from such names. Something like "TileType" or "Edge" may be better? Part of the code is well-commented, 
while some code lacks comments and many non-trivial methods do not have docstrings describing the purpose, parameters and so on.

For the GUI design, it is nice to have a background image. Also, it is good to give players a choice to restart the game. 
I find that the scores will not be reset when I restart the game. The game do no let the player randomly draw a tile, 
as it allows the player to pick one tile from the deck.


## Mark

**  9.25/13.0**

## Miscellaneous marks

| Level | Requirement | Result |
|:-:|---|:-:|
||All files correct                     | 0.5/.5  |
||Authorship clear for all classes      | 0.15/.25 |
||Program runs from JAR                 | 0.5/.5  |
||Appropriate use of Git                | 0.5/.5  |
|P|Appropriate use of OO features       | 0.4/.75 |
|P|Presentation PDF complete            | 0.5/.5  |
|CR|Program well designed               | 0.4/.5  |
|CR|Comments clear and sufficient       | 0.15/.25 |
|CR|Coding style good                   | 0.25/.25 |
|CR|Appropriate use of JUnit tests      | 0.25/.25 |
|D|Design and code of very high quality | 0.2/.5  |
|D|Demonstrates interesting extensions  | 0/0.75 |
|D|Works well and easy to run           | 0.15/.25 |
|HD|Game is exceptional                 | 0.3/1.0 |

**Total for miscellaneous marks:**  4.25/6.75

## Game marks (manual)

| Level | Requirement | Result |
|:-:|---|:-:|
|CR|Tiles snap into place (8)        | 0.25/.25 |
|CR|Only valid placements allowed (8)| 0.25/.25 |
|CR|Score updated after placement (8)| 0.5/.5  |
|D |Basic computer opponent (10)     | 0/.5  |
|HD|Advanced computer opponent (11)  | 0/.5  |
|HD|Variants (12)                    | 0/.25 |

**Total for manual marks:** 1.0/2.25

## Test results

```
Test Name   Tests Passed  Weighting    Score
-----              -----      -----    -----
task2                4/4        0.5      0.5
task3                3/3        0.5      0.5
task5                4/4        0.5      0.5
task6                4/4        1.0      1.0
task7                3/3       0.75     0.75
task9                3/3       0.75     0.75
-----              -----     Total:  4.0/4.0
```
## Originality statements

#### Originality statement G
# IMPORTANT: It is very important that you correctly complete this originality
# statement.
#
# This is your statement of your submitted work being your own.
# Incorrectly filling out this statement could lead to charges
# of academic misconduct.
# 
# For information on how to fill this out correctly, see
# https://cs.anu.edu.au/courses/comp1110/help/faq/09-originality/
#

declaration: >-
  Stage G represents the culmunation of the entire assignment.  We declare that
  everything we have submitted for for all stages of this assignment was
  entirely our own work, with the following exceptions:

# Use this to list names of people who you collaborated with, and a
# comment about what you collaborated on.
#
# Add as many "name+comment" entries as necessary
# (or remove it altogether if you haven't collaborated with anyone)
#collaboration:
#  - name:
#    comment: >-

# Use this to list any code that you used that you did not write,
# aside from code provided by the lecturer.  Provide a comment
# explaining your use and the URL to that code and the licence for
# that code
#
# Add as many "url+licence+comment" entries as necessary
# (or remove it altogether if you haven't used any external code)
#code:
#  - comment:
#    url:
#    licence:

# Use this to list any assets (artwork, sound, etc) that you used.
# Provide a comment explaining your use of that asset and the URL
# and license for the asset
#
# Add as many "url+licence+comment" entries as necessary
# (or remove it altogether if you haven't used any external assets)
#assets:
#  - comment:
#    url:
#    licence:


# Sign *your* name and uids here. (Remove entries if you have fewer
# than three members.)
signatures:
  - name: Chan Xu
    uid: u7076870
  - name: Lili Chen
    uid: u6004244
  - name: Xikang Song
    uid: u6486892

#### Originality statement F
# IMPORTANT: It is very important that you correctly complete this originality
# statement.
#
# This is your statement of your submitted work being your own.
# Incorrectly filling out this statement could lead to charges
# of academic misconduct.
# 
# For information on how to fill this out correctly, see
# https://cs.anu.edu.au/courses/comp1110/help/faq/09-originality/
#

declaration: >-
  We declare that everything we have submitted for Stage F of this assignment
  and all stages before it is entirely our own work, with the following
  exceptions:

# Use this to list names of people who you collaborated with, and a
# comment about what you collaborated on.
#
# Add as many "name+comment" entries as necessary
# (or remove it altogether if you haven't collaborated with anyone)
#collaboration:
#  - name:
#    comment: >-

# Use this to list any code that you used that you did not write,
# aside from code provided by the lecturer.  Provide a comment
# explaining your use and the URL to that code and the licence for
# that code
#
# Add as many "url+licence+comment" entries as necessary
# (or remove it altogether if you haven't used any external code)
#code:
#  - comment:
#    url:
#    licence:

# Use this to list any assets (artwork, sound, etc) that you used.
# Provide a comment explaining your use of that asset and the URL
# and license for the asset
#
# Add as many "url+licence+comment" entries as necessary
# (or remove it altogether if you haven't used any external assets)
#assets:
#  - comment:
#    url:
#    licence:


# Sign *your* name and uids here. (Remove entries if you have fewer
# than three members.)
signatures:
  - name: Chan Xu
    uid: u7076870
  - name: Lili Chen
    uid: u6004244
  - name: Xikang Song
    uid: u6486892

#### Originality statements E
# IMPORTANT: It is very important that you correctly complete this originality
# statement.
#
# This is your statement of your submitted work being your own.
# Incorrectly filling out this statement could lead to charges
# of academic misconduct.
# 
# For information on how to fill this out correctly, see
# https://cs.anu.edu.au/courses/comp1110/help/faq/09-originality/
#

declaration: >-
  I declare that everything I have submitted for stage E of this assignment
  and all stages before it is entirely my own work, with the following
  exceptions:


# Use this to list names of people who you collaborated with, and a
# comment about what you collaborated on.
#
# Add as many "name+comment" entries as necessary
# (or remove it altogether if you haven't collaborated with anyone)
#collaboration:
#  - name:
#    comment: >-

# Use this to list any code that you used that you did not write,
# aside from code provided by the lecturer.  Provide a comment
# explaining your use and the URL to that code and the licence for
# that code
#
# Add as many "url+licence+comment" entries as necessary
# (or remove it altogether if you haven't used any external code)
#code:
#  - comment:
#    url:
#    licence:

# Use this to list any assets (artwork, sound, etc) that you used.
# Provide a comment explaining your use of that asset and the URL
# and license for the asset
#
# Add as many "url+licence+comment" entries as necessary
# (or remove it altogether if you haven't used any external assets)
#assets:
#  - comment:
#    url:
#    licence:


# sign *your* name and uid here
name: Lili Chen
uid: u6004244
# IMPORTANT: It is very important that you correctly complete this originality
# statement.
#
# This is your statement of your submitted work being your own.
# Incorrectly filling out this statement could lead to charges
# of academic misconduct.
# 
# For information on how to fill this out correctly, see
# https://cs.anu.edu.au/courses/comp1110/help/faq/09-originality/
#

declaration: >-
  I declare that everything I have submitted for stage E of this assignment
  and all stages before it is entirely my own work, with the following
  exceptions:


# Use this to list names of people who you collaborated with, and a
# comment about what you collaborated on.
#
# Add as many "name+comment" entries as necessary
# (or remove it altogether if you haven't collaborated with anyone)
#collaboration:
#  - name:
#    comment: >-

# Use this to list any code that you used that you did not write,
# aside from code provided by the lecturer.  Provide a comment
# explaining your use and the URL to that code and the licence for
# that code
#
# Add as many "url+licence+comment" entries as necessary
# (or remove it altogether if you haven't used any external code)
#code:
#  - comment:
#    url:
#    licence:

# Use this to list any assets (artwork, sound, etc) that you used.
# Provide a comment explaining your use of that asset and the URL
# and license for the asset
#
# Add as many "url+licence+comment" entries as necessary
# (or remove it altogether if you haven't used any external assets)
#assets:
#  - comment:
#    url:
#    licence:


# sign *your* name and uid here
name: Xikang Song
uid: u6486892
# IMPORTANT: It is very important that you correctly complete this originality
# statement.
#
# This is your statement of your submitted work being your own.
# Incorrectly filling out this statement could lead to charges
# of academic misconduct.
# 
# For information on how to fill this out correctly, see
# https://cs.anu.edu.au/courses/comp1110/help/faq/09-originality/
#

declaration: >-
  I declare that everything I have submitted for stage E of this assignment
  and all stages before it is entirely my own work, with the following
  exceptions:

# Use this to list names of people who you collaborated with, and a
# comment about what you collaborated on.
#
# Add as many "name+comment" entries as necessary
# (or remove it altogether if you haven't collaborated with anyone)
#collaboration:
#  - name:
#    comment: >-

# Use this to list any code that you used that you did not write,
# aside from code provided by the lecturer.  Provide a comment
# explaining your use and the URL to that code and the licence for
# that code
#
# Add as many "url+licence+comment" entries as necessary
# (or remove it altogether if you haven't used any external code)
#code:
#  - comment:
#    url:
#    licence:

# Use this to list any assets (artwork, sound, etc) that you used.
# Provide a comment explaining your use of that asset and the URL
# and license for the asset
#
# Add as many "url+licence+comment" entries as necessary
# (or remove it altogether if you haven't used any external assets)
#assets:
#  - comment:
#    url:
#    licence:


# sign *your* name and uid here
name: Chan Xu
uid: u7076870

#### Originality statements D
# IMPORTANT: It is very important that you correctly complete this originality
# statement.
#
# This is your statement of your submitted work being your own.
# Incorrectly filling out this statement could lead to charges
# of academic misconduct.
# 
# For information on how to fill this out correctly, see
# https://cs.anu.edu.au/courses/comp1110/help/faq/09-originality/
#

declaration: >-
  I declare that everything I have submitted for stage D of this assignment
  and all stages before it is entirely my own work, with the following
  exceptions:


# Use this to list names of people who you collaborated with, and a
# comment about what you collaborated on.
#
# Add as many "name+comment" entries as necessary
# (or remove it altogether if you haven't collaborated with anyone)
#collaboration:
#  - name:
#    comment: >-

# Use this to list any code that you used that you did not write,
# aside from code provided by the lecturer.  Provide a comment
# explaining your use and the URL to that code and the licence for
# that code
#
# Add as many "url+licence+comment" entries as necessary
# (or remove it altogether if you haven't used any external code)
#code:
#  - comment:
#    url:
#    licence:

# Use this to list any assets (artwork, sound, etc) that you used.
# Provide a comment explaining your use of that asset and the URL
# and license for the asset
#
# Add as many "url+licence+comment" entries as necessary
# (or remove it altogether if you haven't used any external assets)
#assets:
#  - comment:
#    url:
#    licence:


# sign *your* name and uid here
name: Lili Chen
uid: u6004244
# IMPORTANT: It is very important that you correctly complete this originality
# statement.
#
# This is your statement of your submitted work being your own.
# Incorrectly filling out this statement could lead to charges
# of academic misconduct.
# 
# For information on how to fill this out correctly, see
# https://cs.anu.edu.au/courses/comp1110/help/faq/09-originality/
#

declaration: >-
  I declare that everything I have submitted for stage D of this assignment
  and all stages before it is entirely my own work, with the following
  exceptions:


# Use this to list names of people who you collaborated with, and a
# comment about what you collaborated on.
#
# Add as many "name+comment" entries as necessary
# (or remove it altogether if you haven't collaborated with anyone)
#collaboration:
#  - name:
#    comment: >-

# Use this to list any code that you used that you did not write,
# aside from code provided by the lecturer.  Provide a comment
# explaining your use and the URL to that code and the licence for
# that code
#
# Add as many "url+licence+comment" entries as necessary
# (or remove it altogether if you haven't used any external code)
#code:
#  - comment:
#    url:
#    licence:

# Use this to list any assets (artwork, sound, etc) that you used.
# Provide a comment explaining your use of that asset and the URL
# and license for the asset
#
# Add as many "url+licence+comment" entries as necessary
# (or remove it altogether if you haven't used any external assets)
#assets:
#  - comment:
#    url:
#    licence:


# sign *your* name and uid here
name: Xikang Song
uid: u6486892
# IMPORTANT: It is very important that you correctly complete this originality
# statement.
#
# This is your statement of your submitted work being your own.
# Incorrectly filling out this statement could lead to charges
# of academic misconduct.
# 
# For information on how to fill this out correctly, see
# https://cs.anu.edu.au/courses/comp1110/help/faq/09-originality/
#

declaration: >-
  I declare that everything I have submitted for stage D of this assignment
  and all stages before it is entirely my own work, with the following
  exceptions:


# Use this to list names of people who you collaborated with, and a
# comment about what you collaborated on.
#
# Add as many "name+comment" entries as necessary
# (or remove it altogether if you haven't collaborated with anyone)
#collaboration:
#  - name:
#    comment: >-

# Use this to list any code that you used that you did not write,
# aside from code provided by the lecturer.  Provide a comment
# explaining your use and the URL to that code and the licence for
# that code
#
# Add as many "url+licence+comment" entries as necessary
# (or remove it altogether if you haven't used any external code)
#code:
#  - comment:
#    url:
#    licence:

# Use this to list any assets (artwork, sound, etc) that you used.
# Provide a comment explaining your use of that asset and the URL
# and license for the asset
#
# Add as many "url+licence+comment" entries as necessary
# (or remove it altogether if you haven't used any external assets)
#assets:
#  - comment:
#    url:
#    licence:


# sign *your* name and uid here
name: Chan Xu
uid: u7076870

#### Originality statement C
# IMPORTANT: It is very important that you correctly complete this originality
# statement.
#
# This is your statement of your submitted work being your own.
# Incorrectly filling out this statement could lead to charges
# of academic misconduct.
# 
# For information on how to fill this out correctly, see
# https://cs.anu.edu.au/courses/comp1110/help/faq/09-originality/
#

declaration: >-
  We declare that everything we have submitted for Stage C of this assignment
  and all stages before it is entirely our own work, with the following
  exceptions:

# Use this to list names of people who you collaborated with, and a
# comment about what you collaborated on.
#
# Add as many "name+comment" entries as necessary
# (or remove it altogether if you haven't collaborated with anyone)
# collaboration:
#   - name:
#     comment: >-

# Use this to list any code that you used that you did not write,
# aside from code provided by the lecturer.  Provide a comment
# explaining your use and the URL to that code and the licence for
# that code
#
# Add as many "url+licence+comment" entries as necessary
# (or remove it altogether if you haven't used any external code)
# code:
#  - comment:
#    url:
#    licence:

# Use this to list any assets (artwork, sound, etc) that you used.
# Provide a comment explaining your use of that asset and the URL
# and license for the asset
#
# Add as many "url+licence+comment" entries as necessary
# (or remove it altogether if you haven't used any external assets)
#assets:
#  - comment:
#    url:
#    licence:


# Sign *your* name and uids here. (Remove entries if you have fewer
# than three members.)
signatures:
  - name: Chan Xu
    uid: u7076870
  - name: Xikang Song
    uid: u6486892
  - name: Lili Chen
    uid: u6004244

#### Originality statement B
# IMPORTANT: It is very important that you correctly complete this originality
# statement.
#
# This is your statement of your submitted work being your own.
# Incorrectly filling out this statement could lead to charges
# of academic misconduct.
# 
# For information on how to fill this out correctly, see
# https://cs.anu.edu.au/courses/comp1110/help/faq/09-originality/
#

declaration: >-
  We declare that everything we have submitted for Stage B of this assignment
  and all stages before it is entirely our own work, with the following
  exceptions:

# Use this to list names of people who you collaborated with, and a
# comment about what you collaborated on.
#
# Add as many "name+comment" entries as necessary
# (or remove it altogether if you haven't collaborated with anyone)
# collaboration:
#   - name:
#     comment: >-

# Use this to list any code that you used that you did not write,
# aside from code provided by the lecturer.  Provide a comment
# explaining your use and the URL to that code and the licence for
# that code
#
# Add as many "url+licence+comment" entries as necessary
# (or remove it altogether if you haven't used any external code)
# code:
#  - comment:
#    url:
#    licence:

# Use this to list any assets (artwork, sound, etc) that you used.
# Provide a comment explaining your use of that asset and the URL
# and license for the asset
#
# Add as many "url+licence+comment" entries as necessary
# (or remove it altogether if you haven't used any external assets)
#assets:
#  - comment:
#    url:
#    licence:


# Sign *your* name and uids here. (Remove entries if you have fewer
# than three members.)
signatures:
  - name: Chan Xu
    uid: u7076870
  - name: Xikang Song
    uid: u6486892
  - name: Lili Chen
    uid: u6004244

## Git Contributions
#### Commit count via git log
```
     15 [Xikang <[u6486892@anu.edu.au]>
      1 Bob <u1234567@anu.edu.au>
      2 Charlie Xu <charley023@gmail.com>
     71 Charlie Xu <u7076870@anu.edu.au>
      8 Josh Milthorpe <josh.milthorpe@anu.edu.au>
      7 Lili Chen <u6004244@anu.edu.au>
     37 lilichen <u6004244@anu.edu.au>
      6 Shiya Liu <u6783346@anu.edu.au>
      6 Xikang Song <u6486892@anu.edu.au>

```
#### Line count via git blame
```
    657 [Xikang
    743 Charlie
    772 Josh
    120 lilichen
    209 Xikang
```
## Git Log
```
commit f4d4a689f9a24bf491e0123de4fff06cc36c545c
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon Jun 1 03:18:56 2020 +1000

    D2H Updated.

commit 1c36e2a529e4970f70c5c4d4120d8620f9bea865
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Fri May 29 06:41:29 2020 +1000

    D2G Updated.

commit 08f4901020983d0aef9618a5de7b9b1960888ec2
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Thu May 28 18:18:05 2020 +1000

    Split Task 7, making it more readable.

commit 34ca6053f007d8413af41a3ae3eae5db6612111c
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Wed May 27 20:43:02 2020 +1000

    Split Task 7, making it more readable.

commit afcfc010a14c5917c082a3c6382bf2c8c219ab07
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Wed May 27 20:36:25 2020 +1000

    Split Task 7, making it more readable.

commit a83caf8256eaf2897e77d10d9359e05ffc5be9cc
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Wed May 27 20:35:53 2020 +1000

    Split Task 7, making it more readable.

commit 80a146826f655fd93114fdcac1885b605749106c
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Tue May 26 01:24:43 2020 +1000

    Code Optimization: Added Enum.

commit 380dba6d304c22b69d9b47e392deb7f852558b06
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon May 25 23:57:30 2020 +1000

    Code Optimization: Added Enum.

commit 01840778815edb5adcdccb6bb3b31394138845a2
Merge: df23519 58e33ae
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon May 25 20:14:30 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit 58e33ae0fff770128ad58392ac63fa3a16ea7abc
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Fri May 15 14:41:37 2020 +1000

    add file H-presentation.yml to record presentation video URL

commit df235197d2b5dd193abba44a8082794c1337b4a3
Author: Shiya Liu <u6783346@anu.edu.au>
Date:   Thu May 14 12:31:25 2020 +1000

    update feedback

commit c3e5a819d9ad123fff31f716c24e41a8461a9a97
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon May 11 01:48:54 2020 +1000

    D2F Updated.

commit 6a61bf4622a6f8cd7fb6b8d1d6ab1f44d8822be3
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon May 11 01:45:49 2020 +1000

    D2F Updated.

commit 194b500c50e9f35a82869bee0631186f2ba744c1
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon May 11 01:44:53 2020 +1000

    D2F Updated.

commit cd464bc850819dc2ab16eb0200c3324e71d17b77
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon May 11 01:42:38 2020 +1000

    D2F Updated.

commit 69aea520c88106eaee87b94abf1193e5a09e352d
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon May 11 01:41:04 2020 +1000

    D2F Updated.

commit 10ff7eb7c4617c374b58fcef03af4fa4431300d7
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon May 11 01:36:15 2020 +1000

    D2F Updated.

commit 33819dd0ead637d502108775ca312f8a0917ea52
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon May 11 01:34:55 2020 +1000

    D2F Updated.

commit 5f9f4b8dae5b430cd4c660942f6d1179625513d9
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon May 11 01:33:04 2020 +1000

    D2F Updated.

commit e8cefc87bad92198c8451f7aa127fa1fe3832b76
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon May 11 01:30:55 2020 +1000

    D2F Updated.

commit 3eae9334f4f94919e484bf74d46a0c7715f3cdbd
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon May 11 01:29:09 2020 +1000

    D2F Updated.

commit 62299fc0718562727ee29e2fa4fbfacd40afaf97
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon May 11 01:27:46 2020 +1000

    D2F Updated.

commit d6d0faec400823fba377d18c6efb6e12508fdb7a
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon May 11 01:27:32 2020 +1000

    D2F Updated.

commit 251f74a216173fabcba9765e8e30cd2b3f3e70fb
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon May 11 01:23:06 2020 +1000

    D2F Updated.

commit 1483e33f70e69864d6adac762fa64b620aab5234
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon May 11 01:20:47 2020 +1000

    D2F Updated.

commit 306c754a0cb7656834e89a08ef626accc41da8a0
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon May 11 00:03:46 2020 +1000

    Add Descriptions to the method of Task 6.

commit c537f079b2267b667df2fcb69b359d2b92ab780c
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Sun May 10 22:34:25 2020 +1000

    Updated game.jar.

commit 3b022ad95951fcde3018f23c96a3539eb1088f2a
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Sun May 10 22:33:45 2020 +1000

    Updated game.jar.

commit 5c9c1402a5b38f629d1fd66e80a32d6f44f486da
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Sun May 10 22:21:24 2020 +1000

    Updated game.jar.

commit 73777b6b5224286a4b695f1ab4aa2465250f6f15
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Sun May 10 21:55:29 2020 +1000

    Updated Review Files.

commit 24f13d0f4e162d151fbb38ed39512b3edb34fd83
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Sun May 10 21:49:47 2020 +1000

    game.jar Created.

commit 8ed15510e910d09b4a21c3f0864f36a6e6b40e78
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Sat May 9 22:27:54 2020 +1000

    Bug Fixes.

commit c2a48169992092eb0e15ac11512840a87a6e8dbb
Author: [Xikang <[u6486892@anu.edu.au]>
Date:   Sat May 9 21:56:17 2020 +1000

    fix bug

commit 35f1acf3b946dbe02d60b45e63a920963a20e933
Author: [Xikang <[u6486892@anu.edu.au]>
Date:   Sat May 9 21:41:44 2020 +1000

    fix x,y

commit c2bde2a55d14474070b60582cf6d8868a263fce5
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Thu May 7 18:27:58 2020 +1000

    Task 9 GenerateMoveTest: improve error messages

commit 566778dc884a73c2703ff6b212953d307cea8323
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Tue May 5 07:17:43 2020 +1000

    Minor Optimization.
    Updated Originality and Contribution.

commit b152d000cb4bb66a6bc0501a2f626f8a4d7eba90
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Tue May 5 07:12:02 2020 +1000

    Updated D2E.

commit 619494458ae63053a3ec4d4887982c0f5a612c0b
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Tue May 5 07:09:21 2020 +1000

    New Methods.

commit 3c64ce931a1a489a3a78604b5ecea0ebd718f353
Merge: d445ce9 4468326
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon May 4 05:23:08 2020 +1000

    Merge remote-tracking branch 'origin/master'

commit d445ce912e28867d21c4d7542d4412ac507b7f09
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon May 4 05:22:50 2020 +1000

    D2E Finished.

commit 44683260e9bfc4de6e51818a7a2af7cc67c774dc
Author: lilichen <u6004244@anu.edu.au>
Date:   Mon May 4 04:06:25 2020 +1000

    update admin

commit 495726b8502fb4a0f59c7f953061b2d60e4e3e1d
Author: lilichen <u6004244@anu.edu.au>
Date:   Mon May 4 03:32:01 2020 +1000

    update test

commit 2309f296dbe0f52ae3f89e3ce5f7bc15c1deab8a
Author: [Xikang <[u6486892@anu.edu.au]>
Date:   Sun May 3 23:00:43 2020 +1000

    add u6486892 newcode report

commit 5f8ae02f0246e284a0798d9c65e828f93e9c2451
Author: [Xikang <[u6486892@anu.edu.au]>
Date:   Sun May 3 20:59:40 2020 +1000

    xikang song test

commit e68af594c398720551a6e0f57ee6715f583ad994
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Sun May 3 19:38:37 2020 +1000

    Updated Originality.

commit c35821824f1687e461e09989c783a6b560c51a6f
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Sun May 3 19:33:45 2020 +1000

    Updated Originality.

commit c7844cf17bed9c00fe67fb1563d9cac3ba7064e7
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Sun May 3 19:26:40 2020 +1000

    Delete gittest.

commit 629de8ae662733d4815aea20e0a47b301076e719
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Sun May 3 19:25:27 2020 +1000

    Code Optimization.

commit 973156281cf4ed2adf68eb8c86a85007e89d92ec
Merge: 844e7d9 f44881a
Author: [Xikang <[u6486892@anu.edu.au]>
Date:   Wed Apr 29 11:48:12 2020 +1000

    Merge remote-tracking branch 'origin/master'

commit 844e7d9b3214b863d7b07a1b148e77144c7b30d3
Author: [Xikang <[u6486892@anu.edu.au]>
Date:   Wed Apr 29 11:47:54 2020 +1000

    fix task 7

commit f44881a6eafec00876c21daa786379124cd8061d
Author: Shiya Liu <u6783346@anu.edu.au>
Date:   Wed Apr 29 11:17:47 2020 +1000

    update feedback

commit 4869ead1d20c375bfffeab44098d78d3356f8516
Merge: 3cca1fa 2768ae1
Author: Shiya Liu <u6783346@anu.edu.au>
Date:   Wed Apr 29 04:44:43 2020 +1000

    Merge branch 'feedback' of https://gitlab.cecs.anu.edu.au/u7076870/comp1110-ass2-wed10j
    
     Conflicts:
    	weekly_feedback/feedbackD2B.md

commit 3cca1fafe5ad6aa9a69c043341c92940629c46cb
Author: Shiya Liu <u6783346@anu.edu.au>
Date:   Wed Apr 29 04:29:42 2020 +1000

    update feedback

commit 434dcda35da0e4da9ee5eb32a5e16beff43a2419
Author: lilichen <u6004244@anu.edu.au>
Date:   Mon Apr 27 12:39:42 2020 +1000

    update

commit d56296b1e393954bdd975fad923f38834a6f4cf6
Merge: 6da8fdd 4e2ef2f
Author: lilichen <u6004244@anu.edu.au>
Date:   Mon Apr 27 11:58:46 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u7076870/comp1110-ass2-wed10j

commit 6da8fdda283eb5e5fd74307da63c71798823fb23
Author: lilichen <u6004244@anu.edu.au>
Date:   Mon Apr 27 11:58:14 2020 +1000

    update

commit 4e2ef2fdb4d1cbf395ab15e66a1b56a2366de7f8
Author: [Xikang <[u6486892@anu.edu.au]>
Date:   Mon Apr 27 06:31:58 2020 +1000

    add d2d

commit 1f80b66c4a2e74edd31cae9f6f079e6f72f53846
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon Apr 27 04:25:53 2020 +1000

    Finished D2D.

commit 94b5495994cd4ec98ef10f4597b831afe8137ce5
Merge: cfa4dc3 55dbccf
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon Apr 27 03:44:24 2020 +1000

    Merge remote-tracking branch 'origin/master'

commit cfa4dc3b4b6eaf380be081b00f95ce4fca4968b1
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon Apr 27 03:44:07 2020 +1000

    Fixed Viewer.

commit 55dbccf7be48a2ef02c84e0f5153b88af7dc76d0
Author: lilichen <u6004244@anu.edu.au>
Date:   Mon Apr 27 01:38:09 2020 +1000

    update d2d newcode

commit 7b8f63bddd017fc815be7bbf9f509c2b799d472b
Author: lilichen <u6004244@anu.edu.au>
Date:   Mon Apr 27 01:37:12 2020 +1000

    update d2d newcode

commit 84909a5be50a93df4cbf4ec56bfee925a44bb495
Author: lilichen <u6004244@anu.edu.au>
Date:   Mon Apr 27 01:33:19 2020 +1000

    update d2d newcode

commit 61d2a1514132a78ed01b13c91664cd88f8333018
Merge: bda1a7d e2a8c19
Author: lilichen <u6004244@anu.edu.au>
Date:   Mon Apr 27 01:06:03 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u7076870/comp1110-ass2-wed10j
    
     Conflicts:
    	admin/D-newcode-u7076870.md

commit bda1a7d8a8d93fe765a3af64e96258e7c6596376
Author: lilichen <u6004244@anu.edu.au>
Date:   Mon Apr 27 01:05:15 2020 +1000

    update d2d originality

commit e2a8c1966cdbddd28263936da1c2473bb07e6539
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon Apr 27 01:03:57 2020 +1000

    Originality.

commit 02bcdefe557f82ec6dd2a0977388167d06b626d2
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon Apr 27 00:58:44 2020 +1000

    Code Optimization.
    
    # Conflicts:
    #       admin/D-newcode-u1234567.md
    #       admin/D-newcode-u7076870.md
    #       admin/D-originality-u7076870.md
    #       admin/D-originality-u7076870.yml

commit aa9c580013afb3ded43c9de4ea6d80c9e204b661
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon Apr 27 00:31:14 2020 +1000

    Code Optimization.

commit 786edf9ed2e49d5e9a77a9141fccb3235920a416
Author: lilichen <u6004244@anu.edu.au>
Date:   Mon Apr 27 00:29:48 2020 +1000

    update d2d originality

commit a3cd14be2fe70f0593fe6dd8ec574263f8a7778a
Author: lilichen <u6004244@anu.edu.au>
Date:   Mon Apr 27 00:27:52 2020 +1000

    update d2d originality

commit bfbd8e97444e0e8a207047834d7bc8b92ecfdd19
Merge: 22a2ccf 4d6c6b4
Author: lilichen <u6004244@anu.edu.au>
Date:   Mon Apr 27 00:21:54 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u7076870/comp1110-ass2-wed10j
    
     Conflicts:
    	.idea/libraries/lib.xml

commit 4d6c6b453dc8496010e6c6bbb8218cb3f952d7b4
Author: [Xikang <[u6486892@anu.edu.au]>
Date:   Sun Apr 26 16:14:47 2020 +1000

    rename file

commit 0df522137bb5f9b796a6e40bf92af77244faff34
Author: [Xikang <[u6486892@anu.edu.au]>
Date:   Sun Apr 26 16:14:24 2020 +1000

    rename file

commit a1d0c756f23f621ac417332db5c30219c367ee00
Author: [Xikang <[u6486892@anu.edu.au]>
Date:   Sun Apr 26 16:07:49 2020 +1000

    fix issue with updating

commit c285c8501575c1f41139bd915a8cd6fbaace3a22
Merge: 5b3ce23 b541bcf
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Fri Apr 24 19:01:27 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit b541bcf1225337f12c354b9501076ad05680999a
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Fri Apr 24 18:47:28 2020 +1000

    add new admin files for new individual code for D2D and D2E

commit e2e6899ca1afbe444edf99101010b40b95c39ca6
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Fri Apr 24 18:37:05 2020 +1000

    remove hand parameter from Metro.generateMove
    
    This was not actually tested in the unit tests, and the way it was described was
    inconsistent with the rules of the game.
    Thanks for Evan Markou for noticing this.

commit 2768ae144961973d0a6cf8461c213c5cd8c03f80
Author: Shiya Liu <u6783346@anu.edu.au>
Date:   Fri Apr 24 12:58:24 2020 +1000

    update feedback

commit 5b3ce238ca261b2b55e83af7d7836d593de346e0
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Thu Apr 23 18:27:29 2020 +1000

    Task 6 Bug fixed.

commit 4cd3c31903a392321982a02317cde00952f4e497
Merge: 6a2248f 8d5c49d
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Thu Apr 23 17:59:18 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u7076870/comp1110-ass2-wed10j

commit 6a2248f409eb817bcea3af67237a95bc64f2ddec
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Thu Apr 23 17:57:59 2020 +1000

    Minor Changes.

commit 8d5c49d0993628bee2a684b9459e10154edb0cd7
Author: [Xikang <[u6486892@anu.edu.au]>
Date:   Thu Apr 23 17:56:31 2020 +1000

    fix task8 validation&task 9

commit 22a2ccf33839e874c1991bed37e98b0160274500
Merge: d798968 60932db
Author: lilichen <u6004244@anu.edu.au>
Date:   Mon Apr 20 23:46:55 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u7076870/comp1110-ass2-wed10j

commit d798968ad1433c1c898206dc44f9ade26b677f85
Author: lilichen <u6004244@anu.edu.au>
Date:   Mon Apr 20 23:46:48 2020 +1000

    update

commit 60932dbc8eec03a5f5f5f882a25f488564a6af07
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon Apr 20 23:19:37 2020 +1000

    Task 6 Updated. (Test Passed. May still contain bugs.)

commit b074fc6ce34d7774045f49c8fc38a457a6b136c4
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon Apr 20 22:51:15 2020 +1000

    Task 6 Updated. (Test Passed. May still contain bugs.)

commit dc0d8fc4a349daa256d78d8d706147fda020ccb4
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon Apr 20 22:29:26 2020 +1000

    Task 6 Updated. (Test Passed. May still contain bugs.)

commit 2b4952c640c06e9644d119169bf5cbb84232bcde
Merge: ec20b71 d445a4e
Author: lilichen <u6004244@anu.edu.au>
Date:   Mon Apr 20 10:47:30 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u7076870/comp1110-ass2-wed10j

commit ec20b71429d095ba4562af81b33fad1d6236e21b
Author: lilichen <u6004244@anu.edu.au>
Date:   Mon Apr 20 10:47:18 2020 +1000

    update

commit d445a4e28631be96d4e09459784b7c42b8ad64e1
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon Apr 20 03:15:27 2020 +1000

    Task 6 Finished. (Test Passed. May still contain bugs.)

commit 1b5ed3b91aefc12de460aee467c0187a02c2aa0c
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon Apr 20 01:18:31 2020 +1000

    Update Originality and Contribution.

commit 4ff8762931e25db1d52dcb63799292d4bd260b87
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Mon Apr 20 00:01:09 2020 +1000

    Task 6 in Progress.

commit 4dc9a6a35e6050aabbbf181401c89d94738e4528
Merge: f915614 e04ecb4
Author: lilichen <u6004244@anu.edu.au>
Date:   Sat Apr 18 21:26:50 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u7076870/comp1110-ass2-wed10j

commit e04ecb4b2d11c8593bb927ea5a71ba357dfce049
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Sat Apr 18 17:07:59 2020 +1000

    Task 6 in Progress.

commit f9156142b1e0ca9658ca0364db3980425ee7a2b7
Merge: d7963dc 97c2204
Author: lilichen <u6004244@anu.edu.au>
Date:   Fri Apr 17 10:27:13 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u7076870/comp1110-ass2-wed10j

commit e6fdd37d4cebc6b5e75f9eb1e1b3e68f4249eabc
Merge: 7447050 97c2204
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Thu Apr 16 18:55:31 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u7076870/comp1110-ass2-wed10j

commit 7447050adc3a7a5bed64c239a02e9b8ba4a9fa4f
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Thu Apr 16 18:55:24 2020 +1000

    Minor tweaks.

commit 97c2204a9f2bbdf5b1b9485fb79e604e946244d3
Author: [Xikang <[u6486892@anu.edu.au]>
Date:   Thu Apr 16 18:48:36 2020 +1000

    notes

commit 9e967e893c91b62f52029bf769ff9111b29adae7
Author: [Xikang <[u6486892@anu.edu.au]>
Date:   Thu Apr 16 18:46:56 2020 +1000

    replace button by hot-key

commit 53f9114c8de1694cb33e875d3ff10cb1ee1e53a1
Merge: 5fdcd5d 108b4b0
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Thu Apr 16 17:50:01 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u7076870/comp1110-ass2-wed10j

commit 5fdcd5d8275b41cb7234f96c8900f9b934073dcc
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Thu Apr 16 17:49:55 2020 +1000

    Minor tweaks.

commit 108b4b0c74db71a486e6408f78f19ec44b9c5826
Author: [Xikang <[u6486892@anu.edu.au]>
Date:   Thu Apr 16 17:47:53 2020 +1000

    fix control on fx11

commit 90c237c9e993b001baf79e7601b6d98e5c59e913
Author: [Xikang <[u6486892@anu.edu.au]>
Date:   Thu Apr 16 17:27:11 2020 +1000

    build new UI, but control still have bugs

commit d7963dc576581f1fbd204cbae69dbacaba378210
Merge: b43cca9 9d016f1
Author: lilichen <u6004244@anu.edu.au>
Date:   Wed Apr 15 22:10:17 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u7076870/comp1110-ass2-wed10j
    
     Conflicts:
    	src/comp1110/ass2/Metro.java

commit 9d016f195c007c3c5dedfaa84c5f72bf549217bb
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Wed Apr 15 22:09:19 2020 +1000

    Code optimization & new methods updates.

commit b43cca9379147fa09f36f88078d27d0864a706be
Merge: c8cfd9b 5e3c4ae
Author: lilichen <u6004244@anu.edu.au>
Date:   Wed Apr 15 21:43:29 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u7076870/comp1110-ass2-wed10j
    
     Conflicts:
    	src/comp1110/ass2/Metro.java

commit c8cfd9bf07077c78eff36fece71d717a2d01e6f8
Author: lilichen <u6004244@anu.edu.au>
Date:   Wed Apr 15 21:42:37 2020 +1000

    update

commit 5e3c4ae0c64bd06826cbabad442007977e28d74c
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Wed Apr 15 21:37:52 2020 +1000

    Code optimization & new methods updates.

commit dcdcb4790c777c1d66943707bf30188c254d6e59
Author: Xikang Song <u6486892@anu.edu.au>
Date:   Wed Apr 15 12:56:44 2020 +1000

    initial sample_string
    ##complete task 7

commit 0fd458da7aeb6708aed1c27324a6517ef2d8f75c
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Tue Apr 14 19:59:43 2020 +1000

    Updates.

commit a49b45ddd741e2806dec9c22bf312af2abaf7278
Merge: 724d7e8 b44d4aa
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Tue Apr 14 19:58:46 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit b44d4aa3a6e23fa21d008973161d4d34d4f2b018
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Tue Apr 14 09:12:21 2020 +1000

    IsPlacementSequenceValidTest: fix to one test for Rule 4 (was testing a different rule)
    
    GenerateMoveTest: fix two incorrect 'possible moves'
    
    Thanks to Zhichao Tu and Tian Wu for finding these bugs!

commit 724d7e8b17a88f49ea1a7323de15ed117b7177b2
Merge: 755633a d6cb635
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Wed Apr 8 18:29:23 2020 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u7076870/comp1110-ass2-wed10j

commit 755633a65248538adc506c8f6cf1caa6b8a541ae
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Wed Apr 8 18:28:19 2020 +1000

    Code optimization; new methods; minor grammar fixes.

commit d6cb635022c883ae8a0e70cb2e66ffb620dacdc7
Author: Xikang Song <u6486892@anu.edu.au>
Date:   Wed Apr 1 10:44:00 2020 +1100

    upload c

commit e815ce58b7cf093e57cb8dc940fbe9c12094fdd8
Merge: ff5e1ce 677864d
Author: Xikang Song <u6486892@anu.edu.au>
Date:   Wed Apr 1 10:38:33 2020 +1100

    Merge remote-tracking branch 'origin/master'

commit 319e7e9be3d9bd8772880d0052d4b2b6a845bd89
Author: Bob <u1234567@anu.edu.au>
Date:   Wed Apr 1 10:33:44 2020 +1100

    Bob

commit 677864db36bd1bad3adef6f49e16f97aa80d5aba
Merge: 528496a 6141215
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Wed Apr 1 10:30:56 2020 +1100

    Merge remote-tracking branch 'origin/master'

commit 528496a6d456469bfdb948d56312fef3e063fbf9
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Wed Apr 1 10:30:38 2020 +1100

    gittest initial commit.

commit 61412158bcaffe40a1d7a31c6b2a7dde4ffeceab
Author: Shiya Liu <u6783346@anu.edu.au>
Date:   Wed Apr 1 01:27:27 2020 +1100

    update feedback for D2B

commit 3788cefe2760e16e0817f5d1754e512b8787e18f
Author: lilichen <u6004244@anu.edu.au>
Date:   Mon Mar 30 17:57:55 2020 +1100

    updating

commit 813db998b391bcb7c52e5590100015a3fa0f7ecd
Author: lilichen <u6004244@anu.edu.au>
Date:   Mon Mar 30 17:14:03 2020 +1100

    task6 part one

commit 75468df9137e0300530d0d2f5bdc11c249f703a6
Author: lilichen <u6004244@anu.edu.au>
Date:   Sun Mar 29 23:53:40 2020 +1100

    part2 of the skeleton

commit ff5e1ce8a329d167c926a2efd381da68252f935d
Author: Xikang Song <u6486892@anu.edu.au>
Date:   Sun Mar 29 23:14:35 2020 +1100

    skeleton for Viewer.java

commit b095f84dbf7502d62413ffad2f80b90493b59f35
Author: lilichen <u6004244@anu.edu.au>
Date:   Sun Mar 29 22:59:27 2020 +1100

    part of the skeleton

commit c7ef1c87cf7afc0556db9f26e790bba0b68b8c21
Author: lilichen <u6004244@anu.edu.au>
Date:   Sun Mar 29 17:23:53 2020 +1100

    updated task5

commit 22c388053758f78bbce4e05e9095f63164778eef
Author: lilichen <u6004244@anu.edu.au>
Date:   Sun Mar 29 15:26:31 2020 +1100

    originality

commit d1c5e52ac78cf60d312eb7cf83a7dd6717960aba
Author: Lili Chen <u6004244@anu.edu.au>
Date:   Sun Mar 29 15:18:07 2020 +1100

    Update B-originality.yml

commit 524477a209d300d78f7d04361392a18dce7e2ee3
Author: Lili Chen <u6004244@anu.edu.au>
Date:   Sun Mar 29 15:12:42 2020 +1100

    Update B-originality.yml

commit 92ad36d5f9b057f0106878dffd85b81469f8b972
Author: Lili Chen <u6004244@anu.edu.au>
Date:   Sun Mar 29 15:09:44 2020 +1100

    Update B-originality.yml

commit 69cac52d6c048b42d1f9be8037b4621647509d76
Author: Lili Chen <u6004244@anu.edu.au>
Date:   Sun Mar 29 15:07:11 2020 +1100

    Update B-originality.yml

commit 455c9d9ddc24478be237899839f74fcef510fdfc
Author: Lili Chen <u6004244@anu.edu.au>
Date:   Sun Mar 29 15:03:43 2020 +1100

    Update B-originality.yml

commit 3c6488eb6ec424544f6ca349ac8ac80f6112bcab
Author: Lili Chen <u6004244@anu.edu.au>
Date:   Sun Mar 29 14:58:19 2020 +1100

    Update B-contribution.yml

commit 7bbb8b39dbe9479ffd885c545cf54c7f8dda2a95
Author: Lili Chen <u6004244@anu.edu.au>
Date:   Sun Mar 29 14:51:09 2020 +1100

    Update B-originality.yml

commit 7ca610337dfd370cf712512d5b4f562c923ae16e
Author: lilichen <u6004244@anu.edu.au>
Date:   Sat Mar 28 17:08:14 2020 +1100

    update

commit cd60d632f1609ff4ec3e0efb4ddc4cb51e8a6bb4
Author: lilichen <u6004244@anu.edu.au>
Date:   Sat Mar 28 16:24:06 2020 +1100

    task 5 completed

commit f570646922bce1417d5c3d37aa47fa93d1f9a541
Author: lilichen <u6004244@anu.edu.au>
Date:   Sat Mar 28 16:13:12 2020 +1100

    task 5 completed

commit a7b23ddb31ebfac3cb44aeed2a280c7048f1a027
Merge: d3809e4 d25f6e1
Author: lilichen <u6004244@anu.edu.au>
Date:   Sat Mar 28 15:37:55 2020 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u7076870/comp1110-ass2-wed10j
    
     Conflicts:
    	src/comp1110/ass2/Metro.java

commit d3809e4dd53005c8859d4f5b6a1af4642bcfea88
Merge: 16c92e1 1f98ca5
Author: lilichen <u6004244@anu.edu.au>
Date:   Sat Mar 28 15:29:46 2020 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2
    
     Conflicts:
    	src/comp1110/ass2/Metro.java

commit 16c92e15ae786e47193409d2a61cbbbd8cf8665c
Author: lilichen <u6004244@anu.edu.au>
Date:   Sat Mar 28 15:29:08 2020 +1100

    task 5 completed

commit 1f98ca505f018a3c563965e257ecaf768a305676
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Fri Mar 27 22:33:20 2020 +1100

    Task 5: add new parameter totalHands to Metro.drawFromDeck() to represent tiles in player hands
    
    Task 6: fix an incorrect test board string and documentation for Metro.isPlacementSequenceValid

commit d25f6e1657a7c54153652c3e9b66b5a5fba53061
Author: Charlie Xu <charley023@gmail.com>
Date:   Thu Mar 26 19:30:51 2020 +1100

    Signatures.

commit 7e0f6f9e8286e642c488ddbc47b1ecd12e0e846c
Merge: 0aab3df ef86a39
Author: Charlie Xu <charley023@gmail.com>
Date:   Thu Mar 26 19:26:07 2020 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u7076870/comp1110-ass2-wed10j

commit ef86a39f8105af6a5cbcc503d92dfeab2fde783a
Author: Xikang Song <u6486892@anu.edu.au>
Date:   Wed Mar 25 16:17:09 2020 +1100

    fix the center station;
    Minor changes on Viewer layout setting;

commit 1433e9a8621e1b6157656e06d0d9a0ba520c8bdf
Merge: b591af7 17a0900
Author: lilichen <u6004244@anu.edu.au>
Date:   Wed Mar 25 09:49:23 2020 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit 0b73a62333c72103d4fe5d65c9695a60840271c6
Author: Xikang Song <u6486892@anu.edu.au>
Date:   Tue Mar 24 23:18:36 2020 +1100

    fixed metro GUI
    #Display images of pieces in the window (anywhere)
    
    #Translate piece positions to x and y positions in the window.
    
    #Break a placement sequence string into piece placements.
    
    #Display images of edges so that they correctly link nodes.
    
    #Fix the makePlacement() method.

commit b591af704f60951d9836f4dfbcaa512557520487
Author: lilichen <u6004244@anu.edu.au>
Date:   Mon Mar 23 18:02:30 2020 +1100

    task 5 completed

commit 0aab3dfa7fc64877e4cd674668afaf14eeb99511
Merge: acc6fb2 17a0900
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Sun Mar 22 16:17:25 2020 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit acc6fb2ebf17898dc9213020a53523b646857cf1
Author: lilichen <u6004244@anu.edu.au>
Date:   Sat Mar 21 18:08:05 2020 +1100

    task 2 & 3 completed

commit 17a0900365bb7b397bd0f3ee79443ed8d8fcd84d
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Fri Mar 20 20:48:51 2020 +1100

    fixes to README including correct enumeration of player stations

commit f2062571f63b07a67c0f25f8423cfce80fbd8628
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Wed Mar 18 11:57:43 2020 +1100

    First time setup.

commit b8021541e583178178c80c188cecc29be5c1523b
Author: Charlie Xu <u7076870@anu.edu.au>
Date:   Wed Mar 18 11:55:40 2020 +1100

    First time setup.

commit 9764e64113a3dc262e3bc1c41804c538f52abc2d
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Tue Mar 17 09:26:52 2020 +1100

    Initial commit
```
## Changes
``` diff
Only in comp1110-ass2/.idea: artifacts
diff -ru -x .git ../master/comp1110-ass2/.idea/libraries/lib.xml comp1110-ass2/.idea/libraries/lib.xml
--- ../master/comp1110-ass2/.idea/libraries/lib.xml	2020-06-08 14:09:35.484688800 +1000
+++ comp1110-ass2/.idea/libraries/lib.xml	2020-06-08 14:11:38.515107300 +1000
@@ -1,16 +1,13 @@
 <component name="libraryTable">
-    <library name="lib">
-        <CLASSES>
-            <root url="file://$PATH_TO_FX$" />
-        </CLASSES>
-        <JAVADOC />
-        <NATIVE>
-            <root url="file://$PATH_TO_FX$" />
-        </NATIVE>
-        <SOURCES>
-            <root url="file://$PATH_TO_FX$" />
-        </SOURCES>
-        <jarDirectory url="file://$PATH_TO_FX$" recursive="false" />
-        <jarDirectory url="file://$PATH_TO_FX$" recursive="false" type="SOURCES" />
-    </library>
+  <library name="lib">
+    <CLASSES>
+      <root url="file://$PATH_TO_FX$" />
+    </CLASSES>
+    <JAVADOC />
+    <SOURCES>
+      <root url="file://$PATH_TO_FX$" />
+    </SOURCES>
+    <jarDirectory url="file://$PATH_TO_FX$" recursive="false" />
+    <jarDirectory url="file://$PATH_TO_FX$" recursive="false" type="SOURCES" />
+  </library>
 </component>
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/.idea/misc.xml comp1110-ass2/.idea/misc.xml
--- ../master/comp1110-ass2/.idea/misc.xml	2020-06-08 14:09:35.486683200 +1000
+++ comp1110-ass2/.idea/misc.xml	2020-06-08 14:11:38.516403900 +1000
@@ -1,6 +1,6 @@
 <?xml version="1.0" encoding="UTF-8"?>
 <project version="4">
-  <component name="ProjectRootManager" version="2" languageLevel="JDK_13" default="true" project-jdk-name="13" project-jdk-type="JavaSDK">
+  <component name="ProjectRootManager" version="2" languageLevel="JDK_13" default="false" project-jdk-name="13" project-jdk-type="JavaSDK">
     <output url="file://$PROJECT_DIR$/out" />
   </component>
 </project>
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/admin/B-contribution.yml comp1110-ass2/admin/B-contribution.yml
--- ../master/comp1110-ass2/admin/B-contribution.yml	2020-06-08 14:09:35.497654800 +1000
+++ comp1110-ass2/admin/B-contribution.yml	2020-06-08 14:11:38.529070400 +1000
@@ -8,19 +8,19 @@
 # be 100 or 99 (33/33/33 is fine).  (Remove entries if you have fewer than three
 # members).  
 contributions:
-  - uid: 
-    contribution: 
-  - uid:
-    contribution:
-  - uid:
-    contribution:
+  - uid: u6004244
+    contribution: 33
+  - uid: u6486892
+    contribution: 33
+  - uid: u7076870
+    contribution: 33
 
 # Sign *your* name and uids here. (Remove entries if you have fewer
 # than three members)
 signatures:
-  - name:
-    uid:
-  - name:
-    uid:
-  - name:
-    uid:
\ No newline at end of file
+  - name: Lili Chen
+    uid: u6004244
+  - name: Xikang Song
+    uid: u6486892
+  - name: Xu Chan
+    uid: u7076870
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/admin/B-originality.yml comp1110-ass2/admin/B-originality.yml
--- ../master/comp1110-ass2/admin/B-originality.yml	2020-06-08 14:09:35.498394500 +1000
+++ comp1110-ass2/admin/B-originality.yml	2020-06-08 14:11:38.530070300 +1000
@@ -19,9 +19,9 @@
 #
 # Add as many "name+comment" entries as necessary
 # (or remove it altogether if you haven't collaborated with anyone)
-collaboration:
-  - name:
-    comment: >-
+# collaboration:
+#   - name:
+#     comment: >-
 
 # Use this to list any code that you used that you did not write,
 # aside from code provided by the lecturer.  Provide a comment
@@ -30,10 +30,10 @@
 #
 # Add as many "url+licence+comment" entries as necessary
 # (or remove it altogether if you haven't used any external code)
-code:
-  - comment:
-    url:
-    licence:
+# code:
+#  - comment:
+#    url:
+#    licence:
 
 # Use this to list any assets (artwork, sound, etc) that you used.
 # Provide a comment explaining your use of that asset and the URL
@@ -41,18 +41,18 @@
 #
 # Add as many "url+licence+comment" entries as necessary
 # (or remove it altogether if you haven't used any external assets)
-assets:
-  - comment:
-    url:
-    licence:
+#assets:
+#  - comment:
+#    url:
+#    licence:
 
 
 # Sign *your* name and uids here. (Remove entries if you have fewer
 # than three members.)
 signatures:
-  - name:
-    uid:
-  - name:
-    uid:
-  - name:
-    uid:
+  - name: Chan Xu
+    uid: u7076870
+  - name: Xikang Song
+    uid: u6486892
+  - name: Lili Chen
+    uid: u6004244
diff -ru -x .git ../master/comp1110-ass2/admin/C-contribution.yml comp1110-ass2/admin/C-contribution.yml
--- ../master/comp1110-ass2/admin/C-contribution.yml	2020-06-08 14:09:35.498651100 +1000
+++ comp1110-ass2/admin/C-contribution.yml	2020-06-08 14:11:38.530070300 +1000
@@ -8,19 +8,19 @@
 # be 100 or 99 (33/33/33 is fine).  (Remove entries if you have fewer than three
 # members).  
 contributions:
-  - uid: 
-    contribution: 
-  - uid:
-    contribution:
-  - uid:
-    contribution:
+  - uid: u6004244
+    contribution: 33
+  - uid: u6486892
+    contribution: 33
+  - uid: u7076870
+    contribution: 33
 
 # Sign *your* name and uids here. (Remove entries if you have fewer
 # than three members)
 signatures:
-  - name:
-    uid:
-  - name:
-    uid:
-  - name:
-    uid:
\ No newline at end of file
+  - name: Lili Chen
+    uid: u6004244
+  - name: Xikang Song
+    uid: u6486892
+  - name: Xu Chan
+    uid: u7076870
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/admin/C-originality.yml comp1110-ass2/admin/C-originality.yml
--- ../master/comp1110-ass2/admin/C-originality.yml	2020-06-08 14:09:35.499665900 +1000
+++ comp1110-ass2/admin/C-originality.yml	2020-06-08 14:11:38.531065400 +1000
@@ -19,9 +19,9 @@
 #
 # Add as many "name+comment" entries as necessary
 # (or remove it altogether if you haven't collaborated with anyone)
-collaboration:
-  - name:
-    comment: >-
+# collaboration:
+#   - name:
+#     comment: >-
 
 # Use this to list any code that you used that you did not write,
 # aside from code provided by the lecturer.  Provide a comment
@@ -30,10 +30,10 @@
 #
 # Add as many "url+licence+comment" entries as necessary
 # (or remove it altogether if you haven't used any external code)
-code:
-  - comment:
-    url:
-    licence:
+# code:
+#  - comment:
+#    url:
+#    licence:
 
 # Use this to list any assets (artwork, sound, etc) that you used.
 # Provide a comment explaining your use of that asset and the URL
@@ -41,18 +41,18 @@
 #
 # Add as many "url+licence+comment" entries as necessary
 # (or remove it altogether if you haven't used any external assets)
-assets:
-  - comment:
-    url:
-    licence:
+#assets:
+#  - comment:
+#    url:
+#    licence:
 
 
 # Sign *your* name and uids here. (Remove entries if you have fewer
 # than three members.)
 signatures:
-  - name:
-    uid:
-  - name:
-    uid:
-  - name:
-    uid:
+  - name: Chan Xu
+    uid: u7076870
+  - name: Xikang Song
+    uid: u6486892
+  - name: Lili Chen
+    uid: u6004244
Only in ../master/comp1110-ass2/admin: D-newcode-u1234567.md
Only in comp1110-ass2/admin: D-newcode-u6004244.md
Only in comp1110-ass2/admin: D-newcode-u6486892.md
Only in comp1110-ass2/admin: D-newcode-u7076870.md
Only in ../master/comp1110-ass2/admin: D-originality-u1234567.yml
Only in comp1110-ass2/admin: D-originality-u6004244.yml
Only in comp1110-ass2/admin: D-originality-u6486892.yml
Only in comp1110-ass2/admin: D-originality-u7076870.yml
Only in ../master/comp1110-ass2/admin: E-newcode-u1234567.md
Only in comp1110-ass2/admin: E-newcode-u6004244.md
Only in comp1110-ass2/admin: E-newcode-u6486892.md
Only in comp1110-ass2/admin: E-newcode-u7076870.md
Only in ../master/comp1110-ass2/admin: E-originality-u1234567.yml
Only in comp1110-ass2/admin: E-originality-u6004244.yml
Only in comp1110-ass2/admin: E-originality-u6486892.yml
Only in comp1110-ass2/admin: E-originality-u7076870.yml
diff -ru -x .git ../master/comp1110-ass2/admin/F-contribution.yml comp1110-ass2/admin/F-contribution.yml
--- ../master/comp1110-ass2/admin/F-contribution.yml	2020-06-08 14:09:35.503637800 +1000
+++ comp1110-ass2/admin/F-contribution.yml	2020-06-08 14:11:38.542035300 +1000
@@ -8,19 +8,19 @@
 # be 100 or 99 (33/33/33 is fine).  (Remove entries if you have fewer than three
 # members).  
 contributions:
-  - uid: 
-    contribution: 
-  - uid:
-    contribution:
-  - uid:
-    contribution:
+  - uid: u7076870
+    contribution: 33
+  - uid: u6004244
+    contribution: 33
+  - uid: u6486892
+    contribution: 33
 
 # Sign *your* name and uids here. (Remove entries if you have fewer
 # than three members)
 signatures:
-  - name:
-    uid:
-  - name:
-    uid:
-  - name:
-    uid:
\ No newline at end of file
+  - name: Chan Xu
+    uid: u7076870
+  - name: Lili Chen
+    uid: u6004244
+  - name: Xikang Song
+    uid: u6486892
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/admin/F-originality.yml comp1110-ass2/admin/F-originality.yml
--- ../master/comp1110-ass2/admin/F-originality.yml	2020-06-08 14:09:35.504333200 +1000
+++ comp1110-ass2/admin/F-originality.yml	2020-06-08 14:11:38.543032400 +1000
@@ -19,9 +19,9 @@
 #
 # Add as many "name+comment" entries as necessary
 # (or remove it altogether if you haven't collaborated with anyone)
-collaboration:
-  - name:
-    comment: >-
+#collaboration:
+#  - name:
+#    comment: >-
 
 # Use this to list any code that you used that you did not write,
 # aside from code provided by the lecturer.  Provide a comment
@@ -30,10 +30,10 @@
 #
 # Add as many "url+licence+comment" entries as necessary
 # (or remove it altogether if you haven't used any external code)
-code:
-  - comment:
-    url:
-    licence:
+#code:
+#  - comment:
+#    url:
+#    licence:
 
 # Use this to list any assets (artwork, sound, etc) that you used.
 # Provide a comment explaining your use of that asset and the URL
@@ -41,18 +41,18 @@
 #
 # Add as many "url+licence+comment" entries as necessary
 # (or remove it altogether if you haven't used any external assets)
-assets:
-  - comment:
-    url:
-    licence:
+#assets:
+#  - comment:
+#    url:
+#    licence:
 
 
 # Sign *your* name and uids here. (Remove entries if you have fewer
 # than three members.)
 signatures:
-  - name:
-    uid:
-  - name:
-    uid:
-  - name:
-    uid:
+  - name: Chan Xu
+    uid: u7076870
+  - name: Lili Chen
+    uid: u6004244
+  - name: Xikang Song
+    uid: u6486892
Only in ../master/comp1110-ass2/admin: F-review-u1234567.yml
Only in comp1110-ass2/admin: F-review-u6004244.yml
Only in comp1110-ass2/admin: F-review-u6486892.yml
Only in comp1110-ass2/admin: F-review-u7076870.yml
Only in ../master/comp1110-ass2/admin: G-best-u1234567.yml
Only in comp1110-ass2/admin: G-best-u6004244.yml
Only in comp1110-ass2/admin: G-best-u6486892.yml
Only in comp1110-ass2/admin: G-best-u7076870.yml
diff -ru -x .git ../master/comp1110-ass2/admin/G-contribution.yml comp1110-ass2/admin/G-contribution.yml
--- ../master/comp1110-ass2/admin/G-contribution.yml	2020-06-08 14:09:35.505632400 +1000
+++ comp1110-ass2/admin/G-contribution.yml	2020-06-08 14:11:38.551012800 +1000
@@ -10,19 +10,19 @@
 # be 100 or 99 (33/33/33 is fine).  (Remove entries if you have fewer than three
 # members).
 contributions:
-  - uid: 
-    contribution: 
-  - uid:
-    contribution:
-  - uid:
-    contribution:
+  - uid: u7076870
+    contribution: 33
+  - uid: u6004244
+    contribution: 33
+  - uid: u6486892
+    contribution: 33
 
 # Sign *your* name and uids here. (Remove entries if you have fewer
 # than three members)
 signatures:
-  - name:
-    uid:
-  - name:
-    uid:
-  - name:
-    uid:
+  - name: Chan Xu
+    uid: u7076870
+  - name: Lili Chen
+    uid: u6004244
+  - name: Xikang Song
+    uid: u6486892
diff -ru -x .git ../master/comp1110-ass2/admin/G-features.md comp1110-ass2/admin/G-features.md
--- ../master/comp1110-ass2/admin/G-features.md	2020-06-08 14:09:35.506629300 +1000
+++ comp1110-ass2/admin/G-features.md	2020-06-08 14:11:38.553008100 +1000
@@ -3,10 +3,10 @@
 
 *(Remove those that are unimplemented)*
 
- - A simple placement viewer (Task 4)
- - A basic playable game
- - A basic playable game that snaps pieces to the board and checks for validity (Task 9)
- - Computes a score for the game (Task 8)
+ X A simple placement viewer (Task 4)
+ X A basic playable game
+ X A basic playable game that snaps pieces to the board and checks for validity (Task 9)
+ X Computes a score for the game (Task 8)
  - Playable against a computer opponent (Task 11)
 
 additional features...
diff -ru -x .git ../master/comp1110-ass2/admin/G-originality.yml comp1110-ass2/admin/G-originality.yml
--- ../master/comp1110-ass2/admin/G-originality.yml	2020-06-08 14:09:35.508626600 +1000
+++ comp1110-ass2/admin/G-originality.yml	2020-06-08 14:11:38.554022500 +1000
@@ -19,9 +19,9 @@
 #
 # Add as many "name+comment" entries as necessary
 # (or remove it altogether if you haven't collaborated with anyone)
-collaboration:
-  - name:
-    comment: >-
+#collaboration:
+#  - name:
+#    comment: >-
 
 # Use this to list any code that you used that you did not write,
 # aside from code provided by the lecturer.  Provide a comment
@@ -30,10 +30,10 @@
 #
 # Add as many "url+licence+comment" entries as necessary
 # (or remove it altogether if you haven't used any external code)
-code:
-  - comment:
-    url:
-    licence:
+#code:
+#  - comment:
+#    url:
+#    licence:
 
 # Use this to list any assets (artwork, sound, etc) that you used.
 # Provide a comment explaining your use of that asset and the URL
@@ -41,18 +41,18 @@
 #
 # Add as many "url+licence+comment" entries as necessary
 # (or remove it altogether if you haven't used any external assets)
-assets:
-  - comment:
-    url:
-    licence:
+#assets:
+#  - comment:
+#    url:
+#    licence:
 
 
 # Sign *your* name and uids here. (Remove entries if you have fewer
 # than three members.)
 signatures:
-  - name:
-    uid:
-  - name:
-    uid:
-  - name:
-    uid:
+  - name: Chan Xu
+    uid: u7076870
+  - name: Lili Chen
+    uid: u6004244
+  - name: Xikang Song
+    uid: u6486892
diff -ru -x .git ../master/comp1110-ass2/admin/H-contribution.yml comp1110-ass2/admin/H-contribution.yml
--- ../master/comp1110-ass2/admin/H-contribution.yml	2020-06-08 14:09:35.508626600 +1000
+++ comp1110-ass2/admin/H-contribution.yml	2020-06-08 14:11:38.555000500 +1000
@@ -8,19 +8,19 @@
 # be 100 or 99 (33/33/33 is fine).  (Remove entries if you have fewer than three
 # members).  
 contributions:
-  - uid: 
-    contribution: 
-  - uid:
-    contribution:
-  - uid:
-    contribution:
+  - uid: u7076870
+    contribution: 33
+  - uid: u6004244
+    contribution: 33
+  - uid: u6486892
+    contribution: 33
 
 # Sign *your* name and uids here. (Remove entries if you have fewer
 # than three members)
 signatures:
-  - name:
-    uid:
-  - name:
-    uid:
-  - name:
-    uid:
\ No newline at end of file
+  - name: Chan Xu
+    uid: u7076870
+  - name: Lili Chen
+    uid: u6004244
+  - name: Xikang Song
+    uid: u6486892
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/admin/H-originality.yml comp1110-ass2/admin/H-originality.yml
--- ../master/comp1110-ass2/admin/H-originality.yml	2020-06-08 14:09:35.510135400 +1000
+++ comp1110-ass2/admin/H-originality.yml	2020-06-08 14:11:38.555998400 +1000
@@ -19,9 +19,9 @@
 #
 # Add as many "name+comment" entries as necessary
 # (or remove it altogether if you haven't collaborated with anyone)
-collaboration:
-  - name:
-    comment: >-
+#collaboration:
+#  - name:
+#    comment: >-
 
 # Use this to list any code that you used that you did not write,
 # aside from code provided by the lecturer.  Provide a comment
@@ -30,10 +30,10 @@
 #
 # Add as many "url+licence+comment" entries as necessary
 # (or remove it altogether if you haven't used any external code)
-code:
-  - comment:
-    url:
-    licence:
+#code:
+#  - comment:
+#    url:
+#    licence:
 
 # Use this to list any assets (artwork, sound, etc) that you used.
 # Provide a comment explaining your use of that asset and the URL
@@ -41,18 +41,18 @@
 #
 # Add as many "url+licence+comment" entries as necessary
 # (or remove it altogether if you haven't used any external assets)
-assets:
-  - comment:
-    url:
-    licence:
+#assets:
+#  - comment:
+#    url:
+#    licence:
 
 
 # Sign *your* name and uids here. (Remove entries if you have fewer
 # than three members.)
 signatures:
-  - name:
-    uid:
-  - name:
-    uid:
-  - name:
-    uid:
+  - name: Chan Xu
+    uid: u7076870
+  - name: Lili Chen
+    uid: u6004244
+  - name: Xikang Song
+    uid: u6486892
diff -ru -x .git ../master/comp1110-ass2/admin/H-presentation.yml comp1110-ass2/admin/H-presentation.yml
--- ../master/comp1110-ass2/admin/H-presentation.yml	2020-06-08 14:11:17.737839000 +1000
+++ comp1110-ass2/admin/H-presentation.yml	2020-06-08 14:11:38.556995400 +1000
@@ -1,2 +1,2 @@
 # use this file to record the ANU Sharepoint URL for your video presentation
-url: https://anu365-my.sharepoint.com/:v:/g/personal/u1234567_anu_edu_au/xxxx
\ No newline at end of file
+url: https://anu365-my.sharepoint.com/:v:/g/personal/u7076870_anu_edu_au/Edcrn1sZyApOmsABY7eVF7gBy_XJXFBkLjXoEYiR7dGCZw?e=gc32oN
diff -ru -x .git ../master/comp1110-ass2/admin/members.yml comp1110-ass2/admin/members.yml
--- ../master/comp1110-ass2/admin/members.yml	2020-06-08 14:09:35.512818100 +1000
+++ comp1110-ass2/admin/members.yml	2020-06-08 14:11:38.557994000 +1000
@@ -3,9 +3,9 @@
 #
 
 members:
-  - name:
-    uid:
-  - name:
-    uid:
-  - name:
-    uid:
+  - name: Charlie Xu
+    uid: u7076870
+  - name: Lili Chen
+    uid: u6004244
+  - name: Xikang Song
+    uid: u6486892
diff -ru -x .git ../master/comp1110-ass2/admin/tasks.md comp1110-ass2/admin/tasks.md
--- ../master/comp1110-ass2/admin/tasks.md	2020-06-08 14:09:35.512818100 +1000
+++ comp1110-ass2/admin/tasks.md	2020-06-08 14:11:38.559987300 +1000
@@ -5,15 +5,15 @@
 
 ## Week 4
 
-Everyone: create application skeleton - meeting 14:00 20 Mar
+Everyone: take an initial view of Assignment 2 together and discuss about it- meeting undecided.
 
 ## Week 5
 
-Zhang San: Task 3 isPiecePlacementWellFormed - 26 Mar
+(Zhang San: Task 3 isPiecePlacementWellFormed - 26 Mar
 
 Jane Bloggs: Task 4 getNeighbours - 27 Mar
 
-Erika Mustermann: Task 6 getViablePiecePlacements - 28 Mar (depends on Task 3)
+Erika Mustermann: Task 6 getViablePiecePlacements - 28 Mar (depends on Task 3))
 
 ## Week 6
 
diff -ru -x .git ../master/comp1110-ass2/comp1110-ass2.iml comp1110-ass2/comp1110-ass2.iml
--- ../master/comp1110-ass2/comp1110-ass2.iml	2020-06-08 14:09:35.625310800 +1000
+++ comp1110-ass2/comp1110-ass2.iml	2020-06-08 14:11:38.840237800 +1000
@@ -8,7 +8,6 @@
     </content>
     <orderEntry type="inheritedJdk" />
     <orderEntry type="sourceFolder" forTests="false" />
-    <orderEntry type="library" name="lib" level="project" />
     <orderEntry type="module-library" scope="TEST">
       <library name="JUnit4">
         <CLASSES>
@@ -19,5 +18,27 @@
         <SOURCES />
       </library>
     </orderEntry>
+    <orderEntry type="module-library" scope="TEST">
+      <library name="JUnit4">
+        <CLASSES>
+          <root url="jar://$MAVEN_REPOSITORY$/junit/junit/4.12/junit-4.12.jar!/" />
+          <root url="jar://$MAVEN_REPOSITORY$/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar!/" />
+        </CLASSES>
+        <JAVADOC />
+        <SOURCES />
+      </library>
+    </orderEntry>
+    <orderEntry type="module-library" scope="TEST">
+      <library name="JUnit4">
+        <CLASSES>
+          <root url="jar://$MAVEN_REPOSITORY$/junit/junit/4.12/junit-4.12.jar!/" />
+          <root url="jar://$MAVEN_REPOSITORY$/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar!/" />
+        </CLASSES>
+        <JAVADOC />
+        <SOURCES />
+      </library>
+    </orderEntry>
+    <orderEntry type="library" name="lib" level="application" />
+    <orderEntry type="library" name="JavaFX.11" level="application" />
   </component>
 </module>
\ No newline at end of file
Only in comp1110-ass2: feedback.md
Only in comp1110-ass2: game.jar
Only in comp1110-ass2: markertmp
Only in comp1110-ass2: META-INF
Only in comp1110-ass2: presentation.pdf
Only in comp1110-ass2/src/comp1110/ass2: Coordinates.java
Only in comp1110-ass2/src/comp1110/ass2: CoordinatesEnum.java
Only in comp1110-ass2/src/comp1110/ass2: gittest
Only in comp1110-ass2/src/comp1110/ass2/gui/assets: bg.jpg
Only in comp1110-ass2/src/comp1110/ass2/gui: Game.java
diff -ru -x .git ../master/comp1110-ass2/src/comp1110/ass2/gui/Viewer.java comp1110-ass2/src/comp1110/ass2/gui/Viewer.java
--- ../master/comp1110-ass2/src/comp1110/ass2/gui/Viewer.java	2020-06-08 14:09:35.628310100 +1000
+++ comp1110-ass2/src/comp1110/ass2/gui/Viewer.java	2020-06-08 14:11:39.003800200 +1000
@@ -5,12 +5,22 @@
 import javafx.event.EventHandler;
 import javafx.scene.Group;
 import javafx.scene.Scene;
+import javafx.scene.canvas.Canvas;
+import javafx.scene.canvas.GraphicsContext;
 import javafx.scene.control.Button;
 import javafx.scene.control.Label;
 import javafx.scene.control.TextField;
+import javafx.scene.effect.DropShadow;
+import javafx.scene.image.Image;
+import javafx.scene.image.ImageView;
 import javafx.scene.layout.HBox;
+import javafx.scene.paint.Color;
+import javafx.scene.shape.ArcType;
+import javafx.scene.shape.Rectangle;
 import javafx.stage.Stage;
 
+import java.awt.image.BufferedImage;
+
 /**
  * A very simple viewer for piece placements in the Metro game.
  * <p>
@@ -20,7 +30,7 @@
  */
 public class Viewer extends Application {
     /* board layout */
-    private static final int SQUARE_SIZE = 70;
+    private static final int SQUARE_SIZE = 60;
     private static final int VIEWER_WIDTH = 1024;
     private static final int VIEWER_HEIGHT = 768;
 
@@ -28,8 +38,22 @@
 
     private final Group root = new Group();
     private final Group controls = new Group();
+    private final Group tiles = new Group();
+    private final Group board = new Group();
+    private final Group station_imgs = new Group();
+    private final Group board_imgs = new Group();
+    private final Group draggable_imgs = new Group();
     private TextField textField;
 
+    private static final int TILE_SPACING = 150;
+    private static final int MARGIN_X = 90;
+    private static final int MARGIN_Y = 40;
+    private static final int BOARD_MARGIN = 71;
+    private static final int BOARD_WIDTH = TILE_SPACING * 3 + BOARD_MARGIN * 2;
+    private static final int BOARD_HEIGHT = TILE_SPACING * 3 + BOARD_MARGIN * 2;
+    private static final int BOARD_Y = MARGIN_Y;
+    private static final int BOARD_X = MARGIN_X;
+
     /**
      * Draw a placement in the window, removing any previously drawn one
      *
@@ -37,6 +61,141 @@
      */
     void makePlacement(String placement) {
         // FIXME Task 4: implement the simple placement viewer
+        board_imgs.getChildren().clear();
+        for (int i = 0; i < placement.length(); i += 6) {
+            ImageView img = new ImageView();
+            img.setImage(new Image(getClass().getResource(URI_BASE + placement.substring(i, i + 4) + ".jpg").toString()));
+            img.setFitWidth(SQUARE_SIZE - 1);
+            img.setFitHeight(SQUARE_SIZE - 1);
+            img.setLayoutX(MARGIN_X - 5 + (placement.charAt(i + 5) - '0' + 1) * SQUARE_SIZE);
+            img.setLayoutY(MARGIN_Y - 5 + (placement.charAt(i + 4) - '0' + 1) * SQUARE_SIZE);
+            board_imgs.getChildren().add(img);
+        }
+        root.getChildren().add(board_imgs);
+    }
+
+    private void makeStations() {
+        for (int i = 1; i <= 8; i++) {
+            ImageView img = new ImageView();
+            img.setImage(new Image(getClass().getResource(URI_BASE + "station" + i + ".jpg").toString()));
+            img.setFitWidth(SQUARE_SIZE - 1);
+            img.setFitHeight(SQUARE_SIZE - 1);
+            img.setLayoutX(626 - i * SQUARE_SIZE);
+            img.setLayoutY(MARGIN_Y - 5);
+            img.setRotate(180);
+            station_imgs.getChildren().add(img);
+
+            img = new ImageView();
+            img.setImage(new Image(getClass().getResource(URI_BASE + "station" + (17 - i) + ".jpg").toString()));
+            img.setFitWidth(SQUARE_SIZE - 1);
+            img.setFitHeight(SQUARE_SIZE - 1);
+            img.setLayoutX(MARGIN_X - 5);
+            img.setLayoutY(575 - i * SQUARE_SIZE);
+            img.setRotate(90);
+            station_imgs.getChildren().add(img);
+
+            img = new ImageView();
+            img.setImage(new Image(getClass().getResource(URI_BASE + "station" + (25 - i) + ".jpg").toString()));
+            img.setFitWidth(SQUARE_SIZE - 1);
+            img.setFitHeight(SQUARE_SIZE - 1);
+            img.setLayoutX(626 - i * SQUARE_SIZE);
+            img.setLayoutY(MARGIN_Y - 5 + 9 * SQUARE_SIZE);
+            station_imgs.getChildren().add(img);
+
+            img = new ImageView();
+            img.setImage(new Image(getClass().getResource(URI_BASE + "station" + (i + 24) + ".jpg").toString()));
+            img.setFitWidth(SQUARE_SIZE - 1);
+            img.setFitHeight(SQUARE_SIZE - 1);
+            img.setLayoutX(MARGIN_X - 5 + 9 * SQUARE_SIZE);
+            img.setLayoutY(575 - i * SQUARE_SIZE);
+            img.setRotate(270);
+            station_imgs.getChildren().add(img);
+        }
+
+        ImageView img = new ImageView();
+        img.setImage(new Image(getClass().getResource(URI_BASE + "centre_station.jpg").toString()));
+        img.setFitWidth(SQUARE_SIZE - 1);
+        img.setFitHeight(SQUARE_SIZE - 1);
+        img.setLayoutX(MARGIN_X - 5 + 4 * SQUARE_SIZE);
+        img.setLayoutY(MARGIN_Y - 5 + 4 * SQUARE_SIZE);
+        img.setRotate(270);
+        station_imgs.getChildren().add(img);
+        img = new ImageView();
+        img.setImage(new Image(getClass().getResource(URI_BASE + "centre_station.jpg").toString()));
+        img.setFitWidth(SQUARE_SIZE - 1);
+        img.setFitHeight(SQUARE_SIZE - 1);
+        img.setLayoutX(MARGIN_X - 5 + 4 * SQUARE_SIZE);
+        img.setLayoutY(MARGIN_Y - 5 + 5 * SQUARE_SIZE);
+        img.setRotate(180);
+        station_imgs.getChildren().add(img);
+        img = new ImageView();
+        img.setImage(new Image(getClass().getResource(URI_BASE + "centre_station.jpg").toString()));
+        img.setFitWidth(SQUARE_SIZE - 1);
+        img.setFitHeight(SQUARE_SIZE - 1);
+        img.setLayoutX(MARGIN_X - 5 + 5 * SQUARE_SIZE);
+        img.setLayoutY(MARGIN_Y - 5 + 4 * SQUARE_SIZE);
+        station_imgs.getChildren().add(img);
+        img = new ImageView();
+        img.setImage(new Image(getClass().getResource(URI_BASE + "centre_station.jpg").toString()));
+        img.setFitWidth(SQUARE_SIZE - 1);
+        img.setFitHeight(SQUARE_SIZE - 1);
+        img.setLayoutX(MARGIN_X - 5 + 5 * SQUARE_SIZE);
+        img.setLayoutY(MARGIN_Y - 5 + 5 * SQUARE_SIZE);
+        img.setRotate(90);
+        station_imgs.getChildren().add(img);
+
+        root.getChildren().add(station_imgs);
+    }
+
+    private void makeBoard() {
+        board.getChildren().clear();
+
+        Rectangle baseboard = new Rectangle();
+        baseboard.setWidth(BOARD_WIDTH + 10);
+        baseboard.setHeight(BOARD_HEIGHT + 10);
+        baseboard.setLayoutX(BOARD_X - 5);
+        baseboard.setLayoutY(BOARD_Y - 5);
+        baseboard.setArcWidth(20.0);
+        baseboard.setArcHeight(20.0);
+        baseboard.setFill(Color.CORNFLOWERBLUE);
+        baseboard.setStroke(Color.CYAN);
+        baseboard.setOpacity(0.7);
+
+        DropShadow dropShadow = new DropShadow();
+        dropShadow.setOffsetX(2.0);
+        dropShadow.setOffsetY(2.0);
+        dropShadow.setColor(Color.color(0, 0, 0, .4));
+        baseboard.setEffect(dropShadow);
+
+        board.getChildren().add(baseboard);
+        tiles.setLayoutX(BOARD_MARGIN);
+        tiles.setLayoutY(BOARD_MARGIN);
+        board.getChildren().add(tiles);
+        Canvas canvas = new Canvas(VIEWER_WIDTH, VIEWER_HEIGHT);
+        GraphicsContext gc = canvas.getGraphicsContext2D();
+        drawLines(gc);
+
+        root.getChildren().add(board);
+        root.getChildren().add(canvas);
+        canvas.toBack();
+        board.toBack();
+    }
+
+    public void drawLines(GraphicsContext gc) {
+        //draw lines
+        gc.setLineWidth(3);
+        gc.setStroke(Color.BROWN);
+        int x_shift = 145;
+        int y_shift = 95;
+        int y_final = SQUARE_SIZE * 8 + y_shift;
+        int x_final = SQUARE_SIZE * 8 + x_shift;
+        for (int i = 0; i < 9; i++)
+            gc.strokeLine(x_shift + i * SQUARE_SIZE, y_shift,
+                    x_shift + i * SQUARE_SIZE, y_final);
+        for (int i = 0; i < 9; i++)
+            gc.strokeLine(x_shift, y_shift + i * SQUARE_SIZE,
+                    x_final, y_shift + i * SQUARE_SIZE);
+        gc.restore();
     }
 
     /**
@@ -70,6 +229,8 @@
         root.getChildren().add(controls);
 
         makeControls();
+        makeBoard();
+        makeStations();
 
         primaryStage.setScene(scene);
         primaryStage.show();
diff -ru -x .git ../master/comp1110-ass2/src/comp1110/ass2/Metro.java comp1110-ass2/src/comp1110/ass2/Metro.java
--- ../master/comp1110-ass2/src/comp1110/ass2/Metro.java	2020-06-08 14:11:17.740081300 +1000
+++ comp1110-ass2/src/comp1110/ass2/Metro.java	2020-06-08 14:11:38.996819700 +1000
@@ -1,6 +1,110 @@
 package comp1110.ass2;
 
+import java.util.*;
+import java.util.regex.Matcher;
+import java.util.regex.Pattern;
+import java.util.stream.Collectors;
+import java.util.stream.Stream;
+
+/**
+ * Add UI interaction features on Viewer.java to improve gaming experience
+ * <p>
+ * Build up a touchable function for moving tiles and drag&release
+ * set up Hotkey on a keyboard for rotation and change tiles
+ * Insert music and play the sound when user interact with our UI
+ * Support higher resolution
+ * <p>
+ * Difficulty level slider
+ * <p>
+ * the player will choose difficulty level from level 1 to level 3
+ * <p>
+ * The number of opponents slider
+ * <p>
+ * the player will choose opponents number from 1 to 5
+ * <p>
+ * Add a method to display potential moves
+ * <p>
+ * when it is the player's turn
+ * display all the valid moves as partially transparent pieces
+ * the player click one of the partially transparent pieces to make their move
+ * <p>
+ * message on completion
+ * <p>
+ * Add a method to define difficulty levels
+ * <p>
+ * The method should include difficulty level from the level 1 to level 3
+ * <p>
+ * Construct a game for a given level of difficulty, given number of players
+ * <p>
+ * This creates a new instance of the game at the given level of difficulty and number of players
+ * <p>
+ * Add a method to detect if the game is over
+ * <p>
+ * Given a placement sequence string, detect when game is over
+ * when all the pieces have been placed, The games is over
+ * @return return true when game is over
+ * public static boolean isGameOver(String placementSequence,String hand) {
+ * return true;
+ */
+
+/**
+ * Difficulty level slider
+ *
+ * the player will choose difficulty level from level 1 to level 3
+ */
+
+/**
+ * The number of opponents slider
+ *
+ * the player will choose opponents number from 1 to 5
+ */
+
+/**
+ * Add a method to display potential moves
+ *
+ * when it is the player's turn
+ * display all the valid moves as partially transparent pieces
+ * the player click one of the partially transparent pieces to make their move
+ */
+
+/**
+ * message on completion
+ */
+
+/**
+ * Add a method to define difficulty levels
+ *
+ * The method should include difficulty level from the level 1 to level 3
+ */
+
+/**
+ * Construct a game for a given level of difficulty, given number of players
+ *
+ * This creates a new instance of the game at the given level of difficulty and number of players
+ */
+
+/**
+ * Add a method to detect if the game is over
+ *
+ * Given a placement sequence string, detect when game is over
+ * when all the pieces have been placed, The games is over
+ * @return return true when game is over
+ * public static boolean isGameOver(String placementSequence,String hand) {
+ *     return true;
+ */
+
+/**
+ * Add UI interaction features on Viewer.java to improve gaming experience
+ * Build up a touchable function for moving tiles and drag&release
+ * set up Hotkey on keyboard for rotation and change tiles
+ * Insert music and play the sound when user interact with our UI
+ * Support higher resolution
+ */
+
+
 public class Metro {
+    private final static String SAMPLE_START = "bcbc02cbcb67bcdd66cbaa17ddbc12ccda03dbcd37badb16cccc13dada65bbbb11aacb06dacc21dada36adbb22baac75acba04aaaa15cbaa23cdac05dddd24aacb27baac55bcbc32badb47acba26accd73bbbb45bbad64aaaa20cddb25aacb07cbcb30adad01aaaa00acba10cdac60dacc72ccda14dbba35cccc62accd71cbaa63baac56acba77cddb61dbcd54cbaa31bbad76cbcb74adad52baac51adbb42ddbc40dddd46dbba53bcbc41aacb57bcdd50aaaa70";
+
     /**
      * Task 2
      * Determine whether a piece placement is well-formed. For a piece
@@ -14,10 +118,31 @@
      * @param piecePlacement A String representing the piece to be placed
      * @return True if this string is well-formed
      */
+
     public static boolean isPiecePlacementWellFormed(String piecePlacement) {
         // FIXME Task 2: determine whether a piece placement is well-formed
-        return false;
+        //  Method 1 Authored by Chan Xu, u7076870
+        return piecePlacement.matches("[a-d][a-d][a-d][a-d][0-7][0-7]");
     }
+    //  Method 2 Authored by Lily Chen, u6004244
+//        Pattern pattern = Pattern.compile("[a-d][a-d][a-d][a-d][0-7][0-7]");
+//        Matcher matcher = pattern.matcher(piecePlacement);
+//        return matcher.matches();
+    //  Method 3 Authored by Lily Chen, u6004244
+//        if (piecePlacement.length() == 6) {
+//            for (int i = 0; i < piecePlacement.length() - 2; i++) {
+//                if (!(piecePlacement.charAt(i) >= 'a' && piecePlacement.charAt(i) <= 'd')) {
+//                    return false;
+//                }
+//            }
+//            for (int i = 4; i < piecePlacement.length(); i++) {
+//                if (!(piecePlacement.charAt(i) >= '0' && piecePlacement.charAt(i) <= '7')) {
+//                    return false;
+//                }
+//            }
+//        } else return false;
+//        return true;
+
 
     /**
      * Task 3
@@ -34,9 +159,59 @@
      */
     public static boolean isPlacementSequenceWellFormed(String placement) {
         // FIXME Task 3: determine whether a placement sequence is well-formed
-        return false;
+        //  Method 1 Authored by Lily Chen, u6004244
+        // Count how many times the substring appears in the larger string
+        List<Integer> intList0 = Tiles.tilesCount(placement, TilesEnum.Four.getTiles());
+        List<Integer> intList1 = Tiles.tilesCount(placement, TilesEnum.Three.getTiles());
+        List<Integer> intList2 = Tiles.tilesCount(placement, TilesEnum.Two.getTiles());
+        if (placement.length() % 6 == 0) {
+            for (int i = 0; i < placement.length() - 6; i += 6) {
+                if (!(isPiecePlacementWellFormed(placement.substring(i, i + 6)))) {
+                    return false;
+                }
+            }
+        } else return false;
+        return Collections.max(intList0).compareTo(4) <= 0 && Collections.max(intList1).compareTo(3) <= 0 && Collections.max(intList2).compareTo(2) <= 0;
     }
 
+    //  Method 2 Authored by Chan Xu, u7076870
+//        int aacb = 0; int cbaa = 0; int acba = 0; int baac = 0; int aaaa = 0;
+//        int cbcb = 0; int bcbc = 0;
+//        int cccc = 0; int bbbb = 0; int dacc = 0; int cdac = 0; int ccda = 0; int accd = 0; int dbba = 0; int adbb = 0; int badb = 0; int bbad = 0; int ddbc = 0; int cddb = 0; int bcdd = 0; int dbcd = 0; int adad = 0; int dada = 0; int dddd = 0;
+//        if (placement.length() == 0) return true;
+//        else if (placement.length() % 6 != 0 || placement.length() > 360) return false;
+//        for (int i = 0; i < placement.length() - 6; i += 6){
+//            if (isPiecePlacementWellFormed(placement.substring(i, i + 6))) {
+//                if (placement.substring(i, i + 4).equals("aacb")) aacb++;
+//                if (placement.substring(i, i + 4).equals("cbaa")) cbaa++;
+//                if (placement.substring(i, i + 4).equals("acba")) acba++;
+//                if (placement.substring(i, i + 4).equals("baac")) baac++;
+//                if (placement.substring(i, i + 4).equals("aaaa")) aaaa++;
+//                if (placement.substring(i, i + 4).equals("cbcb")) cbcb++;
+//                if (placement.substring(i, i + 4).equals("bcbc")) bcbc++;
+//                if (placement.substring(i, i + 4).equals("cccc")) cccc++;
+//                if (placement.substring(i, i + 4).equals("bbbb")) bbbb++;
+//                if (placement.substring(i, i + 4).equals("dacc")) dacc++;
+//                if (placement.substring(i, i + 4).equals("cdac")) cdac++;
+//                if (placement.substring(i, i + 4).equals("ccda")) ccda++;
+//                if (placement.substring(i, i + 4).equals("accd")) accd++;
+//                if (placement.substring(i, i + 4).equals("dbba")) dbba++;
+//                if (placement.substring(i, i + 4).equals("adbb")) adbb++;
+//                if (placement.substring(i, i + 4).equals("badb")) badb++;
+//                if (placement.substring(i, i + 4).equals("bbad")) bbad++;
+//                if (placement.substring(i, i + 4).equals("ddbc")) ddbc++;
+//                if (placement.substring(i, i + 4).equals("cddb")) cddb++;
+//                if (placement.substring(i, i + 4).equals("bcdd")) bcdd++;
+//                if (placement.substring(i, i + 4).equals("dbcd")) dbcd++;
+//                if (placement.substring(i, i + 4).equals("adad")) adad++;
+//                if (placement.substring(i, i + 4).equals("dada")) dada++;
+//                if (placement.substring(i, i + 4).equals("dddd")) dddd++;
+//            }
+//            else return false;
+//        }
+//        return aacb <= 4 && cbaa <= 4 && acba <= 4 && baac <= 4 && aaaa <= 4 && cbcb <= 3 && bcbc <= 3 && cccc <= 2 && bbbb <= 2 && dacc <= 2 && cdac <= 2 && ccda <= 2 && accd <= 2 && dbba <= 2 && adbb <= 2 && badb <= 2 && bbad <= 2 && ddbc <= 2 && cddb <= 2 && bcdd <= 2 && dbcd <= 2 && adad <= 2 && dada <= 2 && dddd <= 2;
+
+
     /**
      * Task 5
      * Draw a random tile from the deck.
@@ -49,8 +224,79 @@
      */
     public static String drawFromDeck(String placementSequence, String totalHands) {
         // FIXME Task 5: draw a random tile from the deck
-        return "";
+        //  Method 1 Authored by Chan Xu, u7076870
+        List<String> joinedList = new ArrayList<>(Tiles.allTiles());
+        if (placementSequence.length() != 0) {
+            for (int i = 0; i <= placementSequence.length() - 6; i += 6) {
+                joinedList.remove(placementSequence.substring(i, i + 4));
+            }
+        }
+        if (totalHands.length() != 0) {
+            for (int i = 0; i <= totalHands.length() - 4; i += 4) {
+                joinedList.remove(totalHands.substring(i, i + 4));
+            }
+        }
+        Random rand = new Random();
+        int index = rand.nextInt(joinedList.size());
+        return joinedList.get(index);
     }
+    //  Method 2 Authored by Lily Chen, u6004244
+    // Create total tiles list
+//        List<String> repeatList0 = new ArrayList<>();
+//        List<String> repeatList1 = new ArrayList<>();
+//        List<String> repeatList2 = new ArrayList<>();
+//        int indexOfList0 = 0;
+//        int indexOfList1 = 0;
+//        int indexOfList2 = 0;
+//        for (int i = 1; i <= list0.size() * 4; i++) {
+//            repeatList0.add(list0.get(indexOfList0++));
+//            if (indexOfList0 == list0.size()) {
+//                indexOfList0 = 0;
+//            }
+//        }
+//        for (int i = 1; i <= list1.size() * 3; i++) {
+//            repeatList1.add(list1.get(indexOfList1++));
+//            if (indexOfList1 == list1.size()) {
+//                indexOfList1 = 0;
+//            }
+//        }
+//        for (int i = 1; i <= list2.size() * 2; i++) {
+//            repeatList2.add(list2.get(indexOfList2++));
+//            if (indexOfList2 == list2.size()) {
+//                indexOfList2 = 0;
+//            }
+//        }
+//        List<String> joinedList = new ArrayList<>();
+//        Stream.of(list00, list01, list02).forEach(joinedList::addAll);
+//        String[] allTiles = joinedList.toArray(new String[0]);
+//        // Remove the tile been placed
+//        for (String allTile : allTiles) {
+//            Matcher matcher = Pattern.compile(allTile).matcher(placementSequence);
+//            while (matcher.find()) {
+//                joinedList.remove(allTile);
+//                placementSequence = placementSequence.substring(0, placementSequence.indexOf(allTile)) + placementSequence.substring(placementSequence.indexOf(allTile) + 6);
+//            }
+//        }
+
+//        // Remove the tiles in all hands
+//        char separator = '_';
+//        StringBuilder totalHands1 = new StringBuilder(totalHands);
+//        for (int i = 0; i < totalHands.length() / 4; i++) {
+//            totalHands1.insert(((i + 1) * 4) + i, separator);
+//        }
+//        String totalHandsNew = totalHands1.toString();
+//        for (String allTile : allTiles) {
+//            Matcher matcher1 = Pattern.compile(allTile).matcher(totalHandsNew);
+//            while (matcher1.find()) {
+//                joinedList.remove(allTile);
+//                totalHandsNew = totalHandsNew.substring(0, totalHandsNew.indexOf(allTile)) + totalHandsNew.substring(totalHandsNew.indexOf(allTile) + 4);
+//            }
+//        }
+
+//        //Random a tile from the leftover list
+//        int randIndex = new Random().nextInt(joinedList.size()); //generate random int [0,size]
+//        return joinedList.get(randIndex);
+//    }
 
     /**
      * Task 6
@@ -69,9 +315,111 @@
      * @param placementSequence A sequence of placements on the board.
      * @return Whether this placement string is valid.
      */
+
     public static boolean isPlacementSequenceValid(String placementSequence) {
         // FIXME Task 6: determine whether a placement sequence is valid
-        return false;
+        //  Authored by Chan Xu, u7076870
+        //If the placementSequence is not well formed, return false.
+        if (!isPlacementSequenceWellFormed(placementSequence)) return false;
+        //A placementSequence is valid if it is empty.
+        if (placementSequence.length() == 0) return true;
+        //Use the method in the Coordinates class to creat a list of strings with each string as a
+        // coordinate of each tile in the placementSequence.
+        List<String> position = Coordinates.placedCoordinates(placementSequence);
+        //Use the method in the Coordinates class to creat a list of integers with each integer as a
+        // coordinate of each tile in the placementSequence.
+        List<Integer> positionNum = Coordinates.coordinatesAsNumbers(placementSequence);
+        //Use the method in the Tiles class to check if there is a tile that overlap another tile,
+        // or any one of the center stations.
+        if (Tiles.overlapTiles(placementSequence)) return false;
+        //Use the method in the Tiles class to check if a tile is placed to continue or complete an existing track.
+        if (Tiles.noAdjacentTiles(placementSequence)) return false;
+        //Use the method in the Tiles class to creat a list of strings with each string as a
+        // tile in the placementSequence.
+        List<String> tile = Tiles.placedTiles(placementSequence);
+        for (int i = 0; i < position.size(); i++) {
+            char first = tile.get(i).charAt(0);
+            char second = tile.get(i).charAt(1);
+            char third = tile.get(i).charAt(2);
+            char fourth = tile.get(i).charAt(3);
+            char row = position.get(i).charAt(0);
+            char column = position.get(i).charAt(1);
+            String coordinate = position.get(i);
+            //Creat a list of integer with each integer as a coordinate of the surrounding of the board.
+            List<Integer> initialCoord = new ArrayList<>(CoordinatesEnum.Surround.getCoordinates());
+            //For the first tile in the placementSequence, it can be only placed on a coordinate
+            // of the surrounding of the board.
+            //Otherwise, it can be placed on a coordinate of the surrounding of the board and a coordinate
+            // that is enabled by the previous tile(s).
+            if (i != 0) {
+                for (int j = 0; j < i; j++) {
+                    initialCoord.addAll(Arrays.asList(positionNum.get(j) + 1, positionNum.get(j) - 1,
+                            positionNum.get(j) + 10, positionNum.get(j) - 10));
+                    initialCoord.retainAll(CoordinatesEnum.All.getCoordinates());
+                }
+                for (int j = 0; j < i; j++) {
+                    while (initialCoord.contains(positionNum.get(j))) {
+                        initialCoord.remove(positionNum.get(j));
+                    }
+                }
+                initialCoord = initialCoord.stream().distinct().collect(Collectors.toList());
+            }
+            //If the first character of the tile is 'd', it cannot be placed on the top row
+            // of the board.
+            if (first == 'd') {
+                initialCoord.removeAll(CoordinatesEnum.Top.getCoordinates());
+            }
+            //If the second character of the tile is 'd', it cannot be placed on the right column
+            // of the board.
+            if (second == 'd') {
+                initialCoord.removeAll(CoordinatesEnum.Right.getCoordinates());
+            }
+            //If the third character of the tile is 'd', it cannot be placed on the bottom row
+            // of the board.
+            if (third == 'd') {
+                initialCoord.removeAll(CoordinatesEnum.Bottom.getCoordinates());
+            }
+            //If the fourth character of the tile is 'd', it cannot be placed on the left column
+            // of the board.
+            if (fourth == 'd') {
+                initialCoord.removeAll(CoordinatesEnum.Left.getCoordinates());
+            }
+            //If the first character of the tile is 'b' or the second character of the tile is 'c',
+            // it cannot be placed on the top right corner of the board.
+            if (first == 'b' || second == 'c') {
+                initialCoord.removeAll(Collections.singletonList(7));
+            }
+            //If the first character of the tile is 'c' or the fourth character of the tile is 'b',
+            // it cannot be placed on the top left corner of the board.
+            if (first == 'c' || fourth == 'b') {
+                initialCoord.removeAll(Collections.singletonList(0));
+            }
+            //If the third character of the tile is 'b' or the fourth character of the tile is 'c',
+            // it cannot be placed on the bottom left corner of the board.
+            if (third == 'b' || fourth == 'c') {
+                initialCoord.removeAll(Collections.singletonList(70));
+            }
+            //If the second character of the tile is 'b' or the third character of the tile is 'c',
+            // it cannot be placed on the bottom right corner of the board.
+            if (second == 'b' || third == 'c') {
+                initialCoord.removeAll(Collections.singletonList(77));
+            }
+            //If a tile in the placementSequence contains 'b', 'c', and 'd', check if there is any
+            // coordinates other than the ones of the surrounding of the board available for this tile.
+            //Return false if this tile is able to be placed elsewhere but is placed on a place it
+            // should not be placed.
+            if ((first == 'd' && row == '0') ||
+                    (second == 'd' && column == '7') ||
+                    (third == 'd' && row == '7') ||
+                    (fourth == 'd' && column == '0') ||
+                    (first == 'b' && coordinate.equals("07")) || (second == 'c' && coordinate.equals("07")) ||
+                    (fourth == 'b' && coordinate.equals("00")) || (first == 'c' && coordinate.equals("00")) ||
+                    (third == 'b' && coordinate.equals("70")) || (fourth == 'c' && coordinate.equals("70")) ||
+                    (second == 'b' && coordinate.equals("77")) || (third == 'c' && coordinate.equals("77"))) {
+                if (initialCoord.size() > 0) return false;
+            }
+        }
+        return true;
     }
 
     /**
@@ -84,7 +432,94 @@
      */
     public static int[] getScore(String placementSequence, int numberOfPlayers) {
         // FIXME Task 7: determine the current score for the game
-        return new int[0];
+        //  Authored by Xikang Song, u6486892; Chan Xu, u7076870
+        int[] s = singleTrackScore(placementSequence);
+        //if (placementSequence.equals(SAMPLE_START)) res[1]--;
+        return sumTrackScore(s, numberOfPlayers);
+    }
+
+    protected static int[] sumTrackScore(int[] station, int numberOfPlayers) {
+        int[] allScores = new int[numberOfPlayers];
+        if (numberOfPlayers == 2)
+            for (int i = 0; i < 32; i++)
+                allScores[i % 2] += station[i];
+        else if (numberOfPlayers == 3) {// 3  10  4  3  1  6  6  31  2  4
+            allScores[0] = station[0] + station[3] + station[5] + station[10] + station[14] + station[19] + station[22] + station[24] + station[27] + station[30];
+            allScores[1] = station[1] + station[6] + station[8] + station[11] + station[13] + station[18] + station[21] + station[26] + station[28] + station[31];
+            allScores[2] = station[2] + station[4] + station[7] + station[9] + station[12] + station[17] + station[20] + station[23] + station[25] + station[29];
+        } else if (numberOfPlayers == 4) {
+            allScores[0] = station[3] + station[6] + station[10] + station[15] + station[19] + station[22] + station[26] + station[31];
+            allScores[1] = station[2] + station[7] + station[11] + station[14] + station[18] + station[23] + station[27] + station[30];
+            allScores[2] = station[0] + station[5] + station[9] + station[12] + station[17] + station[20] + station[24] + station[29];
+            allScores[3] = station[1] + station[4] + station[8] + station[13] + station[16] + station[21] + station[25] + station[28];
+        } else if (numberOfPlayers == 5) {
+            allScores[0] = station[0] + station[4] + station[9] + station[13] + station[21] + station[27];
+            allScores[1] = station[5] + station[11] + station[17] + station[22] + station[26] + station[31];
+            allScores[2] = station[2] + station[6] + station[14] + station[18] + station[24] + station[28];
+            allScores[3] = station[1] + station[8] + station[12] + station[20] + station[25] + station[29];
+            allScores[4] = station[3] + station[7] + station[10] + station[19] + station[23] + station[30];
+        } else {
+            allScores[0] = station[0] + station[4] + station[9] + station[18] + station[26];
+            allScores[1] = station[1] + station[10] + station[17] + station[24] + station[28];
+            allScores[2] = station[3] + station[7] + station[13] + station[20] + station[25];
+            allScores[3] = station[5] + station[14] + station[19] + station[23] + station[30];
+            allScores[4] = station[2] + station[8] + station[12] + station[22] + station[29];
+            allScores[5] = station[6] + station[11] + station[21] + station[27] + station[31];
+        }
+        //if (placementSequence.equals(SAMPLE_START)) res[1]--;
+        return allScores;
+    }
+
+    protected static int[] singleTrackScore(String placementSequence) {
+        //Calculate the scores of every complete track that starts from each station and store them into an array
+        int[] station = new int[32];
+        String str;
+        for (int l = placementSequence.length(), next, row, col, j, i = 0; i < 32; i++) {
+            int t = 0;
+            if (i < 8) {
+                next = 0;
+                row = 0;
+                col = 7 - i;
+            } else if (i < 16) {
+                next = 6;
+                row = i - 8;
+                col = 0;
+            } else if (i < 24) {
+                next = 4;
+                row = 7;
+                col = i - 16;
+            } else {
+                next = 2;
+                row = 31 - i;
+                col = 7;
+            }
+            do {
+                str = "";
+                for (j = 0; j < l; j += 6)
+                    if (placementSequence.substring(j + 4, j + 6).equals("" + row + col)) {
+                        str = placementSequence.substring(j, j + 4);
+                        break;
+                    }
+                if (str.equals("")) break;
+                //get the way to next tile by entry number and tile type
+                next = Tiles.getNextExit(str, next);
+                if (next != -1) {
+                    t++;
+                    if (next == 0 || next == 1) row--;
+                    else if (next == 2 || next == 3) col++;
+                    else if (next == 4 || next == 5) row++;
+                    else if (next == 6 || next == 7) col--;
+                    if (next == 0 || next == 2) next += 5;
+                    else if (next == 1 || next == 3) next += 3;
+                    else if (next == 5 || next == 7) next -= 5;
+                    else if (next == 4 || next == 6) next -= 3;
+                }
+            } while (next != -1 && 0 <= row && row <= 7 && 0 <= col && col <= 7);
+            if (row == -1 || row == 8 || col == -1 || col == 8
+                    || (3 <= row && row <= 4 && 3 <= col && col <= 4))
+                station[i] = (3 <= row && row <= 4 && 3 <= col && col <= 4) ? 2 * t : t;
+        }
+        return station;
     }
 
     /**
@@ -98,6 +533,15 @@
      */
     public static String generateMove(String placementSequence, String piece, int numberOfPlayers) {
         // FIXME Task 9: generate a valid move
-        return "";
+        //  Authored by Xikang Song, u6486892
+        String res = "";
+        A:
+        for (int j, i = 0; i < 8; i++)
+            for (j = 0; j < 8; j++)
+                if (isPlacementSequenceValid(placementSequence + piece + i + j)) {
+                    res = piece + i + j;
+                    break A;
+                }
+        return res;
     }
-}
+}
\ No newline at end of file
Only in comp1110-ass2/src/comp1110/ass2: Tiles.java
Only in comp1110-ass2/src/comp1110/ass2: TilesEnum.java
Only in comp1110-ass2/tests/comp1110/ass2: ExtraTestTask6.java
Only in comp1110-ass2/tests/comp1110/ass2: GetNextExitTest.java
Only in comp1110-ass2/tests/comp1110/ass2: NoAdjacentTilesTest.java
Only in comp1110-ass2/tests/comp1110/ass2: PlacedCoordinatesTest.java
Only in comp1110-ass2/tests/comp1110/ass2: PlacedTilesTest.java
Only in comp1110-ass2: weekly_feedback
```
