/*
 * ColorLife.scala
 */

package org.nuttycombe.colorlife

import org.nuttycombe.colorlife.ui._

object ColorLife extends Application {
    val game = new Game(33, 25, 3)
    val ui = new GUI(game)
}
