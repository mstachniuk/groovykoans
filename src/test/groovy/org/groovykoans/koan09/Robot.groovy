/*
 * Copyright (c) 2012-2014 nadavc <https://twitter.com/nadavc>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the WTFPL, Version 2, as published by Sam Hocevar.
 * See the COPYING file for more details.
 */

package org.groovykoans.koan09

import org.codehaus.groovy.runtime.InvokerHelper

class Robot {
    // ------------ START EDITING HERE ----------------------
    int x
    int y

    def left() {
        x--;
    }

    def right() {
        x++;
    }

    def up() {
        y++;
    }

    def down() {
        y--;
    }

    def invokeMethod(String name, args) {
        if(name ==~ /^go.*/) {
            def methodNames = name.findAll(/[A-Z][a-z]*/) {
                it.toLowerCase()
            }
            methodNames.each { "$it"()}
        }
    }

    // ------------ STOP EDITING HERE  ----------------------
}
