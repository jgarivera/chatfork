package com.flairborne.fabulist.element.action;

import com.flairborne.fabulist.element.channel.message.Message;
import com.flairborne.fabulist.element.character.Quote;
import com.flairborne.fabulist.element.context.Context;
import com.flairborne.fabulist.element.context.Displayable;

/**
 * Represents an action towards the {@link Context context} of the story.
 * Every action produces a message that details what has happened.
 */
public interface Action extends Displayable {

    /**
     * Perform action.
     *
     * @return {@link Message} message to send that indicates completion of this action
     */
    Message act(Context context);

    /**
     * @return a new instance of {@link Dialogue}
     */
    static Action dialogue(Quote quote) {
        return new Dialogue(quote);
    }
}
