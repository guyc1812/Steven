package com.avengers.Rogers.DesignPattern.Command.Commands;

import com.avengers.Rogers.DesignPattern.Command.Command;
import com.avengers.Rogers.DesignPattern.Command.Object.TV;

public class TVOnCommand implements Command {
    TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.on();
        tv.setInputChannel();
    }

    public void undo() {
        tv.off();
    }
}