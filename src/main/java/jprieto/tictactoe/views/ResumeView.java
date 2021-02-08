package jprieto.tictactoe.views;

import jprieto.utils.views.YesNoDialog;

public class ResumeView {

    public boolean read() {
        YesNoDialog isResumed = new YesNoDialog();
        isResumed.read(Message.RESUME.toString());
        return isResumed.isAffirmative();
    }

}
