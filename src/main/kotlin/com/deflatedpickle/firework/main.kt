package com.deflatedpickle.firework

import org.eclipse.swt.widgets.Display
import org.eclipse.swt.widgets.Shell

fun main(args: Array<String>) {
    val display = Display()
    val shell = Shell(display)
    shell.text = "Firework"
    shell.setMinimumSize(400, 400)

    shell.pack()
    shell.open()

    while (!shell.isDisposed) {
        if (!display.readAndDispatch()) {
            display.sleep()
        }
    }
    display.dispose()
}