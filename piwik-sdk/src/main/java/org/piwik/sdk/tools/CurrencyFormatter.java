/*
 * Android SDK for Piwik
 *
 * @link https://github.com/piwik/piwik-android-sdk
 * @license https://github.com/piwik/piwik-sdk-android/blob/master/LICENSE BSD-3 Clause
 */

package org.piwik.sdk.tools;

import java.text.DecimalFormat;

public class CurrencyFormatter {
    public static String priceString(int cents) {
        DecimalFormat form = new DecimalFormat("0.00");
        return form.format(cents / 100.);
    }
}
