package acm.utsa.campusrunner;

import android.content.Context;
import android.util.AttributeSet;

/**
 * This class is to change the way the preference list behaves
 * Created by John on 10/28/2015.
 *
 */

public class MyEditTextPreference extends android.preference.EditTextPreference{
    public MyEditTextPreference(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public MyEditTextPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyEditTextPreference(Context context) {
        super(context);
    }

    @Override
    public CharSequence getSummary() {
        String summary = super.getSummary().toString();
        return String.format(summary, getText());
    }
}
